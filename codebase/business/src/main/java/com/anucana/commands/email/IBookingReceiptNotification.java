package com.anucana.commands.email;

import com.anucana.client.data.IClientDetails;
import com.anucana.payment.utilities.BookingReceiptGenerationFailedException;
import com.anucana.persistence.entities.UserEventEntity;
import com.anucana.user.data.IUserDetails;

public interface IBookingReceiptNotification extends ICommand{
	
	public String getContent(UserEventEntity userEvent,IClientDetails client,IUserDetails user) throws BookingReceiptGenerationFailedException;

}
