package com.anucana.value.objects;

import java.io.Serializable;

public class PaymentRequest implements Serializable {

	private static final long serialVersionUID = -4606409385963229630L;
	/**
	 * Merchant Key provided by PayUMoney
	 * Compulsory Field.
	 */
	private String key;
	/**
	 * Compulsory Field.
	 */
	private String txnid;
	/**
	 * Payment amount (Type cast the amount to float)
	 * Compulsory Field.
	 */
	private String amount;
	/**
	 * The format of the json encoding for productinfo is as follows:-
	 *	Productinfo = {“paymentParts”:[
	 *						{"name":"abc","description":"abcd","value":"500","isRequired":"true",“settlementEvent” : “EmailConfirmation”},
	 *						{"name":"xyz","description":"wxyz","value":"1500","isRequired":"false",“settlementEvent”: “EmailConfirmation”}
	 *		      					],
	 *						{“paymentIdentifiers”:[
	 *							{"field":"CompletionDate","value":"31/10/2012”},
	 *							{"field":"TxnId","value":"abced"}
	 *					     ]}
	 *				  }
	 * 
	 * 
	 * Compulsory Field.
	 */
	private String productinfo;

	
	
	/**
	 * only alphabets a-z are allowed
	 * Compulsory Field.
	 */
	private String firstname;
	/**
	 * only alphabets a-z are allowed
	 */
	private String lastname;
	
	
	/**
	 * Length must not more than 100 characters each and
	 * the allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String address1;
	/**
	 * Length must not more than 100 characters each and
	 * the allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String address2;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String city;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String state;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String country;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String zipcode;

	
	
	/**
	 * Customer’s email Id
	 * Compulsory Field.
	 */
	private String email;
	/**
	 * Mobile number or landline number (numeric value only)
	 * Compulsory Field.
	 */
	private String phone;
	
	
	
	
	/**
	 * user defined field 1
	 */
	private String udf1;
	
	/**
	 * user defined field 2
	 */
	private String udf2;
	
	/**
	 * user defined field 3
	 */
	private String udf3;
	
	/**
	 * user defined field 4
	 */
	private String udf4;
	
	/**
	 * user defined field 5
	 */
	private String udf5;
	
	
	
	
	/**
	 * Success URL where PayUMoney will redirect after successful payment.
	 * Compulsory Field.
	 */
	private String surl;
	
	/**
	 * Failure URL where PayUMoney will redirect after failed payment.
	 * Compulsory Field.
	 */
	private String furl;
	
	/**
	 * Cancel URL where PayUMoney will redirect when user cancel the transaction.
	 */
	private String curl;
	
	
	
	
	
	
	
	/**
	 * Hash or Checksum =sha512(key|txnid|amount|productinfo|firstname|email|udf1|udf2|udf3|udf4|udf5||||||salt) (SALT will be provided by PayUMoney)
 	 * Compulsory Field.
	 */
	private String checksum;
	
	/**
	 * Value : payu_paisa
	 * Compulsory Field. 
	 */
	private String service_provider;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTxnid() {
		return txnid;
	}

	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getProductinfo() {
		return productinfo;
	}

	public void setProductinfo(String productinfo) {
		this.productinfo = productinfo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUdf1() {
		return udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf2() {
		return udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getUdf3() {
		return udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	public String getUdf4() {
		return udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	public String getUdf5() {
		return udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	public String getSurl() {
		return surl;
	}

	public void setSurl(String surl) {
		this.surl = surl;
	}

	public String getFurl() {
		return furl;
	}

	public void setFurl(String furl) {
		this.furl = furl;
	}

	public String getCurl() {
		return curl;
	}

	public void setCurl(String curl) {
		this.curl = curl;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}
	
	
	

}
