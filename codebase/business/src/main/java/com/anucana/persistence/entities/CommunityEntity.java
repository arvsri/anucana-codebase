package com.anucana.persistence.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMMUNITY")
public class CommunityEntity extends AuditEntity implements Identifiable<Long>, Serializable {

	private static final long serialVersionUID = 7189755992895214643L;

	@Id
	@GeneratedValue
	@Column(name = "COMMUNITY_ID")
	private Long id;
	
	@Column( name = "NAME", length = 255, unique = true, nullable = false)
	private String name;

	@Column( name = "FOUNDATION_DT", nullable = false)
	private Date foundationDate;
	
	@Column( name = "ABOUT", length = 5000)
	private String about;
	
	@Column( name = "ADDRESS", length = 1000)
	private String address;

	@Column( name = "EMAIL", length = 255)
	private String email;

	@Column( name = "WEBSITE", length = 255)
	private String website;

	@Column( name = "PHONE", length = 255)
	private String phoneNumber;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "PHONE_TYPE",referencedColumnName = "TYPE_CD")
	private TypeTableEntity phoneType;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "INDUSTRY_CD",referencedColumnName = "TYPE_CD")
	private TypeTableEntity industry;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "STATUS_CD",referencedColumnName = "TYPE_CD")
	private TypeTableEntity status;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "community" ,targetEntity = CommunityKeywordEntity.class)
	private Collection<CommunityKeywordEntity> keywords;

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "community" ,targetEntity = UserCommunityEntity.class)
	private Collection<UserCommunityEntity> subscribers;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
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

	public TypeTableEntity getIndustry() {
		return industry;
	}

	public void setIndustry(TypeTableEntity industry) {
		this.industry = industry;
	}

	public TypeTableEntity getStatus() {
		return status;
	}

	public void setStatus(TypeTableEntity status) {
		this.status = status;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Collection<CommunityKeywordEntity> getKeywords() {
		return keywords;
	}

	public void setKeywords(Collection<CommunityKeywordEntity> keywords) {
		this.keywords = keywords;
	}

	public Collection<UserCommunityEntity> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(Collection<UserCommunityEntity> subscribers) {
		this.subscribers = subscribers;
	}

}
