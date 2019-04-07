package org.mn.dao;

import java.util.List;

import org.mn.bean.Role;

/**  
* @Title: RoleDao  
* @Description: 角色数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午5:36:09  
*/
public interface RoleDao {
	List<Role> findAllRoleInfo();
}
