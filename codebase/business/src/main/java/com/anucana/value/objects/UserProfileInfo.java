package com.anucana.value.objects;

/**
 * Model for user profile related information
 * 
 * @author asrivastava
 * @since Jan 25, 2014
 */

public class UserProfileInfo extends UserPrimaryInfo{

	/**
	 * the serial version uid
	 */
	private static final long serialVersionUID = 1L;

	private String profileHeading;
	
	private String countryCd;
	
	private String areaCd;
	
	private String industryCd;
	
	private String summary;
	

	public String getProfileHeading() {
		return profileHeading;
	}

	public void setProfileHeading(String profileHeading) {
		this.profileHeading = profileHeading;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getAreaCd() {
		return areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	public String getIndustryCd() {
		return industryCd;
	}

	public void setIndustryCd(String industryCd) {
		this.industryCd = industryCd;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
