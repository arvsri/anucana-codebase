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
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@NotEmpty
@Length(min = 6, max = 20)
@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
public @interface ValidPassword {

    String message() default "";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};	
	
}
