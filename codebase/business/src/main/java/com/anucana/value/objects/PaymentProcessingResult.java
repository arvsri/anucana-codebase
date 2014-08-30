package com.anucana.value.objects;

import java.io.Serializable;

public class PaymentProcessingResult implements Serializable{

	private static final long serialVersionUID = 5540917668338180277L;

	private long userEventId;
	
	private boolean processingSuccess;

	private boolean notificationSuccess;
	
	private String errorReason;
	
	public PaymentProcessingResult() {
		
	}
	
	public PaymentProcessingResult(long userEventId, boolean processingSuccess,boolean notificationSuccess, String errorReason) {
		super();
		this.userEventId = userEventId;
		this.processingSuccess = processingSuccess;
		this.notificationSuccess = notificationSuccess;
		this.errorReason = errorReason;
	}

	public long getUserEventId() {
		return userEventId;
	}

	public void setUserEventId(long userEventId) {
		this.userEventId = userEventId;
	}

	public boolean isProcessingSuccess() {
		return processingSuccess;
	}

	public void setProcessingSuccess(boolean processingSuccess) {
		this.processingSuccess = processingSuccess;
	}

	public boolean isNotificationSuccess() {
		return notificationSuccess;
	}

	public void setNotificationSuccess(boolean notificationSuccess) {
		this.notificationSuccess = notificationSuccess;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}
	
	
	
}
