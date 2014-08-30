package com.anucana.value.objects;

import java.io.Serializable;

import javax.validation.constraints.Min;

import com.anucana.validation.annotations.ValidDiscountCoupon;
import com.anucana.validation.annotations.ValidEventBooking;
import com.anucana.validation.annotations.ValidEventBookingPayment;
import com.anucana.validation.annotations.ValidPhone;
import com.anucana.validation.annotations.ValidUserBooking;
import com.anucana.validation.groups.NewBooking;

@ValidEventBooking(groups = NewBooking.BookingDetails.class)
@ValidUserBooking(groups = NewBooking.BookingDetails.class)
@ValidEventBookingPayment(groups = NewBooking.PaymentDetails.class)
public class UserBooking implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String phone;
	
	private boolean updateProfilePhone;
	
	private long communityId;
	
	private long eventId;
	
	// Must be set as the userId of the logged in user
	private long userId;
	
	// for display purposes only
	private Event event;
	
	private int numberOfSeats;
	
	// for display purpose only
	private int numberOfAvailableSeats;
	
	private float payment;
	
	private String discountCouponCode;
	// for ui display purposes
	private Discount discount;
	
	// payment after applying discount coupon if any 
	private float netPayment;
	
	//user action 
	private String action;

	@ValidPhone(groups = NewBooking.BookingDetails.class)
	public String getPhone() {
		return phone;
	}

	
	public boolean isUpdateProfilePhone() {
		return updateProfilePhone;
	}

	public long getCommunityId() {
		return communityId;
	}

	public long getEventId() {
		return eventId;
	}

	public long getUserId() {
		return userId;
	}


	public Event getEvent() {
		return event;
	}

	@Min(value = 1,groups = NewBooking.BookingDetails.class)
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public float getPayment() {
		return payment;
	}
	
	@ValidDiscountCoupon(groups = NewBooking.CouponDetails.class)
	public String getDiscountCouponCode() {
		return discountCouponCode;
	}

	public float getNetPayment() {
		return netPayment;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public void setPayment(float payment) {
		this.payment = payment;
	}

	public void setDiscountCouponCode(String discountCouponCode) {
		this.discountCouponCode = discountCouponCode;
	}

	public void setNetPayment(float netPayment) {
		this.netPayment = netPayment;
	}


	public void setUpdateProfilePhone(boolean updateProfilePhone) {
		this.updateProfilePhone = updateProfilePhone;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public Discount getDiscount() {
		return discount;
	}


	public void setDiscount(Discount discount) {
		this.discount = discount;
	}


	public int getNumberOfAvailableSeats() {
		return numberOfAvailableSeats;
	}


	public void setNumberOfAvailableSeats(int numberOfAvailableSeats) {
		this.numberOfAvailableSeats = numberOfAvailableSeats;
	}
	
}
