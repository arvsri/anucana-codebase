package com.anucana.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ICommunityService;
import com.anucana.services.IEventService;
import com.anucana.services.IMultimediaService;
import com.anucana.services.IUserProfileService;
import com.anucana.services.IUtilityService;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.Event;
import com.anucana.value.objects.ImageOps;
import com.anucana.value.objects.ImageOps.ImageCropCordinates;
import com.anucana.value.objects.TypeGroup;
import com.anucana.value.objects.UserProfile;
import com.anucana.web.common.IWebConfigsProvider;

@Controller
@RequestMapping(value="/community/**")
public class CommunityController extends AccessController{
	
	@Autowired
	private IUtilityService utiltiyService;
	@Autowired
	private ICommunityService communityService;
    @Autowired
    private IWebConfigsProvider configProvider;
    @Autowired
    private IMultimediaService multimediaService;
	@Autowired
	private IUserProfileService profileServie;
	@Autowired
	private IEventService eventService;
	@Value("#{propertyConfigurer['config.communities.pagesize']}")
	private Integer pageSize;
	@Value("#{propertyConfigurer['config.profiles.pagesize']}")
	private Integer profilesPageSize;    

	@RequestMapping(value= "unmanaged/home",method = RequestMethod.GET)
	public ModelAndView communityHome() throws Exception {
		ModelAndView mv = new ModelAndView("communitiesHome");
		mv.addObject(new Community());
		
		ServiceResponse<Collection<String>> keywords = communityService.getAllCommunityKeywords(getLoggedInUserDetails(), configProvider.getClientDetails());
		mv.addObject("keywords",keywords.getTargetObject());
		searchCommunities(1, null, mv);
		return mv;
	}
	
	@RequestMapping(value= "unmanaged/searchPaginated",method = RequestMethod.POST)
	public ModelAndView searchPaginatedCommunities(@RequestParam(value="pageNumber") int pageNumber,@RequestParam(value="keywords") String keywords) throws Exception{
		ModelAndView mv = new ModelAndView("communitySearch");
		searchCommunities(pageNumber, keywords, mv);
		return mv;
	}
	

