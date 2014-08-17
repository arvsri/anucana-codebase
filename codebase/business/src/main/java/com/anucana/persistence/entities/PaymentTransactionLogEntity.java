package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_TRANSACTION_LOG")
public class PaymentTransactionLogEntity implements Serializable, StandardEntity<Long> {

	private static final long serialVersionUID = 1257889636616312008L;

	@Id
	@GeneratedValue
	@Column(name = "PAYMENT_TRANSACTION_LOG_ID")
	private Long id;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "LOG_TYPE",referencedColumnName = "TYPE_CD")
	private TypeTableEntity logType;
	
	@ManyToOne(targetEntity = PaymentTransactionEntity.class)
	@JoinColumn(name = "PAYMENT_TRANSACTION_ID", referencedColumnName = "PAYMENT_TRANSACTION_ID")
    private PaymentTransactionEntity paymentTransaction;
	
	public PaymentTransactionEntity getPaymentTransaction() {
		return paymentTransaction;
	}

	public void setPaymentTransaction(PaymentTransactionEntity paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
	}

	@Column(name = "LOG_MESSAGE", length = 10000)
	private String logMessage;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public TypeTableEntity getLogType() {
		return logType;
	}

	public void setLogType(TypeTableEntity logType) {
		this.logType = logType;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}
	
	
	
}
