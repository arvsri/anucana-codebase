package com.anucana.services;

import java.io.Serializable;

import com.anucana.client.data.IClientDetails;
import com.anucana.constants.IBusinessConstants;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.UserLogin;

/**
 * Services for user login ( authentication, authorization transaction, security etc ). The service assumes that all the objects provided to it has been validated  
 * 
 * @author asrivastava
 * 
 */
public interface ILoginService extends Serializable,IBusinessConstants{

	
	/**
	 * Authenticates the user
	 * @param user
	 * @param session 
	 * @return
	 * @throws Exception
	 */
	boolean authenticateUser(UserLogin user) throws Exception;
	
	/**
	 * Get the user details
	 * @param subject
	 * @return
	 * @throws Exception
	 */
	public UserLogin getUserDetails(UserLogin subject) throws Exception;

	
	/**
	 * Registers a new user to the anucana system
	 * 
	 * @param request
	 * @param user
	 * @param client
	 * @return
	 * @throws ServiceException
	 */
	ServiceResponse<UserLogin> registerNewUser(ServiceRequest<UserLogin> request, IUserDetails user, IClientDetails client) throws ServiceException;
	
	
	/**
	 * Activates a user   
	 * @param user
	 * @return userId
	 * @param secretCode
	 * @throws Exception 
	 */
	UserLogin activateUser(String userId,String secretCode) throws Exception;
	
	
	/**
	 * Verifies the users and sends a notifcation with link to reset the password
	 * 
	 * @param request
	 * @param userDetails
	 * @param client
	 * @return
	 * @throws ServiceException
	 */
	ServiceResponse<UserLogin> forgotPassword(ServiceRequest<UserLogin> request, IUserDetails userDetails,IClientDetails client) throws ServiceException;	
	
	/**
	 * Updates the password of the user in the repository
	 * @param userId
	 * @param newPassword
	 * @param secretCode
	 * @return
	 */
	UserLogin updatePassword(String userId,String newPassword, String secretCode) throws Exception;

	/**
	 * Updates the first and last name of the user ( they can not be null )
	 * 
	 * @param loginNumber
	 * @param firstName
	 * @param lastName
	 * @throws Exception
	 */
	void updateName(long loginNumber,String firstName, String lastName) throws Exception;
	

	/**
	 * Tells if the user id already exists in the system
	 * @param userId
	 * @return : True if the user id already exists
	 * @throws Exception
	 */
	boolean doesUserIdExists(String userId) throws Exception;

	/**
	 * Gets the user details by user name
	 * @param request
	 * @param user
	 * @param clientDetails
	 * @return
	 * @throws ServiceException
	 */
	public ServiceResponse<UserLogin> getUserByUserName(ServiceRequest<String> request, IUserDetails user, IClientDetails client) throws ServiceException;
	
	/**
	 * Save the user login history
	 * 
	 * @param request
	 * @param user
	 * @param clientDetails
	 * @return
	 * @throws ServiceException
	 */
	public ServiceResponse<UserLogin> recordUserLoginHistory(ServiceRequest<String> request, IUserDetails user, IClientDetails client) throws ServiceException;

	/**
	 * Locks out user account to deny further attempts of login
	 * 
	 * @param request
	 * @param user
	 * @param client
	 * @return
	 * @throws ServiceException
	 */
	public ServiceResponse<UserLogin> lockoutUserAccount(ServiceRequest<String> request, IUserDetails user, IClientDetails client) throws ServiceException;
	
	
}
