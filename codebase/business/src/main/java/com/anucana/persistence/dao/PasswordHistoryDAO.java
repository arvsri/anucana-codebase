package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.PasswordHistoryEntity;


public interface PasswordHistoryDAO extends GenericDAO<PasswordHistoryEntity> {
	
	List<PasswordHistoryEntity> getOldPasswordsOfUser(Long userId);	

}
