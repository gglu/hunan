/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.service.permission;

import java.util.List;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Service;

import com.soft.hunan.injury.entity.permission.ResourceInfo;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 * 
 */
@Service("resourceService")
public class ResourceService implements IResourceService {

	@Override
	public List<ConfigAttribute> findAuthorities4Resource(String requestUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findAllResources(PageHelper<ResourceInfo> page) {
		// TODO Auto-generated method stub
		
	}

	
}
