package com.anucana.services;

import java.io.Serializable;

import com.anucana.client.data.IClientDetails;
import com.anucana.constants.IBusinessConstants;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.session.data.IUserSession;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.ForgotPasswordUserLogin;
import com.anucana.value.objects.NewUserLogin;
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
	 * Updates the login date 
	 *  
	 * @param userLoginVO
	 * @param session
	 * @throws Exception
	 */
	public void updateLoginDate(UserLogin userLoginVO,IUserSession session) throws Exception;
	
	/**
	 * Get the user details
	 * @param subject
	 * @return
	 * @throws Exception
	 */
	public UserLogin getUserDetails(UserLogin subject) throws Exception;

	
	/**
	 * Creates a new user in repository and sends an email to the user for verify himself  
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	UserLogin createUser(NewUserLogin user) throws Exception;
	
	/**
	 * Activates a user   
	 * @param user
	 * @return userId
	 * @param secretCode
	 * @throws Exception 
	 */
	UserLogin activateUser(String userId,String secretCode) throws Exception;
	
	/**
	 * Send an email to the user with link to resent password   
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	UserLogin forgotPassword(ForgotPasswordUserLogin user) throws Exception;
	
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
	public ServiceResponse<UserLogin> getUserByUserName(ServiceRequest<String> request, IUserDetails user, IClientDetails clientDetails) throws ServiceException;
}
