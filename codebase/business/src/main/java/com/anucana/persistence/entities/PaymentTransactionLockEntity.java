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
@Table(name = "payment_transaction_lock")
public class PaymentTransactionLockEntity extends AuditEntity implements Serializable, StandardEntity<Long> {

	private static final long serialVersionUID = 6501256561835026329L;

	@Id
    @GeneratedValue
    @Column(name = "payment_transaction_lock_id")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "login_id", referencedColumnName = "login_id")
    private UserLoginEntity user;

    @ManyToOne(targetEntity = EventEntity.class)
    @JoinColumn(name = "event_id", referencedColumnName = "event_id")
    private EventEntity event;

    @Column(name = "number_of_seats", nullable = false)
    private Integer numberOfSeats;
    
    @OneToOne(targetEntity = PaymentTransactionEntity.class)
    @JoinColumn(name = "linked_transaction_id", referencedColumnName = "payment_transaction_id")
    private PaymentTransactionEntity linkedPaymentTransaction;

    @Column(name = "transaction_start_time")
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
