package com.anucana.persistence.dao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anucana.persistence.entities.TypeGroupEntity;
import com.anucana.persistence.entities.TypeTableEntity;

@Repository
public class TypeDAOHibernate extends GenericDAOHibernate<TypeGroupEntity> implements TypeDAO {

	@Autowired
	public TypeDAOHibernate(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public TypeGroupEntity findByGroupCode(String groupCode) {
		Criteria criteria = currentSession().createCriteria(TypeGroupEntity.class).add(Restrictions.eq("groupCode", groupCode)).setFetchMode("typeCodes", FetchMode.SELECT);
		List<?> typeGroups = criteria.list();

		if (CollectionUtils.isNotEmpty(typeGroups)) {
			return (TypeGroupEntity) typeGroups.get(0);
		}
		return null;
	}

	@Override
	public TypeTableEntity findByTypeCode(String typeCode) {
		Criteria criteria = currentSession().createCriteria(TypeTableEntity.class).add(Restrictions.eq("typeCode", typeCode));
		List<?> types = criteria.list();

		if (CollectionUtils.isNotEmpty(types)) {
			return (TypeTableEntity) types.get(0);
		}
		return null;
	}

}
