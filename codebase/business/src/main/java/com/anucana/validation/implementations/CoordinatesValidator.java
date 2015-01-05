package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.anucana.validation.annotations.ValidCoordinates;

public class CoordinatesValidator implements ConstraintValidator<ValidCoordinates, String> {

	@Override
	public void initialize(ValidCoordinates constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		// null value is a valid value
		if(StringUtils.isEmpty(value)){
			return true;
		}
		
		// but not any other zero or non double value
		try {
			double coordinate = Double.valueOf(value);
			if (coordinate != 0D) {
				return true;
			}
		} catch (NumberFormatException nfx) {
			return false;
		}
		return false;
	}

}
