package com.anucana.value.objects;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PaymentRequest implements Serializable {

	private static final long serialVersionUID = -4606409385963229630L;
	
	/**
	 * UI centric field. The url on which request is posted
	 */
	transient private String posturl = StringUtils.EMPTY;
	
	/**
	 * Merchant Key provided by PayUMoney
	 * Compulsory Field.
	 */
	transient private String key = StringUtils.EMPTY;
	/**
	 * Compulsory Field.
	 */
	private String txnid = StringUtils.EMPTY;
	/**
	 * Payment amount (Type cast the amount to float)
	 * Compulsory Field.
	 */
	private String amount = StringUtils.EMPTY;
	/**
	 * The format of the json encoding for productinfo is as follows:-
	 * <p>
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
	 * </p>
	 * Compulsory Field.
	 */
	private String productinfo = StringUtils.EMPTY;
	
	transient private String htmlCharEscapedProductinfo = StringUtils.EMPTY;
	
	/**
	 * only alphabets a-z are allowed
	 * Compulsory Field.
	 */
	private String firstname = StringUtils.EMPTY;
	/**
	 * only alphabets a-z are allowed
	 */
	private String lastname = StringUtils.EMPTY;
	
	
	/**
	 * Length must not more than 100 characters each and
	 * the allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String address1 = StringUtils.EMPTY;
	/**
	 * Length must not more than 100 characters each and
	 * the allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String address2 = StringUtils.EMPTY;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String city = StringUtils.EMPTY;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String state = StringUtils.EMPTY;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String country = StringUtils.EMPTY;
	/**
	 * The allowed characters are only A TO Z, a to z, 0 to 9, @, - (Minus), _ (Underscore), / (Backslash), (Space), (Dot)
	 */
	private String zipcode = StringUtils.EMPTY;

	
	
	/**
	 * Customer’s email Id
	 * Compulsory Field.
	 */
	private String email = StringUtils.EMPTY;
	/**
	 * Mobile number or landline number (numeric value only)
	 * Compulsory Field.
	 */
	private String phone = StringUtils.EMPTY;
	
	
	
	
	/**
	 * user defined field 1
	 */
	private String udf1 = StringUtils.EMPTY;
	
	/**
	 * user defined field 2
	 */
	private String udf2 = StringUtils.EMPTY;
	
	/**
	 * user defined field 3
	 */
	private String udf3 = StringUtils.EMPTY;
	
	/**
	 * user defined field 4
	 */
	private String udf4 = StringUtils.EMPTY;
	
	/**
	 * user defined field 5
	 */
	private String udf5 = StringUtils.EMPTY;
	/**
	 * user defined field 6
	 */
	private String udf6 = StringUtils.EMPTY;
	
	/**
	 * user defined field 7
	 */
	private String udf7 = StringUtils.EMPTY;
	
	/**
	 * user defined field 8
	 */
	private String udf8 = StringUtils.EMPTY;
	
	/**
	 * user defined field 9
	 */
	private String udf9 = StringUtils.EMPTY;
	
	/**
	 * user defined field 10
	 */
	private String udf10 = StringUtils.EMPTY;
	
	
	
	
	/**
	 * Success URL where PayUMoney will redirect after successful payment.
	 * Compulsory Field.
	 */
	transient private String surl = StringUtils.EMPTY;
	
	/**
	 * Failure URL where PayUMoney will redirect after failed payment.
	 * Compulsory Field.
	 */
	transient private String furl = StringUtils.EMPTY;
	
	/**
	 * Cancel URL where PayUMoney will redirect when user cancel the transaction.
	 */
	transient private String curl = StringUtils.EMPTY;
	
	
	
	
	
	
	
	/**
	 * Hash or Checksum =sha512(key|txnid|amount|productinfo|firstname|email|udf1|udf2|udf3|udf4|udf5||||||salt) (SALT will be provided by PayUMoney)
 	 * Compulsory Field.
	 */
	private String hash = StringUtils.EMPTY;
	
	/**
	 * Value : payu_paisa
	 * Compulsory Field. 
	 */
	private String service_provider = StringUtils.EMPTY;

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
	
	public String getUdf6() {
		return udf6;
	}

	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}

	public String getUdf7() {
		return udf7;
	}

	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}

	public String getUdf8() {
		return udf8;
	}

	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}

	public String getUdf9() {
		return udf9;
	}

	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}

	public String getUdf10() {
		return udf10;
	}

	public void setUdf10(String udf10) {
		this.udf10 = udf10;
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

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public String getPosturl() {
		return posturl;
	}

	public void setPosturl(String posturl) {
		this.posturl = posturl;
	}

	
	public String getHtmlCharEscapedProductinfo() {
		return htmlCharEscapedProductinfo;
	}

	public void setHtmlCharEscapedProductinfo(String htmlCharEscapedProductinfo) {
		this.htmlCharEscapedProductinfo = htmlCharEscapedProductinfo;
	}

	public String hashSequence(String salt){
		StringBuilder hashBuilder = new StringBuilder("");

		hashBuilder.append(this.key).append("|");
		hashBuilder.append(this.txnid).append("|");
		hashBuilder.append(this.amount).append("|");
		hashBuilder.append(this.productinfo).append("|");
		hashBuilder.append(this.firstname).append("|");
		hashBuilder.append(this.email).append("|");
		hashBuilder.append(this.udf1).append("|");
		hashBuilder.append(this.udf2).append("|");
		hashBuilder.append(this.udf3).append("|");
		hashBuilder.append(this.udf4).append("|");
		hashBuilder.append(this.udf5).append("|");
		hashBuilder.append(this.udf6).append("|");
		hashBuilder.append(this.udf7).append("|");
		hashBuilder.append(this.udf8).append("|");
		hashBuilder.append(this.udf9).append("|");
		hashBuilder.append(this.udf10).append("|");
		hashBuilder.append(salt);

		return hashBuilder.toString();
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE,false);
	}
	
}
