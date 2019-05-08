package org.mn.service;

import java.util.List;

import org.mn.bean.Role;

/**  
* @Title: IRoleService  
* @Description: 角色业务接口  
* @author: MengNing  
* @date: 2019年4月4日下午5:35:31  
*/
public interface IRoleService {
	/**
	 * @Title: findAllRoleInfo   
	 * @Description: 查询所有角色信息  
	 * @return: List<Role>      
	 * @throws
	 */
	List<Role> findAllRoleInfo(); 
	
	/**
	 * @Title: findAllRolePageInfo   
	 * @Description: 分页查询角色信息  
	 * @param: @return      
	 * @return: List<Role>      
	 * @throws
	 */
	List<Role> findAllRolePageInfo(Integer currIndex, Integer pageSize);
}
