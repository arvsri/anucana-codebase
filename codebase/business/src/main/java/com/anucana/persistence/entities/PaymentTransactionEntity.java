package com.anucana.persistence.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.anucana.constants.ITypeConstants;
import com.anucana.payment.builders.BusinessTransactionIdBuilder;

@Entity
@Table(name = "PAYMENT_TRANSACTION")
public class PaymentTransactionEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = -3200310134709735832L;

    
    public static final String PAYMENT_TRANSACTION_ERROR_NONE = ITypeConstants.TYPE_GENERIC_PAY_ERROR_NONE;
    public static final String PAYMENT_TRANSACTION_ERROR_ANY = ITypeConstants.TYPE_GENERIC_PAY_ERROR_ANY;
    public static final String PAYMENT_TRANSACTION_ERROR_CHECKSUM_FAILED = ITypeConstants.TYPE_GENERIC_PAY_ERROR_CHECKSUM_FAILED;

    public static final String PAYMENT_TRANSACTION_MODE_CREDIT_CARD = ITypeConstants.TYPE_PAYMENT_TRANSACTION_MODE_CREDIT_CARD;
    public static final String PAYMENT_TRANSACTION_MODE_NET_BANKING = ITypeConstants.TYPE_PAYMENT_TRANSACTION_MODE_NET_BANKING;
    public static final String PAYMENT_TRANSACTION_MODE_CHEQUE = ITypeConstants.TYPE_PAYMENT_TRANSACTION_MODE_CHEQUE;
    public static final String PAYMENT_TRANSACTION_MODE_DEMAND_DRAFT = ITypeConstants.TYPE_PAYMENT_TRANSACTION_MODE_DEMAND_DRAFT;
    public static final String PAYMENT_TRANSACTION_MODE_CASH_PICKUP = ITypeConstants.TYPE_PAYMENT_TRANSACTION_MODE_CASH_PICKUP;

    public static final String PAYMENT_TRANSACTION_STATUS_SUCCESS = ITypeConstants.TYPE_PAYMENT_TRANSACTION_STATUS_SUCCESS;
    public static final String PAYMENT_TRANSACTION_STATUS_PENDNG = ITypeConstants.TYPE_PAYMENT_TRANSACTION_STATUS_PENDNG;
    public static final String PAYMENT_TRANSACTION_STATUS_FAILURE = ITypeConstants.TYPE_PAYMENT_TRANSACTION_STATUS_FAILURE;
    // To be used in case checksum of payment response failed
    public static final String PAYMENT_TRANSACTION_STATUS_DISPUTE = ITypeConstants.TYPE_PAYMENT_TRANSACTION_STATUS_DISPUTE;
    
    @Id
    @GeneratedValue
    @Column(name = "PAYMENT_TRANSACTION_ID")
    private Long id;

    @ManyToOne(targetEntity = UserEventEntity.class)
    @JoinColumn(name = "USER_EVENT_ID", referencedColumnName = "USER_EVENT_ID")
    private UserEventEntity userEvent;

    /**
     * Internally generated id by {@link BusinessTransactionIdBuilder}
     */
    @Column(name = "BUSINESS_TRANSACTION_ID", length = 29, unique = true)
    private String businessTransactionId;

    /**
     * Uniquely identifies a successful payment carried out by gate way. Basically its mihpayid ( as per payumoney )   
     */
    @Column(name = "PAYMENT_RESPONSE_ID", length = 255, unique = true)
    private String paymentResponseId;
    

    @Column(name = "AMOUNT")
    private Float amount;

    /**
     * Any discount happening at the payment gateway level
     */
    @Column(name = "DISCOUNT")
    private Float discount;

    /**
     * Transaction status : success/pending/failure/dispute
     */
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "STATUS", nullable = false, referencedColumnName = "TYPE_CD")
    private TypeTableEntity status;
    
    /**
     * Payment modes : 'CC' for credit-card / 'NB' for net-banking / 'CD' for cheque or DD / 'CO' for Cash Pickup
     */
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "PAYMENT_MODE", referencedColumnName = "TYPE_CD")
    private TypeTableEntity paymentMode;

    
	@ManyToOne(targetEntity = TypeTableEntity.class)
	@JoinColumn(name = "ERROR_CD", referencedColumnName = "TYPE_CD")
    private TypeTableEntity errorCode;

    @Column(name = "PAYMENT_GATEWAY_TYPE", length = 255)
    private String paymentGatewayType;

    @Column(name = "GATEWAY_RESPONSE_ID", length = 255)
    private String gatewayResponseId;
    
    @Column(name = "BANK_REFERENCE_NUMBER", length = 255)
    private String bankReference;
    

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "paymentTransaction" ,targetEntity = PaymentTransactionLogEntity.class)
	private Collection<PaymentTransactionLogEntity> paymentTransactionLogs;
    
    
    @Override
    public Long getId() {
        return id;
    }


    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public Float getAmount() {
        return amount;
    }


    public void setAmount(Float amount) {
        this.amount = amount;
    }



	public String getBusinessTransactionId() {
		return businessTransactionId;
	}


	public void setBusinessTransactionId(String businessTransactionId) {
		this.businessTransactionId = businessTransactionId;
	}


	public String getPaymentResponseId() {
		return paymentResponseId;
	}


	public void setPaymentResponseId(String paymentResponseId) {
		this.paymentResponseId = paymentResponseId;
	}


	public Float getDiscount() {
		return discount;
	}


	public void setDiscount(Float discount) {
		this.discount = discount;
	}


	public TypeTableEntity getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(TypeTableEntity errorCode) {
		this.errorCode = errorCode;
	}


	public String getPaymentGatewayType() {
		return paymentGatewayType;
	}


	public void setPaymentGatewayType(String paymentGatewayType) {
		this.paymentGatewayType = paymentGatewayType;
	}

	public String getGatewayResponseId() {
		return gatewayResponseId;
	}


	public void setGatewayResponseId(String gatewayResponseId) {
		this.gatewayResponseId = gatewayResponseId;
	}


	public String getBankReference() {
		return bankReference;
	}


	public void setBankReference(String bankReference) {
		this.bankReference = bankReference;
	}


	
	public Collection<PaymentTransactionLogEntity> getPaymentTransactionLogs() {
		return paymentTransactionLogs;
	}


	public void setPaymentTransactionLogs(
			Collection<PaymentTransactionLogEntity> paymentTransactionLogs) {
		this.paymentTransactionLogs = paymentTransactionLogs;
	}


	public UserEventEntity getUserEvent() {
		return userEvent;
	}


	public void setUserEvent(UserEventEntity userEvent) {
		this.userEvent = userEvent;
	}


	public TypeTableEntity getStatus() {
		return status;
	}


	public void setStatus(TypeTableEntity status) {
		this.status = status;
	}


	public TypeTableEntity getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(TypeTableEntity paymentMode) {
		this.paymentMode = paymentMode;
	}

    
}
