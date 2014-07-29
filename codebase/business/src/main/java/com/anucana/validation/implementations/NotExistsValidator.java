package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.persistence.dao.PostalCodeDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.PostalCodeEntity;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.validation.annotations.NotExists;
import com.anucana.validation.annotations.SupportedExistsType;

/**
 * The validator for validating the non existence of {@link SupportedExistsType} 
 * @author asrivastava
 *
 */
public class NotExistsValidator implements ConstraintValidator<NotExists, String>{

	private SupportedExistsType type = null; 
	
	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	@Autowired
	private PostalCodeDAO postalCodeDAO ;
	
	
	@Override
	public void initialize(NotExists constraintAnnotation) {
		type = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if ( StringUtils.isBlank(value) ) {
			return true;
		}
		try {
			if(type.equals(SupportedExistsType.USER_NAME)){
				return !loginDao.doesUserExists(value);
			}else if (type.equals(SupportedExistsType.POSTAL_ID_CODE)) {
				PostalCodeEntity postalCode = postalCodeDAO.findById(Long.valueOf(value));
				return postalCode == null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
