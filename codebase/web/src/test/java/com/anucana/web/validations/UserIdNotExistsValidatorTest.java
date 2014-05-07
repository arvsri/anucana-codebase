package com.anucana.web.validations;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.anucana.services.ILoginService;
import com.anucana.validations.UserIdNotExistsValidator;


/**
 * Unit test for {@link UserIdNotExistsValidator}
 * @author asrivastava
 *
 */
public class UserIdNotExistsValidatorTest {

	@Test
	public void isValid() throws Exception{
		UserIdNotExistsValidator validator = new UserIdNotExistsValidator();
		
		ILoginService loginService = Mockito.mock(ILoginService.class);
		validator.setLoginService(loginService);
		
		// Test that if the user id exists, the validator returns false
		Mockito.when(loginService.doesUserIdExists("Blah Blah")).thenReturn(true);
		Assert.assertFalse(validator.isValid("Blah Blah", null));

		// Test that if the user id doesn't exists, the validator returns true
		Mockito.when(loginService.doesUserIdExists("New Blah Blah")).thenReturn(false);
		Assert.assertTrue(validator.isValid("New Blah Blah", null));
		
	}
}
