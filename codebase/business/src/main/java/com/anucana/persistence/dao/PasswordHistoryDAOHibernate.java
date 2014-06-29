package com.anucana.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.PasswordHistoryEntity;

@Repository
public class PasswordHistoryDAOHibernate extends GenericDAOHibernate<PasswordHistoryEntity> implements PasswordHistoryDAO {

    @Autowired
    public PasswordHistoryDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
    @SuppressWarnings("unchecked")
	@Override
	public List<PasswordHistoryEntity> getOldPasswordsOfUser(Long userId) {
		Criteria criteria = currentSession().createCriteria(PasswordHistoryEntity.class).add(Restrictions.eq("userLogin.id", userId));
		return criteria.list();
	}    

}
