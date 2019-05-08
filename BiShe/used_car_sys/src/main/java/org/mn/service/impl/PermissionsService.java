package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.Permissions;
import org.mn.dao.PermissionDao;
import org.mn.service.IPermissionService;
import org.springframework.stereotype.Service;

/**  
* @Title: PermissionsService  
* @Description: 权限业务 
* @author: MengNing  
* @date: 2019年4月4日下午5:38:00  
*/
@Service
public class PermissionsService implements IPermissionService {
	
	@Resource
	private PermissionDao perDao;
	/* 
	 * @see org.mn.service.IPermissionService#findAllPerInfo()
	 */
	@Override
	public List<Permissions> findAllPerInfo() {
		// TODO Auto-generated method stub
		return perDao.findAllPerInfo();
	}

	/* 
	 * @see org.mn.service.IPermissionService#findAllPerPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<Permissions> findAllPerPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return perDao.findAllPerPageInfo(currIndex, pageSize);
	}

}
