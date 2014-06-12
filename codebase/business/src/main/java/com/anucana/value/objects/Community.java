package com.anucana.value.objects;

import java.util.Collection;
import java.util.Date;

public class Community extends GenericVO implements IRankable{

	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = 539431027283878645L;

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
	
	private Collection<CommunityKeyword> keywords;
	private Collection<Long> subscribers;
	
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

	public Collection<CommunityKeyword> getKeywords() {
		return keywords;
	}
	public void setKeywords(Collection<CommunityKeyword> keywords) {
		this.keywords = keywords;
	}
	public Collection<Long> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(Collection<Long> subscribers) {
		this.subscribers = subscribers;
	}

	private int totalRank;
	
	@Override
	public void addRank(MatchRank rank) {
		totalRank += totalRank + rank.getRankValue();
	}
	@Override
	public Integer getTotalRank() {
		return totalRank;
	}
	
	public String getBannerUrl() {
		return bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	
	
}
