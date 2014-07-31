package com.anucana.value.objects;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = -1132480040830153429L;

	private String pincodeId;

	private String addressLine1;

	private String addressLine2;

	// for ui display purposes only
	private String addressDescription;

	private String pinCode;

	public Address(String pinCode, String addressDescription) {
		super();
		this.pinCode = pinCode;
		this.addressDescription = addressDescription;
	}

	public String getPincodeId() {
		return pincodeId;
	}

	public void setPincodeId(String pincodeId) {
		this.pincodeId = pincodeId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressDescription() {
		return addressDescription;
	}

	public void setAddressDescription(String addressDescription) {
		this.addressDescription = addressDescription;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
