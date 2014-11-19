package com.anucana.services;

import java.util.List;

import com.anucana.client.data.IClientDetails;
import com.anucana.entity.search.conditions.UserBookingSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.BookingSearchResult;
import com.anucana.value.objects.PaymentProcessingResult;
import com.anucana.value.objects.PaymentResponse;
import com.anucana.value.objects.UserBooking;

public interface IBookingService {

	ServiceResponse<UserBooking> getBookingDetails(ServiceRequest<Long> request, IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	
	ServiceResponse<UserBooking> applyBookingDetails(ServiceRequest<UserBooking> request, IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	ServiceResponse<UserBooking> applyDiscountCoupon(ServiceRequest<UserBooking> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	

	ServiceResponse<?> getPaymentRequest(ServiceRequest<UserBooking> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	
	ServiceResponse<PaymentProcessingResult> processPayment(ServiceRequest<PaymentResponse> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;

	ServiceResponse<PaymentProcessingResult> sendSuccessNotifcation(ServiceRequest<PaymentResponse> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;
	
	
	ServiceResponse<List<BookingSearchResult>> searchBookings(ServiceRequest<UserBookingSearchConditions> request,IUserDetails userDetails,IClientDetails client) throws ServiceException;


	ServiceResponse<String> getReceiptHTML(ServiceRequest<Long> serviceRequest,IUserDetails loggedInUserDetails, IClientDetails clientDetails) throws ServiceException;
	
	ServiceResponse<Integer> cancelTimedOutPayments(ServiceRequest<?> serviceRequest, IUserDetails loggedInUserDetails,IClientDetails clientDetails) throws ServiceException;
}
