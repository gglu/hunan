/**
 * 
 */
package com.soft.hunan.injury.dao.permission;

import java.util.Set;

import com.soft.hunan.injury.entity.permission.RoleInfo;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 *
 */
public interface IRoleDao {

	void findAllRoles(PageHelper<RoleInfo> page);

	Set<RoleInfo> roles4Assign(Long userid);

}
