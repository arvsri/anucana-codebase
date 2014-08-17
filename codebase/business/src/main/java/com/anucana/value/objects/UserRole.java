package com.anucana.value.objects;

import java.io.Serializable;

public class UserRole implements Serializable {

	private static final long serialVersionUID = 7331291936316397094L;

	private final long userId;

	private final String role;

	private final String comments;

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
