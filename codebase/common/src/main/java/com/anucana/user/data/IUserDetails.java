package com.anucana.user.data;

public interface IUserDetails {

	long getUserId();

	String getUsername();

	String getPassword();

	String getFirstName();

	String getLastName();

	void setFirstName(String firstName);

	void setLastName(String lastName);

}
