package com.anucana.persistence.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class GenericDAOHibernate<T> implements GenericDAO<T>{

	private Class<T> persistentClass;
	private SessionFactory sessionFactory;	
	
	@SuppressWarnings("unchecked")
	public GenericDAOHibernate(SessionFactory sessionFactory) {
		this.persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T findById(Serializable id) {
		return (T) currentSession().load(getPersistentClass(),id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		Criteria crit = currentSession().createCriteria(getPersistentClass());
		return crit.list();
	}

	@Override
	public void save(T entity) {
		currentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		currentSession().delete(entity);
	}

	@Override
	public void flush() {
		currentSession().flush();
	}

	protected Session currentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	protected Class<T> getPersistentClass(){
		return this.persistentClass;
	}
	
}
