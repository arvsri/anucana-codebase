package com.anucana.services;

import java.io.Serializable;

import com.anucana.value.objects.UserPrimaryInfo;
import com.anucana.value.objects.UserProfileInfo;

/**
 * Services for user information ( authentication, authorization transaction, security etc ). The service assumes that all the objects provided to it has been validated
 *  
 * @author asrivastava
 * @since Jan 25, 2014
 */
public interface IUserDetailsService extends Serializable{

	UserPrimaryInfo getPrimaryInfo(long loginNumber);
	
	UserProfileInfo getProfileInfo(long loginNumber);

	
	UserPrimaryInfo updatePrimaryInfo(long loginNumber, UserPrimaryInfo primaryInfo);
	
	UserProfileInfo updateProfileInfo(long loginNumber, UserProfileInfo profileInfo);
	
}
