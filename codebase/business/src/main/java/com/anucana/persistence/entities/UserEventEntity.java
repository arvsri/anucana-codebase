package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.anucana.constants.ITypeConstants;

@Entity
@Table(name = "USER_EVENT")
public class UserEventEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = 4545703834458894544L;

    public static final String USER_EVENT_STATUS_ENROLLED = ITypeConstants.TYPE_USER_EVENT_STATUS_ENROLLED;
    public static final String USER_EVENT_STATUS_PAID = ITypeConstants.TYPE_USER_EVENT_STATUS_PAID;
    public static final String USER_EVENT_STATUS_CANCELLED = ITypeConstants.TYPE_USER_EVENT_STATUS_CANCELLED;
    public static final String USER_EVENT_STATUS_PAYMENT_REVERSED = ITypeConstants.TYPE_USER_EVENT_STATUS_PAYMENT_REVERESED;

    @Id
    @GeneratedValue
    @Column(name = "USER_EVENT_ID")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "LOGIN_ID", referencedColumnName = "LOGIN_ID")
    private UserLoginEntity user;

    @ManyToOne(targetEntity = EventEntity.class)
    @JoinColumn(name = "EVENT_ID", referencedColumnName = "EVENT_ID")
    private EventEntity event;

	@Column(name = "PHONENUMBER", length = PHONE_NUMBER_SIZE)
	private String phoneNumber;
    
    @Column(name = "NUMBER_OF_SEATS", nullable = false)
    private Integer numberOfSeats;
    
    @OneToOne(targetEntity = PaymentTransactionEntity.class)
    @JoinColumn(name = "SUCCESS_PAYMENT_TRANSACTION_ID", referencedColumnName = "PAYMENT_TRANSACTION_ID")
    private PaymentTransactionEntity successPaymentTransaction;

    @Column(name = "DISCOUNT_COUPON", length = 20)
    private String discountCoupon;

    @Column(name = "PAYMENT", nullable = false)
    private Double payment;

    @Column(name = "NET_PAYMENT", nullable = false)
    private Double netPayment;
    
    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "STATUS_CD", referencedColumnName = "TYPE_CD")
    private TypeTableEntity status;


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


    public EventEntity getEvent() {
        return event;
    }


    public void setEvent(EventEntity event) {
        this.event = event;
    }


    public TypeTableEntity getStatus() {
        return status;
    }


    public void setStatus(TypeTableEntity status) {
        this.status = status;
    }


	public PaymentTransactionEntity getSuccessPaymentTransaction() {
		return successPaymentTransaction;
	}


	public void setSuccessPaymentTransaction(PaymentTransactionEntity successPaymentTransaction) {
		this.successPaymentTransaction = successPaymentTransaction;
	}


	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public String getDiscountCoupon() {
		return discountCoupon;
	}


	public void setDiscountCoupon(String discountCoupon) {
		this.discountCoupon = discountCoupon;
	}


	public Double getPayment() {
		return payment;
	}


	public void setPayment(Double payment) {
		this.payment = payment;
	}


	public Double getNetPayment() {
		return netPayment;
	}


	public void setNetPayment(Double netPayment) {
		this.netPayment = netPayment;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
