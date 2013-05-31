/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-18
 */
package com.soft.hunan.injury.ss3.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author liwencheng
 *
 */
public class InjuryCurrentUserTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3665015634660881805L;
	private String loginpage;
	public void setLoginpage(String loginPage) {
		this.loginpage = loginPage;
	}


	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		try {
			if(null == authentication || !authentication.isAuthenticated()){
				pageContext.getOut().write("<a href='"+loginpage+"' >您还未登录</a>");
			}else{
				String username = retrieveName(authentication);
				pageContext.getOut().write(username);
			}
		} catch (IOException e) {
			throw new JspException(e);
		}
		return super.doStartTag();
	}


	private String retrieveName(Authentication authentication) {
		// TODO Auto-generated method stub
		Object currentUser = authentication.getPrincipal();
		if(String.class.isAssignableFrom(currentUser.getClass()))
			return (String) currentUser;
		if(UserDetails.class.isAssignableFrom(currentUser.getClass()))
			return ((UserDetails)currentUser).getUsername();
		return currentUser.toString();
	}
}

