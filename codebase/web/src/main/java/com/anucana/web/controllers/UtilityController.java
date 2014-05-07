package com.anucana.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anucana.services.IUtilityService;

@Controller
@RequestMapping(value="/util/*")
public class UtilityController {

	@Autowired
	private IUtilityService utiltiyService ;
	
	@RequestMapping(value= "/group/{groupCode}",method = RequestMethod.GET)
	@ResponseBody
	public Object update(@ PathVariable("groupCode") String groupCode) throws Exception{
		return utiltiyService.getTypesByGroup(groupCode);
	}
	
}
