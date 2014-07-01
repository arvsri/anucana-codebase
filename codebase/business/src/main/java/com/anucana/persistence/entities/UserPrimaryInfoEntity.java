package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PRIMARY_INFORMATION")
public class UserPrimaryInfoEntity extends AuditEntity implements StandardEntity<Long>,Serializable {

	private static final long serialVersionUID = -6291896007535820556L;

	@Id
	@GeneratedValue
	@Column(name = "USER_PRIMARY_INFO_ID")
	private Long id;

	@OneToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "LOGIN_ID",nullable = false, referencedColumnName = "LOGIN_ID")
	private UserLoginEntity userLogin;

    @OneToOne(targetEntity = AddressEntity.class)
    @JoinColumn(name = "ADDRESS_ID", nullable = true, referencedColumnName = "ADDRESS_ID")
    private AddressEntity address;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "ADDRESS_ACCESS",referencedColumnName = "TYPE_CD")
	private TypeTableEntity addressAccess;
	
	@Column(name = "EMAIL", length = EMAIL_SIZE)
	private String email;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "EMAIL_ACCESS",referencedColumnName = "TYPE_CD")
	private TypeTableEntity emailAccess;
	
	@Column(name = "GENDER", length = 1)
	private String gender;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "GENDER_ACCESS",referencedColumnName = "TYPE_CD")
	private TypeTableEntity genderAccess;
	
	@Column(name = "PHONENUMBER", length = PHONE_NUMBER_SIZE)
	private String phoneNumber;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "PHONENUMBER_ACCESS",referencedColumnName = "TYPE_CD")
	private TypeTableEntity phoneNumberAccess;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "PHONE_TYPE",referencedColumnName = "TYPE_CD")
	private TypeTableEntity phoneType;

	@Column(name = "MESSENGER", length = MESSENGER_SIZE)
	private String messenger;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "MESSENGER_ACCESS",referencedColumnName = "TYPE_CD")
	private TypeTableEntity messengerAccess;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "MESSENGER_TYPE",referencedColumnName = "TYPE_CD")
	private TypeTableEntity messengerType;
	
	
	public UserLoginEntity getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLoginEntity userLogin) {
		this.userLogin = userLogin;
	}


    public AddressEntity getAddress() {
        return address;
    }


    public void setAddress(AddressEntity address) {
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public TypeTableEntity getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(TypeTableEntity phoneType) {
		this.phoneType = phoneType;
	}

	public String getMessenger() {
		return messenger;
	}

	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}

	public TypeTableEntity getMessengerType() {
		return messengerType;
	}

	public void setMessengerType(TypeTableEntity messengerType) {
		this.messengerType = messengerType;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public TypeTableEntity getAddressAccess() {
		return addressAccess;
	}

	public void setAddressAccess(TypeTableEntity addressAccess) {
		this.addressAccess = addressAccess;
	}

	public TypeTableEntity getEmailAccess() {
		return emailAccess;
	}

	public void setEmailAccess(TypeTableEntity emailAccess) {
		this.emailAccess = emailAccess;
	}

	public TypeTableEntity getGenderAccess() {
		return genderAccess;
	}

	public void setGenderAccess(TypeTableEntity genderAccess) {
		this.genderAccess = genderAccess;
	}

	public TypeTableEntity getPhoneNumberAccess() {
		return phoneNumberAccess;
	}

	public void setPhoneNumberAccess(TypeTableEntity phoneNumberAccess) {
		this.phoneNumberAccess = phoneNumberAccess;
	}

	public TypeTableEntity getMessengerAccess() {
		return messengerAccess;
	}

	public void setMessengerAccess(TypeTableEntity messengerAccess) {
		this.messengerAccess = messengerAccess;
	}

}
