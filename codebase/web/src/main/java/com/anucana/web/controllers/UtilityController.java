package com.anucana.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.services.IUtilityService;

@Controller
@RequestMapping(value="/util/unmanaged/*")
public class UtilityController {

	@Autowired
	private IUtilityService utiltiyService ;
	
	@RequestMapping(value= "/group/{groupCode}",method = RequestMethod.GET)
	public ModelAndView update(@ PathVariable("groupCode") String groupCode) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.addObject(utiltiyService.getTypesByGroup(groupCode));
		return mv;
	}
	
}
