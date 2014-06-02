package com.anucana.value.objects.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anucana.value.objects.validation.Exists.TYPE;

/**
 * Validation constraint for validating if the specified type already exists
 * 
 * @author asrivastava
 *
 */
@Documented
@Constraint(validatedBy = NotExistsValidator.class)
@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface NotExists{
	
	TYPE value() default TYPE.USER_NAME;
	
	String message() default "";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
