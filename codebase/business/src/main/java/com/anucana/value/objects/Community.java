package com.anucana.value.objects;

import java.io.Serializable;
import java.util.Date;

public class Community implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;

	private long communityId;

	private String name;
	private Date foundationDate;

	private String about;
	private Address address;

	private String email;
	private String website;

	private String phone;
	private String phoneTypeCd;

	private String industryCd;

	private String bannerUrl;

	private String[] keywords;
	private long[] subscribers;
	
	
	public Community(long communityId, String name, String about,String bannerUrl) {
		super();
		this.communityId = communityId;
		this.name = name;
		this.bannerUrl = bannerUrl;
	}

	public Community() {}

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

	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public long[] getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(long[] subscribers) {
		this.subscribers = subscribers;
	}

}
