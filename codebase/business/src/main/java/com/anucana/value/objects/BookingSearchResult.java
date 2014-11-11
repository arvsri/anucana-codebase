package com.anucana.value.objects;

import java.util.Calendar;
import java.util.Date;

public class BookingSearchResult {

	private long userEventId; 
	
	private int numberOfBookedSeats;
	
	private float payment;

	private Date dateOfBooking;
	
	private DateBreakup dateOfBookingBreakUp;
	
	private long eventId;
	
	private Event event;

	public long getUserEventId() {
		return userEventId;
	}

	public void setUserEventId(long userEventId) {
		this.userEventId = userEventId;
	}

	public int getNumberOfBookedSeats() {
		return numberOfBookedSeats;
	}

	public void setNumberOfBookedSeats(int numberOfBookedSeats) {
		this.numberOfBookedSeats = numberOfBookedSeats;
	}

	public float getPayment() {
		return payment;
	}

	public void setPayment(float payment) {
		this.payment = payment;
	}

	public Date getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
		if (this.dateOfBooking != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateOfBooking);
			this.dateOfBookingBreakUp = new DateBreakup(cal.get(Calendar.DATE),
					cal.get(Calendar.MONTH), cal.get(Calendar.YEAR),
					cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE),
					cal.get(Calendar.AM_PM));
		}
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public DateBreakup getDateOfBookingBreakUp() {
		return dateOfBookingBreakUp;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	
}
