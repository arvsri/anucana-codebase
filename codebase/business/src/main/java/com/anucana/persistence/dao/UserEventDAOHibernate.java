package com.anucana.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.entities.UserEventEntity;

@Repository
public class UserEventDAOHibernate extends GenericDAOHibernate<UserEventEntity> implements UserEventDAO {

    @Autowired
    public UserEventDAOHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

	@Override
	public int getEventBookedSeatsCount(long eventId) {
		Query query = currentSession().createQuery("select sum(userEvent.numberOfSeats) from UserEventEntity userEvent " +
				"where userEvent.status.typeCode=:userEventReservedStatus");
		query.setParameter("userEventReservedStatus", ITypeConstants.TYPE_USER_EVENT_STATUS_PAID);
		Object countObj = query.list().iterator().next();
		if(countObj != null){
			return ((Long)countObj).intValue();	
		}
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserEventEntity> findEnrolledUserEvents(long eventId) {
		Query query = currentSession().createQuery("from UserEventEntity userEvent " + "where userEvent.status.typeCode=:userEventEnrolledStatus");
		query.setParameter("userEventEnrolledStatus", ITypeConstants.TYPE_USER_EVENT_STATUS_ENROLLED);
		return query.list();
	}

	@Override
	public UserEventEntity findUserEvents(long userId, long eventId) {
		
		Criteria criteria = currentSession().createCriteria(UserEventEntity.class).setFetchMode("status", FetchMode.SELECT);
		criteria.createAlias("user", "user");
		criteria.createAlias("event", "event");
		
		criteria.add(Restrictions.eq("user.id", userId));
		criteria.add(Restrictions.eq("event.id", eventId));
		
		return (UserEventEntity) criteria.uniqueResult();
	}
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UserEventEntity> findAllByUser(long userId,String status) {
		
		Criteria criteria = currentSession().createCriteria(UserEventEntity.class);
		criteria.createAlias("user", "user");
		criteria.createAlias("status", "status");
		
		criteria.add(Restrictions.eq("user.id", userId));
		criteria.add(Restrictions.eq("status.typeCode", status));

		criteria.setFetchMode("status", FetchMode.SELECT);
		criteria.setFetchMode("event", FetchMode.SELECT);
		
		criteria.addOrder(Order.desc("creationDate"));

		return criteria.list();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UserEventEntity> findAllByEventNameAndUser(long userId,String nameLike,String status) {
		
		Criteria criteria = currentSession().createCriteria(UserEventEntity.class);
		criteria.createAlias("user", "user");
		criteria.createAlias("status", "status");
		criteria.createAlias("event", "event");
		
		
		criteria.add(Restrictions.eq("user.id", userId));
		criteria.add(Restrictions.eq("status.typeCode", status));
		criteria.add(Restrictions.like("event.name", nameLike,MatchMode.ANYWHERE));

		criteria.setFetchMode("status", FetchMode.SELECT);
		criteria.setFetchMode("event", FetchMode.SELECT);

		criteria.addOrder(Order.desc("creationDate"));
		
		return criteria.list();
	}

}
