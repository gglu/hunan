/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author liwencheng
 * 
 */
public abstract class InjuryBaseDao<T> extends HibernateDaoSupport{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@PostConstruct
	protected void initDao() throws Exception {
		// TODO Auto-generated method stub
		setHibernateTemplate(hibernateTemplate);
	}

	
	public T save(T entity){
		getHibernateTemplate().save(entity);
		return entity;
	}
	
	public T update(T entity){
		getHibernateTemplate().update(entity);
		return entity;
	}
	
	public T remove(T entity){
		getHibernateTemplate().delete(entity);
		return entity;
	}
	
}
