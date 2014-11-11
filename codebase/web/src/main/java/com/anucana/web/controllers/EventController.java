package com.anucana.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.CommunitySearchConditions;
import com.anucana.entity.search.conditions.EventSearchConditions;
import com.anucana.entity.search.conditions.ProfileSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ICommunityService;
import com.anucana.services.IEventService;
import com.anucana.services.IMultimediaService;
import com.anucana.services.IUserProfileService;
import com.anucana.services.IUtilityService;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.SimpleUtils;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.Address;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.Event;
import com.anucana.value.objects.EventSearch;
import com.anucana.value.objects.ImageOps;
import com.anucana.value.objects.ImageOps.ImageCropCordinates;
import com.anucana.value.objects.PostalCode;
import com.anucana.value.objects.TypeGroup;
import com.anucana.value.objects.UserProfile;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Controls flow to all the events organized by anucana
 * 
 * @author asrivastava
 * @since August 2, 2014
 *
 */
@Controller
@RequestMapping(value="/event/**")
public class EventController extends AccessController {
	
	@Autowired
	private IUtilityService utiltiyService;
    @Autowired
    private IWebConfigsProvider configProvider;
    @Autowired
    private IMultimediaService multimediaService;
	@Autowired
	private IUserProfileService profileServie;
	@Autowired
	private ICommunityService communityService;
	@Autowired
	private IEventService eventService;
	
	@Value("#{propertyConfigurer['config.events.pagesize']}")
	private final Integer pageSize = 5;

	/**
	 ***********************************************************************************************************************************************************
	 *														Unmanaged public services for event search and select
	 *********************************************************************************************************************************************************** 
	 */

	@RequestMapping(value = "unmanaged/home", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView showEventsHome(EventSearch eventSearch) throws ServiceException {
		ModelAndView mv = new ModelAndView("eventsHome");
		
		ServiceResponse<List<Address>> addresses = eventService.getAllEventAddresses(getLoggedInUserDetails(), configProvider.getClientDetails());
		Map<String,Address> uniqueDistrictMap = new HashMap<String,Address>();
		for(Address address : addresses.getTargetObject()){
			uniqueDistrictMap.put(address.getDistrict(), address);
		}
		mv.addObject("addresses",uniqueDistrictMap.values());
		
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SELECT_ALL);
		ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		mv.addObject("communities",communities.getTargetObject());
		search(eventSearch,mv);
		return mv;
	}	
	
	@RequestMapping(value = "unmanaged/{id}", method = RequestMethod.GET)
	public ModelAndView getEvent(@PathVariable("id") long eventId) throws ServiceException {
		ModelAndView mv = new ModelAndView();
		ServiceResponse<Event> event = eventService.getEventDetails(new ServiceRequest<Long>(eventId),getLoggedInUserDetails(), configProvider.getClientDetails());
		mv.addObject(event.getTargetObject());
		return mv;
	}	

	@RequestMapping(value = "unmanaged/search", method = RequestMethod.GET)
	public ModelAndView search(EventSearch eventSearch) throws ServiceException {
		ModelAndView mv = new ModelAndView("eventsHome");
		return search(eventSearch, mv);
	}	
	
	
	private ModelAndView search(EventSearch eventSearch, ModelAndView mv)throws ServiceException {

		EventSearchConditions searchCondition = new EventSearchConditions(EventSearchConditions.MODE.SEARCH_BY_MULTI_CONDITIONS,EventSearchConditions.LOAD.FULL);
		searchCondition.setCommunityId(eventSearch.getCommunityId());
		searchCondition.setPinCode(eventSearch.getPincode());
		
		EventSearchConditions.PERIOD period = null;
		if("WEEK".equalsIgnoreCase(eventSearch.getTimeFilter())){
			period = EventSearchConditions.PERIOD.WEEK; 
		}else if("MONTH".equalsIgnoreCase(eventSearch.getTimeFilter())){
			period = EventSearchConditions.PERIOD.MONTH;
		}else{
			period = EventSearchConditions.PERIOD.YEAR;
		}
		searchCondition.setSearchPeriod(period);
		
		ServiceResponse<List<Event>> response = eventService.searchEvents(new ServiceRequest<EventSearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		List<Event> events =  response.getTargetObject();
		List<Event> paginatedEvents =  new ArrayList<Event>();

		int startIndex = (eventSearch.getPageNumber() - 1) * pageSize;
		int endIndex = eventSearch.getPageNumber() * pageSize;
		if(startIndex < events.size() && startIndex >=0 ){
			endIndex =  endIndex < events.size() ? endIndex : events.size();
			paginatedEvents.addAll(events.subList(startIndex, endIndex));
		}
		mv.addObject("events",paginatedEvents);
		mv.addObject("eventSearch",eventSearch);
		mv.addObject("nextPage",paginatedEvents.size() == pageSize);
		
		return mv;
	}	
	
	
	/**
	 ***********************************************************************************************************************************************************
	 *														Managed services for event create/update/delete
	 *********************************************************************************************************************************************************** 
	 */
	
	@RequestMapping(value= "managed/edit",method = RequestMethod.GET)
	public ModelAndView createEvent() throws Exception {
		return new ModelAndView("redirect:/event/managed/edit/0");
	}
	
	@RequestMapping(value= "managed/edit/{eventId}",method = RequestMethod.GET)
	public ModelAndView editEvent(@PathVariable long eventId) throws Exception {
		ModelAndView mv = new ModelAndView("event");
		ServiceResponse<Event> response = eventService.getEventDetails(new ServiceRequest<Long>(eventId), getLoggedInUserDetails(), configProvider.getClientDetails());
		Event event = response.getTargetObject();
		mv.addObject(event);
		setAdditionalDetails(event,mv);
		return mv;
	}

	@RequestMapping(value= "managed/edit/{eventId}",method = RequestMethod.POST)
	public ModelAndView saveEvent(Event event, @RequestParam("action") String action) throws Exception {
		ModelAndView mv = new ModelAndView("event");
		if("save".equals(action)){
			ServiceResponse<Event> response = eventService.saveEventDetails(new ServiceRequest<Event>(event), getLoggedInUserDetails(), configProvider.getClientDetails());
			if(response.getBindingResult().hasErrors()){
				mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			}else{
				return new ModelAndView("redirect:/event/managed/edit/" + response.getTargetObject().getEventId());
			}
		}
		setAdditionalDetails(event,mv);
		return mv;
	}

	@RequestMapping(value= "managed/edit/image/{eventId}", method = RequestMethod.POST)
	public ModelAndView uploadEventBanner(@PathVariable("eventId") long eventId,MultipartFile image) throws Exception{
		ModelAndView mv = new ModelAndView("imageUpload");
		if(eventId == 0){
			return mv;
		}
		
		ImageOps imageOps = new ImageOps(ImageOps.BUCKET.EVENT);
		imageOps.setImage(image);
		imageOps.setId(eventId);
		
		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		ServiceResponse<ImageOps> response = multimediaService.saveImage(new ServiceRequest<ImageOps>(imageOps), userDetails, configProvider.getClientDetails());
		
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			return mv;
		}
		mv.addObject("imgURL",response.getTargetObject().getTimedImageURL());
		mv.addObject("isDummy",response.getTargetObject().isDummy());
		
		return mv;
	}
	
