/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * created by liwencheng 2013-5-10
 */
package com.soft.hunan.injury.ss3.method.matcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

/**
 * @author liwencheng
 *
 */
public class SimpleMethodMatcher implements MethodMatcher,InitializingBean {
	
	private String classPattern ;
	private String methogPattern ;
	private String basePackage;
	private List<String> excludeMethod;
	public void setClassPattern(String classPattern) {
		this.classPattern = classPattern;
	}
	public void setMethogPattern(String methogPattern) {
		this.methogPattern = methogPattern;
	}
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage.replace('.', '/');
	}
	public void setExcludeMethod(List<String> excludeMethod) {
		this.excludeMethod = excludeMethod;
	}


	private AntPathMatcher packageReg = new AntPathMatcher();
	
	@Override
	public boolean match(Class<?> clazz, Method method) {
		// TODO Auto-generated method stub
		boolean flag = iniflag;
		String methodName = method.getName();
		if(excludeMethod != null && !excludeMethod.isEmpty()){
			if(excludeMethod.contains(methodName))
				return false;
		}
		if(methogPattern != null){
			flag &= Pattern.matches(methogPattern, methodName);
			if(!flag)return false;
		}
		
		String path = ClassUtils.convertClassNameToResourcePath(clazz.getName());
		if(basePackage != null){
			flag &= packageReg.match(basePackage, path);
			if(!flag)return false;
		}
		
		String className = ClassUtils.getShortName(clazz);
		if(classPattern != null){
			flag &= Pattern.matches(classPattern, className);
			if(!flag)return false;
		}
		
		return flag;
	}

	private boolean iniflag = false;
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		if(null != basePackage){
			Assert.isTrue(packageReg.isPattern(basePackage), "the value for packageReg is invalid！！！ check it and take a try！！！");
			iniflag |= true;
		}
		if(null != classPattern){
			iniflag |= true;
		}
		if(null != methogPattern){
			iniflag |= true;
		}
		if(excludeMethod == null){
			excludeMethod = new ArrayList<String>();
			Method[] ms = Object.class.getMethods();
			for (Method method : ms) {
				excludeMethod.add(method.getName());
			}
		}
	}

}

