package com.anucana.client.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

public class WebClientDetails implements IClientDetails {

	private String clientIP;

	private String contextURL;

	private Map<String, String> initParamtersMap = new HashMap<String, String>();

	public String getClientIP() {
		return clientIP;
	}

	public String getContextURL() {
		return contextURL;
	}

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
