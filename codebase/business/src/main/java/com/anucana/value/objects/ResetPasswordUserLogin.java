package com.anucana.value.objects;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class ResetPasswordUserLogin implements Serializable {

	/**
	 * The default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String secretKey;
	
	private String password1;
	
	private String password2;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	@NotEmpty(message="Please enter your new pasword!")
	@Size(min = 6, max=20, message="Your password must be between 6 to 20 characters!")
	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String newPassword1) {
		this.password1 = newPassword1;
	}

	@NotEmpty(message="Please re-type your new password!")
	@Size(min = 6, max=20, message="Your password must be between 6 to 20 characters!")
	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String newPassword2) {
		this.password2 = newPassword2;
	}
	
	
}
