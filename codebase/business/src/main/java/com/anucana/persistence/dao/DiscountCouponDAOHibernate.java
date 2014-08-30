package com.anucana.persistence.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.DiscountCouponEntity;

@Repository
public class DiscountCouponDAOHibernate extends GenericDAOHibernate<DiscountCouponEntity> implements DiscountCouponDAO {

	@Autowired
	public DiscountCouponDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public DiscountCouponEntity findByCouponCode(String couponCode) {
		
		Criteria criteria = currentSession().createCriteria(DiscountCouponEntity.class).setFetchMode("status", FetchMode.SELECT);
		criteria.setFetchMode("calculationStrategy", FetchMode.SELECT);
		criteria.add(Restrictions.eq("couponCode", couponCode));
		List<?> coupons = criteria.list();

		if (CollectionUtils.isNotEmpty(coupons)) {
			return (DiscountCouponEntity) coupons.get(0);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<DiscountCouponEntity> findBySearchString(String searchString) {
		
		Criteria criteria = currentSession().createCriteria(DiscountCouponEntity.class).setFetchMode("status", FetchMode.SELECT);
		criteria.setFetchMode("calculationStrategy", FetchMode.SELECT);
		criteria.add(Restrictions.like("couponCode", searchString,MatchMode.ANYWHERE));
		
		return criteria.list();
	}

}
