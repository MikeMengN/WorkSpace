package org.mn.service;

import java.util.List;
import org.mn.bean.Permissions;
/**  
* @Title: IPermissionService  
* @Description: 权限业务接口   
* @author: MengNing  
* @date: 2019年4月4日下午5:37:31  
*/
public interface IPermissionService {

	/**
	 * @Title: findAllPerInfo   
	 * @Description: 查询所有权限信息  
	 * @return: List<Permissions>      
	 * @throws
	 */
	List<Permissions> findAllPerInfo(); 
	
	/**
	 * @Title: findAllPerPageInfo   
	 * @Description: 分页查询权限信息  
	 * @param: @return      
	 * @return: List<Permissions>      
	 * @throws
	 */
	List<Permissions> findAllPerPageInfo(Integer currIndex, Integer pageSize);
}
