package com.anucana.payment.utilities;

import org.apache.commons.collections.Predicate;

import com.anucana.persistence.entities.PaymentTransactionEntity;

public class PaymentTransactionStatusPredicate implements Predicate {

	private final String statusCode;

	public PaymentTransactionStatusPredicate(String statusCode) {
		this.statusCode = statusCode;
	}
	
	@Override
	public boolean evaluate(Object arg0) {
		PaymentTransactionEntity paymentTransaction = (PaymentTransactionEntity)arg0;
		if(statusCode.equals(paymentTransaction.getStatus().getTypeCode())){
			return true;
		}
		return false;
	}

}
