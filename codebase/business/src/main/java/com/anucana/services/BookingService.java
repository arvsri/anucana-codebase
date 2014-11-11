package com.anucana.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.client.data.IClientDetails;
import com.anucana.commands.email.CommandFailedExcepion;
import com.anucana.commands.email.CommandInvoker;
import com.anucana.commands.email.IBookingReceiptNotification;
import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.UserBookingSearchConditions;
import com.anucana.payment.builders.BusinessTransactionIdBuilder;
import com.anucana.payment.builders.ProductInfoBuilder;
import com.anucana.payment.utilities.BookingReceiptGenerationFailedException;
import com.anucana.payment.utilities.PaymentUtils;
import com.anucana.persistence.dao.DiscountCouponDAO;
import com.anucana.persistence.dao.EventDAO;
import com.anucana.persistence.dao.PaymentTransactionDAO;
import com.anucana.persistence.dao.PaymentTransactionLogDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserEventDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.DiscountCouponEntity;
import com.anucana.persistence.entities.EventEntity;
import com.anucana.persistence.entities.PaymentTransactionEntity;
import com.anucana.persistence.entities.PaymentTransactionLogEntity;
import com.anucana.persistence.entities.TypeTableEntity;
import com.anucana.persistence.entities.UserEventEntity;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.strategies.discounts.DiscountCalculationContext;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.SimpleUtils;
import com.anucana.validation.groups.NewBooking;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.BookingSearchResult;
import com.anucana.value.objects.Discount;
import com.anucana.value.objects.PaymentProcessingResult;
import com.anucana.value.objects.PaymentRequest;
import com.anucana.value.objects.PaymentResponse;
import com.anucana.value.objects.UserBooking;

