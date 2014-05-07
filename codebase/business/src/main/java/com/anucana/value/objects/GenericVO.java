package com.anucana.value.objects;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class GenericVO implements Serializable, IError, IViewRefreshable {

	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = -4499891228113107892L;
	
	private boolean inError = false;
	private String[] errorMessages = null;
	private String viewRefreshURL;
	private boolean viewRefresh;
	

	@Override
	public boolean isInError() {
		return this.inError;
	}

	@Override
	public void setInError(boolean inError) {
		this.inError = inError;
	}

	@Override
	public String[] getErrorMessages() {
		return errorMessages;
	}

	@Override
	public void setErrorMessages(String... errors) {
		this.errorMessages = errors;
	}

	@Override
	public boolean isViewRefresh() {
		return viewRefresh;
	}

	@Override
	public void setViewRefresh(boolean viewRefresh) {
		this.viewRefresh = viewRefresh;
	}

	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public String getViewRefreshURL() {
		return this.viewRefreshURL;
	}

	public void setViewRefreshURL(String viewRefreshURL) {
		this.viewRefreshURL = viewRefreshURL;
	}

}
