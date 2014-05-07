package com.anucana.value.objects;


/**
 * Model for use primary informations
 * 
 * @author asrivastava
 * @since Jan 25, 2014
 */

public class UserPrimaryInfo extends UserLogin {

	/**
	 * the serial version uid 
	 */
	private static final long serialVersionUID = 1L;

	private long userPrimaryInfoId;
	
	private String address;
	
	private String email;
	
	private String gender;
	
	private String phone;
	
	private String phoneTypeCd;
	
	private String messenger;
	
	private String messengerTypeCd;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessenger() {
		return messenger;
	}

	public long getUserPrimaryInfoId() {
		return userPrimaryInfoId;
	}

	public void setUserPrimaryInfoId(long userPrimaryInfoId) {
		this.userPrimaryInfoId = userPrimaryInfoId;
	}

	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getMessengerTypeCd() {
		return messengerTypeCd;
	}

	public void setMessengerTypeCd(String messengerTypeCd) {
		this.messengerTypeCd = messengerTypeCd;
	}

}
