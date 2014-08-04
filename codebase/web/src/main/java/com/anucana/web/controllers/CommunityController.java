package com.anucana.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.CommunitySearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ICommunityService;
import com.anucana.services.IMultimediaService;
import com.anucana.services.IUtilityService;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.ImageOps;
import com.anucana.value.objects.ImageOps.ImageCropCordinates;
import com.anucana.value.objects.TypeGroup;
import com.anucana.web.beans.UserCommunityBean;
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
    
    

	@RequestMapping(value= "unmanaged/search",method = RequestMethod.GET)
	public ModelAndView showCommunitySearch() throws Exception {
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(new Community());
		return mv;
	}

	@RequestMapping(value= "unmanaged/{communityId}/keywords",method = RequestMethod.GET)
	public ModelAndView getKeywords(@PathVariable long communityId) throws Exception{
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(getAllKeywords());
		return mv;
	}
	

	@RequestMapping(value= "unmanaged/searchResultCount",method = RequestMethod.POST)
	public ModelAndView searchResultCount(@RequestParam(value="searchQuery") String searchQuery) throws Exception{
		Collection<Community> communities = getCommunitiesBySearchQuery(searchQuery);
		
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject((communities == null ) ? 0 : communities.size());
		return mv;
	}


	@RequestMapping(value= "unmanaged/searchPaginated",method = RequestMethod.POST)
	public ModelAndView searchPaginatedCommunities(@RequestParam(value="searchQuery") String searchQuery,@RequestParam(value="resultCount") int resultCount,@RequestParam(value="pageSize") int pageSize) throws Exception{

		List<Community> viewableCommunities = new ArrayList<Community>();
		List<Community> communities = getCommunitiesBySearchQuery(searchQuery); 
		List<Community> paginatedCommunities = new ArrayList<Community>();
		if(!CollectionUtils.isEmpty(communities)){
			int communitiesCount = communities.size();
			if(resultCount >= 0 && pageSize > 0 && resultCount < communitiesCount){
				
				int intialIndex = resultCount < communitiesCount ? resultCount : communitiesCount - 1;
				int finalIndex = resultCount + pageSize < communitiesCount ? resultCount + pageSize : communitiesCount ;
				
				paginatedCommunities.addAll(communities.subList(intialIndex, finalIndex));
			}
		}
		
		for(Community community : paginatedCommunities){
			Community viewableCommunity = new Community();
			BeanUtils.copyProperties(community, viewableCommunity);
//			viewableCommunity.setUserSubscribed(communityService.isUserSubscribed(session.getLoginNumber(), community.getCommunityId()));
			viewableCommunities.add(viewableCommunity);
		}
		
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(viewableCommunities);
		return mv;
	}
	
	private List<String> getAllKeywords() {
		List<String> keywords = new ArrayList<String>();
		keywords.add("Java");
		keywords.add("Microsoft");
		keywords.add("Ruby");
		keywords.add("Linux");
		return keywords;
	}

	private List<Community> getCommunitiesBySearchQuery(String searchQuery) {
		List<Community> communities = new ArrayList<Community>();
		communities.add(getCommunityInstance("Java Community", 1));
		communities.add(getCommunityInstance("Microsoft Community", 2));
		communities.add(getCommunityInstance("Ruby Community", 3));
		communities.add(getCommunityInstance("Linux Community", 4));
		return communities;
	}
	
	private Community getCommunityInstance(String name, int id){
		Community community = new Community();
		community.setCommunityId(id);
		community.setName(name);
		return community;
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
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SEARCH_BY_ID);
		ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		// if there is no community found, user deserves to see the error page
		mv.addObject(communities.getTargetObject().get(0));
		return mv;
	}
	
	/**
	 * *********************************************************************************************************************************************************
	 *										Managed services for community create/ update / delete / subscribe
	 * *********************************************************************************************************************************************************
	 */
	
	@RequestMapping(value= "managed/subscribe",method = RequestMethod.POST)
	public ModelAndView subscribeCommunity(@RequestParam(value="userId") long userId,@RequestParam(value="communityId") long communityId) throws Exception{
		ModelAndView mv = new ModelAndView();
		UserCommunityBean userCommunity = new UserCommunityBean();
		mv.addObject(userCommunity);
		return mv;
	}
	
	@RequestMapping(value= "managed/edit",method = RequestMethod.GET)
	public ModelAndView createCommunity() throws Exception {
		return new ModelAndView("redirect:/community/managed/edit/0");
	}
	
	@RequestMapping(value= "managed/edit/{communityId}",method = RequestMethod.GET)
	public ModelAndView editCommunity(@PathVariable long communityId) throws Exception {
		ModelAndView mv = new ModelAndView("editCommunity");
		if(communityId != 0){
			ServiceResponse<Community> response = communityService.getCommunityDetails(new ServiceRequest<Long>(communityId), getLoggedInUserDetails(), configProvider.getClientDetails());		
			mv.addObject(response.getTargetObject());
		}else{
			mv.addObject(new Community());
		}
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
