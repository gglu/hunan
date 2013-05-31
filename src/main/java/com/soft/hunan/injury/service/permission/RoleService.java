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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.soft.hunan.injury.dao.InjuryBaseDao;
import com.soft.hunan.injury.dao.permission.IRoleDao;
import com.soft.hunan.injury.entity.permission.RoleInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.InjuryBaseService;

/**
 * @author liwencheng
 * 
 */

@Service("roleService")
public class RoleService extends InjuryBaseService<RoleInfo> implements IRoleService {
	
	@Autowired
	private IRoleDao roleDao;

	@Override
	public List<SimpleGrantedAuthority> findAuthorities4User(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ConfigAttribute> findConfigAttributes4Method(Method method, Class<?> targetClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ConfigAttribute> findAllAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findAllRoles(PageHelper<RoleInfo> page) {
		// TODO Auto-generated method stub
		roleDao.findAllRoles(page);
	}

	@Override
	public InjuryBaseDao<RoleInfo> obtainDao() {
		// TODO Auto-generated method stub
		return (InjuryBaseDao<RoleInfo>) roleDao;
	}

	@Override
	public Set<RoleInfo> roles4Assign(Long userid) {
		// TODO Auto-generated method stub
		return roleDao.roles4Assign(userid);
	}

	
}
