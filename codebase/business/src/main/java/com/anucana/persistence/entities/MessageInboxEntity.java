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
@Table(name = "MESSAGE_INBOX")
public class MessageInboxEntity extends AuditEntity implements Serializable, Identifiable<Long> {

    private static final long serialVersionUID = -6074995259307889402L;

    public static final int FIRSTNAME_SIZE = 50;
    public static final int LASTNAME_SIZE = 50;
    public static final int EMAIL_SIZE = 255;
    public static final int SUBJECT_SIZE = 255;
    public static final int MESSAGE_SIZE = 5000;

    public static final String MESSAGE_TYPE_ANNONYMOUS = ITypeConstants.TYPE_MESSAGE_ANNONYMOUS;
    public static final String MESSAGE_TYPE_LOGGED_IN_USER = ITypeConstants.TYPE_MESSAGE_LOGGED_IN_USER;
    public static final String MESSAGE_USER_EVENT = ITypeConstants.TYPE_MESSAGE_USER_EVENT;

    @Id
    @GeneratedValue
    @Column(name = "MESSAGE_ID")
    private Long id;

    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "MESSAGE_CD", nullable = false, referencedColumnName = "TYPE_CD")
    private TypeTableEntity messageType;

    @Column(name = "SOURCE_ID")
    private Long sourceId;

    @Column(name = "FIRST_NAME", nullable = false, length = LASTNAME_SIZE)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = FIRSTNAME_SIZE)
    private String lastName;

    @Column(name = "EMAIL", nullable = false, length = EMAIL_SIZE)
    private String email;

    @Column(name = "SUBJECT", nullable = false, length = SUBJECT_SIZE)
    private String subject;

    @Column(name = "MESSAGE", nullable = true, length = MESSAGE_SIZE)
    private String message;

    @Override
    public Long getId() {
        return this.id;
    }


    public TypeTableEntity getMessageType() {
        return messageType;
    }


    public void setMessageType(TypeTableEntity messageType) {
        this.messageType = messageType;
    }


    public Long getSourceId() {
        return sourceId;
    }


    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
