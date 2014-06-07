package com.anucana.web.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.anucana.web.common.IWebConfigsProvider;

@Component
public class LogoutHandler extends SimpleUrlLogoutSuccessHandler {
	
    @Autowired
    private IWebConfigsProvider configProvider;

	@Override
	public void onLogoutSuccess(HttpServletRequest request,HttpServletResponse response, Authentication authentication)throws IOException, ServletException {
		// redirect back to home page
		response.sendRedirect(configProvider.getServletContext().getContextPath());
	}
	
}
