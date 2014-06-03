package com.anucana.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controls all the user flows related with events

 * @author asrivastava
 *
 */
@Controller
@RequestMapping(value="/events/**")
public class EventsController {

	@RequestMapping(value= "unmanaged/home",method = RequestMethod.GET)
	public ModelAndView showEventsHome() throws Exception{
		return new ModelAndView("eventsHome");
	}
	
}
