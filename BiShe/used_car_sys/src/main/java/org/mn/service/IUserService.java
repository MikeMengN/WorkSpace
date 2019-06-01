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
	
	/**
	 * @Title: findAllUserInfo   
	 * @Description: 查询所有用户信息   分页
	 * @return: List<User>      
	 * @throws
	 */
	List<User> findAllUserPageInfo(Integer currIndex, Integer pageSize);
	
	/**
	 * @Title: findAllUserInfo   
	 * @Description: 查询所有用户信息   
	 * @return: List<User>      
	 * @throws
	 */
	List<User> findAllUserInfo();
	
	/**
	 * @Title: modifyPasswd   
	 * @Description: 修改密码业务类   
	 * @param: @param user_id
	 * @param: @param user_passwd
	 * @return: boolean      
	 * @throws
	 */
	boolean modifyPasswd(String user_id, String newPasswd);
	
	/**
	 * @Title: registUser   
	 * @Description: 注册或者添加用户业务处理   
	 * @param: @param user
	 * @return: boolean      
	 * @throws
	 */
	boolean registUser(User user);
	
	/**
	 * @Title: findDetailUser   
	 * @Description: 查看用户详细信息  
	 * @param: @param user_id
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User findDetailUser(String user_id);
	
	/**
	 * @Title: removeUser   
	 * @Description:根据id删除用户  
	 * @param: @param user_id
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int removeUser(String user_id);
}
