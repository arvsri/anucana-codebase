package com.anucana.persistence.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <T>{
	
	T findById(Serializable id);

	List<T> findAll();

	void save(T entity);
	
	void delete(T entity);
	
	void flush();
}
