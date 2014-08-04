package com.anucana.value.objects;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

    private Long postalCodeId;
    private Integer postalCode;
    
    private String state;
    private String district;
    private String office;

    private String addressLine1;
    private String addressLine2;
    
	public Address() {

	}

	public Address(Long postalCodeId, Integer postalCode, String state,String district, String office, String addressLine1,String addressLine2) {
		super();
		this.postalCodeId = postalCodeId;
		this.postalCode = postalCode;
		this.state = state;
		this.district = district;
		this.office = office;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	public Long getPostalCodeId() {
		return postalCodeId;
	}
	public void setPostalCodeId(Long postalCodeId) {
		this.postalCodeId = postalCodeId;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
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
	
    
}
