package com.anucana.validation.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anucana.validation.implementations.EventBookingValidator;

@Documented
@Constraint(validatedBy = EventBookingValidator.class)
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface ValidEventBooking {

	String message() default "";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
