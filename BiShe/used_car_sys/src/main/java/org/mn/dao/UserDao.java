package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.Permissions;
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
	public User login(@Param("user_name") String user_name, @Param("user_passwd") String user_passwd);
	/**
	 * @Title: perCheck   
	 * @Description: 根据用户id查询用户权限，返回权限列表  
	 * @param: @param user_id
	 * @param: @return      
	 * @return: List<Permissions>      
	 * @throws
	 */
	public List<Permissions> perCheck(String user_id);
	
	/**
	 * @Title: findAllUserInfo 分页  
	 * @Description: 查询所有用户   
	 * @return: List<User>      
	 * @throws
	 */
	public List<User> findAllUserPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
	
	/**
	 * @Title: findAllUserInfo   
	 * @Description: 查询所有用户   
	 * @return: List<User>      
	 * @throws
	 */
	public List<User> findAllUserInfo();
	
	/**
	 * @Title: modifyPasswd   
	 * @Description: 修改密码数据访问层   
	 * @param: @param newPasswd
	 * @return: int      
	 * @throws
	 */
	public int modifyPasswd(@Param("user_id") String user_id, @Param("newPasswd") String newPasswd);
	
	/**
	 * @Title: registUser   
	 * @Description: 注册或者增加用户  数据访问层   
	 * @param: @param user
	 * @return: int      
	 * @throws
	 */
	public int registUser(@Param("user") User user);
	
	/**
	 * @Title: findDetailUser   
	 * @Description: 查询用户详细信息，数据访问层   
	 * @param: @param user_id
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	public User findDetailUser(String user_id);
}
