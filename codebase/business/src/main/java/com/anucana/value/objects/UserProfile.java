package com.anucana.value.objects;

import java.util.List;

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


	private String profileImageUrl;
	
	private boolean dummyImage;
	

	
	private String profileHeading;
	
	private String industryCd;

	private String industryName;
	

	
	private String pincodeId;
	
	private String addressLine1;

	private String addressLine2;
	
	private String addressAccess;

	
	// for ui display purposes only
	private String addressDescription;

	private String pinCode;
	
	private String pincodeIdDescription;
	
	
	
	private String emailId;

	private String emailAccess;
	
	
	
	private String gender;
	
	private String genderAccess;
	
	
	
	private String phonenumber;
	
	private String phoneType;

	private String phonenumberAccess;
	
	
	
	private String messenger;
	
	private String messengerType;
	
	private String messengerTypeDescription;
	
	private String messengerAccess;
	
	
	
	private List<Community> memberCommunities;
	
	private String summary;

	
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
		this.profileImageUrl = profileImageUrl;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setGenderAccess(String genderAccess) {
		this.genderAccess = genderAccess;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}


	public void setPhonenumberAccess(String phonenumberAccess) {
		this.phonenumberAccess = phonenumberAccess;
	}


	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}


	public void setMessengerType(String messengerType) {
		this.messengerType = messengerType;
	}

	

	public void setMessengerTypeDescription(String messengerTypeDescription) {
		this.messengerTypeDescription = messengerTypeDescription;
	}


	public void setMessengerAccess(String messengerAccess) {
		this.messengerAccess = messengerAccess;
	}


	public void setProfileHeading(String profileHeading) {
		this.profileHeading = profileHeading;
	}


	public void setIndustryCd(String industryCd) {
		this.industryCd = industryCd;
	}


	public void setMemberCommunities(List<Community> memberCommunities) {
		this.memberCommunities = memberCommunities;
	}


	public void setSummary(String summary) {
		this.summary = summary;
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
		this.emailId = emailId;
	}


	public void setEmailAccess(String emailAccess) {
		this.emailAccess = emailAccess;
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
		this.pincodeId = pincodeId;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setAddressAccess(String addressAccess) {
		this.addressAccess = addressAccess;
	}

	public void setAddressDescription(String addressDescription) {
		this.addressDescription = addressDescription;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void setPincodeIdDescription(String pincodeIdDescription) {
		this.pincodeIdDescription = pincodeIdDescription;
	}

}
