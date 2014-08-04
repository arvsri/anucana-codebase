package com.anucana.persistence.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
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
		UserLoginEntity user = findByUsername(userName);
		if(user == null){
			return false;
		}
		return true;
	}

	@Override
	public UserLoginEntity findByUsername(String username) {
		Criteria criteria = currentSession().createCriteria(UserLoginEntity.class).setFetchMode("typeCodes", FetchMode.SELECT);
		criteria.add(Restrictions.eq("username", username));
		List<?> users = criteria.list();

		if (CollectionUtils.isNotEmpty(users)) {
			return (UserLoginEntity) users.get(0);
		}
		return null;
	}

	@Override
	public UserLoginEntity getUserWithLoginHistory(String username) {
		Criteria criteria = currentSession().createCriteria(UserLoginEntity.class).setFetchMode("loginHistories", FetchMode.SELECT);
		criteria.add(Restrictions.eq("username", username));
		List<?> users = criteria.list();

		if (CollectionUtils.isNotEmpty(users)) {
			return (UserLoginEntity) users.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserLoginEntity> findByName(String name) {
		Criteria criteria = currentSession().createCriteria(UserLoginEntity.class);
		criteria.add(Restrictions.or(Restrictions.like("firstName",name,MatchMode.ANYWHERE),Restrictions.like("lastName",name,MatchMode.ANYWHERE)));
		return criteria.list();
	}

}
