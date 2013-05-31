/**
 * Copyright 2012-2020 www.zsqyyl.com
 * All right reserved.
 * project:new-log
 * created by liwencheng 2013-5-10
 */
package com.soft.hunan.injury.ss3.method.matcher;

import java.lang.reflect.Method;

/**
 * @author liwencheng
 *
 */
public interface MethodMatcher {

	boolean match(Class<?> clazz,Method method);
}

