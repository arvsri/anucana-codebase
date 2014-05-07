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
@Table(name = "USER_PRIMARY_INFO")
public class UserPrimaryInfoEntity extends AuditEntity implements Identifiable<Long>,Serializable {

	private static final long serialVersionUID = -6291896007535820556L;

	@Id
	@GeneratedValue
	@Column(name = "USER_PRIMARY_INFO_ID")
	private Long id;

	@OneToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "LOGIN_ID",nullable = false, referencedColumnName = "LOGIN_ID")
	private UserLoginEntity userLogin;

	@Column(name = "ADDRESS", length = 1000)
	private String address;

	@Column(name = "EMAIL", length = 255)
	private String email;

	@Column(name = "GENDER", length = 1)
	private String gender;

	@Column(name = "PHONENUMBER", length = 20)
	private String phoneNumber;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "PHONE_TYPE",referencedColumnName = "TYPE_CD")
	private TypeTableEntity phoneType;

	@Column(name = "MESSENGER", length = 255)
	private String messenger;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "MESSENGER_TYPE",referencedColumnName = "TYPE_CD")
	private TypeTableEntity messengerType;
	
	
	public UserLoginEntity getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLoginEntity userLogin) {
		this.userLogin = userLogin;
	}

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

}
