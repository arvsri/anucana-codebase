package com.anucana.services;

import java.io.Serializable;
import java.util.List;

import com.anucana.client.data.IClientDetails;
import com.anucana.entity.search.conditions.ProfileSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.UserProfile;

/**
 * Services for profile information.
 *  
 * @author asrivastava
 * @since Jan 25, 2014
 */
public interface IUserProfileService extends Serializable{

	ServiceResponse<UserProfile> getProfileInfo(ServiceRequest<Long> request, IUserDetails userDetails, IClientDetails client) throws ServiceException;
	
	ServiceResponse<UserProfile> updateProfileInfo(ServiceRequest<UserProfile> request, IUserDetails userDetails, IClientDetails client) throws ServiceException;
	
	ServiceResponse<List<UserProfile>> searchProfiles(ServiceRequest<ProfileSearchConditions> request, IUserDetails userDetails, IClientDetails client) throws ServiceException;
	
}
