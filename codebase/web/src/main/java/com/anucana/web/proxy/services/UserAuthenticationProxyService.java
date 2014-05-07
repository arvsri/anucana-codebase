package com.anucana.web.proxy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.value.objects.UserLogin;
import com.anucana.web.common.WebConfigsProvider;
import com.anucana.web.user.data.WebUserDetails;

@Component
public class UserAuthenticationProxyService extends WebConfigsProvider implements UserDetailsService{

	@Autowired
	private ILoginService loginService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			ServiceResponse<UserLogin> user = loginService.getUserByUserName(new ServiceRequest<String>(username), null, getClientDetails());
			if(user != null && user.getTargetObject() != null){
				return new WebUserDetails(user.getTargetObject(), null);
			}else{
				throw new UsernameNotFoundException("security.username.notfound");
			}
		} catch (ServiceException e) {
			throw new UsernameNotFoundException("security.username.notfound", e);
		}
	}

}
