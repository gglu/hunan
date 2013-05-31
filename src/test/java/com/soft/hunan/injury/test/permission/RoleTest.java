/**
 * 
 */
package com.soft.hunan.injury.test.permission;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.soft.hunan.injury.entity.permission.RoleInfo;
import com.soft.hunan.injury.service.permission.IRoleService;
import com.soft.hunan.injury.test.InjuryBaseTest;

/**
 * @author liwencheng
 *
 */
public class RoleTest extends InjuryBaseTest {

	@Test
	public void test() {
		IRoleService roleService = ctx.getBean("roleService", IRoleService.class);
		
		RoleInfo role = new RoleInfo();
		role.setRoleName("管理员");
		role.setRoleCode("ADMIN");
		
		roleService.save(role);
		
		
		RoleInfo role1 = new RoleInfo();
		role1.setRoleName("院长");
		role1.setRoleCode("MASTER");
		
		roleService.save(role1);
		
		RoleInfo role2 = new RoleInfo();
		role2.setRoleName("医生");
		role2.setRoleCode("DOCTOR");
		
		roleService.save(role2);
		
		
		
		
	}
	
	
}
