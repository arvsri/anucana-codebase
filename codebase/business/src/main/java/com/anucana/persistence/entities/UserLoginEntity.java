package com.anucana.persistence.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collection;

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
@Table(name = "user_login")
public class UserLoginEntity extends AuditEntity implements Serializable,StandardEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue
	@Column(name = "login_id")
	private Long id;
	
	@Column(name = "user_name",unique = true, nullable = false, length = EMAIL_SIZE)
	private String username;
	
	@Column(name = "password_sha", nullable = false, length = PASSWORD_SIZE)
	private String password;
	
	@Column(name = "first_name", nullable = false, length = FIRSTNAME_SIZE)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, length = LASTNAME_SIZE)
	private String lastName;
	
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "status_cd", nullable = false, referencedColumnName = "type_cd")
	private TypeTableEntity status;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserRoleEntity.class)
	private Collection<UserRoleEntity> userRoles;

	@OneToOne(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserPrimaryInfoEntity.class)
	private UserPrimaryInfoEntity userPrimaryInfo;

	@OneToOne(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserProfileInfoEntity.class)
	private UserProfileInfoEntity userProfileInfo;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserCommunityEntity.class)
	private Collection<UserCommunityEntity> communities;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "userLogin" ,targetEntity = UserLoginHistoryEntity.class)
	private Collection<UserLoginHistoryEntity> loginHistories;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
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
	
	public Collection<UserLoginHistoryEntity> getLoginHistories() {
		return loginHistories;
	}

	public void setLoginHistories(Collection<UserLoginHistoryEntity> loginHistories) {
		this.loginHistories = loginHistories;
	}

	/******************************************************************* Utility Methods ****************************************************************************/
	/****************************************************************************************************************************************************************/
	
	public boolean isUserActive() {
		return ITypeConstants.TYPE_LOGIN_ACT.equals(this.getStatus().getTypeCode());
	}
	
	public boolean isUserLockedOut() {
		return ITypeConstants.TYPE_LOGIN_SUS.equals(this.getStatus().getTypeCode());
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
		saltBuilder.append(getUsername());
		
		saltBuilder.append(formatter.format(getCreationDate()));
		saltBuilder.append(getCreatedBy());
		
		saltBuilder.append(getStatus().getTypeCode());
		
		return saltBuilder.toString();
	}
	
}
