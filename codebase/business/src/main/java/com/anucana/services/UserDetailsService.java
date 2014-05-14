package com.anucana.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.persistence.entities.UserPrimaryInfoEntity;
import com.anucana.persistence.entities.UserProfileInfoEntity;
import com.anucana.value.objects.UserPrimaryInfo;
import com.anucana.value.objects.UserProfileInfo;

/**
 * Provides services related with user information - primary and profile 
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED)
public class UserDetailsService implements IUserDetailsService{

	/**
	 * the default serial verison uid
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public UserPrimaryInfo getPrimaryInfo(long loginNumber) {
		UserLoginEntity user = loginDao.findById(loginNumber);
		if(user != null){
			return copyValues(user, user.getUserPrimaryInfo());
		}
		return null;
	}
	
	private UserPrimaryInfo copyValues(UserLoginEntity user,UserPrimaryInfoEntity primaryInfo){
		UserPrimaryInfo primaryInfoVO = new UserPrimaryInfo();
		
		primaryInfoVO.setFirstName(user.getFirstName());
		primaryInfoVO.setLastName(user.getLastName());
		
		primaryInfoVO.setAddress(primaryInfo.getAddress());
		primaryInfoVO.setEmail(primaryInfo.getEmail());
		primaryInfoVO.setGender(primaryInfo.getGender());
		
		primaryInfoVO.setPhone(primaryInfo.getPhoneNumber());
		primaryInfoVO.setPhoneTypeCd(primaryInfo.getPhoneType() == null ? null :  primaryInfo.getPhoneType().getTypeCode());
		
		primaryInfoVO.setMessenger(primaryInfo.getMessenger());
		primaryInfoVO.setMessengerTypeCd(primaryInfo.getMessengerType() == null ? null :  primaryInfo.getMessengerType().getTypeCode());

		return primaryInfoVO;
	}

	private UserProfileInfo copyValues(UserLoginEntity user,UserProfileInfoEntity profileInfo){
		UserProfileInfo profileInfoVO = new UserProfileInfo();
		
		profileInfoVO.setProfileHeading(profileInfo.getProfileHeading());
		profileInfoVO.setSummary(profileInfo.getSummary());
		profileInfoVO.setAreaCd(profileInfo.getArea() == null ? null :  profileInfo.getArea().getTypeCode());
		profileInfoVO.setCountryCd(profileInfo.getCountry() == null ? null :  profileInfo.getCountry().getTypeCode());
		profileInfoVO.setIndustryCd(profileInfo.getIndustry() == null ? null :  profileInfo.getIndustry().getTypeCode());

		return profileInfoVO;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public UserProfileInfo getProfileInfo(long loginNumber) {
		UserLoginEntity user = loginDao.findById(loginNumber);
		if(user != null){
			return copyValues(user, user.getUserProfileInfo());
		}
		return null;
	}

	@Override
	public UserPrimaryInfo updatePrimaryInfo(long loginNumber,UserPrimaryInfo primaryInfo) {
		return null;
	}

	@Override
	public UserProfileInfo updateProfileInfo(long loginNumber,UserProfileInfo profileInfo) {
		return null;
	}
	
}
