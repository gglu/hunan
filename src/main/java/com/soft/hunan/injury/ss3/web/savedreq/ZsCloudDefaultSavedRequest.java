/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-9
 */
package com.soft.hunan.injury.ss3.web.savedreq;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.PortResolver;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;

/**
 * @author liwencheng
 *
 */
public class ZsCloudDefaultSavedRequest extends DefaultSavedRequest {

	private HttpServletRequest request;
	public HttpServletRequest getRequest(){
		return this.request;
	}
	
	public ZsCloudDefaultSavedRequest(HttpServletRequest request, PortResolver portResolver) {
		super(request, portResolver);
		// TODO Auto-generated constructor stub
		this.request = request;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6378587299509512326L;

}

