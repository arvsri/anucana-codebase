package com.anucana.web.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.ui.ModelMap;

/**
 * Unit test for {@link LoginController}
 * 
 * @author asrivastava
 *
 */
public class LoginControllerTest {
	
	
	@Test
	public void showUserLogin(){
		InitController controller = new InitController();
		Assert.assertEquals("loginHome",controller.showUserLoginHome().getViewName());
	}
	
	@Test
	public void showForgotPassword(){
//		ModelMap modelMap = new ModelMap();
//		LoginController controller = new LoginController();
//		Assert.assertEquals("forgotPassword",controller.showForgotPassword(modelMap));
	}
	
}
