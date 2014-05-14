package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.UserLoginHistoryEntity;

@Repository
public class UserLoginHistoryDAOHibernate extends GenericDAOHibernate<UserLoginHistoryEntity> implements UserLoginHistoryDAO<UserLoginHistoryEntity>{
	
	@Autowired
	public UserLoginHistoryDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
