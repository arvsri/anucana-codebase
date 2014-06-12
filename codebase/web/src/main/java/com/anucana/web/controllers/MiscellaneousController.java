package com.anucana.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.value.objects.ContactUs;
import com.anucana.value.objects.UserLogin;

@Controller
public class MiscellaneousController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView showUserLoginHome() {
		ModelAndView mv = new ModelAndView("loginHome");
		mv.addObject(new UserLogin());
		return mv;
	}
	
	@RequestMapping(value = { "/unmanaged/contactUs"}, method = RequestMethod.GET)
	public ModelAndView showContactUs() {
		ModelAndView mv = new ModelAndView("contactUs");
		mv.addObject(new ContactUs());
		return mv;
	}
	

}
