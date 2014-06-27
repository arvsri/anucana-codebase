package com.anucana.services;

import java.util.Collection;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.value.objects.TypeGroup;

public interface IUtilityService {
	
	ShaPasswordEncoder urlKeyEncoder = new ShaPasswordEncoder(256);
	
    ServiceResponse<Collection<TypeGroup.Type>> getTypesByGroup(ServiceRequest<String> request);

}
