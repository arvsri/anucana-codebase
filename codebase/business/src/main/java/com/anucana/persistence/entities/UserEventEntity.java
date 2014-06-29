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

    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "STATUS_CD", referencedColumnName = "TYPE_CD")
    private TypeTableEntity status;

    @OneToOne(targetEntity = PaymentTransactionEntity.class)
    @JoinColumn(name = "PAYMENT_TRANSACTION_ID", referencedColumnName = "PAYMENT_TRANSACTION_ID")
    private PaymentTransactionEntity payemntTransaction;


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


    public PaymentTransactionEntity getPayemntTransaction() {
        return payemntTransaction;
    }


    public void setPayemntTransaction(PaymentTransactionEntity payemntTransaction) {
        this.payemntTransaction = payemntTransaction;
    }


}
