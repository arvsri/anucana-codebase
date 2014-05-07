package com.anucana.web.beans;

import java.io.Serializable;
import java.util.Date;

import com.anucana.value.objects.IError;
import com.anucana.value.objects.IViewRefreshable;

public class CommunityBean implements IError,IViewRefreshable,Serializable{

	/**
	 * Default serial version uid
	 */
	private static final long serialVersionUID = 1L;

	private long communityId;	

	private String name;
	
	private Date foundationDate;
	
	private String about;
	
	private String address;
	
	private String email;
	
	private String website;
	
	private String phone;
	
	private String phoneTypeCd;
	
	private String industryCd;
	
	private String statusCd;
	
	private String bannerUrl;

	private boolean inError = false;

	private String[] errorMessages = null;
	
	private boolean viewRefresh;
	
	private String viewRefreshURL;
	
	/**
	 * Flag to decide is the current logged in user is subscribed to this community.
	 * If no user has logged in, this flag would be false
	 */
	private boolean userSubscribed;
	
	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getIndustryCd() {
		return industryCd;
	}

	public void setIndustryCd(String industryCd) {
		this.industryCd = industryCd;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	@Override
	public boolean isInError() {
		return this.inError;
	}

	@Override
	public void setInError(boolean inError) {
		this.inError = inError;
	}

	@Override
	public String[] getErrorMessages() {
		return errorMessages;
	}

	@Override
	public void setErrorMessages(String... errors) {
		this.errorMessages = errors;
	}

	@Override
	public boolean isViewRefresh() {
		return viewRefresh;
	}

	@Override
	public void setViewRefresh(boolean viewRefresh) {
		this.viewRefresh = viewRefresh;
	}

	public boolean isUserSubscribed() {
		return userSubscribed;
	}

	public void setUserSubscribed(boolean userSubscribed) {
		this.userSubscribed = userSubscribed;
	}

	public String getViewRefreshURL() {
		return viewRefreshURL;
	}

	public void setViewRefreshURL(String viewRefreshURL) {
		this.viewRefreshURL = viewRefreshURL;
	}
	
	
}
