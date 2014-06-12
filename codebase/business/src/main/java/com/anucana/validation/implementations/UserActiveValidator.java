package com.anucana.validation.implementations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.validation.annotations.UserActive;

public class UserActiveValidator implements ConstraintValidator<UserActive, String> {
	
	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;

	@Override
	public void initialize(UserActive constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if ( StringUtils.isBlank(value) ) {
			return false;
		}
		try {
			UserLoginEntity entity =  loginDao.getUser(value);
			if(entity != null && entity.isUserActive() ){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
