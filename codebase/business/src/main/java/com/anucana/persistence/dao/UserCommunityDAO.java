package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.UserCommunityEntity;


public interface UserCommunityDAO extends GenericDAO<UserCommunityEntity> {

	List<UserCommunityEntity> findByLoginId(long subscriberId);

}
