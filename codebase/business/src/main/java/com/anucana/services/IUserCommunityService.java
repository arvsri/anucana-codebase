package com.anucana.services;

import java.io.Serializable;
import java.util.List;

import com.anucana.value.objects.Community;
import com.anucana.value.objects.UserCommunity;

public interface IUserCommunityService extends Serializable{

	List<String> getAllKeywords();
	
	List<Community> getAllCommunities();
	
	List<Community> getUserSubscribedCommunities(long loginNumber);
	
	boolean isUserSubscribed(long loginNumber, long communityId);
	
	UserCommunity subscribeCommunity(long loginNumber,long communityId);
	
	List<Community> getCommunitiesByProfileMatch(long loginNumber);
	
	List<Community> getCommunitiesBySearchQuery(String searchQuery);
}
