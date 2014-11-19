package com.anucana.web.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.anucana.service.contracts.ServiceException;
import com.anucana.services.IBookingService;


public class WebScheduledJobs {
	
	private static final Logger LOG = LoggerFactory.getLogger(WebScheduledJobs.class);
	
	@Autowired
	private IBookingService bookingService;

	public void everyMinuteSchedule(){
		try {
			bookingService.cancelTimedOutPayments(null, null, null);
		} catch (ServiceException e) {
			LOG.error("Error occured in cancel timed out payments --- ", e);
		}
	}
	
}
