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
@Table(name = "user_primary_information")
public class UserPrimaryInfoEntity extends AuditEntity implements StandardEntity<Long>,Serializable {

	private static final long serialVersionUID = -6291896007535820556L;

	@Id
	@GeneratedValue
	@Column(name = "user_primary_info_id")
	private Long id;

	@OneToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "login_id",nullable = false, referencedColumnName = "login_id")
	private UserLoginEntity userLogin;

    @OneToOne(targetEntity = AddressEntity.class)
    @JoinColumn(name = "address_id", nullable = true, referencedColumnName = "address_id")
    private AddressEntity address;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "address_access",referencedColumnName = "type_cd")
	private TypeTableEntity addressAccess;
	
	@Column(name = "email", length = EMAIL_SIZE)
	private String email;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "email_access",referencedColumnName = "type_cd")
	private TypeTableEntity emailAccess;
	
	@Column(name = "gender", length = 1)
	private String gender;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "gender_access",referencedColumnName = "type_cd")
	private TypeTableEntity genderAccess;
	
	@Column(name = "phonenumber", length = PHONE_NUMBER_SIZE)
	private String phoneNumber;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "phonenumber_access",referencedColumnName = "type_cd")
	private TypeTableEntity phoneNumberAccess;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "phone_type",referencedColumnName = "type_cd")
	private TypeTableEntity phoneType;

	@Column(name = "messenger", length = MESSENGER_SIZE)
	private String messenger;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "messenger_access",referencedColumnName = "type_cd")
	private TypeTableEntity messengerAccess;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "messenger_type",referencedColumnName = "type_cd")
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
