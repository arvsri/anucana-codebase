package com.anucana.web.advices;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceException;
import com.anucana.web.errors.AuthorizationException;

@ControllerAdvice
public class ExceptionHandlerAdvice {

	public static final String ERROR_MESSAGE_ATTR = "errormsg";
	
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ModelAndView handleSizeLimitExceeded(MaxUploadSizeExceededException ex){
		ModelAndView mv = new ModelAndView("genericError");
		mv.addObject(ERROR_MESSAGE_ATTR, "Maximum upload size of " + ex.getMaxUploadSize() /1000 + " KB exceeded");
		return mv;
	}

	@ExceptionHandler(AuthorizationException.class)
	public ModelAndView handleAuthorizationException(AuthorizationException ex) {
 		ModelAndView model = new ModelAndView("genericError");
 		model.addObject(ERROR_MESSAGE_ATTR, "You are not authorized to perform this operation!");
		return model;
	}

	@ExceptionHandler(ServiceException.class)
	public ModelAndView handleServiceException(ServiceException ex) {
 		ModelAndView model = new ModelAndView("genericError");
 		model.addObject(ERROR_MESSAGE_ATTR, "Error occured while performing the operation !");
		return model;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleGenericException(Exception ex) {
 		ModelAndView model = new ModelAndView("genericError");
 		model.addObject(ERROR_MESSAGE_ATTR, ex.getMessage());
		return model;
	}
	
}
