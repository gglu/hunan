/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-29
 */
package com.soft.hunan.injury.act.record;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liwencheng
 *
 */

@Controller
@RequestMapping("emp")
public class EmployeeInfoAct {

	@RequestMapping("all.do")
	public String emplyeeinfos(){
		
		
		return "record/empinfos";
	}
	
	@RequestMapping("detail.do")
	public String employeeDetail(Long id,ModelMap model){
		
		
		return "record/empdetail";
	}
}
