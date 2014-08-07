package com.anucana.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.anucana.persistence.entities.StandardEntity;

@Constraint(validatedBy = {})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@NotEmpty
@Length(min = 1, max = StandardEntity.NAME_SIZE)
@Pattern(regexp = "[a-zA-Z0-9\\s-_\\.]+")
public @interface ValidName {

	String message() default "";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};	
	
}
