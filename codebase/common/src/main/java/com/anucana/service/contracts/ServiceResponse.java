package com.anucana.service.contracts;

import java.io.Serializable;

import org.springframework.validation.DataBinder;


public class ServiceResponse<T> extends DataBinder implements Serializable{

	private static final long serialVersionUID = -1787640104032414943L;

	public ServiceResponse(T t) {
		super(t);
	}
	
	@SuppressWarnings("unchecked")
	public T getTargetObject(){
		return (T)getTarget();
	}

}
