package com.anucana.persistence.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_TRANSACTION_LOCK")
public class PaymentTransactionLockEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

	private static final long serialVersionUID = 6501256561835026329L;

	@Id
    @GeneratedValue
    @Column(name = "PAYMENT_TRANSACTION_LOCK_ID")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "LOGIN_ID", referencedColumnName = "LOGIN_ID")
    private UserLoginEntity user;

    @ManyToOne(targetEntity = EventEntity.class)
    @JoinColumn(name = "EVENT_ID", referencedColumnName = "EVENT_ID")
    private EventEntity event;

    @Column(name = "NUMBER_OF_SEATS", nullable = false)
    private Integer numberOfSeats;
    
    @OneToOne(targetEntity = PaymentTransactionEntity.class)
    @JoinColumn(name = "LINKED_TRANSACTION_ID", referencedColumnName = "PAYMENT_TRANSACTION_ID")
    private PaymentTransactionEntity linkedPaymentTransaction;

    @Column(name = "TRANSACTION_START_TIME")
    private Timestamp transactionStartTime;

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

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public PaymentTransactionEntity getLinkedPaymentTransaction() {
		return linkedPaymentTransaction;
	}

	public void setLinkedPaymentTransaction(
			PaymentTransactionEntity linkedPaymentTransaction) {
		this.linkedPaymentTransaction = linkedPaymentTransaction;
	}

	public Timestamp getTransactionStartTime() {
		return transactionStartTime;
	}

	public void setTransactionStartTime(Timestamp transactionStartTime) {
		this.transactionStartTime = transactionStartTime;
	}
	
}
