package com.anucana.value.objects.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.UserLoginEntity;

/**
 * The validator for validating the existence of {@link Exists.TYPE} 
 * @author asrivastava
 *
 */
public class ExistsValidator implements ConstraintValidator<Exists, String> {

	private Exists.TYPE type = null; 
	
	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	
	@Override
	public void initialize(Exists constraintAnnotation) {
		type = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if ( StringUtils.isBlank(value) ) {
			return false;
		}
		try {
			if(type.equals(Exists.TYPE.USER_NAME)){
				return loginDao.doesUserExists(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
