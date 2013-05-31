/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-11
 */
package com.soft.hunan.injury.ss3.tag;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.WebInvocationPrivilegeEvaluator;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author liwencheng
 *
 */
public class InjuryRightTag extends TagSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -50020769366397982L;
	private String url;
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}


	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		boolean flag = authorizeUsingUrlCheck();
		return  flag ?EVAL_PAGE:SKIP_BODY;
	}
	
	public boolean authorizeUsingUrlCheck() throws JspException {
        String contextPath = ((HttpServletRequest) pageContext.getRequest()).getContextPath();
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
        return getPrivilegeEvaluator().isAllowed(contextPath, getUrl(), null, currentUser);
    }
	
	private WebInvocationPrivilegeEvaluator getPrivilegeEvaluator() throws JspException {
        ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(pageContext.getServletContext());
        Map<String, WebInvocationPrivilegeEvaluator> wipes = ctx.getBeansOfType(WebInvocationPrivilegeEvaluator.class);

        if (wipes.size() == 0) {
            throw new JspException(
                    "No visible WebInvocationPrivilegeEvaluator instance could be found in the application "
                            + "context. There must be at least one in order to support the use of URL access checks in 'authorize' tags.");
        }

        return (WebInvocationPrivilegeEvaluator) wipes.values().toArray()[0];
    }

	
}

