package com.anucana.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import com.anucana.client.data.IClientDetails;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceRequest.SERVICE_HINT;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.LocalCollectionUtils;
import com.anucana.utils.SpringUtil;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.Address;
import com.anucana.value.objects.ImageOps;
import com.anucana.value.objects.UserProfile;

/**
 * Provides services related with user information - primary and profile 
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class UserProfileService extends AuditService implements IUserProfileService{

	/**
	 * the default serial verison uid
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	@Autowired
	private TypeDAO typeDao; 
	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	@Autowired
	private IMultimediaService multimediaService;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ServiceResponse<UserProfile> getProfileInfo(ServiceRequest<Long> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		try{
			UserLoginEntity user = loginDao.findById(request.getTargetObject());
			if(user != null && user.isUserActive()){
				UserProfile userProfile = new UserProfile();
				buildCompleteUserProfile(user,userProfile,userDetails,client);
				return new ServiceResponse<UserProfile>(userProfile,SpringUtil.getVariableName(userProfile));
			}else{
				throw new ServiceException(ServiceException.USER_ID_NOT_FOUND_EXCEPTION);
			}
		}catch(Exception ex){
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION,ex);
		}
	}

	private void buildCompleteUserProfile(UserLoginEntity user, UserProfile userProfile,IUserDetails userDetails,IClientDetails client) throws ServiceException {
		copyDBDetails(user, userProfile);
		addProfileImageURL(userProfile,userDetails,client);
		addCommuntiesImageURL(userProfile);
		maskPrimaryInformations(userProfile,userDetails);
	}

	private void addProfileImageURL(UserProfile userProfile,IUserDetails userDetails,IClientDetails client) throws ServiceException {
		ImageOps image = new ImageOps(ImageOps.BUCKET.PROFILE);
		image.setId(userProfile.getUserId());
		
		ServiceResponse<List<ImageOps>> res = multimediaService.getImages(new ServiceRequest<List<ImageOps>>(LocalCollectionUtils.addToNewList(image)), userDetails, client);
		
		userProfile.setProfileImageUrl(res.getTargetObject().get(0).getTimedImageURL());
		userProfile.setDummyImage(res.getTargetObject().get(0).isDummy());
	}

	private void addCommuntiesImageURL(UserProfile userProfile) {
		// TODO : Set communities to the profile information
	}
	
	private void maskPrimaryInformations(UserProfile userProfile,IUserDetails userDetails) {
		//TODO : to implement primary information masking
	}


	private void copyDBDetails(UserLoginEntity user, UserProfile userProfile) {
		userProfile.setUserId(user.getId());
		userProfile.setFirstName(user.getFirstName());
		userProfile.setLastName(user.getLastName());
		
		userProfile.setProfileHeading(user.getUserProfileInfo().getProfileHeading());
		if(user.getUserProfileInfo().getIndustry() != null){
			userProfile.setIndustryCd(user.getUserProfileInfo().getIndustry().getTypeCode());
			userProfile.setIndustryName(user.getUserProfileInfo().getIndustry().getTypeDescription());
		}

		userProfile.setSummary(user.getUserProfileInfo().getSummary());
		
		userProfile.setEmailId(user.getUserPrimaryInfo().getEmail());
		// TODO : Normalize access rules for primary information fields with user settings
		if(user.getUserPrimaryInfo().getEmailAccess() != null){
			userProfile.setEmailAccess(user.getUserPrimaryInfo().getEmailAccess().getTypeCode());
		}
		// TODO : Normalize Address and set it in profile info
		userProfile.setAddress(new Address());
        if (user.getUserPrimaryInfo().getAddress() != null) {
            userProfile.getAddress().setAddressLine1(user.getUserPrimaryInfo().getAddress().getAddressLine1());
        }
		if(user.getUserPrimaryInfo().getAddressAccess() != null){
			userProfile.setAddressAccess(user.getUserPrimaryInfo().getAddressAccess().getTypeCode());
		}

		userProfile.setGender(user.getUserPrimaryInfo().getGender());
		if(user.getUserPrimaryInfo().getGenderAccess() != null){
			userProfile.setGenderAccess(user.getUserPrimaryInfo().getGenderAccess().getTypeCode());
		}
		
		userProfile.setPhonenumber(user.getUserPrimaryInfo().getPhoneNumber());
		if(user.getUserPrimaryInfo().getPhoneType() != null){
			userProfile.setPhoneType(user.getUserPrimaryInfo().getPhoneType().getTypeCode());
		}
		if(user.getUserPrimaryInfo().getPhoneNumberAccess() != null){
			userProfile.setPhonenumberAccess(user.getUserPrimaryInfo().getPhoneNumberAccess().getTypeCode());
		}

		userProfile.setMessenger(user.getUserPrimaryInfo().getMessenger());
		if(user.getUserPrimaryInfo().getMessengerType() != null){
			userProfile.setMessengerType(user.getUserPrimaryInfo().getMessengerType().getTypeCode());	
		}
		
		if(user.getUserPrimaryInfo().getMessengerAccess() != null){
			userProfile.setMessengerAccess(user.getUserPrimaryInfo().getMessengerAccess().getTypeCode());
		}
		// TODO : Set communities to the profile information
	}

	@SuppressWarnings("unchecked")
	@Override
	public ServiceResponse<UserProfile> updateProfileInfo(ServiceRequest<UserProfile> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		UserProfile profile = request.getTargetObject();
		Map<String,Object> changedFieldsMap = (Map<String, Object>) request.getServiceHints(SERVICE_HINT.SPECIFIC_FIELDS_MODIFIED);
		
		BindingResult binding = request.getBindingResult();
		Set<String> changedProperties = changedFieldsMap.keySet();
		if(!changedProperties.isEmpty()){
			// validate each changed property
			for(String changedProperty : changedProperties){
				jsr303validator.validate(profile, changedProperty, binding, new Object[]{});
			}
			// if any property has error nothing to be done
			if(binding.hasErrors()){
				return request;
			}
			// if any property has errors, do not save any thing
			saveProperty(profile, changedProperties,userDetails);
		}
		
		return request;
	}

	private void saveProperty(UserProfile profile,Set<String> changedProperties, IUserDetails userDetails) {
		UserLoginEntity user = loginDao.findById(userDetails.getUserId());		
		
		for(String changedProperty : changedProperties){
			if("firstName".equalsIgnoreCase(changedProperty)){
				user.setFirstName(profile.getFirstName());
			}else if("lastName".equals(changedProperty)){
				user.setLastName(profile.getLastName());
			}else if("profileHeading".equals(changedProperty)){
				user.getUserProfileInfo().setProfileHeading(profile.getProfileHeading());
			}else if("industryCd".equals(changedProperty)){
				user.getUserProfileInfo().setIndustry(typeDao.findByTypeCode(profile.getIndustryCd()));
			}else if("summary".equals(changedProperty)){
				user.getUserProfileInfo().setSummary(profile.getSummary());
			}
		}
		stampAuditDetails(user, userDetails);
		stampAuditDetails(user.getUserProfileInfo(), userDetails);
		loginDao.save(user);
	}


}
