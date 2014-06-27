package com.anucana.persistence.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO : To be extended based on payment gateway integration
@Entity
@Table(name = "PAYMENT_TRANSACTION")
public class PaymentTransactionEntity extends AuditEntity implements Serializable, Identifiable<Long> {

    private static final long serialVersionUID = -3200310134709735832L;

    @Id
    @GeneratedValue
    @Column(name = "PAYMENT_TRANSACTION_ID")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "LOGIN_ID", referencedColumnName = "LOGIN_ID")
    private UserLoginEntity user;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "DISCOUNT_COUPON", length = 20)
    private String discountCoupon;

    @Column(name = "GATEWAY_NAME", length = 255)
    private String gatewayName;

    @Column(name = "GATEWAY_TRANSACTION_ID", length = 255)
    private String gatewayTransactionId;

    @Column(name = "PAYMENT_MODE", length = 255)
    private String paymentMode;

    @Column(name = "PAYMENT_TIME")
    private Timestamp paymentTime;


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


    public String getDiscountCoupon() {
        return discountCoupon;
    }


    public void setDiscountCoupon(String discountCoupon) {
        this.discountCoupon = discountCoupon;
    }


    public String getGatewayName() {
        return gatewayName;
    }


    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }


    public String getGatewayTransactionId() {
        return gatewayTransactionId;
    }


    public void setGatewayTransactionId(String gatewayTransactionId) {
        this.gatewayTransactionId = gatewayTransactionId;
    }


    public String getPaymentMode() {
        return paymentMode;
    }


    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }


    public Timestamp getPaymentTime() {
        return paymentTime;
    }


    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

}
