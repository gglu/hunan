/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-9
 */
package com.soft.hunan.injury.ss3.web.savedreq;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.PortResolver;
import org.springframework.security.web.PortResolverImpl;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.security.web.util.AnyRequestMatcher;
import org.springframework.security.web.util.RequestMatcher;

import com.soft.hunan.injury.helper.WebUtils;

/**
 * @author liwencheng
 * 
 *         在做负载均衡时，如果session处理策略采用sticky才可以，<br/>
 *         否则应该吧request放在一个可以公共的地方，供集群内所有web服务器都可以获取该request！！！<br/>
 * 
 */
public class ZsCloudRequestCache implements RequestCache {
	
//	private String parameter = "udurl";//for short user default the former url
//	public void setParameter(String parameter) {
//		this.parameter = parameter;
//	}

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	// 因为创建的session失效后，而request仍有可能保存在内存中，因此就有可能造成内存泄露，这里使用弱引用，使之可以gc！
	private Map<MySessionIdSoftReference, SavedRequest> reqcache = new HashMap<MySessionIdSoftReference, SavedRequest>();
	private boolean createSessionAllowed = true;
	private RequestMatcher requestMatcher = new AnyRequestMatcher();
	private PortResolver portResolver = new PortResolverImpl();

	public void setCreateSessionAllowed(boolean createSessionAllowed) {
		this.createSessionAllowed = createSessionAllowed;
	}

	public void setRequestMatcher(RequestMatcher requestMatcher) {
		this.requestMatcher = requestMatcher;
	}

	public void setPortResolver(PortResolver portResolver) {
		this.portResolver = portResolver;
	}

	@Override
	public void saveRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		if (requestMatcher.matches(request)) {
			ZsCloudDefaultSavedRequest savedRequest = new ZsCloudDefaultSavedRequest(request, portResolver);
			if (createSessionAllowed || request.getSession(false) != null) {
				reqcache.put(new MySessionIdSoftReference(WebUtils.getRemoteHost(request)),savedRequest);
				logger.debug("DefaultSavedRequest added to ZsCloudRequestCache: " + savedRequest);
			}
		} else {
			logger.debug("Request not saved as configured RequestMatcher did not match");
		}
	}

	@Override
	public SavedRequest getRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);

		if (session != null) {
			ZsCloudDefaultSavedRequest  saverep = (ZsCloudDefaultSavedRequest) reqcache.get(new MySessionIdSoftReference(WebUtils.getRemoteHost(request)));
			if(null == saverep || null == saverep.getRequest()){
				return null;
			}
			return saverep;
		}

		return null;
	}

	@Override
	public HttpServletRequest getMatchingRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ZsCloudDefaultSavedRequest saved = (ZsCloudDefaultSavedRequest) getRequest(request, response);
		
		if (saved == null ) {
			return null;
		}

//		String udurl = request.getParameter(parameter);
//		if(udurl != null && (udurl.equals("yes") || udurl.equals("on") || udurl.equals("true") || udurl.equals("1"))){
//			removeRequest(request, response);	
//			return request;
//		}
		
		if (!saved.doesRequestMatch(request, portResolver)) {
			logger.debug("saved request doesn't match");
			//目前的实现可能导致，通过代理网关访问外网的情况下出现不同于用户预期的行为。
			removeRequest(request, response);
			return null;
		}
		
		removeRequest(request, response);
		
		return new SavedRequestAwareWrapper(saved,request);
	}

	@Override
	public void removeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		logger.debug("Removing DefaultSavedRequest from requestcache if present");
		reqcache.remove(new MySessionIdSoftReference(WebUtils.getRemoteHost(request)));
	}

	class MySessionIdSoftReference extends SoftReference<String> {
		private String sessionid;

		public MySessionIdSoftReference(String sessionid) {
			super(sessionid);
			this.sessionid = sessionid;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (this == obj)
				return true;

			if (!(obj instanceof MySessionIdSoftReference))
				return false;

			MySessionIdSoftReference other = (MySessionIdSoftReference) obj;
			try {
				boolean flag = this.sessionid.equals(other.sessionid);
				return flag;
			} catch (NullPointerException e) {
				// TODO: handle exception
				return false;
			}
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return sessionid.hashCode();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return sessionid;
		}

	}

}
