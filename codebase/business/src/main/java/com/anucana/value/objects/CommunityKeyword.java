package com.anucana.value.objects;


public class CommunityKeyword extends GenericVO {

	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = 3634704190627422147L;
	
	private long keywordId;
	
	private long communityId;
	
	private String keyword;


	public long getKeywordId() {
		return keywordId;
	}

	public void setKeywordId(long keywordId) {
		this.keywordId = keywordId;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
