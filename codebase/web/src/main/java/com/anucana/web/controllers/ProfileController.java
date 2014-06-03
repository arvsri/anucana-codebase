package com.anucana.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.UserLogin;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Controls all the user flows related with profile
 * 
 * @author asrivastava
 * @since Jan 4, 2014
 */
@Controller
@RequestMapping(value="/profile/**")
public class ProfileController {

	@Autowired
	private ILoginService loginService;
	
    @Autowired
    private IWebConfigsProvider configProvider;
    
    /**
     * ************************************************************************************************************************************** 
     * 												Unmanaged / public facing URL handlers
     * **************************************************************************************************************************************
     */
	@RequestMapping(value= "unmanaged/{id}",method = RequestMethod.GET)
	public ModelAndView showUserProfile(@ PathVariable("id") long userId) throws Exception{
		if(isUserLoggedIn(userId)){
			return new ModelAndView("redirect:/managed");
		}
		return getProfileDetails(userId, null);
	}
    

	/**
     * ************************************************************************************************************************************** 
     * 												Managed / authenticated URL handlers
     * **************************************************************************************************************************************
     */
	@RequestMapping(value= "managed",method = RequestMethod.GET)
	public ModelAndView showUserProfile() throws Exception{
		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return getProfileDetails(userDetails.getUserId(), userDetails);
	}


    private boolean isUserLoggedIn(long userId) {
    	if(SecurityContextHolder.getContext().getAuthentication() != null && SecurityContextHolder.getContext().getAuthentication().getPrincipal() != null){
    		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    		return userDetails.getUserId() == userId;
    	}
		return false;
	}
	
	private ModelAndView getProfileDetails(long loginNumber,IUserDetails userDetails) throws ServiceException {
		ModelAndView mv = new ModelAndView("profile");
		ServiceResponse<UserLogin> response = loginService.getUserByUserId(new ServiceRequest<Long>(loginNumber), userDetails, configProvider.getClientDetails());
		mv.addObject(response.getTargetObject());
		return mv;
	}

}
