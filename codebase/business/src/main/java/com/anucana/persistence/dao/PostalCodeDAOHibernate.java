package com.anucana.persistence.dao;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.PostalCodeEntity;

@Repository
public class PostalCodeDAOHibernate extends GenericDAOHibernate<PostalCodeEntity> implements PostalCodeDAO {

    @Autowired
    public PostalCodeDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

	@SuppressWarnings("unchecked")
	@Override
	public Collection<PostalCodeEntity> findAllByPostalCode(Integer postalCode) {
		Criteria crit = currentSession().createCriteria(PostalCodeEntity.class);
		crit.add(Restrictions.eq("postalCd", postalCode)).setFetchMode("country", FetchMode.SELECT);
		return crit.list();
	}

}
