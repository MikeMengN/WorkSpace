package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.Role;

/**  
* @Title: RoleDao  
* @Description: 角色数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午5:36:09  
*/
public interface RoleDao {
	/**
	 * @Title: findAllRoleInfo   
	 * @Description: 查询所有角色信息
	 * @param: @return      
	 * @return: List<Role>      
	 * @throws
	 */
	List<Role> findAllRoleInfo();
	
	/**
	 * @Title: findAllRolePageInfo   
	 * @Description: 分页查询所有角色信息   
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @param: @return      
	 * @return: List<Role>      
	 * @throws
	 */
	List<Role> findAllRolePageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
}
