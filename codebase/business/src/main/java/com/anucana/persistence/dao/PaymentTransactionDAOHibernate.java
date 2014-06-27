package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.PaymentTransactionEntity;

@Repository
public class PaymentTransactionDAOHibernate extends GenericDAOHibernate<PaymentTransactionEntity> implements PaymentTransactionDAO {

    @Autowired
    public PaymentTransactionDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
