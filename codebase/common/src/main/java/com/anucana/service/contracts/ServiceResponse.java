package com.anucana.service.contracts;


public class ServiceResponse<T> extends ServiceRequest<T>{

	public ServiceResponse(T t) {
		super(t);
	}

}
