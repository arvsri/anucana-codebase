package com.anucana.session.data;

import java.util.List;

public interface IUserSession {

	void buildUserSession(long loginNumber, String userId, String firstName,String lastName, boolean authenticated, List<String> userRoles);

	void logOutUserSession();

	long getLoginNumber();

	void updateNames(String firstName, String lastName);

	String getUserId();

	String getFirstName();

	String getLastName();

	boolean isAuthenticated();

	List<String> getUserRoles();

}