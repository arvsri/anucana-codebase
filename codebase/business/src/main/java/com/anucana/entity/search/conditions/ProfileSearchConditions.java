package com.anucana.entity.search.conditions;

public class ProfileSearchConditions {

	public static enum MODE {
		SEARCH_BY_NAME, SEARCH_BY_USER_NAME, SEARCH_BY_ID
	}

	private String name;

	private long loginId;

	private String username;

	private final MODE searchMode;
	
	public ProfileSearchConditions(MODE searchMode) {
		super();
		this.searchMode = searchMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLoginId() {
		return loginId;
	}

	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public MODE getSearchMode() {
		return searchMode;
	}

}
