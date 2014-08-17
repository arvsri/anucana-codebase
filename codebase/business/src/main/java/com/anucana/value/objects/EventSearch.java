package com.anucana.value.objects;

public class EventSearch {
	
	private int pageNumber = 1;

	private int communityId;

	private int pincode;

	private String timeFilter = "MONTH";

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getCommunityId() {
		return communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getTimeFilter() {
		return timeFilter;
	}

	public void setTimeFilter(String timeFilter) {
		this.timeFilter = timeFilter;
	}

}
