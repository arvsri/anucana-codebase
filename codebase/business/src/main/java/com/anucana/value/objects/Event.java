package com.anucana.value.objects;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.anucana.constants.ITypeConstants;
import com.anucana.validation.annotations.Exists;
import com.anucana.validation.annotations.SupportedExistsType;
import com.anucana.validation.annotations.ValidAddressLine;
import com.anucana.validation.annotations.ValidDate;
import com.anucana.validation.annotations.ValidEventCapacity;
import com.anucana.validation.annotations.ValidEventDuration;
import com.anucana.validation.annotations.ValidEventImportanceIndex;
import com.anucana.validation.annotations.ValidEventLongDesciption;
import com.anucana.validation.annotations.ValidEventShortDesciption;
import com.anucana.validation.annotations.ValidGroupType;
import com.anucana.validation.annotations.ValidName;
import com.anucana.validation.annotations.ValidPhone;

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String DATE_FORMAT = "dd/MM/yyyy HH:mm";
	public static final List<Integer> EVENT_IMPORTANCE_INDEX = Arrays.asList(1,2,3,4,5);

	private long eventId;

	private String bannerUrl;
	private boolean dummyImage;

	private String eventDate;
	private String durationInMinutes;

	private String name;

	private String phone;
	private String importanceIndex;

	private String shortDesc;
	private String longDesc;

	private String pinCode;
	private String pincodeId;
	private String addressLine1;
	private String addressLine2;

	private String communityId;
	private String communitySearchCriteria;

	private String speakerId;
	private String searchSpeakerCriteria;
	// for ui purposes only
	private String speakerName;
	
	private String capacity;
	private String costInINR;
	private String statusCd;

	public long getEventId() {
		return eventId;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public boolean isDummyImage() {
		return dummyImage;
	}

	@ValidDate(format = DATE_FORMAT)
	public String getEventDate() {
		return eventDate;
	}

	@ValidEventDuration
	public String getDurationInMinutes() {
		return durationInMinutes;
	}

	@ValidName
	public String getName() {
		return name;
	}

	@ValidPhone
	public String getPhone() {
		return phone;
	}

	@ValidEventShortDesciption
	public String getShortDesc() {
		return shortDesc;
	}

	@ValidEventLongDesciption
	public String getLongDesc() {
		return longDesc;
	}

	public String getPinCode() {
		return pinCode;
	}
	
	@Exists(value = SupportedExistsType.POSTAL_ID_CODE)
	public String getPincodeId() {
		return pincodeId;
	}

	@ValidAddressLine
	public String getAddressLine1() {
		return addressLine1;
	}

	@ValidAddressLine
	public String getAddressLine2() {
		return addressLine2;
	}

	@Exists(value = SupportedExistsType.COMMUNITY_ID)
	public String getCommunityId() {
		return communityId;
	}

	@Exists(value = SupportedExistsType.USER_ID)
	public String getSpeakerId() {
		return speakerId;
	}

	@ValidEventCapacity
	public String getCapacity() {
		return capacity;
	}

	@ValidEventDuration
	public String getCostInINR() {
		return costInINR;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_EVENT_STATUS)
	public String getStatusCd() {
		return statusCd;
	}

	@ValidEventImportanceIndex
	public String getImportanceIndex() {
		return importanceIndex;
	}

	public void setImportanceIndex(String importanceIndex) {
		this.importanceIndex = importanceIndex;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public void setDummyImage(boolean dummyImage) {
		this.dummyImage = dummyImage;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public void setDurationInMinutes(String durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void setPincodeId(String pincodeId) {
		this.pincodeId = pincodeId;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public void setSpeakerId(String speakerId) {
		this.speakerId = speakerId;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public void setCostInINR(String costInINR) {
		this.costInINR = costInINR;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getSearchSpeakerCriteria() {
		return searchSpeakerCriteria;
	}

	public void setSearchSpeakerCriteria(String searchSpeakerCriteria) {
		this.searchSpeakerCriteria = searchSpeakerCriteria;
	}

	public String getCommunitySearchCriteria() {
		return communitySearchCriteria;
	}

	public void setCommunitySearchCriteria(String communitySearchCriteria) {
		this.communitySearchCriteria = communitySearchCriteria;
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}
	

}
