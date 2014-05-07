package com.anucana.service.contracts;

import org.springframework.validation.DataBinder;

public class ServiceRequest<T> extends DataBinder{

	public ServiceRequest(T t) {
		super(t);
	}

	@SuppressWarnings("unchecked")
	public T getTargetObject(){
		return (T)getTarget();
	}
}
