package com.anucana.services;

import java.util.Collection;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import com.anucana.value.objects.TypeGroup;

public interface IUtilityService {
	
	ShaPasswordEncoder urlKeyEncoder = new ShaPasswordEncoder(256);
	
	Collection<TypeGroup.Type> getTypesByGroup(String groupCode);

}
