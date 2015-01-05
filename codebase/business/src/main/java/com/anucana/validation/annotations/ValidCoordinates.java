package com.anucana.validation.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import com.anucana.validation.implementations.CoordinatesValidator;

@Documented
@Constraint(validatedBy = CoordinatesValidator.class)
@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface ValidCoordinates {

    String message() default "";

    Class<?>[] groups() default {};
    
    Class<?>[] payload() default {};	
	
}
