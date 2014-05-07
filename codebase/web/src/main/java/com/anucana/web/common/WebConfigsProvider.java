package com.anucana.web.common;

import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

import com.anucana.client.data.IClientDetails;
import com.anucana.client.data.WebClientDetails;

@Component
public class WebConfigsProvider implements ServletConfigAware,ServletContextAware {
	
	@Autowired 
	private HttpServletRequest request;
	
	private ServletConfig servletConfig;

	private ServletContext servletContext;
	
	public IClientDetails getClientDetails(){
		WebClientDetails clientDetails = new WebClientDetails();
		clientDetails.setClientIP(request.getRemoteAddr());
		clientDetails.setContextURL("http://" +  request.getServerName() + ":" + request.getServerPort() + "/" + servletContext.getContextPath());
		
		@SuppressWarnings("unchecked")
		Enumeration<String> enumaration = (Enumeration<String>)servletConfig.getInitParameterNames();
		while(enumaration.hasMoreElements()){
			String initParam = enumaration.nextElement();
			clientDetails.addInitParamter(initParam, servletConfig.getInitParameter(initParam));
		}

		return clientDetails;
	}

	public void setServletConfig(ServletConfig servletConfig){
		this.servletConfig = servletConfig;
	}
	
	public void setServletContext(ServletContext servletContext){
		this.servletContext = servletContext;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}
	
}
