package com.anucana.persistence.dao;

import com.anucana.persistence.entities.TypeGroupEntity;
import com.anucana.persistence.entities.TypeTableEntity;

public interface TypeDAO extends GenericDAO<TypeGroupEntity>{

	TypeGroupEntity findByGroupCode(String groupCode);
	
	TypeTableEntity findByTypeCode(String typeCode);
	
}
