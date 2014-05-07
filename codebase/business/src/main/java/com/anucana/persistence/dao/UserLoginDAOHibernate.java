package com.anucana.persistence.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.UserLoginEntity;

@Repository
public class UserLoginDAOHibernate extends GenericDAOHibernate<UserLoginEntity> implements UserLoginDAO<UserLoginEntity>{

	@Autowired
	public UserLoginDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public boolean doesUserExists(String userName) {
		UserLoginEntity user = getUser(userName);
		if(user == null){
			return false;
		}
		return true;
	}

	@Override
	public UserLoginEntity getUser(String userName) {
		Criteria criteria = currentSession().createCriteria(UserLoginEntity.class);
		criteria.add(Restrictions.eq("userName", userName));
		List<?> users = criteria.list();

		if (CollectionUtils.isNotEmpty(users)) {
			return (UserLoginEntity) users.get(0);
		}
		return null;
	}

}
