package com.anucana.value.objects;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class ForgotPasswordUserLogin extends UserLogin{
	
	public ForgotPasswordUserLogin(){
		super();
	}
	
	public ForgotPasswordUserLogin(String userId){
		super(userId,null);
	}
	/**
	 * The default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Please enter your user id!")
	@Email(message="User id must be a valid email address!")
	public String getUsername() {
		return super.getUsername();
	}
	
	
}
