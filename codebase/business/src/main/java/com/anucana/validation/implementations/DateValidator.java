package com.anucana.validation.implementations;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.anucana.validation.annotations.ValidDate;

/**
 * The validator for validating the date format
 * 
 * @author asrivastava
 * 
 */
public class DateValidator implements ConstraintValidator<ValidDate, String> {

	private String dateFormat = null;

	@Override
	public void initialize(ValidDate constraintAnnotation) {
		dateFormat = constraintAnnotation.format();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtils.isBlank(value)) {
			return false;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		try {
			formatter.parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
