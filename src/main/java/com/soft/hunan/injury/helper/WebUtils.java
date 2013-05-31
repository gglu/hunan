/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-6
 */
package com.soft.hunan.injury.helper;

import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;

import com.soft.hunan.injury.ss3.dao.InjuryUserDetails;

/**
 * @author liwencheng
 *
 */
public final class WebUtils {

	private WebUtils(){}

	public static void writeMsg(String msg, HttpServletResponse response) {
		// TODO Auto-generated method stub
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != out) {
				out.write(msg);
				out.flush();
				out.close();
			}
		}
	}

	public static void write2Json(Object obj, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		OutputStream out = null;
		try {
			response.setContentType("application/json;charset=UTF-8");
			out =  response.getOutputStream();
			if(obj != null)
				om.writeValue(out, obj);
			else
				om.writeValue(out,"");
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}finally{
			try {
				if(null != out){
					out.flush();
					out.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static String getRemoteHost(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return request.getRemoteAddr();
	}
	
	/**
	 * 返回的是InjuryUserDetails
	 * @return
	 */
	public final static InjuryUserDetails getCurrentUserDetails() {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(!InjuryUserDetails.class.isAssignableFrom(principal.getClass()))
			throw new RuntimeException("权限配置异常！！！forcePrincipalAsString必须设置false！！！！principal 不能设置为string类型");
		return (InjuryUserDetails) principal;
	}
	
}

