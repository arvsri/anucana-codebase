package com.anucana.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.UserCommunityEntity;

@Repository
public class UserCommunityDAOHibernate extends GenericDAOHibernate<UserCommunityEntity> implements UserCommunityDAO {

    @Autowired
    public UserCommunityDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

	@Override
    @SuppressWarnings("unchecked")
	public List<UserCommunityEntity> findBySubscriberId(long subscriberId) {
		Criteria criteria = currentSession().createCriteria(UserCommunityEntity.class);
		criteria.add(Restrictions.eq("userLogin.id", subscriberId));
		criteria.setFetchMode("community", FetchMode.SELECT);
		return criteria.list();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UserCommunityEntity> findByCommunityId(long communityId) {
		Criteria criteria = currentSession().createCriteria(UserCommunityEntity.class);
		criteria.add(Restrictions.eq("community.id", communityId));
		criteria.setFetchMode("userLogin", FetchMode.SELECT);
		return criteria.list();
	}
	
	@Override
	public UserCommunityEntity findByBusinessKey(long subscriberId,long communityId) {
		Criteria criteria = currentSession().createCriteria(UserCommunityEntity.class);
		criteria.add(Restrictions.eq("userLogin.id", subscriberId));
		criteria.add(Restrictions.eq("community.id", communityId));
		return (UserCommunityEntity) criteria.uniqueResult();
	}
	

}
