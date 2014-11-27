package com.anucana.value.objects;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.anucana.constants.ITypeConstants;
import com.anucana.validation.annotations.Exists;
import com.anucana.validation.annotations.SupportedExistsType;
import com.anucana.validation.annotations.ValidAddressLine;
import com.anucana.validation.annotations.ValidEmail;
import com.anucana.validation.annotations.ValidGroupType;
import com.anucana.validation.annotations.ValidIndustryCode;
import com.anucana.validation.annotations.ValidMessenger;
import com.anucana.validation.annotations.ValidPhone;
import com.anucana.validation.annotations.ValidProfileHeading;
import com.anucana.validation.annotations.ValidProfileSummary;

/**
 * Model for user profile related information
 * 
 * 
 * @author asrivastava
 * @since Jan 25, 2014
 */
public class UserProfile extends UserLogin{

	private static final long serialVersionUID = 9187648748110856213L;


	private String profileImageUrl = StringUtils.EMPTY;
	
	private boolean dummyImage;
	

	
	private String profileHeading = StringUtils.EMPTY;
	
	private String industryCd = StringUtils.EMPTY;

	private String industryName = StringUtils.EMPTY;
	

	
	private String pincodeId = StringUtils.EMPTY;
	
	private String addressLine1 = StringUtils.EMPTY;

	private String addressLine2 = StringUtils.EMPTY;
	
	private String addressAccess = StringUtils.EMPTY;

	
	// for ui display purposes only
	private String addressDescription = StringUtils.EMPTY;

	private String pinCode = StringUtils.EMPTY;
	
	private String pincodeIdDescription = StringUtils.EMPTY;
	
	
	
	private String emailId = StringUtils.EMPTY;

	private String emailAccess = StringUtils.EMPTY;
	
	
	
	private String gender = StringUtils.EMPTY;
	
	private String genderAccess = StringUtils.EMPTY;
	
	
	
	private String phonenumber = StringUtils.EMPTY;
	
	private String phoneType = StringUtils.EMPTY;

	private String phonenumberAccess = StringUtils.EMPTY;
	
	
	
	private String messenger = StringUtils.EMPTY;
	
	private String messengerType = StringUtils.EMPTY;
	
	private String messengerTypeDescription = StringUtils.EMPTY;
	
	private String messengerAccess = StringUtils.EMPTY;
	
	
	
	private List<Community> memberCommunities;
	
	private String summary = StringUtils.EMPTY;

	
	public String getProfileImageUrl() {
		return profileImageUrl;
	}



	public String getGender() {
		return gender;
	}


	public String getGenderAccess() {
		return genderAccess;
	}


	@ValidPhone
	public String getPhonenumber() {
		return phonenumber;
	}


	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_PHONE_TYPE_CD)
	public String getPhoneType() {
		return phoneType;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_USER_PROFILE_ACCESS)
	public String getPhonenumberAccess() {
		return phonenumberAccess;
	}

	@ValidMessenger
	public String getMessenger() {
		return messenger;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_MESSENGER_TYPE_CD)
	public String getMessengerType() {
		return messengerType;
	}


	
	public String getMessengerTypeDescription() {
		return messengerTypeDescription;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_USER_PROFILE_ACCESS)
	public String getMessengerAccess() {
		return messengerAccess;
	}

	@ValidProfileHeading
	public String getProfileHeading() {
		return profileHeading;
	}

	
	@ValidIndustryCode
	public String getIndustryCd() {
		return industryCd;
	}


	public List<Community> getMemberCommunities() {
		return memberCommunities;
	}


	@ValidProfileSummary
	public String getSummary() {
		return summary;
	}

	
	public String getIndustryName() {
		return industryName;
	}

	public boolean isDummyImage() {
		return dummyImage;
	}


	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = getValue(profileImageUrl);
	}


	public void setGender(String gender) {
		this.gender = getValue(gender);
	}


	public void setGenderAccess(String genderAccess) {
		this.genderAccess = getValue(genderAccess);
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = getValue(phonenumber);
	}


	public void setPhoneType(String phoneType) {
		this.phoneType = getValue(phoneType);
	}


	public void setPhonenumberAccess(String phonenumberAccess) {
		this.phonenumberAccess = getValue(phonenumberAccess);
	}


	public void setMessenger(String messenger) {
		this.messenger = getValue(messenger);
	}


	public void setMessengerType(String messengerType) {
		this.messengerType = getValue(messengerType);
	}

	

	public void setMessengerTypeDescription(String messengerTypeDescription) {
		this.messengerTypeDescription = getValue(messengerTypeDescription);
	}


	public void setMessengerAccess(String messengerAccess) {
		this.messengerAccess = getValue(messengerAccess);
	}


	public void setProfileHeading(String profileHeading) {
		this.profileHeading = getValue(profileHeading);
	}


	public void setIndustryCd(String industryCd) {
		this.industryCd = getValue(industryCd);
	}


	public void setMemberCommunities(List<Community> memberCommunities) {
		this.memberCommunities = memberCommunities;
	}


	public void setSummary(String summary) {
		this.summary = getValue(summary);
	}


	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}


	public void setDummyImage(boolean dummyImage) {
		this.dummyImage = dummyImage;
	}


	@ValidEmail
	public String getEmailId() {
		return emailId;
	}

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_USER_PROFILE_ACCESS)
	public String getEmailAccess() {
		return emailAccess;
	}

	public void setEmailId(String emailId) {
		this.emailId = getValue(emailId);
	}


	public void setEmailAccess(String emailAccess) {
		this.emailAccess = getValue(emailAccess);
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

	@ValidGroupType(typeGroup = ITypeConstants.TYPE_GRP_USER_PROFILE_ACCESS)
	public String getAddressAccess() {
		return addressAccess;
	}

	public String getAddressDescription() {
		return addressDescription;
	}

	public String getPinCode() {
		return pinCode;
	}

	public String getPincodeIdDescription() {
		return pincodeIdDescription;
	}

	public void setPincodeId(String pincodeId) {
		this.pincodeId = getValue(pincodeId);
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = getValue(addressLine1);
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = getValue(addressLine2);
	}

	public void setAddressAccess(String addressAccess) {
		this.addressAccess = getValue(addressAccess);
	}

	public void setAddressDescription(String addressDescription) {
		this.addressDescription = getValue(addressDescription);
	}

	public void setPinCode(String pinCode) {
		this.pinCode = getValue(pinCode);
	}

	public void setPincodeIdDescription(String pincodeIdDescription) {
		this.pincodeIdDescription = getValue(pincodeIdDescription);
	}

	
	private String getValue(String val){
		if(StringUtils.isNotBlank(val)){
			return val;
		}
		return StringUtils.EMPTY;
	}
}
