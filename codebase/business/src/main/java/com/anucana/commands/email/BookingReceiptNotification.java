package com.anucana.commands.email;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.anucana.client.data.IClientDetails;
import com.anucana.payment.utilities.BookingReceiptGenerationFailedException;
import com.anucana.payment.utilities.PaymentTransactionStatusPredicate;
import com.anucana.persistence.entities.AddressEntity;
import com.anucana.persistence.entities.EventEntity;
import com.anucana.persistence.entities.PaymentTransactionEntity;
import com.anucana.persistence.entities.UserEventEntity;
import com.anucana.user.data.IUserDetails;

import freemarker.template.SimpleHash;

@Component
public class BookingReceiptNotification extends EmailNotificationServiceTemplate implements IBookingReceiptNotification {

	@Value("${email.from.address}")
	private String fromAddress;
	
	@Value("${email.event.booking.receipt.subject}")
	private String subject;
	
	@Override
	public <T> void execute(T t, IClientDetails client, IUserDetails user)throws CommandFailedExcepion {
		try {
			UserEventEntity userEvent = (UserEventEntity)t;
			SimpleHash model = buildModel(userEvent);
			
			MimeMessageHelper messageHelper = new MimeMessageHelper(mailSender.createMimeMessage());
			
			messageHelper.setTo(user.getUsername());
			messageHelper.setFrom(fromAddress);
			messageHelper.setSubject(subject);

			sendEmail(model, messageHelper);
			
		} catch (Exception e) {
			throw new CommandFailedExcepion(e);
		}
	}

	private SimpleHash buildModel(UserEventEntity userEvent) {
		EventEntity event = userEvent.getEvent();
		AddressEntity addressEntity = event.getVenue();
		
		PaymentTransactionEntity successTransaction = 
				(PaymentTransactionEntity) CollectionUtils.find(userEvent.getPaymentTransactions(),
						new PaymentTransactionStatusPredicate(PaymentTransactionEntity.PAYMENT_TRANSACTION_STATUS_SUCCESS));

		SimpleHash model = new SimpleHash();
		//model.put("gatewayResponseId", successTransaction.getGatewayResponseId());
		model.put("bookingId", userEvent.getId());
		model.put("businessTransactionId", successTransaction.getBusinessTransactionId());
		
		model.put("eventName", event.getName());
		model.put("numberOfSeats", userEvent.getNumberOfSeats());
		model.put("eventLocation", addressEntity.getAddressLine1() + ", "
				+ addressEntity.getAddressLine2() + ",  Pincode - "
				+ addressEntity.getPostalCode().getPostalCd());
		model.put("eventDate", DateFormatUtils.format(event.getEventDate(), "EEE, MMM d, ''yyyy"));
		model.put("eventTime", DateFormatUtils.format(event.getEventDate(), "h:mm a"));
		model.put("eventBookingTime", DateFormatUtils.format(userEvent.getCreationDate(), "EEE, d MMM yyyy HH:mm:ss"));
		model.put("paymentmode", successTransaction.getPaymentMode().getTypeDescription());
		
		model.put("payment", userEvent.getPayment());
		model.put("discount", userEvent.getPayment() - userEvent.getNetPayment());
		model.put("netpayment", userEvent.getNetPayment());
		return model;
	}

	@Override
	public String getContent(UserEventEntity userEvent, IClientDetails client,IUserDetails user) throws BookingReceiptGenerationFailedException {
		try{
			SimpleHash model = buildModel(userEvent);
			return getContent(model);
		}catch(Exception ex){
			throw new BookingReceiptGenerationFailedException(ex);
		}
	}
	
	@Override
	public String getTemplateName() {
		return "receipt.ftl";
	}


}
