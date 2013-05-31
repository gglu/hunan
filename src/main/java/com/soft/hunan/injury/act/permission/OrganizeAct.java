/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-29
 */
package com.soft.hunan.injury.act.permission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liwencheng
 *
 */

@RequestMapping("org")
@Controller
public class OrganizeAct {

	
	@RequestMapping("all.do")
	public String allOrganizes(){
		
		
		return "right/organizes";
	}
	
}
