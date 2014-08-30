package com.anucana.services;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.client.data.IClientDetails;
import com.anucana.entity.search.conditions.CouponSearchConditions;
import com.anucana.persistence.dao.DiscountCouponDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.entities.DiscountCouponEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.validation.groups.DiscountCouponCreate;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.DiscountCoupon;

/**
 * Provides services related with coupons ( Coupon create / update / delete )
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class CouponService extends AuditService implements ICouponService{

	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	@Autowired
	private TypeDAO typeDao; 
	@Autowired
	private DiscountCouponDAO discountCouponDAO ;
	
	@Override
	public ServiceResponse<DiscountCoupon> getCouponDetail(ServiceRequest<Long> request, IUserDetails userDetails,IClientDetails clientDetails) throws ServiceException {
		DiscountCouponEntity discountCouponEntity = discountCouponDAO.findById(request.getTargetObject());
		
		DiscountCoupon coupon = new DiscountCoupon();
		copyDBDetails(discountCouponEntity, coupon);
		
		return new ServiceResponse<DiscountCoupon>(coupon);
	}

	@Override
	public ServiceResponse<DiscountCoupon> saveCouponDetail(ServiceRequest<DiscountCoupon> request, IUserDetails userDetails,IClientDetails clientDetails) throws ServiceException {
		request.setValidator(jsr303validator);
		
		request.validate();
		if(request.getBindingResult().hasErrors()){
			return request;
		}

		DiscountCoupon discountCoupon = request.getTargetObject();
		// If its a coupon create case, validate the coupon code creation specific fields 
		if(discountCoupon.getCouponId() == 0l){
			request.validate(DiscountCouponCreate.class);
			if(request.getBindingResult().hasErrors()){
				return request;
			}
		}
		
		DiscountCouponEntity couponEntity = null;
		if(discountCoupon.getCouponId() == 0l){
			couponEntity = new DiscountCouponEntity();
			// coupon entity is set only during creation not during update
			couponEntity.setCouponCode(discountCoupon.getCouponCode());
		}else{
			couponEntity = discountCouponDAO.findById(discountCoupon.getCouponId());
		}
		
		copyBeanDetails(discountCoupon, couponEntity);
		stampAuditDetails(couponEntity, userDetails);
		discountCouponDAO.save(couponEntity);
		
		discountCoupon.setCouponId(couponEntity.getId());
		return new ServiceResponse<DiscountCoupon>(discountCoupon);
	}

	@Override
	public ServiceResponse<List<DiscountCoupon>> searchCoupons(ServiceRequest<CouponSearchConditions> request,IUserDetails userDetails, IClientDetails clientDetails)throws ServiceException {
		
		CouponSearchConditions couponSearchCondition = request.getTargetObject();
		List<DiscountCouponEntity> discountCouponEntities = new ArrayList<DiscountCouponEntity>();
		
		if(CouponSearchConditions.MODE.SEARCH_BY_ID.equals(couponSearchCondition.getSearchMode())){
			discountCouponEntities.add(discountCouponDAO.findById(couponSearchCondition.getCouponId()));
		}else{
			discountCouponEntities = discountCouponDAO.findBySearchString(couponSearchCondition.getSearchString());
		}
		
		List<DiscountCoupon> coupons = new ArrayList<DiscountCoupon>();
		if(CollectionUtils.isNotEmpty(discountCouponEntities)){
			for(DiscountCouponEntity discountCouponEntity : discountCouponEntities){
				DiscountCoupon coupon = new DiscountCoupon();
				copyDBDetails(discountCouponEntity, coupon);
				coupons.add(coupon);
			}
		}
		return new ServiceResponse<List<DiscountCoupon>>(coupons);
	}
	
	private void copyDBDetails(DiscountCouponEntity discountCouponEntity,DiscountCoupon coupon) {
		coupon.setCouponId(discountCouponEntity.getId());
		coupon.setCouponCode(discountCouponEntity.getCouponCode());
		
		coupon.setSummary(discountCouponEntity.getSummary());
		
		coupon.setRate(discountCouponEntity.getRate().toString());
		
		coupon.setValidFrom(DateFormatUtils.format(discountCouponEntity.getValidFrom(),DiscountCoupon.DATE_FORMAT));
		coupon.setValidTo(DateFormatUtils.format(discountCouponEntity.getValidTo(),DiscountCoupon.DATE_FORMAT));
		
		coupon.setCalculationStrategy(discountCouponEntity.getCalculationStrategy().getTypeCode());
		coupon.setStatusCode(discountCouponEntity.getStatus().getTypeCode());
	}
	
	private void copyBeanDetails(DiscountCoupon discountCoupon,DiscountCouponEntity couponEntity) throws ServiceException {
		couponEntity.setRate(Float.valueOf(discountCoupon.getRate()));
		try {
			couponEntity.setValidFrom(DateUtils.parseDate(discountCoupon.getValidFrom(), DiscountCoupon.DATE_FORMAT));
			couponEntity.setValidTo(DateUtils.parseDate(discountCoupon.getValidTo(), DiscountCoupon.DATE_FORMAT));
		} catch (ParseException e) {
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION, e);
		}
		couponEntity.setSummary(discountCoupon.getSummary());

		couponEntity.setStatus(typeDao.findByTypeCode(discountCoupon.getStatusCode()));
		couponEntity.setCalculationStrategy(typeDao.findByTypeCode(discountCoupon.getCalculationStrategy()));
	}
	
	
}
