package com.anucana.validation.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anucana.validation.implementations.NotExistsForValidator;

/**
 * Validation constraint for validating if the specified value already exists
 * for the specified field
 * 
 * @author asrivastava
 * 
 */
@Documented
@Constraint(validatedBy = NotExistsForValidator.class)
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface NotExistsFor {

	String property() default "";

	String forProperty() default "";
	
	SupportedExistsType value() default SupportedExistsType.PASSWORD;
	
	String message() default "";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
