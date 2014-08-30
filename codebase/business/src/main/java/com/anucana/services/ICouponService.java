package com.anucana.services;

import java.util.List;

import com.anucana.client.data.IClientDetails;
import com.anucana.entity.search.conditions.CouponSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.DiscountCoupon;

public interface ICouponService {

	ServiceResponse<DiscountCoupon> getCouponDetail(ServiceRequest<Long> request,IUserDetails userDetails, IClientDetails clientDetails) throws ServiceException;
	
	ServiceResponse<DiscountCoupon> saveCouponDetail(ServiceRequest<DiscountCoupon> request,IUserDetails userDetails, IClientDetails clientDetails) throws ServiceException;
	
	ServiceResponse<List<DiscountCoupon>> searchCoupons(ServiceRequest<CouponSearchConditions> request,IUserDetails userDetails, IClientDetails clientDetails) throws ServiceException;
	
	
}
