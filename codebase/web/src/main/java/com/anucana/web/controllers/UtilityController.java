package com.anucana.web.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.IUtilityService;
import com.anucana.value.objects.TypeGroup;

/**
 * Controller for exposing all utility services
 */
@Controller
@RequestMapping(value="/util/unmanaged/*")
public class UtilityController {

	@Autowired
	private IUtilityService utiltiyService ;
	
	@RequestMapping(value= "/group/{groupCode}",method = RequestMethod.GET)
	public ModelAndView update(@ PathVariable("groupCode") String groupCode) throws Exception{
		ModelAndView mv = new ModelAndView();
        ServiceResponse<Collection<TypeGroup.Type>> response = utiltiyService.getTypesByGroup(new ServiceRequest<String>(groupCode));
        mv.addObject(response.getTargetObject());
		return mv;
	}
	
}
