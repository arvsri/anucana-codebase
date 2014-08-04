package com.anucana.services;

import java.util.Collection;
import java.util.List;

import com.anucana.client.data.IClientDetails;
import com.anucana.entity.search.conditions.CommunitySearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.Community;

public interface ICommunityService {
	
	ServiceResponse<Community> getCommunityDetails(ServiceRequest<Long> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;

	ServiceResponse<Community> saveCommunityDetails(ServiceRequest<Community> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	ServiceResponse<Collection<String>> getCommunityKeywords(ServiceRequest<Long> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;

	ServiceResponse<List<Community>> searchCommunities(ServiceRequest<CommunitySearchConditions> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
}
