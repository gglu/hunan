/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service;

import org.springframework.transaction.annotation.Transactional;

import com.soft.hunan.injury.dao.InjuryBaseDao;

/**
 * @author liwencheng
 * 
 */
public abstract class InjuryBaseService<T> implements IInjuryBaseService<T> {

	public abstract InjuryBaseDao<T> obtainDao();
	
	@Override
	@Transactional
	public T save(T entity) {
		// TODO Auto-generated method stub
		return obtainDao().save(entity);
	}

	@Override
	@Transactional
	public T update(T entity) {
		// TODO Auto-generated method stub
		return obtainDao().update(entity);
	}

	@Override
	@Transactional
	public T remove(T entity) {
		// TODO Auto-generated method stub
		return obtainDao().remove(entity);
	}

	
	
}
