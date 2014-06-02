package com.anucana.services;

import java.util.Date;

import com.anucana.persistence.dao.GenericDAO;
import com.anucana.persistence.entities.AuditEntity;
import com.anucana.persistence.entities.Identifiable;
import com.anucana.user.data.IUserDetails;

public abstract class AuditService {

	<T extends AuditEntity> void stampAuditDetails(T auditEntity, IUserDetails userDetails,GenericDAO<T> dao){
		if(auditEntity.getCreatedBy() == null || auditEntity.getCreationDate() == null){
			T reloadedAuditEntity = null;
			if(auditEntity instanceof Identifiable){
				reloadedAuditEntity = dao.findById((((Identifiable<?>)auditEntity).getId()));
			}
			
			if(reloadedAuditEntity != null){
				auditEntity.setCreatedBy(reloadedAuditEntity.getCreatedBy());
				auditEntity.setCreationDate(reloadedAuditEntity.getCreationDate());
			}else{
				auditEntity.setCreatedBy(userDetails.getUserId());
				auditEntity.setCreationDate(new Date());
			}
		}
		auditEntity.setLastUpdatedBy(userDetails.getUserId());
		auditEntity.setLastUpdateDate(new Date());
	}
	
	<T extends AuditEntity> void copyAuditDetails(T auditEntitySource, T auditEntityTarget){
		auditEntityTarget.setCreatedBy(auditEntitySource.getCreatedBy());
		auditEntityTarget.setLastUpdatedBy(auditEntitySource.getLastUpdatedBy());
		
		auditEntityTarget.setCreationDate(new Date());
		auditEntityTarget.setLastUpdateDate(new Date());
	}
	
}
