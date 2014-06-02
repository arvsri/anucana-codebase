package com.anucana.web.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.value.objects.UserLogin;
import com.anucana.web.common.IWebConfigsProvider;


/**
 * Controller for user login module  
 * 
 * @author asrivastava
 * 
 */
@Controller
@RequestMapping(value= "/login/**")
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
    @Autowired
    private IWebConfigsProvider configProvider;
	
	/**
	 * ***********************************************************************************************************
	 * 											Login Page
	 * *********************************************************************************************************** 
	 */

	@RequestMapping(value= "loginExistingUser",method = RequestMethod.GET)
	public ModelAndView loginExistingUser() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new UserLogin());
		return mv;
	}

	/**
	 * ***********************************************************************************************************
	 * 											New User Registration
	 * *********************************************************************************************************** 
	 */
	
	@RequestMapping(value= "registerNewUser",method = RequestMethod.GET)
	public ModelAndView registerNewUser() throws Exception{
		ModelAndView mv = new ModelAndView("register");
		mv.addObject(new UserLogin());
		return mv;
	}
	@RequestMapping(value= "registerNewUser",method = RequestMethod.POST)
	public ModelAndView registerNewUser(UserLogin user) throws Exception{
		ServiceResponse<UserLogin> serviceResponse = loginService.registerNewUser(new ServiceRequest<UserLogin>(user,ControllerUtil.getVariableName(user)), null,configProvider.getClientDetails());
		if (serviceResponse.getBindingResult().hasErrors()) {
			ModelAndView mv = new ModelAndView("register");
			mv.addObject(ControllerUtil.getVariableName(serviceResponse.getBindingResult()),serviceResponse.getBindingResult());
			return mv;
		}
		return new ModelAndView("registrationConfirmation") ;
	}
	
	/**
	 * ***********************************************************************************************************
	 * 											Activate inactive / suspended account
	 * *********************************************************************************************************** 
	 */

	@RequestMapping(value= "verifyUser",method = RequestMethod.GET)
	public ModelAndView verifyUser() throws Exception{
		ModelAndView mv = new ModelAndView("verifyUser");
		mv.addObject(new UserLogin());
		return mv;
	}
	
	
	@RequestMapping(value= "activateUser",method = RequestMethod.GET)
	public ModelAndView activateUser(@RequestParam String userId, @RequestParam String key) throws Exception{
		if(StringUtils.isBlank(userId) || StringUtils.isBlank(key) || isNumber(userId)){
			return new ModelAndView("userConfirmationFailure");
		}
		UserLogin user = new UserLogin();
		user.setUserId(Long.valueOf(userId));
		user.setSecretKey(key);

		try{
			loginService.activateUser(new ServiceRequest<UserLogin>(user,ControllerUtil.getVariableName(user)), null,configProvider.getClientDetails());
			return new ModelAndView("registrationSuccess");
		}catch(ServiceException ex){
			return new ModelAndView("userConfirmationFailure");
		}
	}
	
	
	
	/**
	 * ***********************************************************************************************************
	 * 											Forgot password
	 * *********************************************************************************************************** 
	 */
	
	@RequestMapping(value="forgotPassword",method = RequestMethod.GET)
	public ModelAndView showForgotPassword(){
		ModelAndView mv = new ModelAndView("forgotPassword");
		mv.addObject(new UserLogin());
		return mv;
	}
	
	@RequestMapping(value="forgotPassword",method = RequestMethod.POST)
	public ModelAndView forgotPassword(UserLogin user) throws Exception{
		ServiceResponse<UserLogin> serviceResponse = loginService.forgotPassword(new ServiceRequest<UserLogin>(user,ControllerUtil.getVariableName(user)), null,configProvider.getClientDetails());
		if (serviceResponse.getBindingResult().hasErrors()) {
			ModelAndView mv = new ModelAndView("forgotPassword");
			mv.addObject(ControllerUtil.getVariableName(serviceResponse.getBindingResult()),serviceResponse.getBindingResult());
			return mv;
		}
		return new ModelAndView("forgotPasswordConfirmation");
	}

	@RequestMapping(value= "resetPassword",method = RequestMethod.GET)
	public ModelAndView resetPassword(@RequestParam String userId, @RequestParam String key) {
		if(StringUtils.isBlank(userId) || StringUtils.isBlank(key) || isNumber(userId)){
			return new ModelAndView("userConfirmationFailure");
		}
		ModelAndView mv = new ModelAndView("resetPassword");
		UserLogin resetPassword = new UserLogin();
		resetPassword.setSecretKey(key);
		resetPassword.setUserId(Long.valueOf(userId));
		mv.addObject(resetPassword);
		return mv;
	}

	@RequestMapping(value= "resetPassword",method = RequestMethod.POST)
	public ModelAndView resetPassword(UserLogin user){
		try{
			ServiceResponse<UserLogin> serviceResponse = loginService.updatePassword(new ServiceRequest<UserLogin>(user,ControllerUtil.getVariableName(user)), null,configProvider.getClientDetails());
			if (serviceResponse.getBindingResult().hasErrors()) {
				ModelAndView mv = new ModelAndView("resetPassword");
				mv.addObject(ControllerUtil.getVariableName(serviceResponse.getBindingResult()),serviceResponse.getBindingResult());
				mv.addObject(user);
				return mv;
			}
			return new ModelAndView("resetPasswordSuccess");
		}catch(ServiceException ex){
			ex.printStackTrace();
			return new ModelAndView("userConfirmationFailure");
		}	
	}
	
	private boolean isNumber(String userId) {
		try{
			Long.valueOf(userId);
		}catch(NumberFormatException ex){
			return false;
		}
		return true;
	}
	
}
