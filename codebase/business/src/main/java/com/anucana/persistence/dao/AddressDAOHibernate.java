package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.AddressEntity;

@Repository
public class AddressDAOHibernate extends GenericDAOHibernate<AddressEntity> implements AddressDAO {

    @Autowired
    public AddressDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
