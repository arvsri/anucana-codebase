package com.anucana.persistence.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.EventEntity;

@Repository
public class EventDAOHibernate extends GenericDAOHibernate<EventEntity> implements EventDAO {

    @Autowired
    public EventDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<EventEntity> findByName(String name) {
		Criteria criteria = currentSession().createCriteria(EventEntity.class);
		criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
		return criteria.list();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EventEntity> findConditionally(long communityId, int pinCode,Date fromDate, Date toDate) {
		Criteria criteria = currentSession().createCriteria(EventEntity.class);
		criteria.add(Restrictions.between("eventDate", fromDate, toDate));
		if(communityId != 0){
			criteria.add(Restrictions.eq("community.id", communityId));
		}
		if(pinCode != 0){
			criteria.createAlias("venue.postalCode", "pc");
			criteria.add(Restrictions.eq("pc.postalCd", pinCode));
		}
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EventEntity> findByCommunityId(long communityId) {
		Criteria criteria = currentSession().createCriteria(EventEntity.class);
		criteria.add(Restrictions.eq("community.id", communityId));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EventEntity> findBySpeakerId(long userId) {
		Criteria criteria = currentSession().createCriteria(EventEntity.class);
		criteria.add(Restrictions.eq("speaker.id", userId));
		return criteria.list();
	}

}
