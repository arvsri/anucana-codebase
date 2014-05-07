package com.anucana.value.objects;

public interface IError {

	boolean isInError();
	
	void setInError(boolean isInError);
	
	String[] getErrorMessages();
	
	void setErrorMessages(String ... errors);
	
}
