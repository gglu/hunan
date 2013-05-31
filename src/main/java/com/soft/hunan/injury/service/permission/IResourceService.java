/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service.permission;

import java.util.List;

import org.springframework.security.access.ConfigAttribute;

import com.soft.hunan.injury.entity.permission.ResourceInfo;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 * 
 */
public interface IResourceService {

	List<ConfigAttribute> findAuthorities4Resource(String requestUrl);

	void findAllResources(PageHelper<ResourceInfo> page);

}
