package com.anucana.value.objects;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = -1132480040830153429L;
	

	private int postalCd;
	
	private String area;
	
	private String countryCd;
	
	private String addressLine1;

	private String addressLine2;
	

	public int getPostalCd() {
		return postalCd;
	}

	public String getArea() {
		return area;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setPostalCd(int postalCd) {
		this.postalCd = postalCd;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
}
