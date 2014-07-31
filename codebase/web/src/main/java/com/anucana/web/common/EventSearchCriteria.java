package com.anucana.web.common;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.collections.Predicate;
import org.apache.commons.lang3.time.DateUtils;

import com.anucana.value.objects.Event;

public class EventSearchCriteria implements Serializable, Predicate {

	private static final long serialVersionUID = 1L;

	private int startIndex = 0;
	private int endIndex = 0;

	private long communityId = 0;
	private String pincode;

	private String timeFilter;

	@Override
	public boolean evaluate(Object arg0) {
		Date fromDate = new Date();
		Date toDate = null;
		if ("WEEK".equalsIgnoreCase(getTimeFilter())) {
			toDate = DateUtils.addWeeks(fromDate, 1);
		} else if ("MONTH".equalsIgnoreCase(getTimeFilter())) {
			toDate = DateUtils.addMonths(fromDate, 1);
		} else {
			toDate = DateUtils.addYears(fromDate, 1);
		}

		if (arg0 instanceof Event) {
			Event event = (Event) arg0;
			return event.getCommunityId() == getCommunityId()
					&& event.getAddress().getPinCode().equals(getPincode())
					&& (event.getEventDate().after(fromDate) && event
							.getEventDate().before(toDate));
		}

		return false;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getTimeFilter() {
		return timeFilter;
	}

	public void setTimeFilter(String timeFilter) {
		this.timeFilter = timeFilter;
	}

}
