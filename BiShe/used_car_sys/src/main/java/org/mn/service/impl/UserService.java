package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.Permissions;
import org.mn.bean.User;
import org.mn.dao.UserDao;
import org.mn.service.IUserService;
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
		String user_pwd = user.getUser_passwd();
		User resultUser = userDao.login(user_name, user_pwd);
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

}
