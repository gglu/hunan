/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-6
 */
package com.soft.hunan.injury.ss3;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.method.AbstractMethodSecurityMetadataSource;

import com.soft.hunan.injury.service.permission.IRoleService;
import com.soft.hunan.injury.ss3.method.matcher.MethodMatcher;

/**
 * @author liwencheng
 *
 * 实现业务方法上的权限判断数据源
 */
public class InjuryMethodSecurityMetadataSource extends AbstractMethodSecurityMetadataSource{

	private List<MethodMatcher> methodMatchers;
	public void setMethodMatchers(List<MethodMatcher> methodMatchers) {
		this.methodMatchers = methodMatchers;
	}

	@Autowired
	private IRoleService roleService;
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		// TODO Auto-generated method stub
		return roleService.findAllAuthorities();
	}

	@Override
	public Collection<ConfigAttribute> getAttributes(Method method, Class<?> targetClass) {
		// TODO Auto-generated method stub
		if(!doMatch(method,targetClass))
			return null;
		System.out.println("获取SecuritySource FOR "+targetClass.getName()+"-->"+method.getName());
		return roleService.findConfigAttributes4Method(method,targetClass);
	}

	private boolean doMatch(Method method, Class<?> targetClass) {
		// TODO Auto-generated method stub
		if(methodMatchers == null || methodMatchers.isEmpty())
			return true;
		
		for(MethodMatcher mm : methodMatchers)
			if(mm.match(targetClass, method))
				return true;
		
		return false;
	}

	
}

