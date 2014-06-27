package com.anucana.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.IMessageService;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.ContactUs;
import com.anucana.value.objects.UserLogin;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Controller for handling all URLs which are associated with very simple services to deserve a dedicated controller and URL doesn't fit with any specialized
 * pattern
 */
@Controller
public class MiscellaneousController extends AccessController {

    @Autowired
    private IWebConfigsProvider configProvider;


	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView showUserLoginHome() {
		ModelAndView mv = new ModelAndView("loginHome");
		mv.addObject(new UserLogin());
		return mv;
	}
	
	/**
	 ******************************************************************************************************************************************************************
	 *                                                     Contact Us 
	 *******************************************************************************************************************************************************************
	 */
	
    @Autowired
    private IMessageService messageService;
	
	@RequestMapping(value = { "/unmanaged/contactUs"}, method = RequestMethod.GET)
	public ModelAndView showContactUs() {
		ModelAndView mv = new ModelAndView("contactUs");
		mv.addObject(new ContactUs());
		return mv;
	}
	
    @RequestMapping(value = { "/unmanaged/contactUs" }, method = RequestMethod.POST)
    public ModelAndView saveContactUs(ContactUs contactUs) throws ServiceException {
        ModelAndView mv = new ModelAndView("contactUs");
        
        ServiceResponse<ContactUs> serviceResponse =
                messageService.saveContactUsMessage(new ServiceRequest<ContactUs>(contactUs), getLoggedInUserDetails(),
                        configProvider.getClientDetails());

        if (serviceResponse.getBindingResult().hasErrors()) {
            mv.addObject(SpringUtil.getVariableName(serviceResponse.getBindingResult()),serviceResponse.getBindingResult());
            return mv;
        }
        mv.addObject(serviceResponse.getTargetObject());
        return mv;
    }

}
