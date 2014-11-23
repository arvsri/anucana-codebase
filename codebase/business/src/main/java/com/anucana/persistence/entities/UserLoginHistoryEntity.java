package com.anucana.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_login_history")
public class UserLoginHistoryEntity extends EqualityHashcodeEntity implements Serializable,StandardEntity<Long> {

	private static final long serialVersionUID = -7475789015177072385L;

	@Id
	@GeneratedValue
	@Column(name = "login_history_id")
	private Long id;
	
	@ManyToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "login_id", referencedColumnName = "login_id")
	private UserLoginEntity userLogin;
	
	@Column(name = "login_ip",length = 45,nullable = false)
	private String ipAddress;
	
	@Column(name = "created_by",nullable = false)
	private Long createdBy;

	@Column(name = "creation_dt",nullable = false)
	private Date creationDate;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public UserLoginEntity getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLoginEntity userLogin) {
		this.userLogin = userLogin;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
