package com.anucana.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.CommunitySearchConditions;
import com.anucana.entity.search.conditions.EventSearchConditions;
import com.anucana.entity.search.conditions.ProfileSearchConditions;
import com.anucana.entity.search.conditions.UserBookingSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.IBookingService;
import com.anucana.services.ICommunityService;
import com.anucana.services.IEventService;
import com.anucana.services.IUserProfileService;
import com.anucana.utils.SimpleUtils;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.BookingSearchResult;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.Event;
import com.anucana.value.objects.PaymentProcessingResult;
import com.anucana.value.objects.PaymentRequest;
import com.anucana.value.objects.PaymentResponse;
import com.anucana.value.objects.UserBooking;
import com.anucana.value.objects.UserProfile;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Controller to manage the bookings, payments, receipt print flows 
 * 
 */
@Controller
@RequestMapping(value="/booking/**")
public class BookingController extends AccessController{

    @Autowired
    private IWebConfigsProvider configProvider;
	@Autowired
	private IUserProfileService profileServie;
	@Autowired
	private ICommunityService communityService;
	@Autowired
	private IEventService eventService;
	@Autowired
	private IBookingService bookingService;
	@Value("#{propertyConfigurer['config.events.max.seatsbooking']}")
	private Integer maxBookingSeats;
	@Value("#{propertyConfigurer['config.bookings.pagesize']}")
	private Integer pagesize;
	
	public static String PAYMENT_RECEIVE_URL = "/booking/unmanaged/payment/receive";
	
	/**
	 * Receives and processes the payment from the payment gateway in case of payment success
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value= "unmanaged/payment/receive",method = RequestMethod.POST)
	public ModelAndView receivePaymentResponse(PaymentResponse response) throws Exception {
		response.setPostAction("success");
		
		ServiceResponse<PaymentProcessingResult> processingResultResponse = 
				bookingService.processPayment(new ServiceRequest<PaymentResponse>(response), getLoggedInUserDetails(), configProvider.getClientDetails());
		PaymentProcessingResult processingResult = processingResultResponse.getTargetObject();
		
		if(processingResult.isProcessingSuccess()){
			try{
				processingResultResponse = 
						bookingService.sendSuccessNotifcation(new ServiceRequest<PaymentResponse>(response), getLoggedInUserDetails(), configProvider.getClientDetails());
				processingResult.setNotificationSuccess(processingResultResponse.getTargetObject().isNotificationSuccess());
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

		return buildViewDetails(processingResult);
	}

	private ModelAndView buildViewDetails(PaymentProcessingResult processingResult)throws ServiceException {
		ModelAndView mv = new ModelAndView("bookEvent");
		mv.addObject("paymentProcessingResult",processingResult);
		
		// load user booking details
		ServiceResponse<UserBooking> bookingResponse = 
				bookingService.getBookingDetails(new ServiceRequest<Long>(processingResult.getUserEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());

		UserBooking userBooking = bookingResponse.getTargetObject();
		ServiceResponse<Event> event = 
				eventService.getEventDetails(new ServiceRequest<Long>(userBooking.getEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());
		userBooking.setEvent(event.getTargetObject());
		buildEssentialViewDetails(userBooking, mv);

		return mv;
	}
	
	@RequestMapping(value= "unmanaged/{eventId}/availableSeats", method = RequestMethod.GET)
	public ModelAndView getAvailableSeats(@PathVariable long eventId) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		ServiceResponse<Integer>  availableSeatsResp = eventService.getAvailableSeatsCount(new ServiceRequest<Long>(eventId), getLoggedInUserDetails(), configProvider.getClientDetails());
		Integer availableSeats = availableSeatsResp.getTargetObject();
		
		availableSeats = ( availableSeats > maxBookingSeats) ? maxBookingSeats : availableSeats;
		mv.addObject("availableSeats",availableSeats);
		return mv;
	}	
	
	
	/**
	 * ***************************************************************************************************************************************************************
	 * 															Managed URLs, they require user is logged in
	 * 				
	 * ***************************************************************************************************************************************************************
	 */
	
	
	@RequestMapping(value= "managed/bookEvent",method = RequestMethod.GET)
	public ModelAndView bookEvent(UserBooking userBooking) throws Exception {
		buildUserBooking(userBooking);
		return applyBookingDetails(userBooking);
	}
	
