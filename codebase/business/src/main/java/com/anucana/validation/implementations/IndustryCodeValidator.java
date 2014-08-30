package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.entities.TypeTableEntity;
import com.anucana.validation.annotations.ValidIndustryCode;

public class IndustryCodeValidator implements ConstraintValidator<ValidIndustryCode, String> {

	@Autowired
	private TypeDAO typeDAO;

	@Override
	public void initialize(ValidIndustryCode constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtils.isNotBlank(value)) {
			try {
				TypeTableEntity entity = typeDAO.findByTypeCode(value);
				if (entity != null) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		return true;
	}
}
