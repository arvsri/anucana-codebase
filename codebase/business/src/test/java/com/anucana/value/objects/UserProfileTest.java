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

public class UserProfileTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void validateProfileHeading() {
		UserProfile userProfile = new UserProfile();

		userProfile.setProfileHeading(null);
		Set<ConstraintViolation<UserProfile>> constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setProfileHeading("");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setProfileHeading("blah");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		// Verify that for space character is allowed 
		userProfile.setProfileHeading("Arvind Srivastava");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setProfileHeading("    Arvind Srivastava   ");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		// Validate numbers are allowed
		userProfile.setProfileHeading("1234");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setProfileHeading("  Arvind 1234   123 ");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		// Validate selected special characters are allowed (.,;-_(){}[]@!'"")
		userProfile.setProfileHeading("Calvin is an awesome developer, a team player. A real gem indeed ! \\\\\\\\\\\\ \t");
		constraintViolations = validator.validateProperty(userProfile, "profileHeading", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
	}
	
	@Test
	public void validateSummary() {
		UserProfile userProfile = new UserProfile();

		userProfile.setSummary(null);
		Set<ConstraintViolation<UserProfile>> constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setSummary("");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setSummary("blah");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
	}

	
	
	@Test
	public void validateSummaryForValidCharacters() {
		UserProfile userProfile = new UserProfile();
		
		// Verify that for space character is allowed 
		userProfile.setSummary("Arvind Srivastava");
		Set<ConstraintViolation<UserProfile>> constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setSummary("    Arvind Srivastava   ");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		// Validate numbers are allowed
		userProfile.setSummary("1234");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile.setSummary("  Arvind 1234   123 ");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		// Validate new line is are allowed
		userProfile.setSummary("\n Arvind \n Srivastav");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		// Validate tabs are allowed
		userProfile.setSummary("\t Arvind \t Srivastav");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		// Validate selected special characters are allowed (.,;-_(){}[]@!'"")
		userProfile.setSummary("Calvin is an awesome developer, a team player. A real gem indeed !");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		userProfile.setSummary("Calvin ( a geek ) is an awesome developer, a team player. A real gem indeed !");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile
				.setSummary("Calvin ( a geek ) is an awesome developer, a team player. A real gem indeed !. His nick name is \"Cal\". " +
						"His pet's name is Hobbes. His email address is calvin@funplace.com { it's his official email address}");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());
		
		userProfile
		.setSummary("Calvin's house address is B / 27/63 B Durgakund Varanasi. Do visit him some time;");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

		// Validate size limit
		userProfile
		.setSummary("Calvin's house address is B / 27/63 B Durgakund Varanasi. Do visit him some time;");
		constraintViolations = validator.validateProperty(userProfile, "summary", Default.class);
		TestCase.assertEquals(0, constraintViolations.size());

	}
	
	
}
