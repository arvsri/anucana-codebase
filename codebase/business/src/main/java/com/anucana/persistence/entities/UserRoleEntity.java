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
@Table(name = "USER_ROLE")
public class UserRoleEntity extends AuditEntity implements Identifiable<Long>,Serializable {

	private static final long serialVersionUID = -9122625775656300447L;

	@Id
	@GeneratedValue
	@Column(name = "USER_ROLES_ID")
	private Long id;
	
	@ManyToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "LOGIN_ID", nullable = false)
	private UserLoginEntity userLogin;

	@ManyToOne( targetEntity = TypeTableEntity.class)
	@JoinColumn (name = "ROLE_CD", nullable = false, referencedColumnName = "TYPE_CD")
	private TypeTableEntity role;
	
	@Column( name = "COMMENTS",nullable = true, length = 255)
	private String comments;
	

	@Override
	public Long getId() {
		return this.id;
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

	public TypeTableEntity getRole() {
		return role;
	}

	public void setRole(TypeTableEntity role) {
		this.role = role;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
