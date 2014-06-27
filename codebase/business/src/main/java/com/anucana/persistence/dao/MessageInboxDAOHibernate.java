package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.MessageInboxEntity;

@Repository
public class MessageInboxDAOHibernate extends GenericDAOHibernate<MessageInboxEntity> implements MessageInboxDAO {

    @Autowired
    public MessageInboxDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
