package com.anucana.value.objects;

import java.io.Serializable;

public class UserBooking implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String phone;
	
	private String updateProfilePhone;
	
	private long communityId;
	
	private long eventId;
	
	// for display purposes only
	private Event event;
	
	private int numberOfSeats;
	
	private double payment;
	
	private String discountCouponCode;

	private int discountCouponId;
	
	// payment after applying discount coupon if any 
	private double netPayment;

	public String getPhone() {
		return phone;
	}

	public String getUpdateProfilePhone() {
		return updateProfilePhone;
	}

	public long getCommunityId() {
		return communityId;
	}

	public long getEventId() {
		return eventId;
	}

	public Event getEvent() {
		return event;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public double getPayment() {
		return payment;
	}

	public String getDiscountCouponCode() {
		return discountCouponCode;
	}

	public int getDiscountCouponId() {
		return discountCouponId;
	}

	public double getNetPayment() {
		return netPayment;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUpdateProfilePhone(String updateProfilePhone) {
		this.updateProfilePhone = updateProfilePhone;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public void setDiscountCouponCode(String discountCouponCode) {
		this.discountCouponCode = discountCouponCode;
	}

	public void setDiscountCouponId(int discountCouponId) {
		this.discountCouponId = discountCouponId;
	}

	public void setNetPayment(double netPayment) {
		this.netPayment = netPayment;
	}

	
	
}
