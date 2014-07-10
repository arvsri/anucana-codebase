package com.anucana.value.objects;

import java.util.List;

import com.anucana.validation.annotations.ValidIndustryCode;
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
	
	
	
	private Address address;
	
	private String addressAccess;
	
	
	private String email;

	private String emailAccess;
	
	
	private String gender;
	
	private String genderAccess;
	
	
	private String phonenumber;
	
	private String phoneType;

	private String phonenumberAccess;
	
	
	private String messenger;
	
	private String messengerType;
	
	private String messengerAccess;
	
	
	
	private List<Community> memberCommunities;
	

	private String summary;

	
	public String getProfileImageUrl() {
		return profileImageUrl;
	}


	public Address getAddress() {
		return address;
	}


	public String getAddressAccess() {
		return addressAccess;
	}


	public String getEmail() {
		return email;
	}


	public String getEmailAccess() {
		return emailAccess;
	}


	public String getGender() {
		return gender;
	}


	public String getGenderAccess() {
		return genderAccess;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public String getPhoneType() {
		return phoneType;
	}


	public String getPhonenumberAccess() {
		return phonenumberAccess;
	}


	public String getMessenger() {
		return messenger;
	}


	public String getMessengerType() {
		return messengerType;
	}


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


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setAddressAccess(String addressAccess) {
		this.addressAccess = addressAccess;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setEmailAccess(String emailAccess) {
		this.emailAccess = emailAccess;
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

}
