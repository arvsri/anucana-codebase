package com.anucana.value.objects;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	private long eventId;

	private String name;
	private Date eventDate;

	private String shortDesc;
	private String longDesc;

	private Address address;

	private String phone;
	private String phoneTypeCd;

	private String bannerUrl;

	private long communityId;
	private long speakerId;
	
	public Event(long eventId, String name, String bannerUrl, Date eventDate,
			String shortDesc, String longDesc, Address address, String phone,
			String phoneTypeCd, long communityId, long speakerId) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.bannerUrl = bannerUrl;
		this.eventDate = eventDate;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.address = address;
		this.phone = phone;
		this.phoneTypeCd = phoneTypeCd;
		this.communityId = communityId;
		this.speakerId = speakerId;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public long getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(long speakerId) {
		this.speakerId = speakerId;
	}

}
