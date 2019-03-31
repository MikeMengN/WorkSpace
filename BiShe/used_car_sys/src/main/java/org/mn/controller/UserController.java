package org.mn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	@Resource
	private UserService userService;
	
	public String login (HttpServletRequest request, HttpServletResponse response, User user) {
		
		User sUser = null;
		if(user != null) {
			sUser = userService.login(user);
			HttpSession session = request.getSession();
			session.setAttribute("sUser", sUser);
		} else {
			return "redirect:/login.jsp";
		}
		
		return "";
	} 
}
