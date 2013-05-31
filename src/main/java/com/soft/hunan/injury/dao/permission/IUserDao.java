/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.dao.permission;

import java.util.List;

import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 * 
 */
public interface IUserDao {

	UserInfo findUserByAccount(String account);

	List<UserInfo> findAllUsers(PageHelper<UserInfo> page);

}
