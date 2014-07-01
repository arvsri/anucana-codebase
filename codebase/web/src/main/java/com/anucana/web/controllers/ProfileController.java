package com.anucana.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceRequest.SERVICE_HINT;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.IMultimediaService;
import com.anucana.services.IUserProfileService;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.ImageOps;
import com.anucana.value.objects.ImageOps.ImageCropCordinates;
import com.anucana.value.objects.UserProfile;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Controls all the user flows related with profile
 * 
 * @author asrivastava
 * @since Jan 4, 2014
 */
@Controller
@RequestMapping(value="/profile/**")
public class ProfileController extends AccessController{

	@Autowired
	private IUserProfileService profileServie;
    @Autowired
    private IWebConfigsProvider configProvider;
    @Autowired
    private IMultimediaService multimediaService;
    
    /**
     * ************************************************************************************************************************************** 
     * 												Unmanaged / public facing URL handlers
     * **************************************************************************************************************************************
     */
	@RequestMapping(value= {"unmanaged/{id}","managed/{id}"},method = RequestMethod.GET)
	public ModelAndView showUserProfile(@ PathVariable("id") long userId) throws Exception{
		if(isUserLoggedIn(userId)){
			return new ModelAndView("redirect:/profile/managed");
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

	
	@RequestMapping(value= "managed/imageUpload/{id}", method = RequestMethod.POST)
	public ModelAndView uploadProfileImage(@PathVariable("id") long userId,MultipartFile image) throws Exception{
		selfAuthorize(userId);

		ModelAndView mv = new ModelAndView("imageUpload");
		ImageOps imageOps = new ImageOps(ImageOps.BUCKET.PROFILE);
		imageOps.setImage(image);
		imageOps.setId(userId);
		
		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		ServiceResponse<ImageOps> response = multimediaService.saveImage(new ServiceRequest<ImageOps>(imageOps), userDetails, configProvider.getClientDetails());
		
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			return mv;
		}
		mv.addObject("imgURL",response.getTargetObject().getTimedImageURL());
		mv.addObject("isDummy",response.getTargetObject().isDummy());
		
		return mv;
	}
	
	@RequestMapping(value= "managed/imageUpload/{id}",params="imageCrop",method = RequestMethod.POST)
	public ModelAndView cropProfileImage(@PathVariable("id") long userId, ImageCropCordinates corpCoordinates) throws Exception{
		selfAuthorize(userId);

		ModelAndView mv = new ModelAndView("imageUpload");
		ImageOps imageOps = new ImageOps(ImageOps.BUCKET.PROFILE);
		imageOps.setCropCoordinates(corpCoordinates);
		imageOps.setId(userId);
		
		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		ServiceResponse<ImageOps> response = multimediaService.cropImage(new ServiceRequest<ImageOps>(imageOps), userDetails, configProvider.getClientDetails());
		
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			return mv;
		}
		mv.addObject("imgURL",response.getTargetObject().getTimedImageURL());
		mv.addObject("isDummy",response.getTargetObject().isDummy());
		
		return mv;
	}

	
	
	@RequestMapping(value= "managed/update/{id}",method = RequestMethod.POST)
	public ModelAndView update(@PathVariable("id") long userId, UserProfile profile, ModelMap modelMap) throws Exception{
		selfAuthorize(userId);

		ServiceRequest<UserProfile> request = new ServiceRequest<UserProfile>(profile);
		request.addServiceHint(SERVICE_HINT.SPECIFIC_FIELDS_MODIFIED, modelMap);
		ServiceResponse<UserProfile> response = profileServie.updateProfileInfo(request, getLoggedInUserDetails(), configProvider.getClientDetails());

		ModelAndView mv = new ModelAndView("profile");
		
		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			return mv;
		}
		
		return mv;
	}
	
	
	private ModelAndView getProfileDetails(long loginNumber,IUserDetails userDetails) throws ServiceException {
		ModelAndView mv = new ModelAndView("profile");
		ServiceResponse<UserProfile> response = profileServie.getProfileInfo(new ServiceRequest<Long>(loginNumber), userDetails, configProvider.getClientDetails());
		mv.addObject(response.getTargetObject());
		return mv;
	}

}
