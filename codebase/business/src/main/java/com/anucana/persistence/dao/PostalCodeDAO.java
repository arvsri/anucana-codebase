package com.anucana.persistence.dao;

import java.util.Collection;

import com.anucana.persistence.entities.PostalCodeEntity;


public interface PostalCodeDAO extends GenericDAO<PostalCodeEntity> {

	Collection<PostalCodeEntity> findAllByPostalCode(Integer postalCode);
	
}
