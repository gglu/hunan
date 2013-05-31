/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-6
 */
package com.soft.hunan.injury.ss3;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.soft.hunan.injury.service.permission.IResourceService;
import com.soft.hunan.injury.service.permission.IRoleService;

/**
 * @author liwencheng
 *
 */
public class InjuryWebUriSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

	@Autowired
	private IResourceService resourceService;
	public void setResourceService(IResourceService resourceService) {
		this.resourceService = resourceService;
	}

	@Autowired
	private IRoleService roleService;
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
	
	private boolean includeContextPath;//在匹配请求路径时，是否包含当前应用上下文的路径去匹配
	public boolean isIncludeContextPath() {
		return includeContextPath;
	}

	public void setIncludeContextPath(boolean includeContextPath) {
		this.includeContextPath = includeContextPath;
	}

	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		FilterInvocation fi = (FilterInvocation) object;

		String url = fi.getRequestUrl();
		if(includeContextPath){
			url = fi.getHttpRequest().getContextPath()+url;
		}
		List<ConfigAttribute> sgaes = resourceService.findAuthorities4Resource(fi.getRequestUrl());
		
		return sgaes;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		// TODO Auto-generated method stub
		//这里是查询出系统里所有角色信息;这里返回null也可以，因为我们的accessdecisionmanger.support()--->return true!!!
		List<ConfigAttribute> sgaes = (List<ConfigAttribute>) roleService.findAllAuthorities();
		
		return sgaes;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return FilterInvocation.class.isAssignableFrom(clazz);
	}

}

