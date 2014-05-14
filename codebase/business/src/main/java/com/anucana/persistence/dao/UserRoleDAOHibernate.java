package com.anucana.persistence.dao;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.UserRoleEntity;

@Repository
public class UserRoleDAOHibernate extends GenericDAOHibernate<UserRoleEntity> implements UserRoleDAO<UserRoleEntity>{

	@Autowired
	public UserRoleDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<UserRoleEntity> getUserRoles(String userName) {
		Criteria crit = currentSession().createCriteria(UserRoleEntity.class).setFetchMode("role", FetchMode.SELECT);
		crit.createCriteria("userLogin").add(Restrictions.eq("username", userName));
		return crit.list();
	}

}
