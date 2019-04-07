package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mn.bean.Permissions;
import org.mn.bean.User;
import org.mn.service.impl.UserService;
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
	public String findAllUserInfo(HttpServletRequest request, HttpServletResponse response) {
		List<User> lisu = userService.findAllUserInfo();
		if(lisu != null) {
			request.setAttribute("lisu", lisu);
			return "user.jsp";
		} else {
			return "error.jsp";
		}
	}
}
