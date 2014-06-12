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

@Constraint(validatedBy = {})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@NotEmpty
@Length(min = 1, max = 50)
@Pattern(regexp = "[a-zA-Z]+")
public @interface ValidFirstName {

    String message() default "";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};	
	
}
