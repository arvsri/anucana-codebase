package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.CommunityEntity;

@Repository
public class CommunityDAOHibernate extends GenericDAOHibernate<CommunityEntity> implements CommunityDAO {

    @Autowired
    public CommunityDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
