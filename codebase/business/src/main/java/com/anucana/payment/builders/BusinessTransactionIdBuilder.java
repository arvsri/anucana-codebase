package com.anucana.payment.builders;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * Internally generated business transaction id ( for uniquely identifying each transaction )
 * Format( 29 digits ): U99999999E99999TddMMyyhhmmss
 * U[User]99999999[8 Digit user Id]E[Event]99999[5 Digit Event Id]T[Time]ddMMyyhhmmss[12 digit day month year hour minute second]
 */
public class BusinessTransactionIdBuilder {

	private long userId = 0;
	private long eventId = 0;
	public static String DATE_FORMAT = "ddMMyyhhmmss";
	
	private final StringBuilder transactionId = new StringBuilder("");
	
	public BusinessTransactionIdBuilder(long userId,long eventId){
		this.userId = userId;
		this.eventId = eventId;
		
		if(this.userId == 0 || this.eventId == 0){
			throw new IllegalArgumentException();
		}
	}
	
	public BusinessTransactionIdBuilder build(){
		String userId8Digits = userId + "";
		if(userId8Digits.length() > 8){
			userId8Digits.substring(0, 8);
		}else if(userId8Digits.length() < 8){
			userId8Digits = getZeroPaddedString(userId8Digits,8 - userId8Digits.length());
		}
		
		String eventId5Digits = eventId + "";
		if(eventId5Digits.length() > 5){
			eventId5Digits.substring(0, 5);
		}else if(eventId5Digits.length() < 5){
			eventId5Digits = getZeroPaddedString(eventId5Digits,5 - eventId5Digits.length());
		}
		String dateStr = DateFormatUtils.format(new Date(), DATE_FORMAT);
		transactionId.append("U").append(userId8Digits).append("E").append(eventId5Digits).append("T").append(dateStr);
		return this;
	}

	public String getResult(){
		return this.transactionId.toString();
	}
	
	private String getZeroPaddedString(String str, int numOfZeroPads) {
		StringBuilder zeroPaddedStr = new StringBuilder("");
		for(int i = 0;i < numOfZeroPads;i++ ){
			zeroPaddedStr.append("0");
		}
		zeroPaddedStr.append(str);
		return zeroPaddedStr.toString();
	}
	
}
