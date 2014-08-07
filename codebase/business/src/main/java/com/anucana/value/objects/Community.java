package com.anucana.value.objects;

import java.io.Serializable;

import com.anucana.constants.ITypeConstants;
import com.anucana.validation.annotations.ValidCommunitySummary;
import com.anucana.validation.annotations.ValidDate;
import com.anucana.validation.annotations.ValidEmail;
import com.anucana.validation.annotations.ValidGroupType;
import com.anucana.validation.annotations.ValidKeyword;
import com.anucana.validation.annotations.ValidName;
import com.anucana.validation.annotations.ValidPhone;

public class Community implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;
	
	public static final String DATE_FORMAT = "dd/MM/yyyy";
	public static final String KEY_WORD_SEPARATOR = ",";
	

	private long communityId;

	private String name;
	private String foundationDate;

	private String about;
	private String email;

	private String phone;
	private String phoneTypeCd = ITypeConstants.TYPE_PHONE_WORK;

	private String industryCd;
	private String bannerUrl;
	private boolean dummyImage;
	
	private String keywords;
	
	// tells if the user in session ( if at all its there ) has subscribed to this community or not
	private boolean userSubscribed;
	
	public Community() {}
	
	public Community(long communityId, String name, String about,String bannerUrl) {
		super();
		this.communityId = communityId;
		this.name = name;
		this.bannerUrl = bannerUrl;
	}


	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	@ValidName
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@ValidDate(format = DATE_FORMAT)
	public String getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}

	@ValidCommunitySummary
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@ValidEmail
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ValidPhone
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_PHONE_TYPE_CD)
	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_INDUSTRY_TYPE_CD)
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

	@ValidKeyword
	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public boolean isDummyImage() {
		return dummyImage;
	}

	public void setDummyImage(boolean dummyImage) {
		this.dummyImage = dummyImage;
	}

	public boolean isUserSubscribed() {
		return userSubscribed;
	}

	public void setUserSubscribed(boolean userSubscribed) {
		this.userSubscribed = userSubscribed;
	}


}
