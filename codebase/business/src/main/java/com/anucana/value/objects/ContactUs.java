package com.anucana.value.objects;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.anucana.persistence.entities.MessageInboxEntity;
import com.anucana.validation.annotations.ValidEmail;
import com.anucana.validation.annotations.ValidFirstName;
import com.anucana.validation.annotations.ValidLastName;

public class ContactUs implements Serializable{
	
	private static final long serialVersionUID = 4418062645986210528L;

    private Long messageId;

    private String firstName;

    private String lastName;
	
	private String email;
	
	private String subject;
	
	private String message;


    @ValidFirstName
    public String getFirstName() {
        return firstName;
    }

    @ValidLastName
    public String getLastName() {
        return lastName;
    }
    
    @ValidEmail
    public String getEmail() {
        return email;
    }

    @ValidSubject
    public String getSubject() {
        return subject;
    }

    @ValidMessage
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

	@Constraint(validatedBy = {})
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@ReportAsSingleViolation
	@NotEmpty
	@Length(min = 1, max = MessageInboxEntity.SUBJECT_SIZE)
	@Pattern(regexp = "[a-zA-Z0-9\\s-_\\.\\n\\t\\r,!\\(\\)\\{\\}@'\"\\?/\\\\;:]*")
	public @interface ValidSubject {

	    String message() default "";

	    Class<?>[] groups() default {};

	    Class<?>[] payload() default {};	
		
	}
	

	@Constraint(validatedBy = {})
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@ReportAsSingleViolation
	@NotEmpty
	@Length(min = 1, max = MessageInboxEntity.MESSAGE_SIZE)
	@Pattern(regexp = "[a-zA-Z0-9\\s-_\\.\\n\\t\\r,!\\(\\)\\{\\}@'\"\\?/\\\\;:]*")
	public @interface ValidMessage {

	    String message() default "";

	    Class<?>[] groups() default {};

	    Class<?>[] payload() default {};	
		
	}
    
}
