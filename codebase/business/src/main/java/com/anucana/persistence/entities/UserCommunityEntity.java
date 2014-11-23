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
@Table(name = "user_community")
public class UserCommunityEntity extends AuditEntity implements StandardEntity<Long>,Serializable {

	private static final long serialVersionUID = -7795415814271826531L;

	@Id
	@GeneratedValue
	@Column(name = "user_community_id")
	private Long id;
	
	@ManyToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "login_id", referencedColumnName = "login_id")
    private UserLoginEntity userLogin;

	@ManyToOne(targetEntity = CommunityEntity.class)
	@JoinColumn(name = "community_id", referencedColumnName = "community_id")
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
