package com.anucana.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.value.objects.PaymentResponse;
import com.anucana.value.objects.UserBooking;

/**
 * Controller to manage the bookings, payments, receipt print flows 
 * 
 */
@Controller
@RequestMapping(value="/booking/**")
public class BookingController extends AccessController{

	/**
	 * Receives and processes the payment from the payment gateway in case of payment success
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value= "unmanaged/payment/success",method = RequestMethod.POST)
	public ModelAndView paymentSuccess(PaymentResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		// 1. Verifies the data it received the from payment gateway ( by matching the hash, transaction id and user id from its own records )
		// 2. Creates user event record, creates payement transaction record
		// 3. Shows user success on the book event page 
		// 4. or show appropriate error message if payment processing failed
		return mv;
	}
	
	/**
	 * Receives and processes the payment from the payment gateway in case of payment failure
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value= "unmanaged/payment/failue",method = RequestMethod.POST)
	public ModelAndView paymentFailue(PaymentResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		// 1. or show appropriate error message if payment processing failed
		return mv;
	}

	/**
	 * Handles payment cancellation from the user
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value= "unmanaged/payment/cancelled",method = RequestMethod.POST)
	public ModelAndView paymentCancelled(PaymentResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		// 1. or show appropriate error message if payment processing failed
		return mv;
	}
	
	/**
	 * ***************************************************************************************************************************************************************
	 * 															Managed URLs, they require user is logged in
	 * 				
	 * ***************************************************************************************************************************************************************
	 */
	
	
	@RequestMapping(value= "managed/bookEvent",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView bookEvent(UserBooking userBooking) throws Exception {
		// Event Id  must be present, so throw an exception if event id is not present or is invalid.
		// validate if event is not in past and has seats left
		// then forward to booking
		ModelAndView mv = new ModelAndView("bookEvent");
		mv.addObject(userBooking);
		return mv;
	}
	
	
	@RequestMapping(value= "managed/myBookings",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView showBookings() throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		return mv;
	}
	
	@RequestMapping(value= "managed/printReceipt",method = RequestMethod.GET)
	public ModelAndView printReceipt(long eventId) throws Exception {
		ModelAndView mv = new ModelAndView("bookEvent");
		return mv;
	}
	
}
