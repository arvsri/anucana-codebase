package com.anucana.web.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.anucana.web.common.WebConfigsProvider;

@Component
public class AuthenticationHandler extends WebConfigsProvider implements AuthenticationSuccessHandler,AuthenticationFailureHandler,LogoutSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)throws IOException, ServletException {
		// Save the login details ( IP, user id, password and last login date )
		
		// if first time login, forward the request to profile page, else on dashboard
		getServletContext().getRequestDispatcher("/managed/profile").forward(request, response);
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception)throws IOException, ServletException {
		getServletContext().getRequestDispatcher("/managed/loginExistingUser").forward(request, response);
	}

	@Override
	public void onLogoutSuccess(HttpServletRequest request,HttpServletResponse response, Authentication authentication)throws IOException, ServletException {
		// redirect back to home page
		getServletContext().getRequestDispatcher("/managed/loginHome").forward(request, response);
	}
	
}
