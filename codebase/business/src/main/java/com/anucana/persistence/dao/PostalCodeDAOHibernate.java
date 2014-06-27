package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.PostalCodeEntity;

@Repository
public class PostalCodeDAOHibernate extends GenericDAOHibernate<PostalCodeEntity> implements PostalCodeDAO {

    @Autowired
    public PostalCodeDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
