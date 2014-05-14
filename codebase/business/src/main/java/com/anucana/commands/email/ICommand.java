package com.anucana.commands.email;

import com.anucana.client.data.IClientDetails;
import com.anucana.user.data.IUserDetails;


public interface ICommand {

	<T> void execute(T t,IClientDetails client,IUserDetails user) throws CommandFailedExcepion;

}
