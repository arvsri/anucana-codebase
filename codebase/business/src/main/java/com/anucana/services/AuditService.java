package com.anucana.services;

import java.util.Date;

import com.anucana.persistence.entities.AuditEntity;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.user.data.IUserDetails;

public abstract class AuditService {

	/**
	 * Stamps the audit details on the audit entity ( both - created by and updated by). It sets the details based on {@link IUserDetails}. 
	 * If {@link IUserDetails} is null - their either the created by and updated by can not be set - or id of the entity is copied in case its {@link UserLoginEntity} 
	 * 
	 * 
	 * @param auditEntity
	 * @param userDetails
	 * @param dao
	 */
	<T extends AuditEntity> void stampAuditDetails(T auditEntity, IUserDetails userDetails){
		if(auditEntity.getCreationDate() == null){
			auditEntity.setCreationDate(new Date());
		}
		if(auditEntity.getCreatedBy() == null){
			auditEntity.setCreatedBy(getUserId(auditEntity,userDetails));
		}
		auditEntity.setLastUpdateDate(new Date());
		auditEntity.setLastUpdatedBy(getUserId(auditEntity,userDetails));
	}

	private <T>  Long getUserId(T auditEntity,IUserDetails userDetails) {
		if(userDetails != null){
			return userDetails.getUserId();
		}
		if(auditEntity instanceof UserLoginEntity){
			return ((UserLoginEntity)auditEntity).getId();
		}
		return null;
	}
	
	/**
	 * Copies the details from source entity to destination entity
	 * @param auditEntitySource
	 * @param auditEntityTarget
	 */
	<T extends AuditEntity> void copyAuditDetails(T auditEntitySource, T auditEntityTarget){
		if(auditEntitySource instanceof UserLoginEntity){
			UserLoginEntity user = (UserLoginEntity)auditEntitySource;
			auditEntityTarget.setCreatedBy(user.getId());
			auditEntityTarget.setLastUpdatedBy(user.getId());
		}else{
			auditEntityTarget.setCreatedBy(auditEntitySource.getCreatedBy());
			auditEntityTarget.setLastUpdatedBy(auditEntitySource.getLastUpdatedBy());
		}
		
		auditEntityTarget.setCreationDate(new Date());
		auditEntityTarget.setLastUpdateDate(new Date());
	}
	
	
	
}
