package com.anucana.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anucana.services.IUserCommunityService;
import com.anucana.value.objects.Community;
import com.anucana.web.beans.CommunityBean;
import com.anucana.web.beans.UserCommunityBean;

@Controller
@RequestMapping(value="/community/*")
public class CommunityController {

//	@Autowired
//	private IUserSession session;
	
	@Autowired
	private IUserCommunityService communityService;

	@RequestMapping(value= "/searchView",method = RequestMethod.GET)
	public String showCommunitySearch(ModelMap model) throws Exception{
		model.addAttribute(new Community());
		return "communitySearch";
	}
	
	@RequestMapping(value= "/{communityId}",method = RequestMethod.GET)
	public String showCommunity(@PathVariable long communityId, ModelMap model) throws Exception{
		model.addAttribute(new Community());
		return "community";
	}

	
	@RequestMapping(value= "/keywords",method = RequestMethod.GET)
	@ResponseBody
	public Collection<String> getKeywords() throws Exception{
		return communityService.getAllKeywords();
	}
	
	@RequestMapping(value= "/searchResultCount",method = RequestMethod.POST)
	@ResponseBody
	public int searchResultCount(@RequestParam(value="searchQuery") String searchQuery) throws Exception{
		Collection<Community> communities = communityService.getCommunitiesBySearchQuery(searchQuery);
		return (communities == null ) ? 0 : communities.size();
	}

	@RequestMapping(value= "/searchPaginated",method = RequestMethod.POST)
	@ResponseBody
	public Collection<CommunityBean> searchPaginatedCommunities(@RequestParam(value="searchQuery") String searchQuery,@RequestParam(value="resultCount") int resultCount,@RequestParam(value="pageSize") int pageSize) throws Exception{
		List<CommunityBean> viewableCommunities = new ArrayList<CommunityBean>();
		
		List<Community> communities = communityService.getCommunitiesBySearchQuery(searchQuery); 
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
			CommunityBean viewableCommunity = new CommunityBean();
			BeanUtils.copyProperties(community, viewableCommunity);
//			viewableCommunity.setUserSubscribed(communityService.isUserSubscribed(session.getLoginNumber(), community.getCommunityId()));
			viewableCommunities.add(viewableCommunity);
		}
		
		return viewableCommunities;
	}
	
	@RequestMapping(value= "/listAll",method = RequestMethod.GET)
	@ResponseBody
	public Collection<Community> listCommunities() throws Exception{
		return communityService.getAllCommunities();
	}

	@RequestMapping(value= "/subscribe",method = RequestMethod.POST)
	@ResponseBody
	public UserCommunityBean subscribeCommunity(@RequestParam(value="loginNumber") long loginNumber,@RequestParam(value="communityId") long communityId) throws Exception{
		UserCommunityBean userCommunity = new UserCommunityBean();
		if(isAuthenticated(loginNumber)){
			BeanUtils.copyProperties(communityService.subscribeCommunity(loginNumber, communityId),userCommunity);	
			return userCommunity;
		}else{
			userCommunity.setInError(true);
			userCommunity.setErrorMessages("User could not be authenticated !");
			
			userCommunity.setViewRefresh(true);
			userCommunity.setViewRefreshURL("/loginExistingUser");
			return userCommunity;
		}
		
	}

	private boolean isAuthenticated(long loginNumber) {
//		return session.getLoginNumber() == loginNumber && session.isAuthenticated();
		return true;
	}
	
}
