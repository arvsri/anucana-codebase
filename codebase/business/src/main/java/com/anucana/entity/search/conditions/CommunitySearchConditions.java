package com.anucana.entity.search.conditions;

import java.util.Collection;

public class CommunitySearchConditions {

	public static enum MODE {
		SEARCH_BY_NAME, SEARCH_BY_KEYWORDS, SEARCH_BY_SUBSCRIBER, SEARCH_BY_ID,SELECT_ALL
	}

	private String name;

	private long communityId;

	private long subscriberId;

	private Collection<String> keywords;

	private final MODE searchMode;
	
	public CommunitySearchConditions(MODE searchMode) {
		super();
		this.searchMode = searchMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public Collection<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(Collection<String> keywords) {
		this.keywords = keywords;
	}

	public MODE getSearchMode() {
		return searchMode;
	}

}
