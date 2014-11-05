package com.anucana.validation.implementations;

import java.util.Date;
import java.util.List;

import javax.validation.ConstraintValidatorContext;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.anucana.persistence.dao.EventDAO;
import com.anucana.persistence.dao.UserEventDAO;
import com.anucana.persistence.entities.EventEntity;
import com.anucana.persistence.entities.UserEventEntity;
import com.anucana.validation.annotations.ValidEventBooking;
import com.anucana.value.objects.UserBooking;

/**
 * Validates if the event booking is valid. Basically it validates three things 
 * 1. Is event exists, its active and event date not in past  ?
 * 2. Are seats available for the event ?
 * 3. Can user provided number of seats be accommodated ?
 * 
 * @author asrivastava
 *
 */
public class EventBookingValidator implements IEventBookingValidator{

	@Autowired
	private EventDAO eventDAO;
	@Autowired
	private UserEventDAO userEventDAO;
	
	@Value("${payment.gateway.response.timeout}")
	private int paymentTransactionTimeout;
	
	
	@Override
	public void initialize(ValidEventBooking constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(UserBooking userBooking, ConstraintValidatorContext context) {
		try{
			EventEntity event = eventDAO.findById(userBooking.getEventId());
			// if there is no event or event is inactive, booking validation fails
			if(event == null || EventEntity.EVENT_STATUS_INACTIVE.equals(event.getStatus().getTypeCode())){
				return false;
			}

			// if the event date is in past, booking validation fails
			if(event.getEventDate().before(new Date())){
				return false;
			}
			
			int availableNumberOfSeats = getNumberOfAvailableSeats(event);
			
			return availableNumberOfSeats > 0 && userBooking.getNumberOfSeats() <= availableNumberOfSeats;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	
	public int getNumberOfAvailableSeats(EventEntity event){
		int eventCapacity = event.getProjectedAttendeeCount().intValue();
		int bookedSeats = userEventDAO.getEventBookedSeatsCount(event.getId());
		int seatsInBookingProgress = 0;
		
		List<UserEventEntity> enrolledUserEvents = userEventDAO.findEnrolledUserEvents(event.getId());
		if(CollectionUtils.isNotEmpty(enrolledUserEvents)){
			for(UserEventEntity enrolledUserEvent : enrolledUserEvents){
				Date lockExpiryTime = DateUtils.addSeconds(enrolledUserEvent.getCreationDate(),paymentTransactionTimeout);
				// if the lock is not expired yet, count the seat being booked as seatsInBookingProgress
				if(lockExpiryTime.after(new Date())){
					seatsInBookingProgress =+ enrolledUserEvent.getNumberOfSeats().intValue();
				}
			}
		}
		int numOfavailableSeats = eventCapacity - bookedSeats - seatsInBookingProgress;
		return numOfavailableSeats > 0 ? numOfavailableSeats : 0;
	}
	
}
