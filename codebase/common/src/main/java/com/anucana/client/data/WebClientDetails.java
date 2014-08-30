package com.anucana.client.data;

import java.util.HashMap;
import java.util.Map;

public class WebClientDetails implements IClientDetails {

	private String clientIP;

	private String contextURL;

	private final Map<String, String> initParamtersMap = new HashMap<String, String>();

	@Override
	public String getClientIP() {
		return clientIP;
	}

	@Override
	public String getContextURL() {
		return contextURL;
	}

	@Override
	public String getInitParamter(String initParam) {
		return initParamtersMap.get(initParam);
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public void setContextURL(String contextURL) {
		this.contextURL = contextURL;
	}

	public void addInitParamter(String initParam, String initParamVal) {
		this.initParamtersMap.put(initParam, initParamVal);
	}

}
