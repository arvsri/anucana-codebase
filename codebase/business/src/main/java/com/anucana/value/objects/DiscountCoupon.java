package com.anucana.value.objects;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import com.anucana.constants.ITypeConstants;
import com.anucana.validation.annotations.NotExists;
import com.anucana.validation.annotations.SupportedExistsType;
import com.anucana.validation.annotations.ValidCouponSummary;
import com.anucana.validation.annotations.ValidDate;
import com.anucana.validation.annotations.ValidFloat;
import com.anucana.validation.annotations.ValidGroupType;
import com.anucana.validation.groups.DiscountCouponCreate;

public class DiscountCoupon implements Serializable {
	
	private static final long serialVersionUID = -5930459300286365788L;

	public static final String DATE_FORMAT = "dd/MM/yyyy HH:mm";
	
	private long couponId;

	private String couponCode;
	
	private String summary;
	
	private String validFrom;
	
	private String validTo;
	
	private String calculationStrategy;
	
	private String rate;
	
	private String statusCode;

	private String searchString;
	
	private String action;
	
	public long getCouponId() {
		return couponId;
	}

	@Pattern(regexp = "[a-zA-Z0-9]{1,10}")
	@NotExists(groups = DiscountCouponCreate.class,value = SupportedExistsType.COUPON_CODE)
	public String getCouponCode() {
		return couponCode;
	}

	@ValidCouponSummary
	public String getSummary() {
		return summary;
	}

	
	@ValidDate(format = DATE_FORMAT)
	public String getValidFrom() {
		return validFrom;
	}

	@ValidDate(format = DATE_FORMAT)
	public String getValidTo() {
		return validTo;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_DISCOUNT_CALC_STRATEGY_TYPE)
	public String getCalculationStrategy() {
		return calculationStrategy;
	}

	@ValidFloat
	public String getRate() {
		return rate;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_DISCOUNT_COUPON_STATUS)
	public String getStatusCode() {
		return statusCode;
	}

	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}


	public void setCalculationStrategy(String calculationStrategy) {
		this.calculationStrategy = calculationStrategy;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
