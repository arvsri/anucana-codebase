package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.EventEntity;

@Repository
public class EventDAOHibernate extends GenericDAOHibernate<EventEntity> implements EventDAO {

    @Autowired
    public EventDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
