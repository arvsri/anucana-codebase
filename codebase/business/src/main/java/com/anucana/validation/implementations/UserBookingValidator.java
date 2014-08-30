package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.UserEventDAO;
import com.anucana.persistence.entities.UserEventEntity;
import com.anucana.validation.annotations.ValidUserBooking;
import com.anucana.value.objects.UserBooking;

/**
 * Validates if the user has not done any booking previously for this event or had previous bookings failed.   
 * 
 * @author asrivastava
 *
 */
public class UserBookingValidator implements ConstraintValidator<ValidUserBooking, UserBooking>{

	@Autowired
	private UserEventDAO userEventDAO;

	@Override
	public void initialize(ValidUserBooking constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(UserBooking booking, ConstraintValidatorContext context) {
		try{
			return isUserBookingAllowed(booking.getUserId(),booking.getEventId());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return false;
	}

	public boolean isUserBookingAllowed(long userId,long eventId) {
		// if no user id is present, booking can not be done anyways
		if(userId == 0 || eventId == 0){
			return false;
		}
		
		UserEventEntity userEvent = userEventDAO.findUserEvents(userId,eventId);
		if(userEvent == null || ITypeConstants.TYPE_USER_EVENT_STATUS_PAYMENT_FAILED.equals(userEvent.getStatus().getTypeCode())){
			return true;
		}
		return false;
	}

}
