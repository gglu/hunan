/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-29
 */
package com.soft.hunan.injury.act.record;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liwencheng
 *
 */

@RequestMapping("rec")
@Controller
public class FirstVisitAct {

	
	@RequestMapping("fv/all.do")
	public String allFirstVisits(){
		
		
		return "record/firstvisits";
	}
}
