package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.type.IntegerTypeHandler;
import org.mn.bean.Permissions;
import org.mn.bean.User;
import org.mn.service.impl.UserService;
import org.mn.util.ConstantUtil;
import org.mn.util.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: UserController  
* @Description: 用户控制器  
* @author: MengNing  
* @date: 2019年3月30日 下午4:16:49  
*/
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource(name = "userService")
	private UserService userService;
	
	/**
	 * @Title: login   
	 * @Description: 登录验证以及根据验证信息取得权限 
	 * @param: @param request
	 * @param: @param response
	 * @param: @param user
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response, User user) {
		// 用户验证登录
		User sUser = userService.login(user);
		if(sUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("sUser", sUser);
			// 将用户设置进session后，根据用户id去查询用户所拥有的权限
			List<Permissions> lisper = userService.perCheck(sUser.getUser_id());
			session.setAttribute("lisper", lisper);
			return "main.jsp";
		} else {
			return "redirect:/login.jsp";
		}
		
	}
	
	/**
	 * @Title: findAllUserInfo   
	 * @Description: 查询所有用户信息   
	 * @param: @param request
	 * @param: @param response
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findAllUserInfo")
	public String findAllUserInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
		// 分页查询时，会默认当前锁定每页记录数为10条，并且此处没有设置给改变此记录的方法
		// 第一次查询时，会默认查询第一页的数据
		Integer currIndex;
		// 取得最大页数
		Integer maxPage = null;
		Integer nowPage = null;
		if(page == null || page <= 0) {
			page = 1;
			currIndex = 0;
		} else {
			currIndex = (page-1)*ConstantUtil.PageSize;
 		}
		Integer pageSize = page*ConstantUtil.PageSize;
		// 分页查询
		List<User> lisu = userService.findAllUserPageInfo(currIndex, pageSize);
		// 无分页查询
		List<User> lsall = userService.findAllUserInfo();
		if(lisu != null) {
			// 取得最大页数,通过判断奇偶的到最大页数
			if(lsall.size()%ConstantUtil.PageSize == 0) {
				maxPage = (lsall.size()) / (ConstantUtil.PageSize);
			} else {
				maxPage = (lsall.size()) / (ConstantUtil.PageSize) + 1;
			}
			// 取得当前页数
			nowPage = page;
			if(nowPage > maxPage) {
				nowPage = maxPage;
			}
			request.setAttribute("lisu", lisu);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "user.jsp";
		} else {
			return "error.jsp";
		}
	}
	
	/**
	 * @Title: modifyPasswd   
	 * @Description: 修改密码方法   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param oldPasswd
	 * @param: @return 返回成功信息     
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/modifyPasswd")
	public String modifyPasswd(HttpServletRequest request, HttpServletResponse response, String oldPasswd, String newPasswd) {
		// 从session中取出用户信息
		User tUser = (User)request.getSession().getAttribute("sUser");
		// 验证旧密码是否正确
		if(MD5Utils.getPwd(oldPasswd) == tUser.getUser_passwd() || MD5Utils.getPwd(oldPasswd).equals(tUser.getUser_passwd())) {
			// 进行密码修改
			userService.modifyPasswd(tUser.getUser_id(), MD5Utils.getPwd(newPasswd));
			return "user/findAllUserInfo?arg=0";
		} else {
			return "error.jsp";
		}
	}
	
	/**
	 * @Title: registUser   
	 * @Description: 用户注册及添加用户方法   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param user
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/registUser")
	public String registUser(HttpServletRequest request, HttpServletResponse response, User user) {
		boolean bool = userService.registUser(user);
		if(bool == true) {
			return "user/findAllUserInfo?arg=0";
		}
		return "error.jsp";
	}
	
	/**
	 * @Title: findDetailUser   
	 * @Description: c查询用户详细信息   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param user_id
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findDetailUser")
	public String findDetailUser(HttpServletRequest request, HttpServletResponse response, String user_id) {
		
		return "error.jsp";
	}
	
}
