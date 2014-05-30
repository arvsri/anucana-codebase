package com.anucana.value.objects;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * Encapsulates all the properties relating to user login. Value object to capture user inputs and rendering user details on views
 * 
 * @author asrivastava
 *
 */
public class UserLogin {
	
	public static interface UserRegistrationValidationMarker{
		
	}
	
	public static interface ForgotPasswordValidationMarker{
		
	}
	

	/**
	 * An auto generated sequence. Primary key of the user login
	 */
	private long userId;

	/**
	 * The first name of the user
	 */
	@NotEmpty(groups = {UserRegistrationValidationMarker.class})
	private String firstName;
	
	/**
	 * The last name of the user
	 */
	@NotEmpty(groups = {UserRegistrationValidationMarker.class})
	private String lastName;

	/**
	 * The user id of the user ( Should be a valid email address ).
	 * Its the business primary key. It will always be unique
	 */
	@NotEmpty(groups = {UserRegistrationValidationMarker.class,ForgotPasswordValidationMarker.class})
	private String username;
	
	/**
	 * The user's password. At controller level, it will contain the plain text password. 
	 * However, the DAO layer will contain the SHA password salted with user id
	 */
	@NotEmpty(groups = {UserRegistrationValidationMarker.class})
	private String password;
	
	/**
	 * Collection of user roles 
	 */
	private Collection<UserRole> roles;
	
	/**
	 * Tells if the user account is active and enabled ( user has activated the account after completing the registration)
	 */
	private boolean enabled;
	
	/**
	 * Tells if the user account is not locked out 
	 */
	private boolean accountNonLocked;
	
	/**
	 * Tells if the user is logging in for the first time
	 */
	private boolean firstTimeLogin;
	

	public UserLogin(long userId, String username, String firstName,String lastName){
		this.userId = userId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public UserLogin(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public UserLogin() {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public Collection<UserRole> getRoles() {
		if (roles == null) {
			roles = new ArrayList<UserRole>();
		}
		return roles;
	}

	public void setRoles(Collection<UserRole> roles) {
		this.roles = roles;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}


	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}


	public boolean isFirstTimeLogin() {
		return firstTimeLogin;
	}


	public void setFirstTimeLogin(boolean firstTimeLogin) {
		this.firstTimeLogin = firstTimeLogin;
	}

	
	
}
