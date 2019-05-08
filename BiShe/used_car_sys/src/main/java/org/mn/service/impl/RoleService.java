package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.Role;
import org.mn.dao.RoleDao;
import org.mn.service.IRoleService;
import org.springframework.stereotype.Service;

/**  
* @Title: RoleService  
* @Description: 角色业务 
* @author: MengNing  
* @date: 2019年4月4日下午5:35:47  
*/
@Service
public class RoleService implements IRoleService {
	@Resource(name = "roleDao")
	private RoleDao roleDao;
	/* 
	 * @see org.mn.service.IRoleService#findAllRoleInfo()
	 */
	@Override
	public List<Role> findAllRoleInfo() {
		// TODO Auto-generated method stub
		return roleDao.findAllRoleInfo();
	}
	/* 
	 * @see org.mn.service.IRoleService#findAllRolePageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<Role> findAllRolePageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return roleDao.findAllRolePageInfo(currIndex, pageSize);
	}
	
}
