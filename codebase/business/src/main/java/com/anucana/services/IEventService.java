package com.anucana.services;

import java.util.List;

import com.anucana.client.data.IClientDetails;
import com.anucana.entity.search.conditions.EventSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.Address;
import com.anucana.value.objects.Event;

public interface IEventService {

	ServiceResponse<Event> getEventDetails(ServiceRequest<Long> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;

	ServiceResponse<Event> saveEventDetails(ServiceRequest<Event> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	ServiceResponse<List<Event>> searchEvents(ServiceRequest<EventSearchConditions> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	ServiceResponse<List<Address>> getAllEventAddresses(IUserDetails userDetails,IClientDetails client) throws ServiceException;

}
