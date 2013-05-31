/**
 * 
 */
package com.soft.hunan.injury.act.permission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.permission.IUserService;

/**
 * @author liwencheng
 *
 */
@Controller
public class UserAct {

	@Autowired
	private IUserService userSerivce;
	
	@RequestMapping("users.do")
	public String allUsers(@ModelAttribute("page")PageHelper<UserInfo> page){
		
		page.setPath("users.do");
		
		List<UserInfo> users = userSerivce.findAllUsers(page);
		
		
		return "right/users";
	}
	
}
