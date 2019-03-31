package org.mn.dao;

import org.mn.bean.User;

/**  
* @Title: UserDao  
* @Description: 用户Dao接口  
* @author: MengNing  
* @date: 2019年3月30日 下午4:17:07  
*/
public interface UserDao {
	/**
	 * @Title: login   
	 * @Description: 用户登录方法
	 * @param: @param user_name
	 * @param: @param user_passwd
	 * @param: @return user实体     
	 * @return: User      
	 * @throws
	 */
	public User login(String user_name, String user_passwd);
}
