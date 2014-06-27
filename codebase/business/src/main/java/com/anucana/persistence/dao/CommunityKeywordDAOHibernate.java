package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.CommunityKeywordEntity;

@Repository
public class CommunityKeywordDAOHibernate extends GenericDAOHibernate<CommunityKeywordEntity> implements CommunityKeywordDAO {

    @Autowired
    public CommunityKeywordDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
