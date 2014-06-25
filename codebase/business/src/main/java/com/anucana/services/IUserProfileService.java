package com.anucana.services;

import java.io.Serializable;

import com.anucana.client.data.IClientDetails;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.UserProfile;

/**
 * Services for user information ( authentication, authorization transaction, security etc ). The service assumes that all the objects provided to it has been validated
 *  
 * @author asrivastava
 * @since Jan 25, 2014
 */
public interface IUserProfileService extends Serializable{

	ServiceResponse<UserProfile> getProfileInfo(ServiceRequest<Long> request, IUserDetails userDetails, IClientDetails client) throws ServiceException;
	
	ServiceResponse<UserProfile> updateProfileInfo(ServiceRequest<UserProfile> request, IUserDetails userDetails, IClientDetails client) throws ServiceException;
	
}
