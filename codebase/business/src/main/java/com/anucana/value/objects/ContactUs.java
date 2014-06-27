package com.anucana.value.objects;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.anucana.persistence.entities.MessageInboxEntity;

public class ContactUs implements Serializable{
	
	private static final long serialVersionUID = 4418062645986210528L;

    private Long messageId;

    private String firstName;

    private String lastName;
	
	private String email;
	
	private String subject;
	
	private String message;


    @NotEmpty
    @Size(max = MessageInboxEntity.FIRSTNAME_SIZE)
    public String getFirstName() {
        return firstName;
    }

    @NotEmpty
    @Size(max = MessageInboxEntity.LASTNAME_SIZE)
    public String getLastName() {
        return lastName;
    }

    @NotEmpty
    @Email
    @Size(max = MessageInboxEntity.EMAIL_SIZE)
    public String getEmail() {
        return email;
    }

    @NotEmpty
    @Size(max = MessageInboxEntity.SUBJECT_SIZE)
    public String getSubject() {
        return subject;
    }

    @NotEmpty
    @Size(max = MessageInboxEntity.MESSAGE_SIZE)
    public String getMessage() {
        return message;
    }


    public Long getMessageId() {
        return messageId;
    }


    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void setMessage(String message) {
        this.message = message;
    }

}
