package com.anucana.validation.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anucana.validation.implementations.ExistsValidator;

/**
 * Validation constraint for validating if the specified type already exists
 * 
 * @author asrivastava
 *
 */
@Documented
@Constraint(validatedBy = ExistsValidator.class)
@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface Exists {
	
	TYPE value() default TYPE.USER_NAME;
	
	String message() default "";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	public static enum TYPE{
		USER_NAME,
		USER_ID
	}
	
}
