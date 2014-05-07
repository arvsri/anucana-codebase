package com.anucana.persistence.dao;

import com.anucana.persistence.entities.UserLoginEntity;

public interface UserLoginDAO<T> extends GenericDAO<T>{

	boolean doesUserExists(String userName);

	UserLoginEntity getUser(String userName);

}
