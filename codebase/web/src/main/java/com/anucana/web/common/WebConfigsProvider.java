package com.anucana.web.common;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import com.anucana.client.data.IClientDetails;
import com.anucana.client.data.WebClientDetails;

@Component
public class WebConfigsProvider implements ServletContextAware,IWebConfigsProvider {
	
	@Autowired 
	private HttpServletRequest request;
	
	private ServletContext servletContext;
	
	@Override
	public IClientDetails getClientDetails(){
		WebClientDetails clientDetails = new WebClientDetails();
		clientDetails.setClientIP(request.getRemoteAddr());
		clientDetails.setContextURL("http://" +  request.getServerName() + ":" + request.getServerPort() + servletContext.getContextPath());
		
		@SuppressWarnings("unchecked")
		Enumeration<String> enumaration = (Enumeration<String>)servletContext.getInitParameterNames();
		while(enumaration.hasMoreElements()){
			String initParam = enumaration.nextElement();
			clientDetails.addInitParamter(initParam, servletContext.getInitParameter(initParam));
		}

		return clientDetails;
	}

	@Override
	public void setServletContext(ServletContext servletContext){
		this.servletContext = servletContext;
	}

	@Override
	public HttpServletRequest getRequest() {
		return request;
	}

	@Override
	public ServletContext getServletContext() {
		return servletContext;
	}
	
}
