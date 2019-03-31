package org.mn.service;

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
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User login(User user);
}
