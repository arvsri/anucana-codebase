package com.anucana.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.client.data.IClientDetails;
import com.anucana.commands.email.CommandFailedExcepion;
import com.anucana.commands.email.CommandInvoker;
import com.anucana.commands.email.IContactUsNotification;
import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.MessageInboxDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.entities.MessageInboxEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.ContactUs;

@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class MessageService extends AuditService implements IMessageService, ITypeConstants {

    private static final long serialVersionUID = -8828070383783088416L;

    @Autowired
    private JSR303ValidatorFactoryBean jsr303validator;
    @Autowired
    private TypeDAO typeDao;
    @Autowired
    private MessageInboxDAO messageInboxDao;
    @Autowired
    private IContactUsNotification contactUsNotification;


    @Override
    public ServiceResponse<ContactUs> saveContactUsMessage(ServiceRequest<ContactUs> request, IUserDetails userDetails, IClientDetails client)
            throws ServiceException {
        ContactUs contactus = request.getTargetObject();
        // Copy the user details on the contact us object incase message is being provided by the logged in user ( overriding what user provided )
        if (userDetails != null) {
            contactus.setEmail(userDetails.getUsername());
            contactus.setFirstName(userDetails.getFirstName());
            contactus.setLastName(userDetails.getLastName());
        }

        // validate the request
        request.setValidator(jsr303validator);
        request.validate();
        if (request.getBindingResult().hasErrors()) {
            return request;
        }

        // build the message entity and save it
        MessageInboxEntity message = new MessageInboxEntity();
        message.setFirstName(contactus.getFirstName());
        message.setLastName(contactus.getLastName());
        message.setEmail(contactus.getEmail());
        message.setSubject(contactus.getSubject());
        message.setMessage(contactus.getMessage());
        
        if(userDetails != null){
            message.setMessageType(typeDao.findByTypeCode(MessageInboxEntity.MESSAGE_TYPE_LOGGED_IN_USER));
        }else{
            message.setMessageType(typeDao.findByTypeCode(MessageInboxEntity.MESSAGE_TYPE_ANNONYMOUS));
        }
        messageInboxDao.save(message);

        // send the notification too 
        try {
            new CommandInvoker().execute(contactUsNotification, message, client, userDetails);
        } catch (CommandFailedExcepion e) {
            throw new ServiceException(ServiceException.EMAIL_NOTIFICATION_FAILED_EXCEPTION, e);
        }

        // stamp the message id so that user can use it as reference for further communications
        contactus.setMessageId(message.getId());
        return request;
    }

}
