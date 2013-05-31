/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service;

/**
 * @author liwencheng
 * 
 */
public interface IInjuryBaseService<T> {

	T save(T entity);
	
	T update(T entity);
	
	T remove(T entity);
	
}
