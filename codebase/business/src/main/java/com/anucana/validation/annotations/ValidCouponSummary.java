package com.anucana.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.anucana.persistence.entities.DiscountCouponEntity;

@Constraint(validatedBy = {})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@Size(max = DiscountCouponEntity.SUMMARY_SIZE)
@Pattern(regexp = "[a-zA-Z0-9\\s-_\\.\\n\\t\\r,!\\(\\)\\{\\}@'\"\\?/\\\\;:]*")
public @interface ValidCouponSummary {

	String message() default "";

	Class<?>[] groups() default {};

	Class<?>[] payload() default {};

}