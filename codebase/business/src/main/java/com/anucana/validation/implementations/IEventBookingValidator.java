package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;

import com.anucana.persistence.entities.EventEntity;
import com.anucana.validation.annotations.ValidEventBooking;
import com.anucana.value.objects.UserBooking;

public interface IEventBookingValidator extends ConstraintValidator<ValidEventBooking, UserBooking>{

	int getNumberOfAvailableSeats(EventEntity event);
}
