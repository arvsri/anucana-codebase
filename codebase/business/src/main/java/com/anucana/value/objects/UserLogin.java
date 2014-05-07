package com.anucana.value.objects;
/**
 * Model / domain object for user login
 * 
 * @author asrivastava
 *
 */
public class UserLogin extends GenericVO{

	private static final long serialVersionUID = 1L;

	/**
	 * An auto generated sequence. Primary key of the user login
	 */
	private long userId;

	/**
	 * The first name of the user
	 */
	private String firstName;
	
	/**
	 * The last name of the user
	 */
	private String lastName;

	/**
	 * The user id of the user ( Should be a valid email address ).
	 * Its the business primary key. It will always be unique
	 */
	private String username;
	
	/**
	 * The user's password. At controller level, it will contain the plain text password. 
	 * However, the DAO layer will contain the SHA password salted with user id
	 */
	private String password;
	
	/**
	 * True if user is logging in for the first time
	 */
	private boolean firstTimeLogin = false;
	
	/**
	 * True if user is active, false otherwise
	 */
	private boolean isUserActive = true;
	
	
	public UserLogin(long userId, String username, String firstName,String lastName,boolean firstTimeLogin){
		this.userId = userId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.firstTimeLogin = firstTimeLogin;
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

	public void setFirstTimeLogin(boolean firstTimeLogin) {
		this.firstTimeLogin = firstTimeLogin;
	}


	public boolean isFirstTimeLogin() {
		return firstTimeLogin;
	}


	public boolean isUserActive() {
		return isUserActive;
	}


	public void setUserActive(boolean isUserActive) {
		this.isUserActive = isUserActive;
	}

	
}
