package com.anucana.value.objects;

public class UserRole extends GenericVO {

	private static final long serialVersionUID = 7331291936316397094L;

	private long userId;

	private String role;

	private String comments;

	public UserRole(long userId, String role, String comments) {
		this.userId = userId;
		this.role = role;
		this.comments = comments;
	}

	public long getUserId() {
		return userId;
	}

	public String getRole() {
		return role;
	}

	public String getComments() {
		return comments;
	}

}
