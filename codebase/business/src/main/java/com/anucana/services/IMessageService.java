package com.anucana.services;

import java.io.Serializable;

import com.anucana.client.data.IClientDetails;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.ContactUs;

/**
 * Services for writing and reading user messages. User might write messages as feedback for an event, his/her event preferences or any anonymous user will to
 * contact us
 */
public interface IMessageService extends Serializable {

    ServiceResponse<ContactUs> saveContactUsMessage(ServiceRequest<ContactUs> request, IUserDetails userDetails, IClientDetails client)
            throws ServiceException;

}
