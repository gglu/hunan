/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.act;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liwencheng
 * 
 */

@Controller
public class IndexAct { 

	
	@RequestMapping("index.do")
	public String index(){
		
		return "index";
	}
}
