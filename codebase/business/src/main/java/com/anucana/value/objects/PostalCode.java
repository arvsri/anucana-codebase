package com.anucana.value.objects;

import java.io.Serializable;

public class PostalCode implements Serializable {

	private static final long serialVersionUID = 1559849887632123380L;

	public PostalCode(Long id, Integer postalCd, String country, String state,String district, String office) {
		this.id = id;
		this.postalCd = postalCd;
		this.country = country;
		this.state = state;
		this.district = district;
		this.office = office;
	}

	private Long id;

	private Integer postalCd;

	private String country;

	private String state;

	private String district;

	private String office;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPostalCd() {
		return postalCd;
	}

	public void setPostalCd(Integer postalCd) {
		this.postalCd = postalCd;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

}
