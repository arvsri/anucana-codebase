package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.anucana.constants.ITypeConstants;

@Entity
@Table(name = "payment_transaction_log")
public class PaymentTransactionLogEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

	private static final long serialVersionUID = 1257889636616312008L;

    public static final String LOG_TYPE_PAYMENT_TRANSACTION_REQUEST = ITypeConstants.TYPE_PAYMENT_TRANSACTION_REQUEST_LOG;
    public static final String LOG_TYPE_PAYMENT_TRANSACTION_RESPONSE = ITypeConstants.TYPE_PAYMENT_TRANSACTION_RESPONSE_LOG;
	
	
	@Id
	@GeneratedValue
	@Column(name = "payment_transaction_log_id")
	private Long id;

	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "log_type",referencedColumnName = "type_cd")
	private TypeTableEntity logType;
	
	@ManyToOne(targetEntity = PaymentTransactionEntity.class)
	@JoinColumn(name = "payment_transaction_id", referencedColumnName = "payment_transaction_id")
    private PaymentTransactionEntity paymentTransaction;
	
	@Column(name = "log_message", length = 10000)
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

	public PaymentTransactionEntity getPaymentTransaction() {
		return paymentTransaction;
	}

	public void setPaymentTransaction(PaymentTransactionEntity paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
	}

	
	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	
}
