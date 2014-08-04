package com.anucana.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.anucana.persistence.entities.StandardEntity;

@Constraint(validatedBy = {})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@Size(max = StandardEntity.PHONE_NUMBER_SIZE)
@Pattern(regexp = "[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")
public @interface ValidPhone{
	
    String message() default "";
    
    Class<?>[] groups() default {};
    
    Class<?>[] payload() default {};	
}
