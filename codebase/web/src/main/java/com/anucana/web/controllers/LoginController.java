package com.anucana.web.controllers;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anucana.services.ILoginService;
import com.anucana.session.data.IUserSession;
import com.anucana.value.objects.ExistingUserLogin;
import com.anucana.value.objects.ForgotPasswordUserLogin;
import com.anucana.value.objects.NewUserLogin;
import com.anucana.value.objects.ResetPasswordUserLogin;
import com.anucana.value.objects.UserLogin;


/**
 * Controls the user login ( authentication and authorization )  
 * 
 * @author asrivastava
 * 
 */
@Controller
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
	@Autowired
	private IUserSession session;

	@RequestMapping(value= {"/","/loginHome"},method = RequestMethod.GET)
	public String showUserLoginHome(ModelMap model){
		model.addAttribute(new ExistingUserLogin());
		model.addAttribute(new NewUserLogin());
		return "loginHome";
	}

	@RequestMapping(value= "/registerNewUser",method = RequestMethod.GET)
	public String registerNewUser(ModelMap model) throws Exception{
		model.addAttribute(new NewUserLogin());
		return "register";
	}

	@RequestMapping(value= "/loginExistingUser",method = RequestMethod.GET)
	public String loginExistingUser(ModelMap model) {
		model.addAttribute(new ExistingUserLogin());
		return "login";
	}
	
	@RequestMapping(value="/forgotPassword",method = RequestMethod.GET)
	public String showForgotPassword(ModelMap model){
		model.addAttribute(new ForgotPasswordUserLogin());
		return "forgotPassword";
	}

	@RequestMapping(value= "/verifyNewUser",method = RequestMethod.GET)
	public String activateNewUser(@RequestParam String userId, @RequestParam String key) throws Exception{
		if (loginService.activateUser(userId,key) != null) {
			return "registrationSuccess";
		}
		return "registrationFailure";
	}
	
	@RequestMapping(value= "/resetPassword",method = RequestMethod.GET)
	public String resetPassword(@RequestParam String userId, @RequestParam String key,ModelMap model) throws Exception{
		if(StringUtils.isBlank(userId) || StringUtils.isBlank(key)){
			return "registrationFailure";
		}
		
		ResetPasswordUserLogin userLogin = new ResetPasswordUserLogin();
		userLogin.setUserId(userId);
		userLogin.setSecretKey(key);
		model.addAttribute(userLogin);
		
		return "resetPassword";
	}
	
	
	@RequestMapping(value= "/logout",method = RequestMethod.GET)
	public String logoutUser(ModelMap model) throws Exception{
		session.logOutUserSession();
		return "redirect:/";
	}
	
	@RequestMapping(value= "/loginExistingUser",method = RequestMethod.POST)
	public String loginExistingUser(@Valid ExistingUserLogin user, BindingResult bindingResult) throws Exception{
		if(bindingResult.hasErrors()){
			return "login";
		}
		if(loginService.authenticateUser(user)){
			UserLogin userDetails = loginService.getUserDetails(user);
			// logout the previously logged in user and log in as new user
			session.logOutUserSession();
			session.buildUserSession(userDetails.getUserId(),userDetails.getUsername(), userDetails.getFirstName(), userDetails.getLastName(), true, null);
			
			loginService.updateLoginDate(userDetails, session);
			return "redirect:/managed/profile/" + userDetails.getUserId();
		}
		return "login";
	}

	@RequestMapping(value= "/registerNewUser",method = RequestMethod.POST)
	public String registerNewUser(@Valid NewUserLogin user, BindingResult bindingResult) throws Exception{
		if (bindingResult.hasErrors()) {
			return "register";
		}
		if (loginService.createUser(user) != null) {
			return "registrationConfirmation";
		}
		return "register";
	}

	@RequestMapping(value="/forgotPassword",method = RequestMethod.POST)
	public String forgotPassword(@Valid ForgotPasswordUserLogin user,BindingResult bindingResult) throws Exception{
		if (bindingResult.hasErrors()) {
			return "forgotPassword";
		}
		loginService.forgotPassword(user);
		return "forgotPasswordConfirmation";
	}
	
	@RequestMapping(value= "/resetPassword",method = RequestMethod.POST)
	public String resetPassword(@Valid ResetPasswordUserLogin user, BindingResult bindingResult) throws Exception{
		if (bindingResult.hasErrors()) {
			return "resetPassword";
		}
		
		if (loginService.updatePassword(user.getUserId(), user.getPassword1(), user.getSecretKey()) != null) {
			return "resetPasswordSuccess";
		}
		
		return "registrationFailure";
	}
	
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	public void setSession(IUserSession session) {
		this.session = session;
	}
}
