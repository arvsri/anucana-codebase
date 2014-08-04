package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.CommunityKeywordEntity;


public interface CommunityKeywordDAO extends GenericDAO<CommunityKeywordEntity> {

	List<CommunityKeywordEntity> findByKeyword(String keyword);	
}
