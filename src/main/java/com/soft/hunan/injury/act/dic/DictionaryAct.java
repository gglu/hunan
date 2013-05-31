/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-30
 */
package com.soft.hunan.injury.act.dic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.hunan.injury.entity.dic.Dictionary;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.permission.IDictionaryService;

/**
 * @author liwencheng
 *
 */

@Controller
@RequestMapping("dic")
public class DictionaryAct {

	@Autowired
	private IDictionaryService dictionaryService;
	
	@RequestMapping("all.do")
	public String allDictionary(@ModelAttribute("page") PageHelper<Dictionary> page){
		
		dictionaryService.findAllDictionary(page);
		
		return "dic/dictionarys";
	}
}
