package com.anucana.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import com.anucana.client.data.IClientDetails;
import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.AddressDAO;
import com.anucana.persistence.dao.PostalCodeDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.AddressEntity;
import com.anucana.persistence.entities.PostalCodeEntity;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceRequest.SERVICE_HINT;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.LocalCollectionUtils;
import com.anucana.utils.SpringUtil;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
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
	private AddressDAO addressDao; 
	@Autowired
	private PostalCodeDAO postalCodeDAO ;
	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	@Autowired
	private IMultimediaService multimediaService;
	
	private static final String MASKING_STRING = "XXXXXXXXX";
	
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
		// No masking if client is viewing his / her own profile
		if(userDetails != null && userDetails.getUserId() == userProfile.getUserId()){
			return;
		}
		
		// mask email address if user is not logged in and profile access is not all. Or if user is logged in but email access is none
		if((userDetails == null && !ITypeConstants.TYPE_PROFILE_ACCESS_ALL.equals(userProfile.getEmailAccess()))
				|| (userDetails != null && ITypeConstants.TYPE_PROFILE_ACCESS_NONE.equals(userProfile.getEmailAccess()))){
			userProfile.setEmailId(MASKING_STRING);
		}

		// mask phone number if user is not logged in and profile access is not all. Or if user is logged in but phonenumber access is none
		if((userDetails == null && !ITypeConstants.TYPE_PROFILE_ACCESS_ALL.equals(userProfile.getPhonenumberAccess()))
				|| (userDetails != null && ITypeConstants.TYPE_PROFILE_ACCESS_NONE.equals(userProfile.getPhonenumberAccess()))){
			userProfile.setPhonenumber(MASKING_STRING);
		}

		// mask messenger if user is not logged in and profile access is not all. Or if user is logged in but messenger access is none
		if((userDetails == null && !ITypeConstants.TYPE_PROFILE_ACCESS_ALL.equals(userProfile.getMessengerAccess()))
				|| (userDetails != null && ITypeConstants.TYPE_PROFILE_ACCESS_NONE.equals(userProfile.getMessengerAccess()))){
			userProfile.setMessenger(MASKING_STRING);
			userProfile.setMessengerTypeDescription(MASKING_STRING);
		}

		// mask address if user is not logged in and profile access is not all. Or if user is logged in but addess access is none
		if((userDetails == null && !ITypeConstants.TYPE_PROFILE_ACCESS_ALL.equals(userProfile.getAddressAccess()))
				|| (userDetails != null && ITypeConstants.TYPE_PROFILE_ACCESS_NONE.equals(userProfile.getAddressAccess()))){
			userProfile.setAddressLine1(MASKING_STRING);
			userProfile.setAddressLine2(MASKING_STRING);
			userProfile.setPincodeId(MASKING_STRING);
			userProfile.setAddressDescription(MASKING_STRING);
		}
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

		if(user.getUserPrimaryInfo().getAddress() != null){
			userProfile.setAddressLine1(user.getUserPrimaryInfo().getAddress().getAddressLine1());
			userProfile.setAddressLine2(user.getUserPrimaryInfo().getAddress().getAddressLine2());
			
			if(user.getUserPrimaryInfo().getAddress().getPostalCode() != null){
				userProfile.setPincodeId(user.getUserPrimaryInfo().getAddress().getPostalCode().getId().toString());
			}
			
			// build address description for ui
			StringBuilder addDesc = new StringBuilder("");
			if(StringUtils.isNotBlank(user.getUserPrimaryInfo().getAddress().getAddressLine1())){
				addDesc.append(user.getUserPrimaryInfo().getAddress().getAddressLine1());
			}
			if(StringUtils.isNotBlank(user.getUserPrimaryInfo().getAddress().getAddressLine2())){
				if(addDesc.length() > 1){
					addDesc.append(", ");
				}
				addDesc.append(user.getUserPrimaryInfo().getAddress().getAddressLine2());
			}
			
			PostalCodeEntity postalCode = user.getUserPrimaryInfo().getAddress().getPostalCode(); 
			if( postalCode != null){
				if(addDesc.length() > 1){
					addDesc.append(", ");
				}
				addDesc.append(postalCode.getDistrict()).append(", ");
				addDesc.append(postalCode.getCountry().getTypeDescription()).append(", ");
				
				userProfile.setPinCode(postalCode.getPostalCd().toString());
				userProfile.setPincodeIdDescription(postalCode.getOffice() + ", " + postalCode.getDistrict() + ", " + postalCode.getDistrict());
			}
			userProfile.setAddressDescription(addDesc.toString());
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
			userProfile.setMessengerTypeDescription(user.getUserPrimaryInfo().getMessengerType().getTypeDescription());
		}
		
		if(user.getUserPrimaryInfo().getMessengerAccess() != null){
			userProfile.setMessengerAccess(user.getUserPrimaryInfo().getMessengerAccess().getTypeCode());
		}
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
				// except first name and last name, every other field is nullable. So, ignore validation if null
				// extremely careful here with this logic. If it messes up, all validations would got for a toss
				if(!("firstName".equalsIgnoreCase(changedProperty) || "lastName".equals(changedProperty)) 
						&& StringUtils.isBlank(changedFieldsMap.get(changedProperty).toString())){
					continue;
				}
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
		AddressEntity addressEntity = user.getUserPrimaryInfo().getAddress();

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
			}else if("pincodeId".equals(changedProperty) && StringUtils.isNotBlank(profile.getPincodeId())){
				if(addressEntity == null){
					addressEntity = new AddressEntity();
				}
				addressEntity.setPostalCode(postalCodeDAO.findById(Long.valueOf(profile.getPincodeId())));
			}else if("addressLine1".equals(changedProperty)){
				if(addressEntity == null){
					addressEntity= new AddressEntity();
				}
				addressEntity.setAddressLine1(profile.getAddressLine1());
			}else if("addressLine2".equals(changedProperty)){
				if(addressEntity == null){
					addressEntity = new AddressEntity();
				}
				addressEntity.setAddressLine2(profile.getAddressLine2());
			}else if("addressAccess".equals(changedProperty)){
				user.getUserPrimaryInfo().setAddressAccess(typeDao.findByTypeCode(profile.getAddressAccess()));
			}else if("emailId".equals(changedProperty)){
				user.getUserPrimaryInfo().setEmail(profile.getEmailId());
			}else if("emailAccess".equals(changedProperty)){
				user.getUserPrimaryInfo().setEmailAccess(typeDao.findByTypeCode(profile.getEmailAccess()));
			}else if("phonenumber".equals(changedProperty)){
				user.getUserPrimaryInfo().setPhoneNumber(profile.getPhonenumber());
			}else if("phoneType".equals(changedProperty)){
				user.getUserPrimaryInfo().setPhoneType(typeDao.findByTypeCode(profile.getPhoneType()));
			}else if("phonenumberAccess".equals(changedProperty)){
				user.getUserPrimaryInfo().setPhoneNumberAccess(typeDao.findByTypeCode(profile.getPhonenumberAccess()));
			}else if("messenger".equals(changedProperty)){
				user.getUserPrimaryInfo().setMessenger(profile.getMessenger());
			}else if("messengerType".equals(changedProperty)){
				user.getUserPrimaryInfo().setMessengerType(typeDao.findByTypeCode(profile.getMessengerType()));
			}else if("messengerAccess".equals(changedProperty)){
				user.getUserPrimaryInfo().setMessengerAccess(typeDao.findByTypeCode(profile.getMessengerAccess()));
			}
		}
		
		stampAuditDetails(user, userDetails);
		stampAuditDetails(user.getUserProfileInfo(), userDetails);
		stampAuditDetails(user.getUserPrimaryInfo(), userDetails);
		// save the address entity
		if(addressEntity != null){
			addressDao.save(addressEntity);
			user.getUserPrimaryInfo().setAddress(addressEntity);
		}
		loginDao.save(user);
	}
}
