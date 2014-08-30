package com.anucana.validation.implementations;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.DiscountCouponDAO;
import com.anucana.persistence.entities.DiscountCouponEntity;
import com.anucana.validation.annotations.ValidDiscountCoupon;

/**
 * Validates if the discount coupon exists, its active and valid
 *  
 * @author asrivastava
 *
 */
public class DiscountCouponValidator implements ConstraintValidator<ValidDiscountCoupon, String>{

	@Autowired
	private DiscountCouponDAO discountCouponDAO;
	
	@Override
	public void initialize(ValidDiscountCoupon constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String couponCode, ConstraintValidatorContext context) {
		try{
			if(StringUtils.isBlank(couponCode)){
				return true;
			}
			DiscountCouponEntity coupon = discountCouponDAO.findByCouponCode(couponCode);
			if(coupon == null || ITypeConstants.TYPE_DISCOUNT_COUPON_INACTIVE.equals(coupon.getStatus().getTypeCode())){
				return false;
			}
			
			Date currentDate = new Date();
			return coupon.getValidFrom().before(currentDate) && coupon.getValidTo().after(currentDate); 
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

}
