package com.anucana.web.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.services.ILoginService;
import com.anucana.web.common.WebConfigsProvider;
import com.anucana.web.constants.IWebConstants;

@Component
public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler implements IWebConstants{

	@Value("#{propertyConfigurer.getProperty('config.account.lockout.attempts')}")
	private Integer maxLoginAttemptCount;
	
    @Autowired
    private ILoginService loginService;

    @Autowired
    private WebConfigsProvider configProvider;
    
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,HttpServletResponse response, AuthenticationException exception)throws IOException, ServletException {
		
		if(exception instanceof BadCredentialsException){
			// reset the login attempt count as its a success
			Integer loginAttemptCount = (Integer)request.getSession().getAttribute(LOGIN_ATTEMPT_COUNT);
			if(loginAttemptCount == null){
				request.getSession().setAttribute(LOGIN_ATTEMPT_COUNT,Integer.valueOf(0));
			}else{
				if(loginAttemptCount > maxLoginAttemptCount ){
					// update the account as locked
					try {
						loginService.lockoutUserAccount(new ServiceRequest<String>(request.getParameter("username")),null,configProvider.getClientDetails());
					} catch (ServiceException e) {
						// nothing can be done if any exception happen
						e.printStackTrace();
					}
				}else{
					request.getSession().setAttribute(LOGIN_ATTEMPT_COUNT,++loginAttemptCount);
				}
			}
		}

		setDefaultFailureUrl("/login/loginExistingUser");
		// Lock out the user if the number of unsuccessful attempts has exceeded the configured number of times
		super.onAuthenticationFailure(request, response, exception);
	}

}
