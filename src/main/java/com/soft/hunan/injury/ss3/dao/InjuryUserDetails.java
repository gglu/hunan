/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.ss3.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.soft.hunan.injury.entity.permission.UserInfo;

/**
 * @author liwencheng
 * 
 */
public class InjuryUserDetails implements UserDetails,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7609780812688148012L;
	private UserInfo user;
	InjuryUserDetails(UserInfo user){
		this.user = user;
	}
	
	public UserInfo getCurrentUser(){
		return user;
	}
	
	Collection<SimpleGrantedAuthority> sgaes = Collections.EMPTY_LIST;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return sgaes;
	}
	
	//这在我们之前某个地方已经约定了！！！，注意看下之前的代码！！！
	public void setAuthorities(Collection<? extends GrantedAuthority> gaes){
		this.sgaes = (Collection<SimpleGrantedAuthority>) gaes;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPwd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getAccount();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return isAccountNonLocked();
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return user.getLocked() == null || !user.getLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return isAccountNonLocked();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isAccountNonLocked();
	}

	private Object details;
	public Object getDetails(){
		return details;
	}

	public void setDetails(Object details) {
		// TODO Auto-generated method stub
		this.details = details;
	}
}
