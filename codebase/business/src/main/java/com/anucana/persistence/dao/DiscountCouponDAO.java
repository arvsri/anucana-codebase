package com.anucana.persistence.dao;

import java.util.List;

import com.anucana.persistence.entities.DiscountCouponEntity;

public interface DiscountCouponDAO extends GenericDAO<DiscountCouponEntity> {
	
	DiscountCouponEntity findByCouponCode(String couponCode);
	
	List<DiscountCouponEntity> findBySearchString(String searchString);

}
