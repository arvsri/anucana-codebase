package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.UserCommunityEntity;


public interface UserCommunityDAO extends GenericDAO<UserCommunityEntity> {

	List<UserCommunityEntity> findBySubscriberId(long subscriberId);
	
	List<UserCommunityEntity> findByCommunityId(long communityId);
	
	UserCommunityEntity findByBusinessKey(long subscriberId,long communityId); 

}
