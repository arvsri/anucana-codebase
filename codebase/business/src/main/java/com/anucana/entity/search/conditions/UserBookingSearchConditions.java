package com.anucana.entity.search.conditions;



public class UserBookingSearchConditions {

	public static enum MODE {
		SEARCH_BY_ID_FOR_USER, SEARCH_BY_EVENT_NAME_FOR_USER,SEARCH_ALL_FOR_USER
	}

	private String eventName;

	private long userEventId;
	
	private String status;

	private final MODE searchMode;
	
	
	public UserBookingSearchConditions(MODE searchMode) {
		super();
		this.searchMode = searchMode;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public long getUserEventId() {
		return userEventId;
	}

	public void setUserEventId(long userEventId) {
		this.userEventId = userEventId;
	}

	public MODE getSearchMode() {
		return searchMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
