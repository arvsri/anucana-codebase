package com.anucana.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import com.anucana.persistence.entities.UserProfileInfoEntity;

@Constraint(validatedBy = {})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
@Max(value = UserProfileInfoEntity.SUMMARY_SIZE)
@Pattern(regexp = "[a-zA-Z0-9]+")
public @interface ValidProfileSummary {

}
