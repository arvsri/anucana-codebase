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

@Entity
@Table(name = "PAYMENT_TRANSACTION")
public class PaymentTransactionEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = -3200310134709735832L;

    @Id
    @GeneratedValue
    @Column(name = "PAYMENT_TRANSACTION_ID")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "LOGIN_ID", referencedColumnName = "LOGIN_ID")
    private UserLoginEntity user;

    /**
     * Internally generated business transaction id ( for uniquely identifying each transaction )
	 * Format( 29 digits ): U99999999E99999TddMMyyhhmmss
	 * U[User]99999999[8 Digit user Id]E[Event]99999[5 Digit Event Id]T[Time]ddMMyyhhmmss[12 digit day month year hour minute second]
     */
    @Column(name = "BUSINESS_TRANSACTION_ID", length = 29, unique = true)
    private String businessTransactionId;

    /**
     * Uniquely identifies a successful payment carried out by gate way. Basically its mihpayid ( as per payumoney )   
     */
    @Column(name = "PAYMENT_RESPONSE_ID", length = 255, unique = true)
    private String paymentResponseId;
    

    @Column(name = "AMOUNT")
    private Double amount;

    /**
     * Any discount happening at the payment gateway level
     */
    @Column(name = "DISCOUNT")
    private Double discount;

    /**
     * Transaction status : success/pending/failure
     */
    @Column(name = "STATUS", length = 255)
    private String status;
    
    /**
     * Payment modes : 'CC' for credit-card / 'NB' for net-banking / 'CD' for cheque or DD / 'CO' for Cash Pickup
     */
    @Column(name = "PAYMENT_MODE", length = 255)
    private String paymentMode;

    
    @Column(name = "ERROR_CD", length = 255)
    private String errorCode;

    @Column(name = "PAYMENT_GATEWAY_TYPE", length = 255)
    private String paymentGatewayType;
    
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


    public UserLoginEntity getUser() {
        return user;
    }


    public void setUser(UserLoginEntity user) {
        this.user = user;
    }


    public Double getAmount() {
        return amount;
    }


    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public String getPaymentMode() {
        return paymentMode;
    }


    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
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


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public String getPaymentGatewayType() {
		return paymentGatewayType;
	}


	public void setPaymentGatewayType(String paymentGatewayType) {
		this.paymentGatewayType = paymentGatewayType;
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

    
    
}
