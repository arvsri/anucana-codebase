package com.anucana.services;

import java.io.Serializable;

import com.anucana.value.objects.UserPrimaryInfo;
import com.anucana.value.objects.UserProfile;

/**
 * Services for user information ( authentication, authorization transaction, security etc ). The service assumes that all the objects provided to it has been validated
 *  
 * @author asrivastava
 * @since Jan 25, 2014
 */
public interface IUserProfileService extends Serializable{

	UserPrimaryInfo getPrimaryInfo(long loginNumber);
	
	UserProfile getProfileInfo(long loginNumber);

	
	UserPrimaryInfo updatePrimaryInfo(long loginNumber, UserPrimaryInfo primaryInfo);
	
	UserProfile updateProfileInfo(long loginNumber, UserProfile profileInfo);
	
}
