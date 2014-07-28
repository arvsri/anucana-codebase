package com.anucana.validation.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anucana.validation.implementations.GroupTypeValidator;

/**
 * Validation constraint for validating if the type code is valid 
 * 
 * @author asrivastava
 *
 */
@Documented
@Constraint(validatedBy = GroupTypeValidator.class)
@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface ValidGroupType {
	
	String typeGroup();
	
	String message() default "";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
