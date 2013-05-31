/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-24
 */
package com.soft.hunan.injury.ss3.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author liwencheng
 *
 */
public class IsUnAuthenticationTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2422392787072927066L;

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication == null || !authentication.isAuthenticated())
			return EVAL_BODY_INCLUDE;
		return SKIP_BODY;
	}
	
}

