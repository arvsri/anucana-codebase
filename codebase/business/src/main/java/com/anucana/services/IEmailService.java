package com.anucana.services;

import java.io.Serializable;

import com.anucana.constants.IBusinessConstants;
import com.anucana.value.objects.UserLogin;

/**
 * Services for building email message and send it to the user
 *  
 * @author asrivastava
 *
 */
public interface IEmailService extends Serializable,IBusinessConstants{
	
	/**
	 * Builds an email message based on the sub type of user login
	 * @param user
	 * @return : Email message
	 * @param : Secret Code to be send out in URL
	 * @throws Exception
	 */
	String buildEmailMessage(UserLogin user,String secretCode) throws Exception;
	
	/**
	 * Delivers email message to the desination 
	 * @param emailMessage
	 * @param destination
	 * @return
	 * @throws Exception
	 */
	String sendEmailMessage(String emailMessage, String desination,String subject) throws Exception;
}
