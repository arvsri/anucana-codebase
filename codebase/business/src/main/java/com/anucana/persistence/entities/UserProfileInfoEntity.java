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
@Table(name = "user_profile_information")
public class UserProfileInfoEntity extends AuditEntity implements StandardEntity<Long>,Serializable {

	private static final long serialVersionUID = 5381440588570548564L;
	
    public static final int PROFILE_HEADING_SIZE = 255;
    public static final int SUMMARY_SIZE = 5000;


	@Id
	@GeneratedValue
	@Column(name = "user_profile_info_id")
	private Long id;
	
	@OneToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "login_id",referencedColumnName = "LOGIN_ID", nullable = false)
	private UserLoginEntity userLogin;
	
	@Column(name = "profile_heading", length = PROFILE_HEADING_SIZE)
	private String profileHeading;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "country_cd", referencedColumnName = "type_cd")
	private TypeTableEntity country;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "area_cd", referencedColumnName = "type_cd")
	private TypeTableEntity area;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "industry_cd", referencedColumnName = "type_cd")
	private TypeTableEntity industry;

	@Column(name = "summary", length = SUMMARY_SIZE)
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
