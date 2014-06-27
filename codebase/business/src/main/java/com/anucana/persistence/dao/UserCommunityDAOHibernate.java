package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.UserCommunityEntity;

@Repository
public class UserCommunityDAOHibernate extends GenericDAOHibernate<UserCommunityEntity> implements UserCommunityDAO {

    @Autowired
    public UserCommunityDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
