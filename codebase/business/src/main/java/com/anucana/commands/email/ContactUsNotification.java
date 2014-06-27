package com.anucana.commands.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.anucana.client.data.IClientDetails;
import com.anucana.persistence.entities.MessageInboxEntity;
import com.anucana.user.data.IUserDetails;

import freemarker.template.SimpleHash;

@Component
public class ContactUsNotification extends EmailNotificationServiceTemplate implements IContactUsNotification {

    @Value("${email.contactus.to.address}")
    private String toAddress;

	@Override
	public <T> void execute(T t, IClientDetails client, IUserDetails user)throws CommandFailedExcepion {
        try {
            MessageInboxEntity message = (MessageInboxEntity) t;

            SimpleHash model = new SimpleHash();
            model.put("firstName", message.getFirstName());
            model.put("lastName", message.getLastName());
            model.put("message", message.getMessage());

            MimeMessageHelper messageHelper = new MimeMessageHelper(mailSender.createMimeMessage());

            messageHelper.setTo(toAddress);
            messageHelper.setFrom(message.getEmail());
            messageHelper.setSubject(message.getSubject());

            sendEmail(model, messageHelper);

        } catch (Exception e) {
            throw new CommandFailedExcepion(e);
        }
    }

	@Override
	public String getTemplateName() {
		return "contact_us.ftl";
	}

}
