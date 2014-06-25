package com.anucana.service.contracts;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.anucana.utils.SpringUtil;

public class ServiceRequest<T> extends ServiceResponse<T> implements Serializable{

	private static final long serialVersionUID = -315094185141934737L;
	
	public static enum SERVICE_HINT{
		SPECIFIC_FIELDS_MODIFIED
	}
	
	private Map<SERVICE_HINT, Object> serviceHints = new HashMap<SERVICE_HINT, Object>();

	public ServiceRequest(T t) {
		super(t,SpringUtil.getVariableName(t));
	}

	
	public void addServiceHint(SERVICE_HINT serviceHintKey, Object serviceHintVals){
		serviceHints.put(serviceHintKey, serviceHintVals);
	}
	
	public Object getServiceHints(SERVICE_HINT serviceHintKey){
		return serviceHints.get(serviceHintKey);
	}
	
}
