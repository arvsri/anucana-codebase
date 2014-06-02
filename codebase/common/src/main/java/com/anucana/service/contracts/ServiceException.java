package com.anucana.service.contracts;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -849497410746337173L;
	
	public static final String  GENERAL_SYSTEM_EXCEPTION = "exception.general";
	public static final String  USERNAME_NOT_FOUND_EXCEPTION = "exception.username.not.found";
	public static final String  USER_ID_NOT_FOUND_EXCEPTION = "exception.userid.not.found";
	public static final String  EMAIL_NOTIFICATION_FAILED_EXCEPTION = "exception.email.notification";
	public static final String  USER_AUTHENTICATION_FAILED_EXCEPTION = "exception.user.authentication";
	
	private String errorCode;
	
    public ServiceException(String errorCode) {
    	super();
    	this.errorCode = errorCode;
    }

    public ServiceException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

	public String getErrorCode() {
		return errorCode;
	}


}
