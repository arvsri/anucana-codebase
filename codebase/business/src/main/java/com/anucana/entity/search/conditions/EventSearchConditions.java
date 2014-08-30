package com.anucana.entity.search.conditions;



public class EventSearchConditions {

	public static enum MODE {
		SEARCH_BY_SPEAKER_ID, SEARCH_BY_COMMUNITY_ID, SEARCH_BY_MULTI_CONDITIONS, SEARCH_BY_ID, SEARCH_BY_NAME
	}

	public static enum LOAD {
		BASIC,FULL
	}
	
	public static enum PERIOD {
		WEEK,MONTH,YEAR
	}
	
	private String name;
	private long speakerId;
	private long communityId;
	private long eventId;
	private int pinCode;
	private PERIOD searchPeriod;
	private final MODE searchMode;
	private final LOAD resultLoad;

	public EventSearchConditions(MODE searchMode) {
		super();
		this.searchMode = searchMode;
		this.resultLoad = LOAD.BASIC;
	}

	public EventSearchConditions(MODE searchMode,LOAD resultLoad) {
		super();
		this.searchMode = searchMode;
		this.resultLoad = resultLoad;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(long speakerId) {
		this.speakerId = speakerId;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public PERIOD getSearchPeriod() {
		return searchPeriod;
	}

	public void setSearchPeriod(PERIOD searchPeriod) {
		this.searchPeriod = searchPeriod;
	}

	public MODE getSearchMode() {
		return searchMode;
	}

	public LOAD getResultLoad() {
		return resultLoad;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	
}
