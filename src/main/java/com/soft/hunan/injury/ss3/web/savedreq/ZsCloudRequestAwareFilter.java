/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-11
 */
package com.soft.hunan.injury.ss3.web.savedreq;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.util.Assert;
import org.springframework.web.filter.GenericFilterBean;

/**
 * @author liwencheng
 *
 */
public class ZsCloudRequestAwareFilter extends GenericFilterBean {

	private RequestCache requestCache;
	
	public ZsCloudRequestAwareFilter() {
        this(new HttpSessionRequestCache());
    }

    public ZsCloudRequestAwareFilter(RequestCache requestCache) {
        Assert.notNull(requestCache, "requestCache cannot be null");
        this.requestCache = requestCache;
    }
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest wrappedSavedRequest =
	            requestCache.getMatchingRequest((HttpServletRequest)request, (HttpServletResponse)response);

	        chain.doFilter(wrappedSavedRequest == null ? request : wrappedSavedRequest, response);
	}

	
}

