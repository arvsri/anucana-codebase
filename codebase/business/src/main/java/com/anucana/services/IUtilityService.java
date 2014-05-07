package com.anucana.services;

import java.util.Collection;

import com.anucana.value.objects.TypeGroup;

public interface IUtilityService {
	
	Collection<TypeGroup.Type> getTypesByGroup(String groupCode);

}
