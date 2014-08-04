package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.UserLoginEntity;

public interface UserLoginDAO<T> extends GenericDAO<T>{

	boolean doesUserExists(String userName);

	UserLoginEntity findByUsername(String userName);

	UserLoginEntity getUserWithLoginHistory(String userName);
	
	List<UserLoginEntity> findByName(String userName);

}
