package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.CommunityEntity;


public interface CommunityDAO extends GenericDAO<CommunityEntity> {

	List<CommunityEntity> findByName(String name);
	
}
