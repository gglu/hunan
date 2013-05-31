/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liwencheng
 * 
 */
public class InjuryBaseTest {

	protected static ClassPathXmlApplicationContext ctx ;
	
	@BeforeClass
	public static void setUp(){
		ctx = new ClassPathXmlApplicationContext("just4test.xml");
	}
	
	
	@AfterClass
	public static void tearDown(){
		if(null != ctx && ctx.isActive()){
			ctx.close();
			ctx=null;
		}
	}
	
}
