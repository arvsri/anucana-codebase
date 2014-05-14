package com.anucana.commands.email;

import com.anucana.client.data.IClientDetails;
import com.anucana.user.data.IUserDetails;

public class CommandInvoker {

	public <T> void execute(ICommand command,T t,IClientDetails client,IUserDetails user) throws CommandFailedExcepion{
		command.execute(t, client, user);
	}
	
}
