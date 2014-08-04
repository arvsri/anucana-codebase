package com.anucana.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.CommunityEntity;

@Repository
public class CommunityDAOHibernate extends GenericDAOHibernate<CommunityEntity>
		implements CommunityDAO {

	@Autowired
	public CommunityDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CommunityEntity> findByName(String name) {
		Criteria criteria = currentSession().createCriteria(CommunityEntity.class);
		criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
		return criteria.list();
	}

}
