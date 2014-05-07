package com.anucana.services;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.anucana.client.data.IClientDetails;
import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.persistence.entities.UserPrimaryInfoEntity;
import com.anucana.persistence.entities.UserProfileInfoEntity;
import com.anucana.persistence.entities.UserRoleEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.session.data.IUserSession;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.CollectionUtils;
import com.anucana.value.objects.ForgotPasswordUserLogin;
import com.anucana.value.objects.NewUserLogin;
import com.anucana.value.objects.UserLogin;

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
	private TypeDAO typeDao; 
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private IEmailService emailService;
	

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

	public void updateLoginDate(UserLogin userLoginVO,IUserSession session) throws Exception {
		UserLoginEntity user = loginDao.getUser(userLoginVO.getUsername());

		user.setLastLoginDate(new Date());
		stampAuditDetails(user, session, loginDao);
		
		loginDao.save(user);
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
			return new UserLogin(user.getId(), user.getUserName(), user.getFirstName(), user.getLastName(),user.isFirstTimeLogin());
		}
		return null;
	}

	@Override
	public UserLogin createUser(NewUserLogin userVO) throws Exception {
		Assert.notNull(userVO);
		
		UserLoginEntity user = new UserLoginEntity();
		user.setUserName(userVO.getUsername());
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
		user.setUserRoles(CollectionUtils.addToNewList(role));

		// Setup the primary information of the user
		UserPrimaryInfoEntity primaryInfo = new UserPrimaryInfoEntity();
		primaryInfo.setEmail(user.getUserName());
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
		String emailMessage = emailService.buildEmailMessage(userVO, passwordEncoder.encode(user.getPassword() + user.getVerificationSalt()));
		emailService.sendEmailMessage(emailMessage, user.getUserName(),
				"Activate your anucana account");

		return new UserLogin(user.getId(), user.getUserName(),user.getFirstName(), user.getLastName(),user.isFirstTimeLogin());
	}

	

	@Override
	public UserLogin activateUser(String userId, String secretCode) throws Exception {
		Assert.hasLength(userId);
		Assert.hasLength(secretCode);
		
		UserLoginEntity user = loginDao.getUser(userId);
		if(user != null && secretCode.equals(passwordEncoder.encode(user.getPassword() + user.getVerificationSalt()))){
			user.setStatus(typeDao.findByTypeCode(TYPE_LOGIN_ACT));
			user.setLastUpdateDate(new Date());
			loginDao.save(user);
			
			return new UserLogin(user.getId(), user.getUserName(), user.getFirstName(), user.getLastName(),user.isFirstTimeLogin());
		}
		return null;
	}


	@Override
	public UserLogin forgotPassword(ForgotPasswordUserLogin userVO)throws Exception {
		Assert.notNull(userVO);
		UserLoginEntity user = loginDao.getUser(userVO.getUsername());

		if(user != null && user.isUserActive()){
			
			userVO.setUserId(user.getId());
			userVO.setFirstName(user.getFirstName());
			userVO.setLastName(user.getLastName());
			
			// Send the email for verification
			String emailMessage = emailService.buildEmailMessage(userVO, passwordEncoder.encode(user.getPassword() + user.getVerificationSalt()));
			emailService.sendEmailMessage(emailMessage, user.getUserName(),"Reset you password");
		}
		
		return userVO;
	}


	@Override
	public UserLogin updatePassword(String userId, String newPassword,String secretCode) throws Exception {
		Assert.hasLength(userId);
		Assert.hasLength(newPassword);
		Assert.hasLength(secretCode);
		
		UserLoginEntity user = loginDao.getUser(userId);
		if(user != null && secretCode.equals(passwordEncoder.encode(user.getPassword() + user.getVerificationSalt()))){
			user.setPassword(passwordEncoder.encode(newPassword));
			// update the last login date 
			user.setLastLoginDate(new Date());
			user.setLastUpdateDate(new Date());
			
			loginDao.save(user);
			return new UserLogin(user.getId(), user.getUserName(), user.getFirstName(), user.getLastName(),user.isFirstTimeLogin());
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

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ServiceResponse<UserLogin> getUserByUserName(ServiceRequest<String> request, IUserDetails user,IClientDetails clientDetails) throws ServiceException {
		UserLoginEntity userEntity = null;
		if (StringUtils.isNotBlank(request.getTargetObject())) {
			userEntity = loginDao.getUser(request.getTargetObject());
			
			if(userEntity != null){
				UserLogin userLogin =  new UserLogin(userEntity.getId(), userEntity.getUserName(), userEntity.getFirstName(), userEntity.getLastName(),userEntity.isFirstTimeLogin());
				userLogin.setUserActive(userEntity.isUserActive());
				return new ServiceResponse<UserLogin>(userLogin);
			}
			
		} 
		return null;
	}	

}
