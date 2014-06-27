package com.anucana.persistence.dao;

import java.io.Serializable;
import java.util.List;

import com.anucana.value.objects.Community;
import com.anucana.value.objects.CommunityKeyword;
import com.anucana.value.objects.UserCommunity;

@Deprecated
public interface IUserCommunityDao extends Serializable{
	
	List<String> selectAllKeywords(); 
	
	List<CommunityKeyword> selectKeywordsByCommunityId(long communityId);	
	
	List<Community> selectAllCommunities();

	List<Community> selectCommunitiesByIndustryCd(String industryCd);
	
	List<Community> selectUserSubscribedCommunities(long loginNumber);

	void saveUserCommunity(UserCommunity userCommunity);
	
	UserCommunity selectUserCommunity(long loginNumber,long communityId);
}
