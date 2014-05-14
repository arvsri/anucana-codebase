package com.anucana.service.contracts;

import java.io.Serializable;

public class ServiceRequest<T> extends ServiceResponse<T> implements Serializable{

	private static final long serialVersionUID = -315094185141934737L;

	public ServiceRequest(T t) {
		super(t);
	}

}
