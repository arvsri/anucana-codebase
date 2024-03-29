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

@Entity
@Table(name = "user_event")
public class UserEventEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = 4545703834458894544L;

    public static final String USER_EVENT_STATUS_ENROLLED = ITypeConstants.TYPE_USER_EVENT_STATUS_ENROLLED;
    public static final String USER_EVENT_STATUS_PAID = ITypeConstants.TYPE_USER_EVENT_STATUS_PAID;
    public static final String USER_EVENT_STATUS_PAYMENT_FAILED = ITypeConstants.TYPE_USER_EVENT_STATUS_PAYMENT_FAILED;
    // Dispute status is used if payment response checksum is failed
    public static final String USER_EVENT_STATUS_PAYMENT_DISPUTE = ITypeConstants.TYPE_USER_EVENT_STATUS_PAYMENT_DISPUTE;
    public static final String USER_EVENT_STATUS_CANCELLED = ITypeConstants.TYPE_USER_EVENT_STATUS_CANCELLED;
    public static final String USER_EVENT_STATUS_PAYMENT_REVERSED = ITypeConstants.TYPE_USER_EVENT_STATUS_PAYMENT_REVERESED;

    @Id
    @GeneratedValue
    @Column(name = "user_event_id")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "login_id", referencedColumnName = "login_id")
    private UserLoginEntity user;

    @ManyToOne(targetEntity = EventEntity.class)
    @JoinColumn(name = "event_id", referencedColumnName = "event_id")
    private EventEntity event;

	@Column(name = "phonenumber", length = PHONE_NUMBER_SIZE)
	private String phoneNumber;
    
    @Column(name = "number_of_seats", nullable = false)
    private Integer numberOfSeats;
    
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "userEvent" ,targetEntity = PaymentTransactionEntity.class)
	private Collection<PaymentTransactionEntity> paymentTransactions;
    
    @ManyToOne(targetEntity = DiscountCouponEntity.class)
    @JoinColumn(name = "discount_coupon_id", referencedColumnName = "discount_coupon_id")
    private DiscountCouponEntity discountCoupon;

    @Column(name = "payment", nullable = false)
    private Float payment;

    @Column(name = "net_payment", nullable = false)
    private Float netPayment;
    
    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "status_cd", referencedColumnName = "type_cd",nullable = false)
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


	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public DiscountCouponEntity getDiscountCoupon() {
		return discountCoupon;
	}


	public void setDiscountCoupon(DiscountCouponEntity discountCoupon) {
		this.discountCoupon = discountCoupon;
	}


	public Float getPayment() {
		return payment;
	}


	public void setPayment(Float payment) {
		this.payment = payment;
	}


	public Float getNetPayment() {
		return netPayment;
	}


	public void setNetPayment(Float netPayment) {
		this.netPayment = netPayment;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Collection<PaymentTransactionEntity> getPaymentTransactions() {
		return paymentTransactions;
	}

	public void setPaymentTransactions(Collection<PaymentTransactionEntity> paymentTransactions) {
		this.paymentTransactions = paymentTransactions;
	}
	
}
