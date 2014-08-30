package com.anucana.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.PaymentTransactionLogEntity;

@Repository
public class PaymentTransactionLogDAOHibernate extends GenericDAOHibernate<PaymentTransactionLogEntity> implements PaymentTransactionLogDAO {
	
	@Autowired
	public PaymentTransactionLogDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}


}
