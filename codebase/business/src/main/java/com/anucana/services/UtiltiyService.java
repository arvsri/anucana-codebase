package com.anucana.services;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.entities.TypeGroupEntity;
import com.anucana.persistence.entities.TypeTableEntity;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.value.objects.TypeGroup.Type;

@Component
public class UtiltiyService implements IUtilityService {

	@Autowired
	private TypeDAO typeDAO ;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	@Override
    public ServiceResponse<Collection<Type>> getTypesByGroup(ServiceRequest<String> request) {
        TypeGroupEntity groupEntity = typeDAO.findByGroupCode(request.getTargetObject());
        if (groupEntity == null || CollectionUtils.isEmpty(groupEntity.getTypeCodes())) {
            return null;
        }

        Collection<Type> types = new ArrayList<Type>();
        for (TypeTableEntity typeTable : groupEntity.getTypeCodes()) {
            types.add(new Type(typeTable.getTypeCode(), typeTable.getTypeDescription()));
        }
        return new ServiceResponse<Collection<Type>>(types);
    }
}
