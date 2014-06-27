package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_COMMUNITY")
public class UserCommunityEntity extends AuditEntity implements Identifiable<Long>,Serializable {

	private static final long serialVersionUID = -7795415814271826531L;

	@Id
	@GeneratedValue
	@Column(name = "USER_COMMUNITY_ID")
	private Long id;
	
	@ManyToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "LOGIN_ID", referencedColumnName = "LOGIN_ID")
    private UserLoginEntity userLogin;

	@ManyToOne(targetEntity = CommunityEntity.class)
	@JoinColumn(name = "COMMUNITY_ID", referencedColumnName = "COMMUNITY_ID")
	private CommunityEntity community;
	
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

    public CommunityEntity getCommunity() {
		return community;
	}

	public void setCommunity(CommunityEntity community) {
		this.community = community;
	}

}
