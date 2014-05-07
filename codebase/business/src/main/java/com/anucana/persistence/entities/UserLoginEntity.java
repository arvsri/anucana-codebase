package com.anucana.persistence.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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

import com.anucana.constants.IBusinessConstants;

@Entity
@Table(name = "USER_LOGIN")
public class UserLoginEntity extends AuditEntity implements Serializable,Identifiable<Long> {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue
	@Column(name = "LOGIN_ID")
	private Long id;
	
	@Column(name = "USER_NAME",unique = true, nullable = false, length = 255)
	private String userName;
	
	@Column(name = "PASSWORD_SHA", nullable = false, length = 128)
	private String password;
	
	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstName;
	
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	private String lastName;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "STATUS_CD", nullable = false, referencedColumnName = "TYPE_CD")
	private TypeTableEntity status;
	
	@Column(name = "LAST_LOGIN_DT")
	private Date lastLoginDate;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserRoleEntity.class)
	private Collection<UserRoleEntity> userRoles;

	@OneToOne(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserPrimaryInfoEntity.class)
	private UserPrimaryInfoEntity userPrimaryInfo;

	@OneToOne(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserProfileInfoEntity.class)
	private UserProfileInfoEntity userProfileInfo;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserCommunityEntity.class)
	private Collection<UserCommunityEntity> communities;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public TypeTableEntity getStatus() {
		return status;
	}

	public void setStatus(TypeTableEntity status) {
		this.status = status;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public void setUserRoles(Collection<UserRoleEntity> userRoles) {
		this.userRoles = userRoles;
	}
	
	public Collection<UserRoleEntity> getUserRoles() {
		return userRoles;
	}

	public UserPrimaryInfoEntity getUserPrimaryInfo() {
		return userPrimaryInfo;
	}

	public void setUserPrimaryInfo(UserPrimaryInfoEntity userPrimaryInfo) {
		this.userPrimaryInfo = userPrimaryInfo;
	}

	public Collection<UserCommunityEntity> getCommunities() {
		return communities;
	}

	public void setCommunities(Collection<UserCommunityEntity> communities) {
		this.communities = communities;
	}
	
	public UserProfileInfoEntity getUserProfileInfo() {
		return userProfileInfo;
	}

	public void setUserProfileInfo(UserProfileInfoEntity userProfileInfo) {
		this.userProfileInfo = userProfileInfo;
	}

	/******************************************************************* Utility Methods ****************************************************************************/
	/****************************************************************************************************************************************************************/
	
	public boolean isFirstTimeLogin(){
		return getLastLoginDate() == null;
	}
	
	public boolean isUserActive() {
		return IBusinessConstants.USER_STATUS_ACTIVE.equals(this.getStatus().getTypeCode());
	}

	/**
	 * When a password is send out for verification, we use bigger salt using dates so that same user is not able to use the same url again and again
	 *  
	 * @param user
	 * @return
	 */
	public String getVerificationSalt(){
		final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy mm:ss");
		StringBuilder saltBuilder = new StringBuilder();
		saltBuilder.append(getId());
		saltBuilder.append(getUserName());
		
		saltBuilder.append(formatter.format(getCreationDate()));
		saltBuilder.append(getCreatedBy());
		
		saltBuilder.append(getStatus().getTypeCode());
		if(getLastLoginDate() != null){
			saltBuilder.append(formatter.format(getLastLoginDate()));
		}
		
		return saltBuilder.toString();
	}
	
}
