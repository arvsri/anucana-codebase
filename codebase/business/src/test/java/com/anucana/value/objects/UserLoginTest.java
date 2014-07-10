package com.anucana.value.objects;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.groups.Default;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserLoginTest{

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void validateFirstNameNullNotAllowed() {
		UserLogin userLogin = new UserLogin();

		Set<ConstraintViolation<UserLogin>> constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(1, constraintViolations.size());
		
		userLogin.setFirstName("");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(1, constraintViolations.size());
		
		userLogin.setFirstName("Arvind");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
	}
	
	@Test
	public void validateFirstNameSizeNotExceeded() {
		UserLogin userLogin = new UserLogin();
		userLogin.setFirstName("arvindarvindarvindarvindarvindarvindarvindarvind");

		Set<ConstraintViolation<UserLogin>> constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userLogin.setFirstName("arvindarvindarvindarvindarvindarvindarvindarvindarv");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void validateFirstNamePatternMatched() {
		UserLogin userLogin = new UserLogin();
		// validate lower case match
		userLogin.setFirstName("arvind");

		Set<ConstraintViolation<UserLogin>> constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		// validate upper case match
		userLogin.setFirstName("ARVIND");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		// validate camel case match
		userLogin.setFirstName("Arvind");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		// validate numeric not permitted
		userLogin.setFirstName("Arvind1");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(1, constraintViolations.size());

		// validate special character not permitted
		userLogin.setFirstName("Arvind@");
		constraintViolations = validator.validateProperty(userLogin, "firstName", Default.class);
		TestCase.assertEquals(1, constraintViolations.size());
	}
	
}
