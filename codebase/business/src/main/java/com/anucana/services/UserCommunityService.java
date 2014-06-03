package com.anucana.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anucana.persistence.dao.IUserCommunityDao;
import com.anucana.value.objects.BestMatchClosure;
import com.anucana.value.objects.CommunityKeyword;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.RankComparator;
import com.anucana.value.objects.UserCommunity;
import com.anucana.value.objects.UserProfileInfo;

@Component
public class UserCommunityService implements IUserCommunityService {

	/**
	 * The default serial version uid
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IUserCommunityDao communityDao; 
	
	@Autowired
	private IUserProfileService userDetailsService;
	
	@Override
	public List<String> getAllKeywords() {
		return communityDao.selectAllKeywords();
	}

	@Override
	public List<Community> getAllCommunities() {
		return communityDao.selectAllCommunities();
	}

	@Override
	public List<Community> getUserSubscribedCommunities(long loginNumber) {
		return communityDao.selectUserSubscribedCommunities(loginNumber);
	}

	@Override
	public List<Community> getCommunitiesByProfileMatch(long loginNumber) {
		UserProfileInfo profileInfo = userDetailsService.getProfileInfo(loginNumber);
		if(profileInfo != null && !StringUtils.isBlank(profileInfo.getIndustryCd())){
			return communityDao.selectCommunitiesByIndustryCd(profileInfo.getIndustryCd());
		}
		return null;
	}
	
	/**
	 * Gets all the communities, rank them based on match of the keyword with search query parameters, sort them based on the rank
	 */
	@Override
	public List<Community> getCommunitiesBySearchQuery(String searchQuery) {
		if(StringUtils.isBlank(searchQuery)){
			return null;
		}
		
		String[] parameters = searchQuery.split(" ");
		
		List<Community> communities = new ArrayList<Community>();
		communities.addAll(communityDao.selectAllCommunities());

		for(Community community : communities){
			for(String searchParamter : parameters){
				List<CommunityKeyword> keywords = communityDao.selectKeywordsByCommunityId(community.getCommunityId());
				
				BestMatchClosure closure = new BestMatchClosure(searchParamter.trim()); 
				CollectionUtils.forAllDo(keywords, closure);
				
				community.addRank(closure.getHighestRank());
			}
		}
		
		Collections.sort(communities, new RankComparator());
		return communities;
	}

	@Override
	public boolean isUserSubscribed(long loginNumber, long communityId) {
		UserCommunity userCommunity = communityDao.selectUserCommunity(loginNumber, communityId);
		if(userCommunity != null){
			return true;
		}
		return false;
	}
	
	
	@Override
	public UserCommunity subscribeCommunity(long loginNumber, long communityId) {
		UserCommunity userCommunity = communityDao.selectUserCommunity(loginNumber, communityId);
		if(userCommunity != null){
			userCommunity.setInError(true);
			userCommunity.setErrorMessages("You are already subscribed to this community !");
			return userCommunity;
		}
		
		userCommunity = new UserCommunity();
		userCommunity.setCommunityId(communityId);
		userCommunity.setLoginNumber(loginNumber);
		
		communityDao.saveUserCommunity(userCommunity);
		
		return userCommunity;
	}

}
