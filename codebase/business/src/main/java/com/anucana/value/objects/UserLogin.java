package com.anucana.value.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.anucana.value.objects.validation.Exists;
import com.anucana.value.objects.validation.ForgotPassword;
import com.anucana.value.objects.validation.NewReg;
import com.anucana.value.objects.validation.NotExists;
import com.anucana.value.objects.validation.ResetPassword;
import com.anucana.value.objects.validation.UserActive;
import com.anucana.value.objects.validation.ValidFirstName;
import com.anucana.value.objects.validation.ValidLastName;
import com.anucana.value.objects.validation.ValidPassword;
import com.anucana.value.objects.validation.ValidUsername;
import com.anucana.value.objects.validation.VerifyUser;



/**
 * Encapsulates all the properties relating to user login. Value object to capture user inputs and rendering user details on views
 * 
 * @author asrivastava
 *
 */
public class UserLogin implements Serializable,Cloneable{
	
	private static final long serialVersionUID = -1288263300311067338L;

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
	
	private String passwordVerify;
	
	/**
	 * Secret key - useful for account activation and reset password
	 */
	private String secretKey;
	
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

	@ValidFirstName(groups = NewReg.FirstPass.class)
	public String getFirstName() {
		return firstName;
	}

	@ValidLastName(groups = NewReg.FirstPass.class)
	public String getLastName() {
		return lastName;
	}

	@ValidUsername(groups = {NewReg.FirstPass.class,ForgotPassword.FirstPass.class,VerifyUser.FirstPass.class})
	@NotExists(value = Exists.TYPE.USER_NAME, groups = {NewReg.SecondPass.class})
	@Exists(value = Exists.TYPE.USER_NAME, groups = {ForgotPassword.SecondPass.class,VerifyUser.SecondPass.class})
	@UserActive(groups = ForgotPassword.SecondPass.class)
	public String getUsername() {
		return username;
	}

	@ValidPassword(groups = {NewReg.FirstPass.class,ResetPassword.class})
	public String getPassword() {
		return password;
	}

	@ValidPassword(groups = { NewReg.FirstPass.class,ResetPassword.class})
	public String getPasswordVerify() {
		if (this.password == null || this.password.equals(this.passwordVerify)) {
			return passwordVerify;
		}
		return null;
	}
	
	
	public String getSecretKey() {
		return secretKey;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setUsername(String username) {
		this.username = username;
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

	public void setPasswordVerify(String passwordVerify) {
		this.passwordVerify = passwordVerify;
	}


	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	
}
