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
@Table(name = "user_role")
public class UserRoleEntity extends AuditEntity implements StandardEntity<Long>,Serializable {

	private static final long serialVersionUID = -9122625775656300447L;

	@Id
	@GeneratedValue
	@Column(name = "user_roles_id")
	private Long id;
	
	@ManyToOne(targetEntity = UserLoginEntity.class)
	@JoinColumn(name = "login_id", nullable = false)
	private UserLoginEntity userLogin;

	@ManyToOne( targetEntity = TypeTableEntity.class)
	@JoinColumn (name = "role_cd", nullable = false, referencedColumnName = "type_cd")
	private TypeTableEntity role;
	
	@Column( name = "comments",nullable = true, length = 255)
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
