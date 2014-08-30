package com.anucana.payment.builders;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

public class ProductInfoBuilder {

	private final List<String> paymentParts = new ArrayList<String>();
	
	private final List<String> paymentIdentifiers = new ArrayList<String>();
	
	private final StringBuilder productInfo = new StringBuilder("");
	
	
	public ProductInfoBuilder withPaymentParts(String name,String discription,String value){
		String paymentPart = "{\"name\":\""
				+ name
				+ "\",\"description\":\""
				+ discription
				+ "\",\"value\":\""
				+ value
				+ "\",\"isRequired\":\"true\",\"settlementEvent\" : \"EmailConfirmation\"}";
		paymentParts.add(paymentPart);
		return this;
	}

	
	public ProductInfoBuilder withPaymentIdentifiers(String fieldName,String value){
		String paymentIdentifier = "{\"field\":\"" + fieldName
				+ "\",\"value\":\"" + value + "\"}";
		paymentIdentifiers.add(paymentIdentifier);
		return this;
	}
	
	public ProductInfoBuilder build(){
		productInfo.append("{\"paymentParts\":[");
		for(String paymentPart : paymentParts){
			if(paymentParts.indexOf(paymentPart) != 0){
				productInfo.append(",");
			}
			productInfo.append(paymentPart);
		}
		productInfo.append("],{\"paymentIdentifiers\":[");
		for(String paymentIdentifier : paymentIdentifiers){
			if(paymentIdentifiers.indexOf(paymentIdentifier) != 0){
				productInfo.append(",");
			}
			productInfo.append(paymentIdentifier);
		}
		productInfo.append("]}");
		return this;
	}
	
	public String getResult(){
		return productInfo.toString();
	}

	
	public String getHTMLEscapedResult(){
		return StringEscapeUtils.ESCAPE_HTML4.translate(productInfo.toString());
	}
	
	
}
