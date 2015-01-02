package com.anucana.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.anucana.constants.ITypeConstants;

@Entity
@Table(name = "event")
public class EventEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = 3119025711723933441L;

    public static final int SHORT_DESC_SIZE = 255;
    public static final int LONG_DESC_SIZE = 5000;

    public static final String EVENT_STATUS_ACTIVE = ITypeConstants.TYPE_EVENT_ACTIVE;
    public static final String EVENT_STATUS_INACTIVE_SUSPENDED = ITypeConstants.TYPE_EVENT_INACTIVE_SUSPENDED;
    public static final String EVENT_STATUS_INACTIVE_PROJECTED = ITypeConstants.TYPE_EVENT_INACTIVE_PROJECTED;

    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private Long id;

    @Column(name = "name", length = NAME_SIZE, nullable = false)
    private String name;

    @Column(name = "event_dt", nullable = false)
    private Date eventDate;

    @Column(name = "duration_in_mins")
    private Long durationInMins;

    @Column(name = "short_desc", length = SHORT_DESC_SIZE)
    private String shortDesc;

    @Column(name = "long_desc", length = LONG_DESC_SIZE)
    private String longDesc;

    @OneToOne(targetEntity = AddressEntity.class)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private AddressEntity venue;

    @Column(name = "phone", length = PHONE_NUMBER_SIZE)
    private String phoneNumber;

    @Column(name = "importance_index")
    private Integer importanceIndex;
    
    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "phone_type", referencedColumnName = "type_cd")
    private TypeTableEntity phoneType;

    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "status_cd", referencedColumnName = "type_cd", nullable = false)
    private TypeTableEntity status;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "login_id", referencedColumnName = "LOGIN_ID")
    private UserLoginEntity speaker;

    @ManyToOne(targetEntity = CommunityEntity.class)
    @JoinColumn(name = "community_id", referencedColumnName = "community_id")
    private CommunityEntity community;

    @Column(name = "projected_attendee_count")
    private Long projectedAttendeeCount;

    @Column(name = "rate_inr")
    private Float rateInRuppes;


    @Override
    public Long getId() {
        return id;
    }


    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Date getEventDate() {
        return eventDate;
    }


    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }


    public Long getDurationInMins() {
        return durationInMins;
    }


    public void setDurationInMins(Long durationInMins) {
        this.durationInMins = durationInMins;
    }


    public String getShortDesc() {
        return shortDesc;
    }


    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }


    public String getLongDesc() {
        return longDesc;
    }


    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }


    public AddressEntity getVenue() {
        return venue;
    }


    public void setVenue(AddressEntity venue) {
        this.venue = venue;
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


    public TypeTableEntity getStatus() {
        return status;
    }


    public void setStatus(TypeTableEntity status) {
        this.status = status;
    }


    public UserLoginEntity getSpeaker() {
        return speaker;
    }


    public void setSpeaker(UserLoginEntity speaker) {
        this.speaker = speaker;
    }


    public CommunityEntity getCommunity() {
        return community;
    }


    public void setCommunity(CommunityEntity community) {
        this.community = community;
    }


    public Long getProjectedAttendeeCount() {
        return projectedAttendeeCount;
    }


    public void setProjectedAttendeeCount(Long projectedAttendeeCount) {
        this.projectedAttendeeCount = projectedAttendeeCount;
    }


    public Float getRateInRuppes() {
        return rateInRuppes;
    }


    public void setRateInRuppes(Float rateInRuppes) {
        this.rateInRuppes = rateInRuppes;
    }


	public Integer getImportanceIndex() {
		return importanceIndex;
	}


	public void setImportanceIndex(Integer importanceIndex) {
		this.importanceIndex = importanceIndex;
	}


}
