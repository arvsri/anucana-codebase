package com.anucana.validation.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anucana.validation.implementations.UserActiveValidator;

/**
 * Validation constraint for validating if the specified type already exists
 * 
 * @author asrivastava
 *
 */
@Documented
@Constraint(validatedBy = UserActiveValidator.class)
@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface UserActive {
	
	String message() default "";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
