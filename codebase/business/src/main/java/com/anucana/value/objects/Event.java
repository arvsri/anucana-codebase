package com.anucana.value.objects;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import com.anucana.constants.ITypeConstants;
import com.anucana.validation.annotations.Exists;
import com.anucana.validation.annotations.SupportedExistsType;
import com.anucana.validation.annotations.ValidAddressLine;
import com.anucana.validation.annotations.ValidDate;
import com.anucana.validation.annotations.ValidEventCapacity;
import com.anucana.validation.annotations.ValidEventCost;
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
	// for UI display purposes only
	private DateBreakup eventDateBreakup;

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
	
	private boolean bookedByUser = false;
	private boolean activeEvent = true;
	
	private String capacity;
	private String costInINR;

	private String statusCd = ITypeConstants.TYPE_EVENT_ACTIVE;
	
	
	public long getEventId() {
		return eventId;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public boolean isDummyImage() {
		return dummyImage;
	}
	
	/**
	 * ******************************************************************************************************************************
	 * 								Event Validation Group
	 * *******************************************************************************************************************************
	 */
	
	public static interface EventGroupActive{}

	public static interface EventGroupInActive{}
	
	
	/**
	 * ******************************************************************************************************************************
	 * 								annotated bean getter methods
	 * ******************************************************************************************************************************
	 */

	@ValidDate(format = DATE_FORMAT,groups = { EventGroupActive.class,EventGroupInActive.class})
	public String getEventDate() {
		return eventDate;
	}

	@ValidEventDuration(groups = { EventGroupActive.class,EventGroupInActive.class})
	public String getDurationInMinutes() {
		return durationInMinutes;
	}

	@ValidName(groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getName() {
		return name;
	}

	@ValidPhone(groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getPhone() {
		return phone;
	}

	@ValidEventShortDesciption(groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getShortDesc() {
		return shortDesc;
	}

	@ValidEventLongDesciption(groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getLongDesc() {
		return longDesc;
	}

	public String getPinCode() {
		return pinCode;
	}
	
	@Exists(value = SupportedExistsType.POSTAL_ID_CODE,groups = EventGroupActive.class)
	public String getPincodeId() {
		return pincodeId;
	}

	@ValidAddressLine(groups = EventGroupActive.class)
	public String getAddressLine1() {
		return addressLine1;
	}

	@ValidAddressLine(groups = EventGroupActive.class)
	public String getAddressLine2() {
		return addressLine2;
	}

	@Exists(value = SupportedExistsType.COMMUNITY_ID,groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getCommunityId() {
		return communityId;
	}

	@Exists(value = SupportedExistsType.USER_ID,groups = EventGroupActive.class)
	public String getSpeakerId() {
		return speakerId;
	}

	@ValidEventCapacity(groups = EventGroupActive.class)
	public String getCapacity() {
		return capacity;
	}

	@ValidEventCost(groups = EventGroupActive.class)
	public String getCostInINR() {
		return costInINR;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_EVENT_STATUS,groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getStatusCd() {
		return statusCd;
	}

	@ValidEventImportanceIndex(groups = {EventGroupActive.class,EventGroupInActive.class})
	public String getImportanceIndex() {
		return importanceIndex;
	}

	
	
	
	/**
	 * ******************************************************************************************************************************
	 * 								Bean setter methods
	 * ******************************************************************************************************************************
	 */
	
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
		if(this.eventDate != null){
			try {
				Date eDate = DateUtils.parseDate(eventDate, DATE_FORMAT);
				Calendar cal = Calendar.getInstance();
				cal.setTime(eDate);
				this.eventDateBreakup = new DateBreakup(cal.get(Calendar.DATE), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR), cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE),cal.get(Calendar.AM_PM));
				
			} catch (ParseException e) {
				// this should never happen
				e.printStackTrace();
			}
		}
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
		if(StringUtils.isNotBlank(statusCd)){
			this.statusCd = statusCd;
			if(ITypeConstants.TYPE_EVENT_ACTIVE.equals(this.statusCd)){
				setActiveEvent(true);
			}else{
				setActiveEvent(false);
			}
		}
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
	
	
	public DateBreakup getEventDateBreakup() {
		return eventDateBreakup;
	}

	public void setEventDateBreakup(DateBreakup eventDateBreakup) {
		this.eventDateBreakup = eventDateBreakup;
	}

	public boolean isBookedByUser() {
		return bookedByUser;
	}

	public void setBookedByUser(boolean bookedByUser) {
		this.bookedByUser = bookedByUser;
	}

	public boolean isActiveEvent() {
		return activeEvent;
	}

	public void setActiveEvent(boolean activeEvent) {
		this.activeEvent = activeEvent;
	}
	
}
