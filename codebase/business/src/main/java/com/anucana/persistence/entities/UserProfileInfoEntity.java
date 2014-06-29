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
@Table(name = "USER_PROFILE_INFORMATION")
public class UserProfileInfoEntity extends AuditEntity implements StandardEntity<Long>,Serializable {

	private static final long serialVersionUID = 5381440588570548564L;

	@Id
	@GeneratedValue
	@Column(name = "USER_PROFILE_INFO_ID")
	private Long id;
	
	@OneToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "LOGIN_ID",referencedColumnName = "LOGIN_ID", nullable = false)
	private UserLoginEntity userLogin;
	
	@Column(name = "PROFILE_HEADING", length = 255)
	private String profileHeading;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "COUNTRY_CD", referencedColumnName = "TYPE_CD")
	private TypeTableEntity country;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "AREA_CD", referencedColumnName = "TYPE_CD")
	private TypeTableEntity area;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "INDUSTRY_CD", referencedColumnName = "TYPE_CD")
	private TypeTableEntity industry;

	@Column(name = "SUMMARY", length = 2000)
	private String summary;
	
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

	public String getProfileHeading() {
		return profileHeading;
	}

	public void setProfileHeading(String profileHeading) {
		this.profileHeading = profileHeading;
	}

	public TypeTableEntity getCountry() {
		return country;
	}

	public void setCountry(TypeTableEntity country) {
		this.country = country;
	}

	public TypeTableEntity getArea() {
		return area;
	}

	public void setArea(TypeTableEntity area) {
		this.area = area;
	}

	public TypeTableEntity getIndustry() {
		return industry;
	}

	public void setIndustry(TypeTableEntity industry) {
		this.industry = industry;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
