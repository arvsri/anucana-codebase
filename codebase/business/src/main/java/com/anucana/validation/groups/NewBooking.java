package com.anucana.validation.groups;

import javax.validation.GroupSequence;

@GroupSequence(value = { NewBooking.BookingDetails.class,NewBooking.CouponDetails.class, NewBooking.PaymentDetails.class })
public interface NewBooking {

	public static interface BookingDetails {

	}

	public static interface CouponDetails {

	}

	public static interface PaymentDetails {
	}

}
