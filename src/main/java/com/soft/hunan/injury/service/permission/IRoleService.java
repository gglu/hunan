/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service.permission;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.soft.hunan.injury.entity.permission.RoleInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.IInjuryBaseService;

/**
 * @author liwencheng
 * 
 */
public interface IRoleService extends IInjuryBaseService<RoleInfo>{

	List<SimpleGrantedAuthority> findAuthorities4User(Long id);

	Collection<ConfigAttribute> findConfigAttributes4Method(Method method,Class<?> targetClass);

	Collection<ConfigAttribute> findAllAuthorities();

	void findAllRoles(PageHelper<RoleInfo> page);

	Set<RoleInfo> roles4Assign(Long userid);

	
}
