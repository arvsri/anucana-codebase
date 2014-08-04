package com.anucana.persistence.dao;

import java.util.Date;
import java.util.List;

import com.anucana.persistence.entities.EventEntity;


public interface EventDAO extends GenericDAO<EventEntity> {

	List<EventEntity> findByName(String name);

	List<EventEntity> findByCommunityId(long communityId);
	
	List<EventEntity> findBySpeakerId(long userId);
	
	List<EventEntity> findConditionally(long communityId, int pinCode,Date fromDate, Date toDate);

}
