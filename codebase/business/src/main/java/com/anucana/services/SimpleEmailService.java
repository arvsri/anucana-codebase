package com.anucana.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.anucana.value.objects.NewUserLogin;
import com.anucana.value.objects.UserLogin;

/**
 * Services for building email message and send it to the user
 *  
 * @author asrivastava
 *
 */
@Component
public class SimpleEmailService implements IEmailService{

	/**
	 * Default serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public String buildEmailMessage(UserLogin user,String secretCode) throws Exception {
		StringBuilder messageBuilder = new StringBuilder();
		if(user instanceof NewUserLogin){
			messageBuilder.append("\n");
			messageBuilder.append("Dear ").append(user.getFirstName());
			messageBuilder.append("\n");
			messageBuilder.append("\n");
			messageBuilder.append("Thank you for choosing to be part of anucana, an enabling platform for knowlege communities.");
			messageBuilder.append("\n");
			messageBuilder.append("\n");
			messageBuilder.append("Please complete the registration by clicking on the following link and provding your user id");
			messageBuilder.append("\n");
			messageBuilder.append(getHostURLWithContext()).append("/verifyNewUser?");
			messageBuilder.append("userId=").append(user.getUsername()).append("&key=").append(secretCode);
			messageBuilder.append("\n");
			messageBuilder.append("\n");
			messageBuilder.append("Regards,");
			messageBuilder.append("\n");
			messageBuilder.append("anucana team");
		}else if(user instanceof com.anucana.value.objects.ForgotPasswordUserLogin){
			messageBuilder.append("\n");
			messageBuilder.append("Dear ").append(user.getFirstName());
			messageBuilder.append("\n");
			messageBuilder.append("Please reset your password by clicking on the following link and providing your user id");
			messageBuilder.append("\n");
			messageBuilder.append(getHostURLWithContext()).append("/resetPassword?");
			messageBuilder.append("userId=").append(user.getUsername()).append("&key=").append(secretCode);
			messageBuilder.append("\n");
			messageBuilder.append("\n");
			messageBuilder.append("Regards,");
			messageBuilder.append("\n");
			messageBuilder.append("anucana team");
		}
		
		return messageBuilder.toString();
	}

	@Override
	public String sendEmailMessage(String emailMessage, String desination,String subject)throws Exception {
		System.out.println("---------------- Sending Email to " + desination + " ------------------------- ");
		System.out.println(" Message Content ");
		System.out.println(emailMessage);
		System.out.println("-------------------------------------------------------------------------------");

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(desination);
		message.setFrom("noreply.anucana@gmail.com");
		message.setSubject(subject);
		message.setBcc("noreply.anucana@gmail.com");
		message.setText(emailMessage);
		mailSender.send(message);
		
		return null;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	private String getHostURLWithContext(){
		return "http://localhost:8080/web";
	}
}
