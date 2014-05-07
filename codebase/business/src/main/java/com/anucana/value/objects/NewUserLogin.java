package com.anucana.value.objects;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class NewUserLogin extends UserLogin {

	/**
	 * The default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Please enter your first name!")
	@Size(min = 1, max=50, message="Your first name must be between 1 to 50 characters!")
	public String getFirstName() {
		return super.getFirstName();
	}

	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}

	@NotEmpty(message="Please enter your last name!")
	@Size(min = 1, max=50, message="Your last name must be between 1 to 50 characters!")
	public String getLastName() {
		return super.getLastName();
	}

	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}

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