/**
 * Provides services related with Booking ( validating booking details, building payment requests, processing payment response, invoice generation and sending out invoices)
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class BookingService extends AuditService implements IBookingService {

	@Value("${payment.gateway.provider}")
	private String serviceProvider;
	@Value("${payment.gateway.posturl}")
	private String paymentPostURL;
	@Value("${payment.gateway.encrypt.key}")
	private String paymentKey;
	@Value("${payment.gateway.encrypt.salt}")
	private String paymentKeySalt;
	@Value("${payment.gateway.encrypt.algorithm}")
	private String encriptionAlgorithm;
	
	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	@Autowired
	private TypeDAO typeDao;
	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	@Autowired
	private DiscountCouponDAO discountCouponDAO;
	@Autowired
	private EventDAO eventDAO;
	@Autowired
	private UserEventDAO userEventDAO;
	@Autowired
	private PaymentTransactionDAO paymentTransactionDAO;
	@Autowired
	private PaymentTransactionLogDAO paymentTransactionLogDAO;
	@Autowired
	private IBookingReceiptNotification bookingReceiptNotification;

	@Override
	public ServiceResponse<UserBooking> getBookingDetails(ServiceRequest<Long> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		UserBooking booking = new UserBooking();
		UserEventEntity userEvent = userEventDAO.findById(request.getTargetObject());
		if(userEvent != null){
			booking.setEventId(userEvent.getEvent().getId());
			booking.setCommunityId(userEvent.getEvent().getCommunity().getId());
			booking.setNumberOfSeats(userEvent.getNumberOfSeats());
			
			booking.setPayment(userEvent.getPayment());
			booking.setNetPayment(userEvent.getNetPayment());

			if(userEvent.getDiscountCoupon() != null){
				booking.setDiscountCouponCode(userEvent.getDiscountCoupon().getCouponCode());
			}
			booking.setPhone(userEvent.getPhoneNumber());
			booking.setUserId(userDetails.getUserId());
		}
		return new ServiceResponse<UserBooking>(booking);
	}

	
	@Override
	public ServiceResponse<UserBooking> applyBookingDetails(ServiceRequest<UserBooking> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		UserBooking booking = request.getTargetObject();
		booking.setUserId(userDetails.getUserId());

		request.setValidator(jsr303validator);
		request.validate(new Object[]{NewBooking.BookingDetails.class});
		
		if(request.getBindingResult().hasErrors()){
			return request;
		}
		
		if(booking.isUpdateProfilePhone()){
			UserLoginEntity user = loginDao.findById(userDetails.getUserId());
			user.getUserPrimaryInfo().setPhoneNumber(booking.getPhone());
			if(user.getUserPrimaryInfo().getPhoneType() == null){
				user.getUserPrimaryInfo().setPhoneType(typeDao.findByTypeCode(ITypeConstants.TYPE_PHONE_WORK));
			}
			if(user.getUserPrimaryInfo().getPhoneNumberAccess() == null){
				user.getUserPrimaryInfo().setPhoneNumberAccess(typeDao.findByTypeCode(ITypeConstants.TYPE_PROFILE_ACCESS_NONE));
			}
			stampAuditDetails(user.getUserPrimaryInfo(), userDetails);
			loginDao.save(user);
		}
		
		EventEntity event = eventDAO.findById(booking.getEventId());
		booking.setPayment(event.getRateInRuppes() * booking.getNumberOfSeats());
		booking.setNetPayment(booking.getPayment());
		
		return new ServiceResponse<UserBooking>(booking);
	}

	@Override
	public ServiceResponse<UserBooking> applyDiscountCoupon(ServiceRequest<UserBooking> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		UserBooking booking = request.getTargetObject();
		booking.setUserId(userDetails.getUserId());
		
		request.setValidator(jsr303validator);
		request.validate(new Object[]{NewBooking.BookingDetails.class,NewBooking.CouponDetails.class});
		
		if(request.getBindingResult().hasErrors()){
			return request;
		}
		
		if(StringUtils.isNotBlank(booking.getDiscountCouponCode())){
			DiscountCouponEntity discountEntity = discountCouponDAO.findByCouponCode(booking.getDiscountCouponCode());
			
			Discount discount = new Discount(booking.getPayment(), discountEntity.getRate(), discountEntity.getCalculationStrategy().getTypeCode());
			float discountedAmount = new DiscountCalculationContext(discount).calculate().getDiscountedAmount();
			booking.setDiscount(discount);
			booking.setNetPayment(booking.getNetPayment() - discountedAmount);
		}
		
		return new ServiceResponse<UserBooking>(booking);
	}

	@Override
	public ServiceResponse<?> getPaymentRequest(ServiceRequest<UserBooking> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		UserBooking booking = request.getTargetObject();
		booking.setUserId(userDetails.getUserId());
		
		request.setValidator(jsr303validator);
		request.validate(new Object[]{NewBooking.BookingDetails.class,NewBooking.CouponDetails.class,NewBooking.PaymentDetails.class});
		
		if(request.getBindingResult().hasErrors()){
			return request;
		}

		// Create  the user event
		EventEntity event = eventDAO.findById(booking.getEventId());
		UserEventEntity userEvent = new UserEventEntity();
		userEvent.setEvent(event);
		userEvent.setUser(loginDao.findById(booking.getUserId()));
		
		userEvent.setPhoneNumber(booking.getPhone());
		userEvent.setPayment(booking.getPayment());
		userEvent.setNetPayment(booking.getNetPayment());
		if(StringUtils.isNotBlank(booking.getDiscountCouponCode())){
			userEvent.setDiscountCoupon(discountCouponDAO.findByCouponCode(booking.getDiscountCouponCode()));
		}
		userEvent.setNumberOfSeats(booking.getNumberOfSeats());
		userEvent.setStatus(typeDao.findByTypeCode(UserEventEntity.USER_EVENT_STATUS_ENROLLED));
		stampAuditDetails(userEvent, userDetails);
		userEventDAO.save(userEvent);

		// build the payment transaction id
		BusinessTransactionIdBuilder transactionIdBuilder = new BusinessTransactionIdBuilder(booking.getUserId(), booking.getEventId()).build();
		
		// create the payment transaction
		PaymentTransactionEntity paymentTransaction = new PaymentTransactionEntity();
		paymentTransaction.setUserEvent(userEvent);
		paymentTransaction.setBusinessTransactionId(transactionIdBuilder.getResult());
		paymentTransaction.setAmount(booking.getNetPayment());
		paymentTransaction.setStatus(typeDao.findByTypeCode(PaymentTransactionEntity.PAYMENT_TRANSACTION_STATUS_PENDNG));
		stampAuditDetails(paymentTransaction, userDetails);
		paymentTransactionDAO.save(paymentTransaction);
		
		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setKey(paymentKey);
		paymentRequest.setService_provider(serviceProvider);
		paymentRequest.setTxnid(transactionIdBuilder.getResult());
		paymentRequest.setAmount(Float.valueOf(booking.getNetPayment()).toString());
		
		ProductInfoBuilder productInfoBuilder = new ProductInfoBuilder()
				.withPaymentParts(event.getName(), event.getShortDesc(),booking.getNetPayment() + "")
				.withPaymentIdentifiers("TxnId",transactionIdBuilder.getResult())
				.build();
		
		paymentRequest.setProductinfo(productInfoBuilder.getResult());
		paymentRequest.setHtmlCharEscapedProductinfo(productInfoBuilder.getHTMLEscapedResult());
		
		paymentRequest.setFirstname(userDetails.getFirstName());
		paymentRequest.setLastname(userDetails.getLastName());
		paymentRequest.setEmail(userDetails.getUsername());
		paymentRequest.setPhone(booking.getPhone());
		
		paymentRequest.setUdf1(booking.getUserId()+"");
		paymentRequest.setUdf2(booking.getEventId()+"");
		paymentRequest.setUdf3(userEvent.getId()+"");
		paymentRequest.setUdf4(paymentTransaction.getId()+"");

		String hashSequence = paymentRequest.hashSequence(paymentKeySalt);
		paymentRequest.setHash(SimpleUtils.calculateChecksum(encriptionAlgorithm, hashSequence));
		paymentRequest.setPosturl(paymentPostURL);
		
		// save the payment request log before sending out the payment request
		PaymentTransactionLogEntity paymentTransactionLog = new PaymentTransactionLogEntity();
		paymentTransactionLog.setPaymentTransaction(paymentTransaction);
		paymentTransactionLog.setLogType(typeDao.findByTypeCode(PaymentTransactionLogEntity.LOG_TYPE_PAYMENT_TRANSACTION_REQUEST));
		paymentTransactionLog.setLogMessage(paymentRequest.toString());
		stampAuditDetails(paymentTransactionLog, userDetails);
		paymentTransactionLogDAO.save(paymentTransactionLog);
		
		return new ServiceResponse<PaymentRequest>(paymentRequest);
	}

	
	@Override
	public ServiceResponse<PaymentProcessingResult> processPayment(ServiceRequest<PaymentResponse> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		PaymentResponse paymentResponse = request.getTargetObject();
		
		// first thing, validate the checksum
		paymentResponse.setKey(paymentKey);
		String hashSequence = paymentResponse.reverseHashSequence(paymentKeySalt);
		String checksum = SimpleUtils.calculateChecksum(encriptionAlgorithm, hashSequence);
		
		UserEventEntity userEventEntity = null;
		PaymentTransactionEntity paymentTransaction = null;
		// checksum passed 
		if(checksum.equals(paymentResponse.getHash())){
			userEventEntity = userEventDAO.findById(SimpleUtils.longVal(paymentResponse.getUdf3()));
			userEventEntity.setStatus(typeDao.findByTypeCode(PaymentUtils.getUserEventStatus(paymentResponse.getStatus())));	
			stampAuditDetails(userEventEntity, userDetails);
			userEventDAO.save(userEventEntity);

			paymentTransaction = paymentTransactionDAO.findById(SimpleUtils.longVal(paymentResponse.getUdf4()));
			
			paymentTransaction.setPaymentResponseId(paymentResponse.getMihpayid());
			paymentTransaction.setAmount(Float.valueOf(paymentResponse.getAmount()));
			if(StringUtils.isNotBlank(paymentResponse.getDiscount())){
				paymentTransaction.setDiscount(Float.valueOf(paymentResponse.getDiscount()));
			}
			paymentTransaction.setStatus(typeDao.findByTypeCode(PaymentUtils.getPaymentTransactionStatus(paymentResponse.getStatus())));			
			String paymentMode = PaymentUtils.getPaymentTransactionMode(paymentResponse.getMode());
			if(StringUtils.isNotBlank(paymentMode)){
				paymentTransaction.setPaymentMode(typeDao.findByTypeCode(paymentMode));
			}

			TypeTableEntity errorType = typeDao.findByTypeCode( ITypeConstants.TYPE_GRP_PREFIX_PAYU_MONEY + paymentResponse.getError());
			if(errorType == null){
				errorType = typeDao.findByTypeCode(PaymentUtils.getPaymentTransactionErrorCode(paymentResponse.getStatus()));
			}
			paymentTransaction.setErrorCode(errorType);
			paymentTransaction.setGatewayResponseId(paymentResponse.getPayuMoneyId());
			paymentTransaction.setPaymentGatewayType(paymentResponse.getPg_type());
			paymentTransaction.setBankReference(paymentResponse.getBank_ref_num());
			stampAuditDetails(paymentTransaction, userDetails);
			
			paymentTransactionDAO.save(paymentTransaction);
			
		}
		
		// save the transaction log
		PaymentTransactionLogEntity paymentTransactionLog = new PaymentTransactionLogEntity();
		paymentTransactionLog.setPaymentTransaction(paymentTransaction);
		paymentTransactionLog.setLogType(typeDao.findByTypeCode(PaymentTransactionLogEntity.LOG_TYPE_PAYMENT_TRANSACTION_RESPONSE));
		paymentTransactionLog.setLogMessage(paymentResponse.toString());
		stampAuditDetails(paymentTransactionLog, userDetails);
		paymentTransactionLogDAO.save(paymentTransactionLog);
		
		// build the result
		PaymentProcessingResult result = new PaymentProcessingResult();
		if(userEventEntity != null && paymentTransaction != null){
			result.setUserEventId(userEventEntity.getId());
			if(UserEventEntity.USER_EVENT_STATUS_PAID.equals(userEventEntity.getStatus().getTypeCode())){
				result.setProcessingSuccess(true);
			}else{
				result.setProcessingSuccess(false);
				result.setErrorReason(paymentTransaction.getErrorCode().getTypeCode() + " - " + paymentTransaction.getErrorCode().getTypeDescription());
			}
		}
		return new ServiceResponse<PaymentProcessingResult>(result);
	}

	
	@Override
	public ServiceResponse<PaymentProcessingResult> sendSuccessNotifcation(ServiceRequest<PaymentResponse> request,IUserDetails userDetails, IClientDetails client)throws ServiceException {
		PaymentResponse paymentResponse = request.getTargetObject();
		try {
			UserEventEntity userEventEntity = userEventDAO.findById(SimpleUtils.longVal(paymentResponse.getUdf3()));
			new CommandInvoker().execute(bookingReceiptNotification, userEventEntity, client, userDetails);
		} catch (CommandFailedExcepion e) {
			throw new ServiceException(ServiceException.EMAIL_NOTIFICATION_FAILED_EXCEPTION,e);
		}
		
		PaymentProcessingResult paymentProcessingResult = new PaymentProcessingResult();
		paymentProcessingResult.setNotificationSuccess(true);
		
		return new ServiceResponse<PaymentProcessingResult>(paymentProcessingResult);
	}


	@Override
	public ServiceResponse<List<BookingSearchResult>> searchBookings(ServiceRequest<UserBookingSearchConditions> request,IUserDetails userDetails, IClientDetails client)throws ServiceException {
		UserBookingSearchConditions searchConditions = request.getTargetObject();

		List<UserEventEntity> userEventEntities = null;
		if(UserBookingSearchConditions.MODE.SEARCH_ALL_FOR_USER.equals(searchConditions.getSearchMode())){
			userEventEntities = userEventDAO.findAllByUser(userDetails.getUserId(), searchConditions.getStatus());
		}else if(UserBookingSearchConditions.MODE.SEARCH_BY_EVENT_NAME_FOR_USER.equals(searchConditions.getSearchMode())){
			userEventEntities = userEventDAO.findAllByEventNameAndUser(userDetails.getUserId(),searchConditions.getEventName(), searchConditions.getStatus());
		}else if(UserBookingSearchConditions.MODE.SEARCH_BY_ID_FOR_USER.equals(searchConditions.getSearchMode())){
			UserEventEntity userEvent = userEventDAO.findById(searchConditions.getUserEventId());
			if(userEvent != null){
				userEventEntities = new ArrayList<UserEventEntity>();
				userEventEntities.add(userEvent);	
			}
		}

		List<BookingSearchResult> result = new ArrayList<BookingSearchResult>();
		if(CollectionUtils.isNotEmpty(userEventEntities)){
			for(UserEventEntity userEventEntity : userEventEntities){
				BookingSearchResult searchResult = new BookingSearchResult();
				searchResult.setUserEventId(userEventEntity.getId());
				searchResult.setEventId(userEventEntity.getEvent().getId());
				searchResult.setDateOfBooking(userEventEntity.getCreationDate());
				searchResult.setNumberOfBookedSeats(userEventEntity.getNumberOfSeats());
				searchResult.setPayment(userEventEntity.getPayment());
				
				result.add(searchResult);
			}
		}
		
		return new ServiceResponse<List<BookingSearchResult>>(result);
	}


	@Override
	public ServiceResponse<String> getReceiptHTML(ServiceRequest<Long> serviceRequest,IUserDetails loggedInUserDetails, IClientDetails clientDetails)throws ServiceException {
		try {
			Long userEventId = serviceRequest.getTargetObject();
			UserEventEntity userEventEntity = userEventDAO.findById(userEventId);
			if(userEventEntity.getUser().getId() == loggedInUserDetails.getUserId()){
				String htmlContent = bookingReceiptNotification.getContent(userEventEntity,clientDetails, loggedInUserDetails);
				return new ServiceResponse<String>(htmlContent);
			}else{
				throw new ServiceException(ServiceException.USER_EVENT_RECEIPT_GENERATION_FAILED_EXCEPTION);
			}
		} catch (BookingReceiptGenerationFailedException e) {
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION,e);
		}
	}

}
