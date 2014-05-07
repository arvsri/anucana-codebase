package com.anucana.session.data;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * The default implementation of user session data. 
 * 
 * @author asrivastava
 *
 */
@Component
@Scope(value="session",proxyMode=ScopedProxyMode.INTERFACES)
public class DefaultUserSessionData implements IUserSession,Serializable {

	/**
	 * The default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	private long loginNumber;
	
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private boolean authenticated;
	
	private List<String> userRoles ;

	@Override
	public void buildUserSession(long loginNumber, String userId,String firstName,String lastName,boolean authenticated,List<String> userRoles){
		this.loginNumber = loginNumber;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.authenticated = authenticated;
		this.userRoles = userRoles;
	}
	
	@Override
	public void logOutUserSession(){
		this.loginNumber = 0;
		this.userId = null;
		this.firstName = null;
		this.lastName = null;
		this.authenticated = false;
		this.userRoles = null;
	}

	public long getLoginNumber() {
		return loginNumber;
	}

	@Override
	public String getUserId() {
		return userId;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean isAuthenticated() {
		return authenticated;
	}

	@Override
	public List<String> getUserRoles() {
		return userRoles;
	}

	@Override
	public void updateNames(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
