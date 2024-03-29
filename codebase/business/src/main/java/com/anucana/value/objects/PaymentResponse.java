package com.anucana.value.objects;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PaymentResponse implements Serializable{

	private static final long serialVersionUID = 3459030659270605865L;
	
	/**
	 * Indicates URL to which response was posted ( Success / failure / cancelled )
	 */
	transient private String postAction;
	
	/**
	 * Unique id from PayU.in
	 */
	private String mihpayid;
	/**
	 * 'CC' for credit-card / 'NB' for net-banking / 'CD' for cheque or DD / 'CO' for Cash Pickup
	 */
	private String mode;
	/**
	 * success/pending/failure
	 */
	private String status;
	
	transient private String key;
	
	private String txnid;
	/**
	 * Original amount send by merchant
	 */
	private String amount;
	
	/**
	 * This is discount given to user - based on promotion set by merchants.
	 */
	private String discount;
	
	private String productinfo;
	
	private String firstname;
	
	private String lastname;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipcode;
	
	private String email;
	
	private String phone;
	
	private String udf1;
	
	private String udf2;
	
	private String udf3;
	
	private String udf4;
	
	private String udf5;

	
	private String udf6;
	
	private String udf7;
	
	private String udf8;
	
	private String udf9;
	
	private String udf10;
	
	
	/**
	 * Hash must be verified before confirmation of transaction
	 * sha512(salt|status||||||udf5|udf4|udf3|udf2|udf1|email|firstname|productinfo|amount|txnid|key)
	 */
	private String hash;
	
	/**
	 * If transaction failed, then reason of failure
	 */
	private String error;
	
	/**
	 * Payment gateway type used in transaction
	 */
	private String pg_type;
	/**
	 * Reference number for the payment gateway
	 */
	private String bank_ref_num;
	
	
	/**
	 * Status of transaction in PayU�s system - e.g. initiated/ in progress /dropped / bounced / captured / auth/ failed / user cancelled/ pending
	 */
	private String unmappedstatus;
	
	/**
	 * Unique payment ID
	 */
	private String payuMoneyId;
	
	public String getPostAction() {
		return postAction;
	}

	public void setPostAction(String postAction) {
		this.postAction = postAction;
	}

	public String getMihpayid() {
		return mihpayid;
	}

	public void setMihpayid(String mihpayid) {
		this.mihpayid = mihpayid;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
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

	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPg_type() {
		return pg_type;
	}

	public void setPg_type(String pg_type) {
		this.pg_type = pg_type;
	}

	public String getBank_ref_num() {
		return bank_ref_num;
	}

	public void setBank_ref_num(String bank_ref_num) {
		this.bank_ref_num = bank_ref_num;
	}

	public String getUnmappedstatus() {
		return unmappedstatus;
	}

	public void setUnmappedstatus(String unmappedstatus) {
		this.unmappedstatus = unmappedstatus;
	}

	public String getPayuMoneyId() {
		return payuMoneyId;
	}

	public void setPayuMoneyId(String payuMoneyId) {
		this.payuMoneyId = payuMoneyId;
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
	
	public String reverseHashSequence(String salt){
		StringBuilder hashBuilder = new StringBuilder("");

		hashBuilder.append(salt).append("|");
		hashBuilder.append(this.status).append("|");
		hashBuilder.append(this.udf10).append("|");
		hashBuilder.append(this.udf9).append("|");
		hashBuilder.append(this.udf8).append("|");
		hashBuilder.append(this.udf7).append("|");
		hashBuilder.append(this.udf6).append("|");
		hashBuilder.append(this.udf5).append("|");
		hashBuilder.append(this.udf4).append("|");
		hashBuilder.append(this.udf3).append("|");
		hashBuilder.append(this.udf2).append("|");
		hashBuilder.append(this.udf1).append("|");
		hashBuilder.append(this.email).append("|");
		hashBuilder.append(this.firstname).append("|");
		hashBuilder.append(this.productinfo).append("|");
		hashBuilder.append(this.amount).append("|");
		hashBuilder.append(this.txnid).append("|");
		hashBuilder.append(this.key);

		return hashBuilder.toString();
	}

	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE,false);
	}
	
}
