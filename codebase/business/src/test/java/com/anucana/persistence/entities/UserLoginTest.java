package com.anucana.persistence.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.anucana.constants.ITypeConstants;

public class UserLoginTest {
	
	private UserLoginEntity user = null;
	
	Date refDate = new Date();
	
	@Before
	public void setup(){
		user = new UserLoginEntity();
		user.setId(1l);
		user.setUserName("arvinds_friend@yahoo.co.in");
		user.setFirstName("Arvind");
		user.setLastName("Srivastava");
		
		user.setCreatedBy(1l);
		user.setCreationDate(refDate);
		user.setLastLoginDate(refDate);
		
		TypeTableEntity status = new TypeTableEntity();
		status.setTypeCode(ITypeConstants.TYPE_LOGIN_INACT);
		
		user.setStatus(status);
	}
	
	
	@Test
	public void verifyGetVeriifcationSalt() {
		final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy mm:ss");
		Assert.assertEquals(
				"1arvinds_friend@yahoo.co.in" + formatter.format(refDate) + "1"
						+ ITypeConstants.TYPE_LOGIN_INACT
						+ formatter.format(refDate), user.getVerificationSalt());
	}	
	
}
