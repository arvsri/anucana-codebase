package com.anucana.web.controllers;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Conventions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.session.data.IUserSession;
import com.anucana.value.objects.ExistingUserLogin;
import com.anucana.value.objects.ForgotPasswordUserLogin;
import com.anucana.value.objects.NewUserLogin;
import com.anucana.value.objects.ResetPasswordUserLogin;
import com.anucana.value.objects.UserLogin;
import com.anucana.web.common.IWebConfigsProvider;


/**
 * Controller for user login module  
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
	
    @Autowired
    private IWebConfigsProvider configProvider;
	

	@RequestMapping(value= {"/","/loginHome"},method = RequestMethod.GET)
	public String showUserLoginHome(ModelMap model){
		model.addAttribute(new ExistingUserLogin());
		model.addAttribute(new NewUserLogin());
		return "loginHome";
	}


	/**
	 * ***********************************************************************************************************
	 * 											New User Registration
	 * *********************************************************************************************************** 
	 */
	
	@RequestMapping(value= "login/registerNewUser",method = RequestMethod.GET)
	public ModelAndView registerNewUser() throws Exception{
		ModelAndView mv = new ModelAndView("register");
		mv.addObject(new UserLogin());
		return mv;
	}
	@RequestMapping(value= "login/registerNewUser",method = RequestMethod.POST)
	public ModelAndView registerNewUser(UserLogin user) throws Exception{
		ServiceResponse<UserLogin> serviceResponse = loginService.registerNewUser(new ServiceRequest<UserLogin>(user,Conventions.getVariableName(user)), null,configProvider.getClientDetails());
		if (serviceResponse.getBindingResult().hasErrors()) {
			ModelAndView mv = new ModelAndView("register");
			mv.addObject("org.springframework.validation.BindingResult.userLogin",serviceResponse.getBindingResult());
			return mv;
		}
		return new ModelAndView("registrationConfirmation") ;
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
	public String activateNewUser(@RequestParam String username, @RequestParam String key) throws Exception{
		if (loginService.activateUser(username,key) != null) {
			return "registrationSuccess";
		}
		return "registrationFailure";
	}
	
	@RequestMapping(value= "/resetPassword",method = RequestMethod.GET)
	public String resetPassword(@RequestParam String username, @RequestParam String key,ModelMap model) throws Exception{
		if(StringUtils.isBlank(username) || StringUtils.isBlank(key)){
			return "registrationFailure";
		}
		
		ResetPasswordUserLogin userLogin = new ResetPasswordUserLogin();
		userLogin.setUsername(username);
		userLogin.setSecretKey(key);
		model.addAttribute(userLogin);
		
		return "resetPassword";
	}
	
	
	@RequestMapping(value= "/logout",method = RequestMethod.GET)
	public String logoutUser(ModelMap model) throws Exception{
		session.logOutUserSession();
		return "redirect:/";
	}
	

	@RequestMapping(value="/forgotPassword",method = RequestMethod.POST)
	public String forgotPassword(ForgotPasswordUserLogin user) throws Exception{
		ServiceResponse<UserLogin> serviceResponse = loginService.forgotPassword(new ServiceRequest<UserLogin>(user), null,configProvider.getClientDetails());
		if (serviceResponse.getBindingResult().hasErrors()) {
			return "forgotPassword";
		}
		return "forgotPasswordConfirmation";
	}
	
	@RequestMapping(value= "/resetPassword",method = RequestMethod.POST)
	public String resetPassword(@Valid ResetPasswordUserLogin user, BindingResult bindingResult) throws Exception{
		if (bindingResult.hasErrors()) {
			return "resetPassword";
		}
		
		if (loginService.updatePassword(user.getUsername(), user.getPassword1(), user.getSecretKey()) != null) {
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
