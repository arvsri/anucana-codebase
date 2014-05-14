package com.anucana.web.proxy.services;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.value.objects.UserLogin;
import com.anucana.value.objects.UserRole;
import com.anucana.web.common.IWebConfigsProvider;
import com.anucana.web.user.data.WebUserDetails;
import com.anucana.web.user.data.WebUserRole;

@Component
public class UserAuthenticationProxyService implements UserDetailsService{

	@Autowired
	private ILoginService loginService;
	
	@Autowired
	private IWebConfigsProvider webConfigProvider;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			ServiceResponse<UserLogin> user = loginService.getUserByUserName(new ServiceRequest<String>(username), null, webConfigProvider.getClientDetails());
			if(user != null && user.getTargetObject() != null){
				return new WebUserDetails(user.getTargetObject(), getWebUserRoles(user.getTargetObject()));
			}else{
				throw new UsernameNotFoundException("User not found");
			}
		} catch (ServiceException e) {
			throw new UsernameNotFoundException("User not found", e);
		}
	}

	@SuppressWarnings("unchecked")
	private Collection<? extends GrantedAuthority> getWebUserRoles(UserLogin user) {
		if(CollectionUtils.isEmpty(user.getRoles())){
			return null;
		}
		return CollectionUtils.collect(user.getRoles(), new Transformer() {
			@Override
			public Object transform(final Object arg0) {
				return new WebUserRole((UserRole)arg0);
			}
		});
	}

}
