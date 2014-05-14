package com.anucana.web.common;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.anucana.client.data.IClientDetails;

public interface IWebConfigsProvider {

	public IClientDetails getClientDetails();
	
	public HttpServletRequest getRequest();

	public ServletContext getServletContext();

}
