package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.UserEventEntity;


public interface UserEventDAO extends GenericDAO<UserEventEntity> {
	
	int getEventBookedSeatsCount(long eventId);
	
	List<UserEventEntity> findEnrolledUserEvents(long eventId);
	
	List<UserEventEntity> findUserEvents(long userId,long eventId);

	List<UserEventEntity> findAllByUser(long userId,String status);
	
	List<UserEventEntity> findAllByEventNameAndUser(long userId,String nameLike,String status);
	
}
