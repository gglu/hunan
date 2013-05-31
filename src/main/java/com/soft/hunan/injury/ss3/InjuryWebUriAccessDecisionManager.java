/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-6
 */
package com.soft.hunan.injury.ss3;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.vote.AbstractAccessDecisionManager;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.FilterInvocation;
import org.springframework.util.Assert;

/**
 * @author liwencheng
 *
 */
public class InjuryWebUriAccessDecisionManager extends AbstractAccessDecisionManager {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private String SUPER_ADMIN = "admin";
	
	private String superAdmin = SUPER_ADMIN;//超级账号，如果为该账号，我们就认为TA可以访问系统内所有资源
	public String getSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(String superAdmin) {
		this.superAdmin = superAdmin;
	}

	@Override
	public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
		
		//检查是否是超级管理员
		if(superAdminCheck(authentication))
			return;
		// TODO Auto-generated method stub,这里我们将使用{@link org.springframework.security.core.authority.SimpleGrantedAuthority}
		Collection<GrantedAuthority> grantedAuthorities = (Collection<GrantedAuthority>) authentication.getAuthorities();
		//判断当前用户拥有的权限（grantedAuthorities）是否与资源授权访问的角色列表（configAttributes）有交集，如果有则允许访问，否则不允许访问
		if(!intersect(grantedAuthorities,configAttributes)){
			logger.error("当前用户({})由于权限不足，被权限模块阻断对资源({})的访问！！！",authentication.getPrincipal(),getSecureResource(object));
			throw new AccessDeniedException("当前用户权限不足！！！请联系系统管理员。。。");
		}
	}

	protected Object getSecureResource(Object object) {
		// TODO Auto-generated method stub
		FilterInvocation fi = (FilterInvocation) object;
		
		String soidentifier = fi.getRequestUrl();
		
		logger.debug("sb has accessed the secure method : {}",soidentifier);
		
		return soidentifier;
	}
	private boolean superAdminCheck(Authentication authentication) throws InsufficientAuthenticationException {
		// TODO Auto-generated method stub
		if(!authentication.isAuthenticated()){
			throw new InsufficientAuthenticationException("未认证！！！");
		}
		
		String username = null;
		if (isInstanceOfUserDetails(authentication)) {
			username = ((UserDetails) authentication.getPrincipal()).getUsername();
		} else {
			username = authentication.getPrincipal().toString();
		}
		return null != username && username.equals(superAdmin);
	}
	
	private boolean isInstanceOfUserDetails(Authentication authentication) {
		return authentication.getPrincipal() instanceof UserDetails;
	}
	
	/**
	 * 
	 * @param grantedAuthorities 当前用户所拥有的全部角色
	 * @param configAttributes 当前受保护资源已授权访问的全部角色
	 * @return 如果二者角色集合都同时拥有至少一个角色，则认为是可以访问该受保护资源的！！！ 返回true，否则false
	 */
	private boolean intersect(Collection<GrantedAuthority> grantedAuthorities,
			Collection<ConfigAttribute> configAttributes) {

		//该用户未赋予任何角色，我们认为他不能访问任何受保护的资源！！！、
		if(grantedAuthorities == null || grantedAuthorities.isEmpty())
			return false;
		
		//如果该资源未赋予任何角色对其进行访问，则我们认为该资源不能被访问！！这可能会带来问题，毕竟我们并不需要一个不被任何人访问的资源
		if(configAttributes == null || configAttributes.isEmpty())
			return false;
		
		for(GrantedAuthority ga : grantedAuthorities){
			for(ConfigAttribute ca : configAttributes){
				//这里我将忽略角色名称的大小写，这在使用英文的角色名称(对大小写敏感的语言)时，应予以重视！！！
				if(ga.getAuthority().equalsIgnoreCase(ca.getAttribute())){
//				if(ga.getAuthority().equals(ca.getAttribute())){
					logger.debug("congratulations！！！you can access the protected secure source！！！");
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return FilterInvocation.class.isAssignableFrom(clazz);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		Assert.notNull(this.messages, "A message source must be set");
	}

	
}

