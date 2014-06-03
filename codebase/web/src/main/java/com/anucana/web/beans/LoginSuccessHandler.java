package com.anucana.web.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.value.objects.UserLogin;
import com.anucana.web.common.IWebConfigsProvider;
import com.anucana.web.constants.IWebConstants;
import com.anucana.web.user.data.WebUserDetails;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler implements IWebConstants{

    private RequestCache requestCache = new HttpSessionRequestCache();
    
    @Autowired
    private ILoginService loginService;
    @Autowired
    private IWebConfigsProvider configProvider;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)throws IOException, ServletException {
		// reset the login attempt count as its a success
		request.getSession().removeAttribute(LOGIN_ATTEMPT_COUNT);
		
		WebUserDetails principal = (WebUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		// Save the login details ( IP, user id, password and login date )
		UserLogin userLogin = null;
		try {
			ServiceResponse<UserLogin> serviceResponse = loginService.recordUserLoginHistory(new ServiceRequest<String>(principal.getUsername()), principal, configProvider.getClientDetails());
			userLogin = serviceResponse.getTargetObject();
		} catch (ServiceException e) {
			throw new ServletException("Error occured while saving the login history",e);
		}
		
		SavedRequest savedRequest = requestCache.getRequest(request, response);
		String targetUrl = savedRequest == null ? null : savedRequest.getRedirectUrl();
		if (StringUtils.isBlank(targetUrl) || targetUrl.contains("login") || targetUrl.contains("Login")) {
			clearAuthenticationAttributes(request);
			if (userLogin.isFirstTimeLogin()) {
				request.getSession().setAttribute(FIRST_TIME_LOGIN, true);
				// if first time login, forward the request to profile page,
				// else on dashboard
				getRedirectStrategy().sendRedirect(request, response,"/profile/managed/" + userLogin.getUserId());
			}else{
				getRedirectStrategy().sendRedirect(request, response,"/events/unmanaged/home");
			}
			return;
		}
        super.onAuthenticationSuccess(request, response, authentication);
	}
	
    public void setRequestCache(RequestCache requestCache) {
        this.requestCache = requestCache;
    }
	
}