	private void searchCommunities( int pageNumber,String keywords, ModelAndView mv) throws ServiceException{
		
		List<Community> searchedCommunities = new ArrayList<Community>();
		List<Community> pagedCommunities = new ArrayList<Community>();
		
		if(StringUtils.isNotBlank(keywords)){
			List<String> keywordCollection = new ArrayList<String>();
			keywordCollection.add(keywords);
			
			CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_KEYWORDS,CommunitySearchConditions.LOAD.FULL);
			searchCondition.setKeywords(keywordCollection);
			
			ServiceResponse<List<Community>> response = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
			searchedCommunities.addAll(response.getTargetObject());
			
		}else{
			CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SELECT_ALL,CommunitySearchConditions.LOAD.FULL);
			ServiceResponse<List<Community>> response = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
			searchedCommunities.addAll(response.getTargetObject());
		}

		int startIndex = (pageNumber - 1) * pageSize;
		int endIndex = pageNumber * pageSize;
		if (startIndex < searchedCommunities.size() && startIndex >= 0) {
			endIndex = endIndex < searchedCommunities.size() ? endIndex : searchedCommunities.size();
			pagedCommunities.addAll(searchedCommunities.subList(startIndex, endIndex));
		}
		mv.addObject(pagedCommunities);		
		mv.addObject("nextPage",pagedCommunities.size() == pageSize);
		
	}
	
	@RequestMapping(value= "unmanaged/listAll",method = RequestMethod.GET)
	public ModelAndView getCommunities() throws ServiceException{
		ModelAndView mv = new ModelAndView();
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SELECT_ALL);
		ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		mv.addObject(communities.getTargetObject());
		return mv;
	}
	
	@RequestMapping(value= "unmanaged/{communityId}",method = RequestMethod.GET)
	public ModelAndView showCommunity(@PathVariable long communityId) throws Exception{
		ModelAndView mv = new ModelAndView("community");
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_ID,CommunitySearchConditions.LOAD.FULL);
		searchCondition.setCommunityId(communityId);
		ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		// if there is no community found, user deserves to see the error page
		mv.addObject(communities.getTargetObject().get(0));
		
		EventSearchConditions eventSearchCondition = new EventSearchConditions(EventSearchConditions.MODE.SEARCH_BY_MULTI_CONDITIONS,EventSearchConditions.LOAD.FULL);
		eventSearchCondition.setCommunityId(communityId);
		eventSearchCondition.setSearchPeriod(EventSearchConditions.PERIOD.MONTH);
		
		ServiceResponse<List<Event>> response = eventService.searchEvents(new ServiceRequest<EventSearchConditions>(eventSearchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		List<Event> events =  response.getTargetObject();
		mv.addObject("events",events);
		return mv;
	}
	
	@RequestMapping(value= "unmanaged/subscribedBy/{userId}",method = RequestMethod.GET)
	public ModelAndView getSubscribedCommunities(@PathVariable long userId) throws ServiceException{
		ModelAndView mv = new ModelAndView();
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_SUBSCRIBER,CommunitySearchConditions.LOAD.FULL);
		if(getLoggedInUserDetails() != null){
			searchCondition.setSubscriberId(getLoggedInUserDetails().getUserId());
		}else{
			searchCondition.setSubscriberId(userId);
		}
		ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		mv.addObject(communities.getTargetObject());
		
		return mv;
	}
	
	
	@RequestMapping(value= "unmanaged/{communityId}/subscribers",method = RequestMethod.GET)
	public ModelAndView getSubscribersOfCommunity(@RequestParam(value="pageNumber") int pageNumber, @PathVariable long communityId) throws ServiceException{
		ModelAndView mv = new ModelAndView("community");
		ServiceResponse<List<Long>> response = communityService.getSubscriberIds(new ServiceRequest<Long>(communityId), getLoggedInUserDetails(), configProvider.getClientDetails());
		List<Long> subscriberIds =  response.getTargetObject();

		List<Long> pagedSubscriberIds = new ArrayList<Long>();
		List<UserProfile> subscribers = new ArrayList<UserProfile>();
		
		int startIndex = (pageNumber - 1) * profilesPageSize;
		int endIndex = pageNumber * profilesPageSize;
		if (startIndex < subscriberIds.size() && startIndex >= 0) {
			endIndex = endIndex < subscriberIds.size() ? endIndex : subscriberIds.size();
			pagedSubscriberIds.addAll(subscriberIds.subList(startIndex, endIndex));
		}
		
		for(Long subscriberId : pagedSubscriberIds){
			ServiceResponse<UserProfile> profileResp = profileServie.getProfileInfo(new ServiceRequest<Long>(subscriberId),getLoggedInUserDetails(),configProvider.getClientDetails());			
			subscribers.add(profileResp.getTargetObject());
		}
		
		mv.addObject("subscribers",subscribers);
		mv.addObject("nextPage",subscribers.size() == profilesPageSize);
		
		return mv;
	}
	
	
	/**
	 * *********************************************************************************************************************************************************
	 *										Managed services for community create/ update / delete / subscribe
	 * *********************************************************************************************************************************************************
	 */
	
	@RequestMapping(value= "managed/{communityId}/subscribe",method = RequestMethod.POST)
	public ModelAndView subscribeCommunity(@PathVariable long communityId) throws Exception{
		ServiceResponse<Boolean> response = communityService.subscribeCommunity(new ServiceRequest<Long>(communityId), getLoggedInUserDetails(), configProvider.getClientDetails());
		ModelAndView mv = new ModelAndView();
		mv.addObject(response.getTargetObject());
		return mv;
	}
	
	@RequestMapping(value= "managed/{communityId}/unsubscribe",method = RequestMethod.POST)
	public ModelAndView unsubscribeCommunity(@PathVariable long communityId) throws Exception{
		ServiceResponse<Boolean> response = communityService.unsubscribeCommunity(new ServiceRequest<Long>(communityId), getLoggedInUserDetails(), configProvider.getClientDetails());
		ModelAndView mv = new ModelAndView();
		mv.addObject(response.getTargetObject());
		return mv;
	}
	
	@RequestMapping(value= "managed/edit",method = RequestMethod.GET)
	public ModelAndView createCommunity() throws Exception {
		return new ModelAndView("redirect:/community/managed/edit/0");
	}
	
	@RequestMapping(value= "managed/edit/{communityId}",method = RequestMethod.GET)
	public ModelAndView editCommunity(@PathVariable long communityId) throws Exception {
		ModelAndView mv = new ModelAndView("editCommunity");
		ServiceResponse<Community> response = communityService.getCommunityDetails(new ServiceRequest<Long>(communityId),getLoggedInUserDetails(),configProvider.getClientDetails());
		mv.addObject(response.getTargetObject());
		setIndustryCodes(mv);
		return mv;
	}

	
	@RequestMapping(value= "managed/edit/{communityId}",method = RequestMethod.POST)
	public ModelAndView saveCommunity(Community community) throws Exception {
		ModelAndView mv = new ModelAndView("editCommunity");
		ServiceResponse<Community> response = communityService.saveCommunityDetails(new ServiceRequest<Community>(community), getLoggedInUserDetails(), configProvider.getClientDetails());
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			setIndustryCodes(mv);
			return mv;
		}
		return new ModelAndView("redirect:/community/managed/edit/" + response.getTargetObject().getCommunityId());
	}

	
	@RequestMapping(value= "managed/edit/image/{communityId}", method = RequestMethod.POST)
	public ModelAndView uploadCommunityBanner(@PathVariable("communityId") long communityId,MultipartFile image) throws Exception{
		ModelAndView mv = new ModelAndView("imageUpload");
		if(communityId == 0){
			return mv;
		}
		
		ImageOps imageOps = new ImageOps(ImageOps.BUCKET.COMMUNITY);
		imageOps.setImage(image);
		imageOps.setId(communityId);
		
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
	
	@RequestMapping(value= "managed/edit/image/{communityId}",params="imageCrop",method = RequestMethod.POST)
	public ModelAndView cropCommunityBanner(@PathVariable("communityId") long communityId, ImageCropCordinates corpCoordinates) throws Exception{
		ModelAndView mv = new ModelAndView("imageUpload");
		if(communityId == 0){
			return mv;
		}

		ImageOps imageOps = new ImageOps(ImageOps.BUCKET.COMMUNITY);
		imageOps.setCropCoordinates(corpCoordinates);
		imageOps.setId(communityId);
		
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
	
	private void setIndustryCodes(ModelAndView mv) throws ServiceException {
		// Get the industry codes
		ServiceResponse<Collection<TypeGroup.Type>> industryCodes = utiltiyService.getTypesByGroup(new ServiceRequest<String>(ITypeConstants.TYPE_GRP_INDUSTRY_TYPE_CD));
		mv.addObject("industryCodes",industryCodes.getTargetObject());
	}

}
