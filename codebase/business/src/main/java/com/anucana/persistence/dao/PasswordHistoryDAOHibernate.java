package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.PasswordHistoryEntity;

@Repository
public class PasswordHistoryDAOHibernate extends GenericDAOHibernate<PasswordHistoryEntity> implements PasswordHistoryDAO {

    @Autowired
    public PasswordHistoryDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
