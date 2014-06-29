package com.anucana.validation.implementations;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.anucana.persistence.dao.PasswordHistoryDAO;
import com.anucana.persistence.entities.PasswordHistoryEntity;
import com.anucana.validation.annotations.NotExistsFor;
import com.anucana.validation.annotations.SupportedExistsType;

public class NotExistsForValidator implements ConstraintValidator<NotExistsFor, Object> {

	private String property = null;
	private String forProperty = null;
	private SupportedExistsType type;

	@Autowired
	private PasswordHistoryDAO passwordHistoryDAO;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void initialize(NotExistsFor constraintAnnotation) {
		this.type = constraintAnnotation.value();
		this.property = constraintAnnotation.property();
		this.forProperty = constraintAnnotation.forProperty();
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		try {
			final Object val = BeanUtils.getProperty(obj, property);
			final Object key = BeanUtils.getProperty(obj, forProperty);
			
			if (SupportedExistsType.PASSWORD.equals(type)) {
				Long userId = Long.valueOf(key.toString());

				List<PasswordHistoryEntity> passwordHistories = passwordHistoryDAO.getOldPasswordsOfUser(userId);
				
				if(CollectionUtils.isNotEmpty(passwordHistories)){
					for(PasswordHistoryEntity passwordHistory : passwordHistories){
						if(passwordEncoder.matches(val.toString(), passwordHistory.getPassword())){
							return false;
						}
					}
				}
				return true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

}
