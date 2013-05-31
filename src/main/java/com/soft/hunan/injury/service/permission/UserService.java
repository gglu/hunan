/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service.permission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.hunan.injury.dao.InjuryBaseDao;
import com.soft.hunan.injury.dao.permission.IUserDao;
import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.InjuryBaseService;

/**
 * @author liwencheng
 * 
 */

@Service("userService")
public class UserService extends InjuryBaseService<UserInfo> implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public com.soft.hunan.injury.entity.permission.UserInfo findUserByAccount(String account) {
		// TODO Auto-generated method stub
		return userDao.findUserByAccount(account);
	}

	@Override
	public InjuryBaseDao<UserInfo> obtainDao() {
		// TODO Auto-generated method stub
		return (InjuryBaseDao<UserInfo>) userDao;
	}

	@Override
	public List<UserInfo> findAllUsers(PageHelper<UserInfo> page) {
		// TODO Auto-generated method stub
		return userDao.findAllUsers(page);
	}

	
}
