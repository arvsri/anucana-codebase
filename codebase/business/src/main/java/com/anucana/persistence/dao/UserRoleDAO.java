package com.anucana.persistence.dao;

import java.util.Collection;

import com.anucana.persistence.entities.UserRoleEntity;

public interface UserRoleDAO<T> extends GenericDAO<T>{

	Collection<UserRoleEntity> getUserRoles(String userName);

}
