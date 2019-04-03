package org.mn.service;

import java.util.List;

import org.mn.bean.Permissions;
import org.mn.bean.User;

/**  
* @Title: UserService  
* @Description: 用户业务接口
* @author: MengNing  
* @date: 2019年3月30日 下午4:20:46  
*/
public interface IUserService {
	/**
	 * @Title: login   
	 * @Description:  用户登录业务接口  
	 * @param: @param user
	 * @return: User      
	 * @throws
	 */
	User login(User user);
	/**
	 * @Title: perCheck   
	 * @Description: 查询当前用户权限  
	 * @param: @param user_id
	 * @return: List<Permissions>      
	 * @throws
	 */
	List<Permissions> perCheck(String user_id);
}
