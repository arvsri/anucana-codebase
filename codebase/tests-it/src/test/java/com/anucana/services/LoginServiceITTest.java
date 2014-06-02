package com.anucana.services;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.persistence.entities.UserRoleEntity;
import com.anucana.value.objects.NewUserLogin;
import com.anucana.value.objects.UserLogin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring-context-setup.xml",
		"classpath:/META-INF/spring/anucana-persistence.xml",
		"classpath:/META-INF/spring/anucana-utils.xml" })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class LoginServiceITTest implements ITypeConstants {

	@Autowired
	private ILoginService loginService;
	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	@Autowired
	private MockedBeanSetup mockedBeanSetup;
	
	private NewUserLogin userLoginVO = null;
	private JavaMailSender mailSender = null;
	
	@Before
	public void setup(){
		userLoginVO = new NewUserLogin();
		userLoginVO.setFirstName("Arvind");
		userLoginVO.setLastName("Srivastava");
		userLoginVO.setUsername("arvinds_friend@yahoo.co.in");
		userLoginVO.setPassword("password01");
		
		mailSender = (JavaMailSender)mockedBeanSetup.getMockedBean("mailSender");
	}

	@After
	public void tearDown(){
		userLoginVO = null;
		Mockito.reset(mailSender); 
	}

	@Test
	public void verifyCreateUser() throws Exception {
		UserLogin  createdUser = null;//loginService.createUser(userLoginVO);
		
		assertEquals(userLoginVO.getFirstName(), createdUser.getFirstName());
		assertEquals(userLoginVO.getLastName(), createdUser.getLastName());
		assertEquals(userLoginVO.getUsername(), createdUser.getUsername());

		UserLoginEntity user = loginDao.findById(createdUser.getUserId());
		assertEquals(TYPE_LOGIN_INACT, user.getStatus().getTypeCode());
		
		assertNotNull(user.getUserPrimaryInfo());
		assertEquals(userLoginVO.getUsername(), user.getUserPrimaryInfo().getEmail());
		
		assertNotNull(user.getUserProfileInfo());
		assertNotNull(user.getUserProfileInfo().getUserLogin());
		
		assertEquals(1, user.getUserRoles().size());
		for(UserRoleEntity role : user.getUserRoles()){
			assertEquals(TYPE_ROLE_GENERAL_USER, role.getRole().getTypeCode());
		}
		Mockito.verify(mailSender, Mockito.times(1)).send(Mockito.any(SimpleMailMessage.class));
	}
	
	@Test
//	public void verifyUserLogin() throws Exception {
//		// verify that user can not be authenticated if no user exists
////		assertFalse(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), userLoginVO.getPassword())));
////		
////		// Create a user
////		UserLogin createUser = null;//loginService.createUser(userLoginVO);
////
////		// verify that it can not be authenticated before user is activated
////		assertFalse(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), userLoginVO.getPassword())));
////		
////		// activate its profile
////		String secretCode = getSecretCodeFromEmail();
////		loginService.activateUser(userLoginVO.getUsername(), secretCode);
////		
////		// verify that user is authenticated correctly
////		assertTrue(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), userLoginVO.getPassword())));
////		
////		// verify that user can not be authenticated with incorrect password
////		assertFalse(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), "somepassowrd")));
////		
////		UserLogin userDetails = loginService.getUserDetails(userLoginVO);
//		// verify if the user details are correct
//		assertEquals(createUser.getFirstName(), userDetails.getFirstName());
//		assertEquals(createUser.getLastName(), userDetails.getLastName());
//		assertEquals(createUser.getUsername(), userDetails.getUsername());
//		assertEquals(createUser.getUserId(), userDetails.getUserId());
//		
////		DefaultUserSessionData sessionData = new DefaultUserSessionData();
////		sessionData.buildUserSession(userDetails.getUserId(), userDetails.getUsername(), userDetails.getFirstName(), userDetails.getLastName(), true, null);
//		
//		userDetails = loginService.getUserDetails(userLoginVO);
//	}

	private String getSecretCodeFromEmail() {
		ArgumentCaptor<SimpleMailMessage> argCapture = ArgumentCaptor.forClass(SimpleMailMessage.class);
		Mockito.verify(mailSender, Mockito.times(1)).send(argCapture.capture());
		assertTrue(argCapture.getValue().getText().contains("&key="));
		String secretCode = argCapture.getValue().getText().split("&key=")[1].split("[\\n]")[0];
		Mockito.reset(mailSender);
		return secretCode;
	}


	@Test	
	public void verifyForgotPassword() throws Exception {
//		verifyUserLogin();
//		// Do a forgot password
//		//loginService.forgotPassword(new ForgotPasswordUserLogin(userLoginVO.getUsername()));
//		// receive the secret code for password reset
//		String secertCodeForPasswordReset = getSecretCodeFromEmail();
//		assertNotNull(secertCodeForPasswordReset);
		
//		loginService.updatePassword(userLoginVO.getUsername(), "Blah Blah", secertCodeForPasswordReset);
//		
//		// Verify that user is able to login with new password but not with old password
//		assertFalse(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), userLoginVO.getPassword())));
//		assertTrue(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), "Blah Blah")));
//		
//		// verify that user is not able to reset the password again with the same secret code
//		loginService.updatePassword(userLoginVO.getUsername(), "Blah Blah New", secertCodeForPasswordReset);
//		assertFalse(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), "Blah Blah New")));
//		assertTrue(loginService.authenticateUser(new UserLogin(userLoginVO.getUsername(), "Blah Blah")));

	}


	@Test
	public void verifyUserNameUpdate() throws Exception {
		//UserLogin  createdUser = loginService.createUser(userLoginVO);
		//loginService.updateName(createdUser.getUserId(), "Blah First Name", "Blah Last Name");
		
		UserLoginEntity user = null;//loginDao.findById(createdUser.getUserId());
		assertEquals("Blah First Name", user.getFirstName());
		assertEquals("Blah Last Name", user.getLastName());
	}

	@Test
	public void verifyUserIdExistsValidation() throws Exception {
//		assertFalse(loginService.doesUserIdExists(userLoginVO.getUsername()));
//		//loginService.createUser(userLoginVO);
//		assertTrue(loginService.doesUserIdExists(userLoginVO.getUsername()));
	}
	

}
