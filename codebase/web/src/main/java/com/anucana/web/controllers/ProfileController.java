package com.anucana.web.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ILoginService;
import com.anucana.services.IUserDetailsService;
import com.anucana.user.data.IUserDetails;
import com.anucana.value.objects.UserLogin;
import com.anucana.value.objects.UserPrimaryInfo;
import com.anucana.value.objects.UserProfileInfo;
import com.anucana.web.common.IWebConfigsProvider;
import com.anucana.web.user.data.WebUserDetails;

/**
 * Controls all the user flows related with profile
 * 
 * @author asrivastava
 * @since Jan 4, 2014
 */
@Controller
@RequestMapping(value="/managed/profile/**")
public class ProfileController {

	@Autowired
	private IUserDetailsService userInfoService;
	
	@Autowired
	private ILoginService loginService;
	
    @Autowired
    private IWebConfigsProvider configProvider;
	
	@RequestMapping(value= "/edit/{id}",method = RequestMethod.GET)
	public ModelAndView showUserProfile(@ PathVariable("id") long loginNumber) throws Exception{
		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		ModelAndView mv = new ModelAndView("profile");
		ServiceResponse<UserLogin> response = loginService.getUserByUserId(new ServiceRequest<Long>(loginNumber), userDetails, configProvider.getClientDetails());
		mv.addObject(response.getTargetObject());
		return mv;
	}

	@RequestMapping(value= "/{id}",method = RequestMethod.POST,params = "updateUserName")
	@ResponseBody
	public Object update(@ PathVariable("id") long loginNumber, UserLogin userLogin) throws Exception{
//		if(isAuthenticated(loginNumber)){
//			if(StringUtils.isBlank(userLogin.getFirstName()) || StringUtils.isBlank(userLogin.getLastName())){
//				userLogin.setInError(true);
//				userLogin.setErrorMessages("First or Last name can not be empty !");
//				return userLogin;
//			}
//			loginService.updateName(loginNumber, userLogin.getFirstName(), userLogin.getLastName());
//			updatePrincipal(userLogin.getFirstName(), userLogin.getLastName());
//			userLogin.setViewRefresh(true);
//		}else{
//			userLogin.setInError(true);
//			userLogin.setErrorMessages("User could not be authenticated !");
//		}
		return userLogin;
	}
	
	@RequestMapping(value= "/{id}",method = RequestMethod.POST,params = "updatePrimaryInfo")
	@ResponseBody
	public Object update(@ PathVariable("id") long loginNumber,@RequestParam("updatePrimaryInfo") String updateType, UserPrimaryInfo request) throws Exception{
//		if(isAuthenticated(loginNumber)){
//			
//			UserPrimaryInfo primaryInfo = setPrimaryInfo(loginNumber, updateType, request);
//			if(primaryInfo == null){
//				request.setInError(true);
//				request.setErrorMessages("Unidentified updated type !");
//				return request;
//			}
//			userInfoService.updatePrimaryInfo(loginNumber, primaryInfo);
//
//		}else{
//			request.setInError(true);
//			request.setErrorMessages("User could not be authenticated !");
//		}
		return request;
	}

	@RequestMapping(value= "/{id}",method = RequestMethod.POST,params = "updateProfile")
	@ResponseBody
	public Object update(@ PathVariable("id") long loginNumber,@RequestParam("updateProfile") String updateType, UserProfileInfo request) throws Exception{
//		if(isAuthenticated(loginNumber)){
//			UserProfileInfo profileInfo = setProfileInfo(loginNumber, updateType, request);
//			if(profileInfo == null){
//				request.setInError(true);
//				request.setErrorMessages("Unidentified updated type !");
//				return request;
//			}
//			
//			userInfoService.updateProfileInfo(loginNumber, profileInfo);
//			
//		}else{
//			request.setInError(true);
//			request.setErrorMessages("User could not be authenticated !");
//		}
		return request;
	}
	
//	@RequestMapping(value = "/{id}/image", method = RequestMethod.POST)
//	public String uploadProfileImage(@PathVariable("id") long loginNumber, @RequestParam(required=false) MultipartFile image,ModelMap model) throws Exception {
//		if (isAuthenticated(loginNumber)) {
//			
//			UserLogin userLogin = new UserLogin();
//			userLogin.setUserId(loginNumber);
//			userLogin = loginService.getUserDetails(userLogin);
//			
//			UserProfileInfo profileInfo = userInfoService.getProfileInfo(loginNumber);
//			UserPrimaryInfo primaryInfo = userInfoService.getPrimaryInfo(loginNumber);
//
//			BeanUtils.copyProperties(primaryInfo, profileInfo);
//			BeanUtils.copyProperties(userLogin, profileInfo);
//			
//			model.addAttribute(profileInfo);
//
//			if(imageService.validateImageFormat(image, model)){
//				imageService.saveImage(new ImageBucket.Builder(image).withUserInfo(userLogin).withModelMap(model).build());
//			}
//			
//			return "profile";
//		}
//		return "redirect:/";
//	}

	private UserPrimaryInfo setPrimaryInfo(long loginNumber, String updateType,UserPrimaryInfo request) {
		
		UserPrimaryInfo primaryInfo = userInfoService.getPrimaryInfo(loginNumber);
		if(StringUtils.isBlank(updateType)){
			return null;
		}else if(updateType.equals("updateEmail")){
			primaryInfo.setEmail(request.getEmail());
		}else if(updateType.equals("updatePhone")){
			primaryInfo.setPhone(request.getPhone());
			primaryInfo.setPhoneTypeCd(request.getPhoneTypeCd());
		}else if(updateType.equals("updateIM")){
			primaryInfo.setMessenger(request.getMessenger());
			primaryInfo.setMessengerTypeCd(request.getMessengerTypeCd());
		}else if(updateType.equals("updateAddress")){
			primaryInfo.setAddress(request.getAddress());
		}else{
			return null;
		}
		
		return primaryInfo;
	}

	
	private UserProfileInfo setProfileInfo(long loginNumber, String updateType,UserProfileInfo request) {
		UserProfileInfo profileInfo = userInfoService.getProfileInfo(loginNumber);
		if(StringUtils.isBlank(updateType)){
			return null;
		}else if(updateType.equals("updateProfileHeading")){
			profileInfo.setProfileHeading(request.getProfileHeading());
		}else if(updateType.equals("updateBasicIntro")){
			profileInfo.setCountryCd(request.getCountryCd());
			profileInfo.setAreaCd(request.getAreaCd());
			profileInfo.setIndustryCd(request.getIndustryCd());
		}else if(updateType.equals("updateAboutMe")){
			profileInfo.setSummary(request.getSummary());
		}else{
			return null;
		}
		
		return profileInfo;
	}
	
	
	/**
	 * @param loginNumber
	 * @return
	 */
	private boolean isAuthenticated(long loginNumber) {
		return SecurityContextHolder.getContext().getAuthentication() != null
				&& ((WebUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId() == loginNumber;
	}
	
	private void updatePrincipal(String firstName, String lastName) {
		WebUserDetails userDetails = ((WebUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		// TODO to be implemneted
	}
	
}
