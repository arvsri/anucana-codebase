package com.anucana.entity.search.conditions;


public class CouponSearchConditions {

	public static enum MODE {
		SEARCH_BY_NAME, SEARCH_BY_ID
	}

	private long couponId;

	private String searchString;
	
	private final MODE searchMode;

	public CouponSearchConditions(MODE searchMode) {
		super();
		this.searchMode = searchMode;
	}

	public long getCouponId() {
		return couponId;
	}

	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public MODE getSearchMode() {
		return searchMode;
	}

	
}
