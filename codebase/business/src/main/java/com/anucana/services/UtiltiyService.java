package com.anucana.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.constants.ITypeConstants;
import com.anucana.persistence.dao.PostalCodeDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.entities.PostalCodeEntity;
import com.anucana.persistence.entities.TypeGroupEntity;
import com.anucana.persistence.entities.TypeTableEntity;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.value.objects.PostalCode;
import com.anucana.value.objects.TypeGroup.Type;

@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class UtiltiyService implements IUtilityService {

	@Autowired
	private TypeDAO typeDAO ;
	@Autowired
	private PostalCodeDAO postalCodeDAO ;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	@Override
    public ServiceResponse<Collection<Type>> getTypesByGroup(ServiceRequest<String> request) {
        TypeGroupEntity groupEntity = typeDAO.findByGroupCode(request.getTargetObject());
        if (groupEntity == null || CollectionUtils.isEmpty(groupEntity.getTypeCodes())) {
            return null;
        }

        Collection<Type> types = new ArrayList<Type>();
        for (TypeTableEntity typeTable : groupEntity.getTypeCodes()) {
        	if(ITypeConstants.TYPE_STATUS_CD_ACT.equals(typeTable.getStatusCode().getTypeCode())){
                types.add(new Type(typeTable.getTypeCode(), typeTable.getTypeDescription()));
        	}
        }
        return new ServiceResponse<Collection<Type>>(types);
    }
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	@Override
    public ServiceResponse<Collection<PostalCode>> getPostalCodes(ServiceRequest<Integer> request) {
		Collection<PostalCodeEntity> postalCodes = postalCodeDAO.findAllByPostalCode(request.getTargetObject());
		List<PostalCode> postalCodeVOs = new ArrayList<PostalCode>();
		if(CollectionUtils.isNotEmpty(postalCodes)){
			for(PostalCodeEntity pc : postalCodes){
				postalCodeVOs.add(new PostalCode(pc.getId(), pc.getPostalCd(), pc.getCountry().getTypeDescription(), pc.getState(), pc.getDistrict(), pc.getOffice()));
			}
		}
		return new ServiceResponse<Collection<PostalCode>>(postalCodeVOs);
    }
	
}
