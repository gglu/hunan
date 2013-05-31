/**
 * 
 */
package com.soft.hunan.injury.act.permission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.hunan.injury.entity.permission.ResourceInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.permission.IResourceService;

/**
 * @author liwencheng
 *
 */
@Controller
@RequestMapping("res")
public class ResourceAct {

	@Autowired
	private IResourceService resourceService;
	
	@RequestMapping("all.do")
	public String allResources(@ModelAttribute("page")PageHelper<ResourceInfo> page){
		
		resourceService.findAllResources(page);
		
		return "right/resources";
	}
}