	private void buildUserBooking(UserBooking userBooking) throws ServiceException{
		
		ProfileSearchConditions profileSearchConditions = new ProfileSearchConditions(ProfileSearchConditions.MODE.SEARCH_BY_ID);
		profileSearchConditions.setLoginId(getLoggedInUserDetails().getUserId());
		ServiceResponse<List<UserProfile>> profileResp = 
				profileServie.searchProfiles(new ServiceRequest<ProfileSearchConditions>(profileSearchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
		UserProfile profile = profileResp.getTargetObject().get(0);

		// set user phone if available on profile
		userBooking.setPhone(profile.getPhonenumber());
		
		EventSearchConditions eventSearchConditions = new EventSearchConditions(EventSearchConditions.MODE.SEARCH_BY_ID);
		eventSearchConditions.setEventId(userBooking.getEventId());
		ServiceResponse<List<Event>> eventSearchResp 
			= eventService.searchEvents(new ServiceRequest<EventSearchConditions>(eventSearchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
		if(CollectionUtils.isNotEmpty(eventSearchResp.getTargetObject())){
			Event event = eventSearchResp.getTargetObject().get(0);
			userBooking.setCommunityId(SimpleUtils.longVal(event.getCommunityId()));
		}
	}
	
	private void buildEssentialViewDetails(UserBooking userBooking,ModelAndView mv) throws ServiceException{
		
		CommunitySearchConditions searchCondition = new CommunitySearchConditions(CommunitySearchConditions.MODE.SELECT_ALL);
		ServiceResponse<List<Community>> communities = communityService.searchCommunities(new ServiceRequest<CommunitySearchConditions>(searchCondition), getLoggedInUserDetails(), configProvider.getClientDetails());
		mv.addObject("communities",communities.getTargetObject());
		
		if(userBooking.getCommunityId() != 0){
			EventSearchConditions eventSearchConditions = new EventSearchConditions(EventSearchConditions.MODE.SEARCH_BY_COMMUNITY_ID);
			eventSearchConditions.setCommunityId(userBooking.getCommunityId());
			ServiceResponse<List<Event>> events 
				= eventService.searchEvents(new ServiceRequest<EventSearchConditions>(eventSearchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());
			mv.addObject("events",events.getTargetObject());
		}
		
		if(userBooking.getEventId() != 0){
			ServiceResponse<Integer>  availableSeatsResp = eventService.getAvailableSeatsCount(new ServiceRequest<Long>(userBooking.getEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());
			Integer availableSeats = availableSeatsResp.getTargetObject();
			
			availableSeats = ( availableSeats > maxBookingSeats) ? maxBookingSeats : availableSeats;
			userBooking.setNumberOfAvailableSeats(availableSeats);
		}
		mv.addObject(userBooking);
	}
	
	
	@RequestMapping(value= "managed/bookEvent",params="action=Continue",method = RequestMethod.POST)
	public ModelAndView applyBookingDetails(UserBooking userBooking) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");

		ServiceResponse<UserBooking> response = bookingService.applyBookingDetails(new ServiceRequest<UserBooking>(userBooking), getLoggedInUserDetails(), configProvider.getClientDetails());
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
		}else{
			ServiceResponse<Event> event = 
					eventService.getEventDetails(new ServiceRequest<Long>(userBooking.getEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());
			userBooking.setEvent(event.getTargetObject());
		}
		
		buildEssentialViewDetails(userBooking, mv);
		return mv;
	}

	@RequestMapping(value= "managed/bookEvent",params="action=Apply",method = RequestMethod.POST)
	public ModelAndView applyDiscountCoupon(UserBooking userBooking) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		ServiceResponse<Event> event = 
				eventService.getEventDetails(new ServiceRequest<Long>(userBooking.getEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());
		userBooking.setEvent(event.getTargetObject());

		ServiceResponse<UserBooking> response = bookingService.applyDiscountCoupon(new ServiceRequest<UserBooking>(userBooking), getLoggedInUserDetails(), configProvider.getClientDetails());
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
		}
		buildEssentialViewDetails(userBooking, mv);
		return mv;
	}

	@RequestMapping(value= "managed/bookEvent",params="action=Pay Now", method = RequestMethod.POST)
	public ModelAndView applyPayments(UserBooking userBooking) throws Exception {
		ServiceResponse<?> response = bookingService.getPaymentRequest(new ServiceRequest<UserBooking>(userBooking),getLoggedInUserDetails(),configProvider.getClientDetails());
		if (response.getBindingResult().hasErrors()) {

			ModelAndView mv = new ModelAndView("bookEvent");
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());

			ServiceResponse<Event> event = 
					eventService.getEventDetails(new ServiceRequest<Long>(userBooking.getEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());
			userBooking.setEvent(event.getTargetObject());

			buildEssentialViewDetails(userBooking, mv);
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("payumoney");
			PaymentRequest paymentRequest = (PaymentRequest)response.getTargetObject();
			String contextURL = configProvider.getClientDetails().getContextURL();

			paymentRequest.setSurl(contextURL+PAYMENT_RECEIVE_URL);
			paymentRequest.setFurl(contextURL+PAYMENT_RECEIVE_URL);
			paymentRequest.setCurl(contextURL+PAYMENT_RECEIVE_URL);
			
			System.out.println(paymentRequest);
			
			mv.addObject(paymentRequest);
			return mv;
		}
	}	
	
	@RequestMapping(value= "managed/list",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView showBookings(@RequestParam(required = false) String searchString,@RequestParam(required = false) String pageNumber) throws Exception {
		ModelAndView mv = new ModelAndView("viewBookings");
		
		UserBookingSearchConditions searchConditions = null;
		if(StringUtils.isBlank(searchString)){
			searchConditions = new UserBookingSearchConditions(UserBookingSearchConditions.MODE.SEARCH_ALL_FOR_USER);
		}else{
			searchConditions = new UserBookingSearchConditions(UserBookingSearchConditions.MODE.SEARCH_BY_EVENT_NAME_FOR_USER);
			searchConditions.setEventName(searchString);
		}
		searchConditions.setStatus(ITypeConstants.TYPE_USER_EVENT_STATUS_PAID);
		
		ServiceResponse<List<BookingSearchResult>> resultsResponse = 
				bookingService.searchBookings(new ServiceRequest<UserBookingSearchConditions>(searchConditions), getLoggedInUserDetails(), configProvider.getClientDetails());

		List<BookingSearchResult> bookings = resultsResponse.getTargetObject();
		List<BookingSearchResult> paginatedBookings =  new ArrayList<BookingSearchResult>();
		
		int pageNum = SimpleUtils.intVal(pageNumber);
		if(pageNum == 0)pageNum = 1;
		int startIndex = (pageNum - 1) * pagesize;
		int endIndex = pageNum * pagesize;
		
		if(startIndex < bookings.size() && startIndex >=0 ){
			endIndex =  endIndex < bookings.size() ? endIndex : bookings.size();
			paginatedBookings.addAll(bookings.subList(startIndex, endIndex));
		}
		
		for(BookingSearchResult booking : paginatedBookings){
			ServiceResponse<Event> event = 
					eventService.getEventDetails(new ServiceRequest<Long>(booking.getEventId()), getLoggedInUserDetails(), configProvider.getClientDetails());
			booking.setEvent(event.getTargetObject());
		}
		mv.addObject("bookings",paginatedBookings);
		mv.addObject("nextPage",paginatedBookings.size() == pagesize);
		
		return mv;
	}
	
	@RequestMapping(value= "managed/{bookingId}/receipt",method = RequestMethod.GET)
	public ResponseEntity<byte[]> printReceipt(@PathVariable(value = "bookingId") long bookingId) throws Exception {
		ServiceResponse<String> resultsResponse = 
				bookingService.getReceiptHTML(new ServiceRequest<Long>(bookingId), getLoggedInUserDetails(), configProvider.getClientDetails());
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.TEXT_HTML);
	    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

	    ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(resultsResponse.getTargetObject().getBytes(), headers, HttpStatus.OK);
	    return response;	
	 }
	
}
