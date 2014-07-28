package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.entities.TypeTableEntity;
import com.anucana.validation.annotations.ValidGroupType;

public class GroupTypeValidator implements ConstraintValidator<ValidGroupType, String> {

	private String typeGroup = null;
	
	@Autowired
	private TypeDAO typeDAO;
	
	@Override
	public void initialize(ValidGroupType constraintAnnotation) {
		typeGroup = constraintAnnotation.typeGroup();
	}

	@Override
	public boolean isValid(String type, ConstraintValidatorContext context) {
		if(StringUtils.isBlank(typeGroup) || StringUtils.isBlank(type)){
			return false;
		}
		TypeTableEntity typeCode = typeDAO.findByTypeCode(type);
		if(typeCode != null && typeGroup.equals(typeCode.getGroupCode().getGroupCode())){
			return true;
		}
		return false;
	}

}
