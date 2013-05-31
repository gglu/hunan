/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service.permission;

import java.util.List;

import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.IInjuryBaseService;

/**
 * @author liwencheng
 * 
 */
public interface IUserService extends IInjuryBaseService<UserInfo> {

	UserInfo findUserByAccount(String account);

	List<UserInfo> findAllUsers(PageHelper<UserInfo> page);

}
