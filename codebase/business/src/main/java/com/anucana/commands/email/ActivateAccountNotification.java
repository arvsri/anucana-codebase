package com.anucana.commands.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.anucana.client.data.IClientDetails;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.services.IUtilityService;
import com.anucana.user.data.IUserDetails;

import freemarker.template.SimpleHash;

@Component
public class ActivateAccountNotification extends EmailNotificationServiceTemplate implements IActivateAccountNotification {

	@Value("${email.from.address}")
	private String fromAddress;
	
	@Value("${email.reg.activate.account.subject}")
	private String subject;
	
	public <T> void execute(T t, IClientDetails client, IUserDetails userDetails) throws CommandFailedExcepion {
		try {
			UserLoginEntity user = (UserLoginEntity)t;
			String secretKey = IUtilityService.urlKeyEncoder.encodePassword(user.getPassword(),user.getVerificationSalt());
			
			StringBuilder contextURL = new StringBuilder(client.getContextURL());
			contextURL.append("/verifyNewUser?").append("username=").append(user.getUsername()).append("&key=").append(secretKey);
			
			SimpleHash model = new SimpleHash();
			model.put("firstName", user.getFirstName());
			model.put("urlWithSecretKey", contextURL.toString());
			
			MimeMessageHelper messageHelper = new MimeMessageHelper(mailSender.createMimeMessage());
			
			messageHelper.setTo(user.getUsername());
			messageHelper.setFrom(fromAddress);
			messageHelper.setSubject(subject);

			sendEmail(model, messageHelper);
			
		} catch (Exception e) {
			throw new CommandFailedExcepion(e);
		}
	}

	@Override
	public String getTemplateName() {
		return "reg_activate_account.ftl";
	}
	

}
