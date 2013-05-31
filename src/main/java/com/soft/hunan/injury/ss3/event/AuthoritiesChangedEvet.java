/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-8
 */
package com.soft.hunan.injury.ss3.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author liwencheng
 *
 */
public class AuthoritiesChangedEvet extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4313494305577032370L;

	public AuthoritiesChangedEvet(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	//撤销的角色
	
	//新赋予的角色

}

