package com.anucana.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISCOUNT_COUPON")
public class DiscountCouponEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

	private static final long serialVersionUID = 382698062586141684L;
	
	public static final int COUPON_CD_SIZE = 10;
    public static final int SUMMARY_SIZE = 5000;
	
	@Id
	@GeneratedValue
	@Column(name = "DISCOUNT_COUPON_ID")
	private Long id;
	
	@Column(name = "DISCOUNT_COUPON_CD",length = COUPON_CD_SIZE,nullable = false)
	private String couponCode;

	@Column(name = "SUMMARY", length = SUMMARY_SIZE)
	private String summary;
	
	@Column(name = "VALID_FROM_DT",nullable = false)
	private Date validFrom;
	
	@Column(name = "VALID_TO_DT",nullable = false)
	private Date validTo;
	
    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "CALC_STRATEGY", referencedColumnName = "TYPE_CD")
    private TypeTableEntity calculationStrategy;
    
    @Column(name = "RATE")
    private Float rate;

    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "STATUS_CD", referencedColumnName = "TYPE_CD")
    private TypeTableEntity status;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public TypeTableEntity getCalculationStrategy() {
		return calculationStrategy;
	}

	public void setCalculationStrategy(TypeTableEntity calculationStrategy) {
		this.calculationStrategy = calculationStrategy;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public TypeTableEntity getStatus() {
		return status;
	}

	public void setStatus(TypeTableEntity status) {
		this.status = status;
	}
	
    
}
