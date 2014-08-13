package com.anucana.value.objects;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

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
	// for UI display purposes only
	private EventDateBreakup eventDateBreakup;

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
		if(this.eventDate != null){
			try {
				Date eDate = DateUtils.parseDate(eventDate, DATE_FORMAT);
				Calendar cal = Calendar.getInstance();
				cal.setTime(eDate);
				this.eventDateBreakup = new EventDateBreakup(cal.get(Calendar.DATE), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR), cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE));
				
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
	
	
	public EventDateBreakup getEventDateBreakup() {
		return eventDateBreakup;
	}

	public void setEventDateBreakup(EventDateBreakup eventDateBreakup) {
		this.eventDateBreakup = eventDateBreakup;
	}

	/**
	 * Useful for UI display purposes. Plugged in with {@link Event#setEventDate(String)} to provide the date and time breakup on UI
	 *
	 */
	public static class EventDateBreakup{
		
		private int date;
		
		private String month;
		
		private int year;
		
		private int hour;
		
		private int minute;
		
		public EventDateBreakup(int date, int month, int year, int hour,int minute) {
			super();
			this.date = date;
			this.year = year;
			this.hour = hour;
			this.minute = minute;

			switch (month){
				case 1:
					setMonth("Jan");
					break;
				case 2:
					setMonth("Feb");
					break;
				case 3: 
					setMonth("Mar");
					break;
				case 4: 
					setMonth("Apr");
					break;
				case 5: 
					setMonth("May");
					break;
				case 6: 
					setMonth("Jun");
					break;
				case 7: 
					setMonth("Jul");
					break;
				case 8: 
					setMonth("Aug");
					break;
				case 9: 
					setMonth("Sep");
					break;
				case 10: 
					setMonth("Oct");
					break;
				case 11: 
					setMonth("Nov");
					break;
				case 12: 
					setMonth("Dec");
					break;
			}
		}

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String string) {
			this.month = string;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}

		public int getMinute() {
			return minute;
		}

		public void setMinute(int minute) {
			this.minute = minute;
		}
		
		
	}

}
