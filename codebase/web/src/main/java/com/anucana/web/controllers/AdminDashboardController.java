package com.anucana.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.entity.search.conditions.CommunitySearchConditions;
import com.anucana.entity.search.conditions.CouponSearchConditions;
import com.anucana.entity.search.conditions.EventSearchConditions;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ICommunityService;
import com.anucana.services.ICouponService;
import com.anucana.services.IEventService;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.DiscountCoupon;
import com.anucana.value.objects.Event;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Gateway to all admin activites
 * 
 * 
 * @author asrivastava
 *
 */
@Controller
@RequestMapping(value="/admin/managed/**")
public class AdminDashboardController extends AccessController{

    @Autowired
    private IWebConfigsProvider configProvider;
	@Autowired
	private ICommunityService communityService;
	@Autowired
	private IEventService eventService;
    @Autowired
    private ICouponService couponService;
	
	@RequestMapping(value= "dashboard", method = RequestMethod.GET)
	public ModelAndView showAdminDashBoard() throws Exception {
		ModelAndView mv = new ModelAndView("administrationDasboard");
		return mv;
	}
	
	@RequestMapping(value= "dashboard", params="action=SearchCommunities",method = RequestMethod.POST)
	public ModelAndView searchCommunities(@RequestParam(value="searchString") String searchString) throws Exception {
		ModelAndView mv = new ModelAndView("administrationDasboard");
		mv.addObject("action","SearchCommunities");
		
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_NAME);
		searchCondition.setName(searchString);
		
		ServiceResponse<List<Community>> response = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
        mv.addObject("communities",response.getTargetObject());

		return mv;
	}
	
	@RequestMapping(value= "dashboard", params="action=SearchEvents",method = RequestMethod.POST)
	public ModelAndView searchEvents(@RequestParam(value="searchString") String searchString) throws Exception {
		ModelAndView mv = new ModelAndView("administrationDasboard");
		mv.addObject("action","SearchEvents");
		
		EventSearchConditions searchCondition = new EventSearchConditions(EventSearchConditions.MODE.SEARCH_BY_NAME);
		searchCondition.setName(searchString);
		
		ServiceResponse<List<Event>> response = eventService.searchEvents(new ServiceRequest<EventSearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
        mv.addObject("events",response.getTargetObject());

		return mv;
	}

	
	@RequestMapping(value= "dashboard", params="action=SearchCoupons",method = RequestMethod.POST)
	public ModelAndView searchCoupons(@RequestParam(value="searchString") String searchString) throws Exception {
		ModelAndView mv = new ModelAndView("administrationDasboard");
		mv.addObject("action","SearchCoupons");
		
		CouponSearchConditions searchConditions = new CouponSearchConditions(CouponSearchConditions.MODE.SEARCH_BY_NAME);
		searchConditions.setSearchString(searchString);
		
		ServiceResponse<List<DiscountCoupon>> coupons = 
				couponService.searchCoupons(new ServiceRequest<CouponSearchConditions>(searchConditions), getLoggedInUserDetails(),configProvider.getClientDetails());
        mv.addObject("coupons",coupons.getTargetObject());

		return mv;
	}
	
	
	
}
