package com.anucana.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

@Constraint(validatedBy = {})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@Max(value = 255)
@Pattern(regexp = "[a-zA-Z0-9]+")
public @interface ValidProfileHeading {

    String message() default "";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};	

}
