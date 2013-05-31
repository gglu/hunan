/**
 * 
 */
package com.soft.hunan.injury.act.permission;

import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.hunan.injury.entity.permission.RoleInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.helper.WebUtils;
import com.soft.hunan.injury.service.permission.IRoleService;

/**
 * @author liwencheng
 *
 */

@RequestMapping("role")
@Controller
public class RoleAct {

	@Autowired
	private IRoleService roleService;
	
	@RequestMapping("all.do")
	public String allRoles(@ModelAttribute("page")PageHelper<RoleInfo> page){
		
		roleService.findAllRoles(page);
		
		return "right/roles";
	}
	
	
	@RequestMapping("roles4usr.do")
	public void roles4usr(Long userid,HttpServletResponse response){
		
		Set<RoleInfo> roles = roleService.roles4Assign(userid);
		
		WebUtils.write2Json(roles, response);
		
	}
}
