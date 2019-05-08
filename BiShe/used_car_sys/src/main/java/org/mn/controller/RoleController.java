package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.Role;
import org.mn.service.impl.RoleService;
import org.mn.util.ConstantUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: RoleController  
* @Description: 角色控制器  
* @author: MengNing  
* @date: 2019年4月4日下午5:34:16  
*/
@Controller
@RequestMapping(value = "/role")
public class RoleController {
	@Resource(name = "roleService")
	private RoleService roleService;
	
	/**
	 * @Title: findAllRoleInfo   
	 * @Description: 查询所有角色信息   
	 * @param: @param request
	 * @param: @param response
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findAllRoleInfo")
	public String findAllRoleInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
		System.out.println("访问到此处！！！！");
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
		List<Role> lisr = roleService.findAllRolePageInfo(currIndex, pageSize);
		// 无分页查询
		List<Role> lsall = roleService.findAllRoleInfo();
		if(lisr != null) {
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
			request.setAttribute("lisr", lisr);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "role.jsp";
		} else {
			return "error.jsp";
		}
 		
	}
}
