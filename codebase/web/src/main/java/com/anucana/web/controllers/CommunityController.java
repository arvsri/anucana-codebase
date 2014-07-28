package com.anucana.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.value.objects.Community;
import com.anucana.web.beans.CommunityBean;
import com.anucana.web.beans.UserCommunityBean;

@Controller
@RequestMapping(value="/community/managed/*")
public class CommunityController {

	@RequestMapping(value= "/search",method = RequestMethod.GET)
	public ModelAndView showCommunitySearch() throws Exception {
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(new Community());
		return mv;
	}

	@RequestMapping(value= "/{communityId}",method = RequestMethod.GET)
	public ModelAndView showCommunity(@PathVariable long communityId, ModelMap model) throws Exception{
		ModelAndView mv = new ModelAndView("community");
		mv.addObject(new Community());
		return mv;
	}

	
	@RequestMapping(value= "/keywords",method = RequestMethod.GET)
	public ModelAndView getKeywords() throws Exception{
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(getAllKeywords());
		return mv;
	}
	

	@RequestMapping(value= "/searchResultCount",method = RequestMethod.POST)
	public ModelAndView searchResultCount(@RequestParam(value="searchQuery") String searchQuery) throws Exception{
		Collection<Community> communities = getCommunitiesBySearchQuery(searchQuery);
		
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject((communities == null ) ? 0 : communities.size());
		return mv;
	}


	@RequestMapping(value= "/searchPaginated",method = RequestMethod.POST)
	public ModelAndView searchPaginatedCommunities(@RequestParam(value="searchQuery") String searchQuery,@RequestParam(value="resultCount") int resultCount,@RequestParam(value="pageSize") int pageSize) throws Exception{

		List<CommunityBean> viewableCommunities = new ArrayList<CommunityBean>();
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
			CommunityBean viewableCommunity = new CommunityBean();
			BeanUtils.copyProperties(community, viewableCommunity);
//			viewableCommunity.setUserSubscribed(communityService.isUserSubscribed(session.getLoginNumber(), community.getCommunityId()));
			viewableCommunities.add(viewableCommunity);
		}
		
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(viewableCommunities);
		return mv;
	}
	
	@RequestMapping(value= "/listAll",method = RequestMethod.GET)
	public ModelAndView listCommunities() throws Exception{
		ModelAndView mv = new ModelAndView("communitySearch");
		mv.addObject(getAllCommunities());
		return mv;
	}

	@RequestMapping(value= "/subscribe",method = RequestMethod.POST)
	public ModelAndView subscribeCommunity(@RequestParam(value="loginNumber") long loginNumber,@RequestParam(value="communityId") long communityId) throws Exception{
		ModelAndView mv = new ModelAndView();
		UserCommunityBean userCommunity = new UserCommunityBean();
		mv.addObject(userCommunity);
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

	private Object getAllCommunities() {
		return getCommunitiesBySearchQuery(null);
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
	
	
}
