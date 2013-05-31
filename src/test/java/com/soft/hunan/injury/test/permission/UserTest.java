package com.soft.hunan.injury.test.permission;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.service.permission.IUserService;
import com.soft.hunan.injury.test.InjuryBaseTest;

public class UserTest extends InjuryBaseTest {

	@Test
	public void test() {
		
		PasswordEncoder pe = new Md5PasswordEncoder();
		
		IUserService userService = ctx.getBean("userService",IUserService.class);
		UserInfo user = new UserInfo();
		user.setAccount("test");
		user.setPwd(pe.encodePassword("123", null));
		user.setName("test");
		userService.save(user);
		
		UserInfo user1 = new UserInfo();
		user1.setAccount("test1");
		user1.setPwd(pe.encodePassword("123", null));
		user1.setName("test1");
		userService.save(user1);
		
		
		UserInfo user2 = new UserInfo();
		user2.setAccount("test2");
		user2.setPwd(pe.encodePassword("123", null));
		user2.setName("test2");
		userService.save(user2);
		
		
		
		UserInfo user3 = new UserInfo();
		user3.setAccount("test3");
		user3.setPwd(pe.encodePassword("123", null));
		user3.setName("test3");
		userService.save(user3);
		
		        
	}

}
