/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-31
 */
package com.soft.hunan.injury.act.record;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liwencheng
 *
 */

@Controller
@RequestMapping("rec")
public class RecordsAct {

	
	@RequestMapping("all.do")
	public String allRecords(){
		
		
		return "record/records";
		
	}
	
	
	
	@RequestMapping("detail.do")
	public String recordDetail(){
		
		
		
		return "record/recorddetail";
	}
}
