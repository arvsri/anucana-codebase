package com.anucana.web.beans;

import java.io.Serializable;

import com.anucana.value.objects.IError;
import com.anucana.value.objects.IViewRefreshable;

public class UserCommunityBean implements IViewRefreshable,IError,Serializable{
	
	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = -5093064612871079266L;
	
	private long loginNumber;
	private long communityId;

	private boolean inError = false;
	private String[] errorMessages = null;
	private String viewRefreshURL;
	private boolean viewRefresh;
	
	
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
	public boolean isInError() {
		return inError;
	}
	public void setInError(boolean inError) {
		this.inError = inError;
	}
	public String[] getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(String... errorMessages) {
		this.errorMessages = errorMessages;
	}
	public String getViewRefreshURL() {
		return viewRefreshURL;
	}
	public void setViewRefreshURL(String viewRefreshURL) {
		this.viewRefreshURL = viewRefreshURL;
	}
	public boolean isViewRefresh() {
		return viewRefresh;
	}
	public void setViewRefresh(boolean viewRefresh) {
		this.viewRefresh = viewRefresh;
	}
	
}
