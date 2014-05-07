package com.anucana.value.objects;


public class UserCommunity extends GenericVO {

	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = -7116333509451202940L;

	private long userCommunityId;

	private long loginNumber;
	
	private long communityId;

	public long getUserCommunityId() {
		return userCommunityId;
	}

	public void setUserCommunityId(long userCommunityId) {
		this.userCommunityId = userCommunityId;
	}

	public long getLoginNumber() {
		return loginNumber;
	}

	public void setLoginNumber(long loginNumber) {
		this.loginNumber = loginNumber;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}
	
	

}