	@RequestMapping(value= "managed/edit/image/{eventId}",params="imageCrop",method = RequestMethod.POST)
	public ModelAndView cropEventBanner(@PathVariable("eventId") long eventId, ImageCropCordinates corpCoordinates) throws Exception{
		ModelAndView mv = new ModelAndView("imageUpload");
		if(eventId == 0){
			return mv;
		}

		ImageOps imageOps = new ImageOps(ImageOps.BUCKET.EVENT);
		imageOps.setCropCoordinates(corpCoordinates);
		imageOps.setId(eventId);
		
		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		ServiceResponse<ImageOps> response = multimediaService.cropImage(new ServiceRequest<ImageOps>(imageOps), userDetails, configProvider.getClientDetails());
		
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			return mv;
		}
		mv.addObject("imgURL",response.getTargetObject().getTimedImageURL());
		mv.addObject("isDummy",response.getTargetObject().isDummy());
		
		return mv;
	}

	private void setAdditionalDetails(Event event,ModelAndView mv) throws ServiceException {

		if(StringUtils.isNotBlank(event.getPinCode())){
	        ServiceResponse<Collection<PostalCode>> postalCodes = utiltiyService.getPostalCodes(new ServiceRequest<Integer>(SimpleUtils.intVal(event.getPinCode())));
	        mv.addObject("postalCodes",postalCodes.getTarget());
		}
		
		if(StringUtils.isNotBlank(event.getSearchSpeakerCriteria())){
			ProfileSearchConditions searchConditions = new ProfileSearchConditions(ProfileSearchConditions.MODE.SEARCH_BY_NAME);
			searchConditions.setName(event.getSearchSpeakerCriteria());
			ServiceResponse<List<UserProfile>> profiles = profileServie.searchProfiles(new ServiceRequest<ProfileSearchConditions>(searchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
	        mv.addObject("profiles",profiles.getTarget());
		}else if(SimpleUtils.longVal(event.getSpeakerId()) != 0){
			ProfileSearchConditions searchConditions = new ProfileSearchConditions(ProfileSearchConditions.MODE.SEARCH_BY_ID);
			searchConditions.setLoginId(SimpleUtils.longVal(event.getSpeakerId()));
			ServiceResponse<List<UserProfile>> profiles = profileServie.searchProfiles(new ServiceRequest<ProfileSearchConditions>(searchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
	        mv.addObject("profiles",profiles.getTarget());
		}
		
		if(StringUtils.isNotBlank(event.getCommunitySearchCriteria())){
			CommunitySearchConditions searchConditions = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_NAME);
			searchConditions.setName(event.getCommunitySearchCriteria());
			ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
	        mv.addObject("communities",communities.getTarget());
		}else if(SimpleUtils.longVal(event.getCommunityId()) != 0){
			CommunitySearchConditions searchConditions = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_ID);
			searchConditions.setCommunityId(SimpleUtils.longVal(event.getCommunityId()));
			ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
	        mv.addObject("communities",communities.getTarget());
		}
		// Get the event importance index
        mv.addObject("importanceIndices",Event.EVENT_IMPORTANCE_INDEX);

		// Get the status code
        ServiceResponse<Collection<TypeGroup.Type>> statusTypes = utiltiyService.getTypesByGroup(new ServiceRequest<String>(ITypeConstants.TYPE_GRP_EVENT_STATUS));
        mv.addObject("statusTypes",statusTypes.getTargetObject());
	}
	
	
}
