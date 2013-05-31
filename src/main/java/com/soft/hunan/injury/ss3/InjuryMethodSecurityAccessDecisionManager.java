/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-6
 */
package com.soft.hunan.injury.ss3;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.BridgeMethodResolver;
import org.springframework.util.ClassUtils;

/**
 * @author liwencheng
 *
 */
public class InjuryMethodSecurityAccessDecisionManager extends InjuryWebUriAccessDecisionManager {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return MethodInvocation.class.isAssignableFrom(clazz);
	}

	@Override
	protected Object getSecureResource(Object object) {
		// TODO Auto-generated method stub
		MethodInvocation invocation = (MethodInvocation) object;
		
		Class<?> userClass = ClassUtils.getUserClass(invocation.getThis().getClass());
		Method specificMethod = ClassUtils.getMostSpecificMethod(invocation.getMethod(), userClass);
		specificMethod = BridgeMethodResolver.findBridgedMethod(specificMethod);
		
		String soidentifier = new StringBuilder(userClass.getName()).append("->").append(specificMethod.getName()).toString();
		
		logger.debug("sb has accessed the secure method : {}",soidentifier);
		
		return soidentifier;
		
		
	}

	
}

