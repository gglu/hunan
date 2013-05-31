/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.ss3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.service.permission.IRoleService;
import com.soft.hunan.injury.service.permission.IUserService;

/**
 * @author liwencheng
 * 
 */
public class InjuryUserDetailService implements UserDetailsService {


	@Autowired
	private IUserService userService;// 仅仅做查询，因此可以不考虑事务问题
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@Autowired
	private IRoleService roleService;
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserInfo user = userService.findUserByAccount(account);
		
		return populateMember(user);
	}

	private UserDetails populateMember(UserInfo user) {
		// TODO Auto-generated method stub
		if(null ==user )
			throw new UsernameNotFoundException("您提供的信息有误，请检查确认后登录！！！");
		
		InjuryUserDetails zcud = new InjuryUserDetails(user);
		//查找该会员所有角色(已激活角色{@link Hrz91Role})
		List<SimpleGrantedAuthority> sgaes = roleService.findAuthorities4User(user.getId());
		zcud.setAuthorities(sgaes);
		
		return zcud;
	}

}
