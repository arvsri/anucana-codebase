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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.anucana.constants.ITypeConstants;

@Entity
@Table(name = "community")
public class CommunityEntity extends AuditEntity implements StandardEntity<Long>, Serializable {

	private static final long serialVersionUID = 7189755992895214643L;

    public static final String COMMUNITY_STATUS_ACTIVE = ITypeConstants.TYPE_COMMUNITY_ACTIVE;
    public static final String COMMUNITY_STATUS_INACTIVE = ITypeConstants.TYPE_COMMUNITY_INACTIVE;
    public static final int ABOUT_SIZE = 5000;
    
	@Id
	@GeneratedValue
	@Column(name = "community_id")
	private Long id;
	
    @Column(name = "name", length = NAME_SIZE, unique = true, nullable = false)
	private String name;

	@Column( name = "foundation_dt", nullable = false)
	private Date foundationDate;
	
    @Column(name = "about", length = ABOUT_SIZE)
	private String about;
	
    @OneToOne(targetEntity = AddressEntity.class)
    @JoinColumn(name = "address_id", nullable = true, referencedColumnName = "address_id")
    private AddressEntity address;

    @Column(name = "email", length = EMAIL_SIZE)
	private String email;

    @Column(name = "website", length = WEBSITE_SIZE)
	private String website;

    @Column(name = "phone", length = PHONE_NUMBER_SIZE)
	private String phoneNumber;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "phone_type",referencedColumnName = "type_cd")
	private TypeTableEntity phoneType;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "industry_cd",referencedColumnName = "type_cd")
	private TypeTableEntity industry;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "status_cd",referencedColumnName = "type_cd", nullable = false)
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
