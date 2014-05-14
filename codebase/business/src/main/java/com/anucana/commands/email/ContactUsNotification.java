package com.anucana.commands.email;

import com.anucana.client.data.IClientDetails;
import com.anucana.user.data.IUserDetails;

public class ContactUsNotification extends EmailNotificationServiceTemplate implements ICommand {

	@Override
	public <T> void execute(T t, IClientDetails client, IUserDetails user)throws CommandFailedExcepion {
		
	}

	@Override
	public String getTemplateName() {
		return "contact_us.ftl";
	}

}
