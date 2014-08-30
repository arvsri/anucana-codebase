package com.anucana.payment.utilities;

import com.anucana.constants.IBusinessConstants;
import com.anucana.persistence.entities.PaymentTransactionEntity;
import com.anucana.persistence.entities.UserEventEntity;

public class PaymentUtils {
	
	public static String getPaymentTransactionStatus(String status) {

		if (IBusinessConstants.PAYMENT_RESPONSE_STATUS_SUCCESS.equalsIgnoreCase(status)) {
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_STATUS_SUCCESS;
		} else if (IBusinessConstants.PAYMENT_RESPONSE_STATUS_FAILURE.equalsIgnoreCase(status)) {
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_STATUS_FAILURE;
		} else if (IBusinessConstants.PAYMENT_RESPONSE_STATUS_PENDING.equalsIgnoreCase(status)) {
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_STATUS_PENDNG;
		} else {
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_STATUS_DISPUTE;
		}
		
	}
	
	public static String getUserEventStatus(String status) {

		if(IBusinessConstants.PAYMENT_RESPONSE_STATUS_SUCCESS.equalsIgnoreCase(status)){
			return UserEventEntity.USER_EVENT_STATUS_PAID;	
		}else{
			// TODO : to confirm with PAYU about pending status
			return UserEventEntity.USER_EVENT_STATUS_PAYMENT_FAILED;
		}

	}
	
	public static String getPaymentTransactionMode(String mode) {

		if(IBusinessConstants.PAYMENT_TRANSACTION_MODE_CREDIT_CARD.equalsIgnoreCase(mode)){
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_MODE_CREDIT_CARD;	
		}else if(IBusinessConstants.PAYMENT_TRANSACTION_MODE_NET_BANKING.equalsIgnoreCase(mode)){
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_MODE_NET_BANKING;	
		}else if(IBusinessConstants.PAYMENT_TRANSACTION_MODE_CHEQUE.equalsIgnoreCase(mode)){
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_MODE_CHEQUE;	
		}else if(IBusinessConstants.PAYMENT_TRANSACTION_MODE_DEMAND_DRAFT.equalsIgnoreCase(mode)){
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_MODE_DEMAND_DRAFT;	
		}else if(IBusinessConstants.PAYMENT_TRANSACTION_MODE_CASH_PICKUP.equalsIgnoreCase(mode)){
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_MODE_CASH_PICKUP;	
		}else{
			return null;
		}
	}
	
	public static String getPaymentTransactionErrorCode(String status) {

		if (IBusinessConstants.PAYMENT_RESPONSE_STATUS_SUCCESS.equalsIgnoreCase(status)) {
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_ERROR_NONE;
		} else {
			return PaymentTransactionEntity.PAYMENT_TRANSACTION_ERROR_ANY;
		} 
	}
	

}
