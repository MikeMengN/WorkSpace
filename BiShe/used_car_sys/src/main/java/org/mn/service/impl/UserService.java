package org.mn.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.Permissions;
import org.mn.bean.User;
import org.mn.dao.UserDao;
import org.mn.service.IUserService;
import org.mn.util.ConstantUtil;
import org.mn.util.DateUtil;
import org.mn.util.MD5Utils;
import org.mn.util.StringUtil;
import org.springframework.stereotype.Service;

/**  
* @Title: UserService  
* @Description: 用户业务实现类  
* @author: MengNing  
* @date: 2019年3月30日 下午4:21:45  
*/
@Service
public class UserService implements IUserService {
	@Resource(name = "userDao")
	private UserDao userDao;
	/* 
	 * @see org.mn.service.IUserService#login(org.mn.bean.User)
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		String user_name = user.getUser_name();
		String user_passwd = null;
		String str = user.getUser_passwd();
		user_passwd = MD5Utils.getPwd(str);
		User resultUser = userDao.login(user_name, user_passwd);
		return resultUser;
	}
	/* 
	 * @see org.mn.service.IUserService#perCheck(java.lang.String)
	 */
	@Override
	public List<Permissions> perCheck(String user_id) {
		// TODO Auto-generated method stub
		return userDao.perCheck(user_id);
	}
	/* 
	 * @see org.mn.service.IUserService#findAllUserInfo()
	 */
	@Override
	public List<User> findAllUserPageInfo(Integer currIndex, Integer pageSize) {
	
		// TODO Auto-generated method stub
		return userDao.findAllUserPageInfo(currIndex, pageSize);
	}
	/* 
	 * @see org.mn.service.IUserService#findAllUserInfo()
	 */
	@Override
	public List<User> findAllUserInfo() {
		// TODO Auto-generated method stub
		return userDao.findAllUserInfo();
	}
	/* 
	 * @see org.mn.service.IUserService#modifyPasswd(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean modifyPasswd(String user_id, String newPasswd) {
		// TODO Auto-generated method stub
		if(userDao.modifyPasswd(user_id, newPasswd) > 0) {
			return true;
		}
		return false;
	}
	/* 
	 * @see org.mn.service.IUserService#registUser(org.mn.bean.User)
	 */
	@Override
	public boolean registUser(User user) {
		// TODO Auto-generated method stub
		// 取得一个随机id作为用户的id
		String user_id = StringUtil.getRoundId();
		user.setUser_id(user_id);
		// 设置创建时间
		user.setCreate_time(DateUtil.getDate());
		// 如果是通过后端管理员添加用户，则不会有密码，密码设为默认值(也需要加密)，如果是用户注册，则需要将密码加密
		if(user.getUser_passwd() != null && user.getUser_passwd().equals("")) {
			user.setUser_passwd(MD5Utils.getPwd(user.getUser_passwd()));
		} else {
			user.setUser_passwd(MD5Utils.getPwd(ConstantUtil.UserPassWord));
		}
		if(userDao.registUser(user) > 0) {
			return true;
		}
		return false;
	}
	/* 
	 * @see org.mn.service.IUserService#findDetailUser(java.lang.String)
	 */
	@Override
	public User findDetailUser(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}

