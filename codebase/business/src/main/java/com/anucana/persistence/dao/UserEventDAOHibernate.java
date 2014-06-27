package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.UserEventEntity;

@Repository
public class UserEventDAOHibernate extends GenericDAOHibernate<UserEventEntity> implements UserEventDAO {

    @Autowired
    public UserEventDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
