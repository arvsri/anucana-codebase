package com.anucana.commands.email;

import java.io.StringWriter;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

import freemarker.template.SimpleHash;
import freemarker.template.Template;

public abstract class EmailNotificationServiceTemplate {

	@Autowired	
	private FreeMarkerConfigurationFactoryBean freemarkerConfiguration;

	@Autowired
	protected JavaMailSender mailSender;
	
	private static HashMap<String, Template> templateCache = new HashMap<String, Template>();

	protected String getContent(SimpleHash ftlModel)throws Exception {
		Template template = templateCache.get(getTemplateName());
		if (template == null) {
			template = freemarkerConfiguration.createConfiguration().getTemplate(getTemplateName());
			templateCache.put(getTemplateName(), template);
		}
		
		StringWriter writer = new StringWriter();
		template.process(ftlModel,writer);
		return writer.toString();
	}
	
	protected void sendEmail(SimpleHash ftlModel, MimeMessageHelper messageHelper)throws Exception {
		messageHelper.setText(getContent(ftlModel),true);
		mailSender.send(messageHelper.getMimeMessage());
	}
	
	public abstract String getTemplateName();
	
	
}
