package com.anucana.value.objects;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



public class ExistingUserLogin extends UserLogin {

	/**
	 * The default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Please enter your user id!")
	@Email(message="User id must be a valid email address!")
	public String getUsername() {
		return super.getUsername();
	}

	public void setUsername(String userId) {
		super.setUsername(userId);
	}

	@NotEmpty(message="Please enter your pasword!")
	@Size(min = 6, max=20, message="Your password must be between 6 to 20 characters!")
	public String getPassword() {
		return super.getPassword();
	}

	public void setPassword(String password) {
		super.setPassword(password);
	}
	
}
