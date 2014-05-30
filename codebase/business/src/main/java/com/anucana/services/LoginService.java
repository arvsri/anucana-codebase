package com.anucana.services;

import java.util.Collection;
import java.util.Date;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.validation.Validator;

import com.anucana.client.data.IClientDetails;
import com.anucana.commands.email.CommandFailedExcepion;
import com.anucana.commands.email.CommandInvoker;
import com.anucana.commands.email.IActivateAccountNotification;
import com.anucana.commands.email.IForgotPasswordNotification;
import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.dao.UserLoginHistoryDAO;
import com.anucana.persistence.dao.UserRoleDAO;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.persistence.entities.UserLoginHistoryEntity;
import com.anucana.persistence.entities.UserPrimaryInfoEntity;
import com.anucana.persistence.entities.UserProfileInfoEntity;
import com.anucana.persistence.entities.UserRoleEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.LocalCollectionUtils;
import com.anucana.value.objects.UserLogin;
import com.anucana.value.objects.UserRole;

/**
 * Provides services related with user login/ authentication
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED)
public class LoginService extends AuditService implements ILoginService,ITypeConstants {

	private static final long serialVersionUID = 1L;

	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	@Autowired
	private UserRoleDAO<UserRoleEntity> userRoleDao;
	@Autowired
	private UserLoginHistoryDAO<UserLoginHistoryEntity> loginHistoryDAO;
	@Autowired
	private TypeDAO typeDao; 
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private IActivateAccountNotification activateAccountNotification;
	@Autowired
	private IForgotPasswordNotification forgotPasswordNotification;
	@Autowired
	private Validator validator;
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public boolean authenticateUser(UserLogin userLoginVO) throws Exception {
		UserLoginEntity user = loginDao.getUser(userLoginVO.getUsername());
		if (user != null) {
			if (user.isUserActive() && user.getPassword().equals(passwordEncoder.encode(userLoginVO.getPassword()))) {
				return true;
			}
		}
		return false;
	}


	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public UserLogin getUserDetails(UserLogin userVO) throws Exception {
		UserLoginEntity user = null;
		if (StringUtils.isNotBlank(userVO.getUsername())) {
			user = loginDao.getUser(userVO.getUsername());
		} else {
			user = loginDao.findById(userVO.getUserId());
		}
		
		if(user != null && user.isUserActive()){
			return new UserLogin(user.getId(), user.getUsername(), user.getFirstName(), user.getLastName());
		}
		return null;
	}

	@Override
	public ServiceResponse<UserLogin> registerNewUser(ServiceRequest<UserLogin> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		request.setValidator(validator);
		request.validate(new Object[]{UserLogin.UserRegistrationValidationMarker.class});
		if(request.getBindingResult().hasErrors()){
			return request;
		}
		
		UserLogin userVO = request.getTargetObject();
		Assert.notNull(userVO);
		
		UserLoginEntity user = new UserLoginEntity();
		user.setUsername(userVO.getUsername());
		user.setFirstName(userVO.getFirstName());
		user.setLastName(userVO.getLastName());
		user.setPassword(passwordEncoder.encode(userVO.getPassword()));
		user.setStatus(typeDao.findByTypeCode(TYPE_LOGIN_INACT));
		user.setCreationDate(new Date());
		
		loginDao.save(user);

		user = loginDao.findById(user.getId());

		// setup audit details
		user.setCreatedBy(user.getId());
		user.setLastUpdatedBy(user.getId());
		user.setLastUpdateDate(new Date());

		// give a general user role
		UserRoleEntity role = new UserRoleEntity();
		role.setUserLogin(user);
		role.setRole(typeDao.findByTypeCode(TYPE_ROLE_GENERAL_USER));
		copyAuditDetails(user, role);
		user.setUserRoles(LocalCollectionUtils.addToNewList(role));

		// Setup the primary information of the user
		UserPrimaryInfoEntity primaryInfo = new UserPrimaryInfoEntity();
		primaryInfo.setEmail(user.getUsername());
		primaryInfo.setUserLogin(user);
		copyAuditDetails(user, primaryInfo);
		user.setUserPrimaryInfo(primaryInfo);

		// setup profile information of the user
		UserProfileInfoEntity profileInfo = new UserProfileInfoEntity();
		profileInfo.setUserLogin(user);
		copyAuditDetails(user, profileInfo);
		user.setUserProfileInfo(profileInfo);

		loginDao.save(user);

		// Send the email for verification
		try {
			new CommandInvoker().execute(activateAccountNotification, user, client, null);
		} catch (CommandFailedExcepion e) {
			throw new ServiceException(ServiceException.EMAIL_NOTIFICATION_FAILED_EXCEPTION,e);
		}
		
		return new ServiceResponse<UserLogin>(new UserLogin(user.getId(), user.getUsername(),user.getFirstName(), user.getLastName()));
	}	
	
	@Override
	public UserLogin activateUser(String username, String secretCode) throws Exception {
		Assert.hasLength(username);
		Assert.hasLength(secretCode);
		
		UserLoginEntity user = loginDao.getUser(username);
		if(user != null && IUtilityService.urlKeyEncoder.isPasswordValid(secretCode, user.getPassword(), user.getVerificationSalt())){
			user.setStatus(typeDao.findByTypeCode(TYPE_LOGIN_ACT));
			user.setLastUpdateDate(new Date());
			loginDao.save(user);
			
			return new UserLogin(user.getId(), user.getUsername(), user.getFirstName(), user.getLastName());
		}
		return null;
	}


	@Override
	public ServiceResponse<UserLogin> forgotPassword(ServiceRequest<UserLogin> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		request.validate();
		if(request.getBindingResult().hasErrors()){
			return request;
		}
		
		UserLogin userVO = request.getTargetObject();
		UserLoginEntity user = loginDao.getUser(userVO.getUsername());
		if(user != null && user.isUserActive()){
			// Send the email for verification
			try {
				new CommandInvoker().execute(forgotPasswordNotification, user, client, null);
			} catch (CommandFailedExcepion e) {
				throw new ServiceException(ServiceException.EMAIL_NOTIFICATION_FAILED_EXCEPTION,e);
			}
		}
		return request;
	}
	
	@Override
	public UserLogin updatePassword(String userId, String newPassword,String secretCode) throws Exception {
		Assert.hasLength(userId);
		Assert.hasLength(newPassword);
		Assert.hasLength(secretCode);
		
		UserLoginEntity user = loginDao.getUser(userId);
		if(user != null && IUtilityService.urlKeyEncoder.isPasswordValid(secretCode, user.getPassword(), user.getVerificationSalt())){
			user.setPassword(passwordEncoder.encode(newPassword));
			// update the last login date 
			user.setLastUpdateDate(new Date());
			
			loginDao.save(user);
			return new UserLogin(user.getId(), user.getUsername(), user.getFirstName(), user.getLastName());
		}
		return null;
	}

	@Override
	public void updateName(long loginNumber, String firstName, String lastName)throws Exception {
		Assert.hasLength(firstName);
		Assert.hasLength(lastName);

		UserLoginEntity user = loginDao.findById(loginNumber);
		user.setFirstName(firstName);
		user.setLastName(lastName);

		loginDao.save(user);
	}


	@Override
	@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
	public boolean doesUserIdExists(String userId) throws Exception {
		UserLoginEntity user = loginDao.getUser(userId);
		if (user != null) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ServiceResponse<UserLogin> getUserByUserName(ServiceRequest<String> request, IUserDetails user,IClientDetails client) throws ServiceException {
		UserLogin userLogin = null;

		if (StringUtils.isNotBlank(request.getTargetObject())) {
			UserLoginEntity userEntity = loginDao.getUser(request.getTargetObject());
			
			if(userEntity != null){
				userLogin =  new UserLogin(userEntity.getId(), userEntity.getUsername(), userEntity.getFirstName(), userEntity.getLastName());
				userLogin.setPassword(userEntity.getPassword());
				userLogin.setEnabled(userEntity.isUserActive());
				userLogin.setAccountNonLocked(!userEntity.isUserLockedOut());
				
				Collection<UserRoleEntity> roles = userRoleDao.getUserRoles(userEntity.getUsername());
				if(CollectionUtils.isNotEmpty(roles)){
					userLogin.setRoles(CollectionUtils.collect(roles, new Transformer() {
						@Override
						public Object transform(final Object arg0) {
							final UserRoleEntity roleEntity = (UserRoleEntity)arg0;
							return new UserRole(roleEntity.getUserLogin().getId(), roleEntity.getRole().getTypeCode(), roleEntity.getComments());
						}
					}));
				}
			}
			
		} 
		
		if(userLogin != null){
			return new ServiceResponse<UserLogin>(userLogin);
		}else{
			throw new ServiceException(ServiceException.USERNAME_NOT_FOUND_EXCEPTION);
		}
	}


	@Override
	public ServiceResponse<UserLogin> recordUserLoginHistory(ServiceRequest<String> request, IUserDetails user,IClientDetails client) throws ServiceException {
		UserLogin userLogin = null;
		if (StringUtils.isNotBlank(request.getTargetObject())) {
			UserLoginEntity userEntity = loginDao.getUserWithLoginHistory(request.getTargetObject());
			
			if(userEntity != null){
				userLogin =  new UserLogin(userEntity.getId(), userEntity.getUsername(), userEntity.getFirstName(), userEntity.getLastName());
				userLogin.setFirstTimeLogin(CollectionUtils.isEmpty(userEntity.getLoginHistories()));

				// save the login history
				UserLoginHistoryEntity historyEntity = new UserLoginHistoryEntity();
				historyEntity.setIpAddress(client.getClientIP());
				historyEntity.setUserLogin(userEntity);
				historyEntity.setPassword(userEntity.getPassword());
				
				historyEntity.setCreationDate(new Date());
				historyEntity.setCreatedBy(user.getUserId());
				
				loginHistoryDAO.save(historyEntity);
			}
		} 
		
		if(userLogin != null){
			return new ServiceResponse<UserLogin>(userLogin);
		}else{
			throw new ServiceException(ServiceException.USERNAME_NOT_FOUND_EXCEPTION);
		}
	}


	@Override
	public ServiceResponse<UserLogin> lockoutUserAccount(ServiceRequest<String> request, IUserDetails user, IClientDetails client) throws ServiceException{
		UserLogin userLogin = null;
		
		if (StringUtils.isNotBlank(request.getTargetObject())) {
			UserLoginEntity userEntity = loginDao.getUser(request.getTargetObject());
			if(userEntity != null){
				userEntity.setStatus(typeDao.findByTypeCode(USER_STATUS_SUSPENDED));
				loginDao.save(userEntity);
				
				userLogin =  new UserLogin(userEntity.getId(), userEntity.getUsername(), userEntity.getFirstName(), userEntity.getLastName());
				userLogin.setAccountNonLocked(!userEntity.isUserLockedOut());
			}
		} 
		if(userLogin != null){
			return new ServiceResponse<UserLogin>(userLogin);
		}else{
			throw new ServiceException(ServiceException.USERNAME_NOT_FOUND_EXCEPTION);
		}
	}



}
