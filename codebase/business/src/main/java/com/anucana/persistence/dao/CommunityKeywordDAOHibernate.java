package com.anucana.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.CommunityKeywordEntity;

@Repository
public class CommunityKeywordDAOHibernate extends GenericDAOHibernate<CommunityKeywordEntity> implements CommunityKeywordDAO {

    @Autowired
    public CommunityKeywordDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<CommunityKeywordEntity> findByKeyword(String keyword) {
		Criteria criteria = currentSession().createCriteria(CommunityKeywordEntity.class);
		criteria.add(Restrictions.eq("keyword", keyword).ignoreCase());
		criteria.setFetchMode("community", FetchMode.SELECT);
		return criteria.list();
	}

}
