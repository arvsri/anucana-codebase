package com.anucana.web.controllers;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.constants.ITypeConstants;
import com.anucana.value.objects.Address;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.Event;
import com.anucana.web.common.EventSearchCriteria;

/**
 * Controls flow to all the events organized by anucana
 * 
 * @author asrivastava
 * @since July 31, 2014
 *
 */
@Controller
@RequestMapping(value="/event/**")
public class EventController extends AccessController {
	
	private static List<Community> communities = new ArrayList<Community>();
	private static List<Event> events = new ArrayList<Event>();
	private static String DATE_FORMAT = "yyyy.MM.dd HH:mm";
	
	
	static{
		communities
				.add(new Community(
						1l,
						"Java Community",
						"A community of all java geeks, professionals and hobbysts.",
						"http://www.iwritetech.com/wp-content/uploads/2013/10/java_tech.jpg"));		
		communities
		.add(new Community(
				2l,
				"Spring Framework",
				"community of people who love programming in Spring - an open source application framework and inversion of control container for the Java platform.  ",
				"http://upload.wikimedia.org/wikipedia/de/9/9d/Spring_Logo.png"));		
		communities
		.add(new Community(
				3l,
				"Hibernate Community",
				"Hibernate - an orm which every one loves and hates in equal proportion",
				"http://docs.jboss.org/jbossclustering/hibernate-caching/3.3/en-US/html/images/hibernate_logo_a.png"));		
		communities
		.add(new Community(
				4l,
				"Linux Community",
				"Only we can call ourself geeks.",
				"http://scienceblogs.com/gregladen/files/2013/02/Linux.jpg"));
		
		try {
			events.add(new Event(
					1l,
					"Java threads in depth - 1",
					"http://blog.idrsolutions.com/wp-content/uploads/2013/09/Sun-java-logo.jpg",
					DateUtils.parseDate("2014.08.16 09:00", DATE_FORMAT),
					"Learn and discuss about java threads in details",
					"The Java thread facility and API is deceptively simple; however, writing complex programs that use threading effectively is not. This tutorial explores threading basics: what threads are, why they are useful, and how to get started writing simple programs that use them. You will also learn about exchanging data between threads, controlling threads, and how threads can communicate with each other.",
					new Address("122001", "Hotel Cross Road"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 1, 1));
			
			events.add(new Event(
					2l,
					"Java threads in depth - 2",
					"http://www.teacherweb.com/MA/Wellesley/Derryberry/owl.jpg",
					DateUtils.parseDate("2014.08.17 09:00", DATE_FORMAT),
					"Learn and discuss about java threads in details",
					"The Java thread facility and API is deceptively simple; however, writing complex programs that use threading effectively is not. This tutorial explores threading basics: what threads are, why they are useful, and how to get started writing simple programs that use them. You will also learn about exchanging data between threads, controlling threads, and how threads can communicate with each other.",
					new Address("122001", "Hotel Cross Road"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 1, 1));

			events.add(new Event(
					3l,
					"Java threads in depth - 3",
					"http://www.teacherweb.com/MA/Wellesley/Derryberry/owl.jpg",
					DateUtils.parseDate("2014.08.23 09:00", DATE_FORMAT),
					"Learn and discuss about java threads in details",
					"The Java thread facility and API is deceptively simple; however, writing complex programs that use threading effectively is not. This tutorial explores threading basics: what threads are, why they are useful, and how to get started writing simple programs that use them. You will also learn about exchanging data between threads, controlling threads, and how threads can communicate with each other.",
					new Address("122001", "Hotel Cross Road"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 1, 1));
			
			events.add(new Event(
					4l,
					"JVM Internals - 1",
					"http://www.javacoffeebreak.com/articles/inside_java/dec99figuretwo.gif",
					DateUtils.parseDate("2014.08.24 09:00", DATE_FORMAT),
					"learn about jvm internals",
					"A Java virtual machine (JVM) is a process virtual machine that can execute Java bytecode. It is the code execution component of the Java platform. Sun Microsystems has stated that there are over 5.5 billion JVM-enabled devices",
					new Address("122001", "Apparel House, Sector - 44"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 1, 1));

			events.add(new Event(
					5l,
					"JVM Internals - 2",
					"http://www.javacoffeebreak.com/articles/inside_java/dec99figuretwo.gif",
					DateUtils.parseDate("2014.08.25 09:00", DATE_FORMAT),
					"learn about jvm internals",
					"A Java virtual machine (JVM) is a process virtual machine that can execute Java bytecode. It is the code execution component of the Java platform. Sun Microsystems has stated that there are over 5.5 billion JVM-enabled devices",
					new Address("122001", "Apparel House, Sector - 44"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 1, 1));
			

			
			
			events.add(new Event(
					6l,
					"Spring MVC",
					"http://docs.myeclipseide.com/topic/org.skyway.core.doc/images/AppLayers-SpringMVC.jpg",
					DateUtils.parseDate("2014.08.02 09:00", DATE_FORMAT),
					"learn about spring mvc",
					"The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale, time zone and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods. With the introduction of Spring 3.0, the @Controller mechanism also allows you to create RESTful Web sites and applications, through the @PathVariable annotation and other features",
					new Address("110019", "IIT Delhi Auditorium"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 2, 1));
			
			events.add(new Event(
					7l,
					"Spring MVC",
					"http://docs.myeclipseide.com/topic/org.skyway.core.doc/images/AppLayers-SpringMVC.jpg",
					DateUtils.parseDate("2014.08.02 09:00", DATE_FORMAT),
					"learn about spring mvc",
					"The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale, time zone and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods. With the introduction of Spring 3.0, the @Controller mechanism also allows you to create RESTful Web sites and applications, through the @PathVariable annotation and other features",
					new Address("110019", "IIT Delhi Auditorium"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 2, 1));
			
			

			events.add(new Event(
					8l,
					"Linux - Shell Scripting",
					"http://en.wikipedia.org/wiki/Linux#mediaviewer/File:Tux.svg",
					DateUtils.parseDate("2014.08.02 13:00", DATE_FORMAT),
					"learn about spring mvc",
					"The development of Linux is one of the most prominent examples of free and open source software collaboration. The underlying source code may be used, modified, and distributed—commercially or non-commercially—by anyone under licenses such as the GNU General Public License. Typically, Linux is packaged in a format known as a Linux distribution for desktop and server use. Some popular mainstream Linux distributions include Debian, Ubuntu, Linux Mint, Fedora, openSUSE, Arch Linux, and the commercial Red Hat Enterprise Linux and SUSE Linux Enterprise Server. Linux distributions include the Linux kernel, supporting utilities and libraries and usually a large amount of application software to fulfill the distribution's intended use.",
					new Address("110019", "IIT Delhi Auditorium"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 4, 1));
			

			events.add(new Event(
					9l,
					"Linux - LAMP programming",
					"http://www.rosehosting.com/blog/wp-content/uploads/2012/06/lamp-linux-apache-mysql-php1.jpg",
					DateUtils.parseDate("2014.08.16 13:00", DATE_FORMAT),
					"LAMP Archtecture",
					"LAMP is an acronym for an archetypal model of web service solution stacks, originally consisting of largely interchangeable components: Linux, the Apache HTTP Server, the MySQL relational database management system, and the PHP programming language. As a solution stack, LAMP is suitable for building dynamic web sites and web applications. The LAMP model has since been adapted to other componentry, though typically consisting of free and open-source software. As an example, the equivalent installation on a Microsoft Windows operating system is known as WAMP.",
					new Address("110024", "Defence colony community center"), "9650733522",
					ITypeConstants.TYPE_PHONE_MOBILE, 4, 1));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value= "unmanaged/communities", method = RequestMethod.GET)
	public ModelAndView getCommunities(){
		ModelAndView mv = new ModelAndView();
		mv.addObject(communities);
		return mv;
	}
	
	@RequestMapping(value = "unmanaged/addresses", method = RequestMethod.GET)
	public ModelAndView getEventAddresses() {
		ModelAndView mv = new ModelAndView();
		List<Address> eventAddresses = new ArrayList<Address>();
		for (Event event : events) {
			eventAddresses.add(event.getAddress());
		}
		mv.addObject(eventAddresses);
		return mv;
	}	

	@RequestMapping(value = "unmanaged/{id}", method = RequestMethod.GET)
	public ModelAndView getEvent(@PathVariable("id") long eventId) {
		ModelAndView mv = new ModelAndView();
		for (Event event : events) {
			if(event.getEventId() == eventId){
				mv.addObject(event);
			}
		}
		return mv;
	}	
	
	@RequestMapping(value = "unmanaged/search", method = RequestMethod.GET)
	public ModelAndView getEvents(EventSearchCriteria searchCriteria) {
		ModelAndView mv = new ModelAndView();
		@SuppressWarnings("unchecked")
		List<?> matchedEvents = new ArrayList<Event>(CollectionUtils.select(events,searchCriteria));
		if(searchCriteria.getStartIndex() < matchedEvents.size()){
			int endIndex =  searchCriteria.getEndIndex() < matchedEvents.size() ? searchCriteria.getEndIndex() : matchedEvents.size();
			mv.addObject(matchedEvents.subList(searchCriteria.getStartIndex(), endIndex));
		}
		return mv;
	}	
	
	
	
}
