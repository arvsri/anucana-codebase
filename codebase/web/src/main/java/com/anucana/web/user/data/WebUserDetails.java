package com.anucana.web.user.data;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.UserLogin;

public class WebUserDetails extends User implements IUserDetails{

	private static final long serialVersionUID = 5313753717894505571L;
	
	private final long userId;
	
	private String firstName;
	
	private String lastName;
	
	public WebUserDetails(UserLogin userLogin, Collection<? extends GrantedAuthority> authorities) {
		super(userLogin.getUsername(), userLogin.getPassword(), userLogin.isEnabled(), true,true, userLogin.isAccountNonLocked(), authorities);
		
		this.userId = userLogin.getUserId();
		
		this.firstName = userLogin.getFirstName();
		this.lastName = userLogin.getLastName();
	}

	@Override
	public long getUserId() {
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
