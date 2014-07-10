package com.anucana.services;

import static junit.framework.Assert.assertEquals;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.anucana.constants.ITypeConstants;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.value.objects.TypeGroup.Type;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring-context-setup.xml",
		"classpath:/META-INF/spring/anucana-persistence.xml",
		"classpath:/META-INF/spring/anucana-utils.xml"})
@TransactionConfiguration
public class UtiltiyServiceITTest implements ITypeConstants{

	@Autowired
	private IUtilityService utilityService;
	
	@Test
	public void getTypesByGroup() throws ServiceException{
        Collection<Type> types = invokeService(TYPE_GRP_STATUS_CD);
		assertEquals(2, types.size());
		assertTypeCode(types,TYPE_STATUS_CD_ACT);
		assertTypeCode(types,TYPE_STATUS_CD_INACT);
		
        types = invokeService(TYPE_GRP_LOGIN_STATUS);
		assertEquals(4, types.size());
		assertTypeCode(types,TYPE_LOGIN_ACT);
		assertTypeCode(types,TYPE_LOGIN_INACT);
		assertTypeCode(types,TYPE_LOGIN_SUS);
		assertTypeCode(types,TYPE_LOGIN_DEL);

        types = invokeService(TYPE_GRP_USER_ROLES);
		assertEquals(6, types.size());
		assertTypeCode(types,TYPE_ROLE_GENERAL_USER);
		assertTypeCode(types,TYPE_ROLE_COMMUNITY_MEMBER);
		assertTypeCode(types,TYPE_ROLE_COMMUNITY_MODERATOR);
		assertTypeCode(types,TYPE_ROLE_SALES_AGENT);
		assertTypeCode(types,TYPE_ROLE_FINANCE_AGENT);
		assertTypeCode(types,TYPE_ROLE_ADMIN);
		

        types = invokeService(TYPE_GRP_PHONE_TYPE_CD);
		assertEquals(3, types.size());
		assertTypeCode(types,TYPE_PHONE_WORK);
		assertTypeCode(types,TYPE_PHONE_HOME);
		assertTypeCode(types,TYPE_PHONE_MOBILE);

        types = invokeService(TYPE_GRP_MESSENGER_TYPE_CD);
		assertEquals(3, types.size());
		assertTypeCode(types,TYPE_MESSENGER_SKYPE);
		assertTypeCode(types,TYPE_MESSENGER_GTALK);
		assertTypeCode(types,TYPE_MESSENGER_YAHOO);

        types = invokeService(TYPE_GRP_INDUSTRY_TYPE_CD);
		assertEquals(147, types.size());

        types = invokeService(TYPE_GRP_COUNTY_CD);
		assertEquals(249, types.size());
		
	}
	
    private Collection<Type> invokeService(String groupCode) throws ServiceException {
        return utilityService.getTypesByGroup(new ServiceRequest<String>(groupCode)).getTargetObject();
    }
	
	
	private void assertTypeCode(final Collection<Type> types, final String typeCd){
		Type type = (Type) CollectionUtils.find(types, new Predicate() {
			@Override
			public boolean evaluate(Object arg0) {
				return typeCd.equals(((Type)arg0).getTypeCode());
			}
		});
		assertEquals(typeCd, type.getTypeCode());
	}
	
}
