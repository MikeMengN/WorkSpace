package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.Role;
import org.mn.service.impl.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: RoleController  
* @Description: 角色控制器  
* @author: MengNing  
* @date: 2019年4月4日下午5:34:16  
*/
@Controller
@RequestMapping(name = "/role")
public class RoleController {
	@Resource
	private RoleService roleService;
	
	/**
	 * @Title: findAllRoleInfo   
	 * @Description: 查询所有角色信息   
	 * @param: @param request
	 * @param: @param response
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(name = "/findAllRoleInfo")
	public String findAllRoleInfo(HttpServletRequest request, HttpServletResponse response) {
		List<Role> lsrole = roleService.findAllRoleInfo();
		if(lsrole != null) {
			request.setAttribute("lsrole", lsrole);
			return "role.jsp";
		} else {
			return "error.jsp";
		}
 		
	}
}
