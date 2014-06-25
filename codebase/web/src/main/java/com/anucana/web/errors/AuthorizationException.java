package com.anucana.web.errors;

import org.springframework.core.NestedRuntimeException;

public class AuthorizationException extends NestedRuntimeException {

	private static final long serialVersionUID = 7546957853017005941L;

	public AuthorizationException(String msg) {
		super(msg);
	}
	
	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
