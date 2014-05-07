package com.anucana.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.services.ILoginService;

/**
 * The validator for validating if the user Id doesn't already exists 
 * @author asrivastava
 *
 */
public class UserIdNotExistsValidator implements ConstraintValidator<UserIdNotExists, String> {

	@Autowired
	ILoginService loginService;
	
	@Override
	public void initialize(UserIdNotExists constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		try {
			return !loginService.doesUserIdExists(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

}
