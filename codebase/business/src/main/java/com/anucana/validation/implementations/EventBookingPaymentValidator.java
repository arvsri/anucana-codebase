package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.persistence.dao.DiscountCouponDAO;
import com.anucana.persistence.dao.EventDAO;
import com.anucana.persistence.entities.DiscountCouponEntity;
import com.anucana.persistence.entities.EventEntity;
import com.anucana.strategies.discounts.DiscountCalculationContext;
import com.anucana.validation.annotations.ValidEventBookingPayment;
import com.anucana.value.objects.Discount;
import com.anucana.value.objects.UserBooking;

/**
 * Validates if the payment being made for the event booking is valid. Basically it validates two things 
 * 1. Is payment amount same as event cost  ?
 * 2. Is net payment = payment - discount being applied ?
 * 
 * @author asrivastava
 *
 */
public class EventBookingPaymentValidator implements ConstraintValidator<ValidEventBookingPayment, UserBooking>{

	@Autowired
	private EventDAO eventDAO;
	@Autowired
	private DiscountCouponDAO discountCouponDAO;
	
	@Override
	public void initialize(ValidEventBookingPayment constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(UserBooking userBooking, ConstraintValidatorContext context) {
		try{
			if(userBooking.getPayment() <= 0d){
				return false;
			}
			EventEntity event = eventDAO.findById(userBooking.getEventId());
			if((event.getRateInRuppes() * userBooking.getNumberOfSeats()) != userBooking.getPayment()){
				return false;
			}
			
			Float discountedAmount = 0f;
			if(StringUtils.isNotBlank(userBooking.getDiscountCouponCode())){
				DiscountCouponEntity discountEntity = discountCouponDAO.findByCouponCode(userBooking.getDiscountCouponCode());
				
				Discount discount = new Discount(userBooking.getPayment(), discountEntity.getRate(), discountEntity.getCalculationStrategy().getTypeCode());
				discountedAmount = new DiscountCalculationContext(discount).calculate().getDiscountedAmount();
				
			}
			return userBooking.getNetPayment() == userBooking.getPayment() - discountedAmount;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

}
