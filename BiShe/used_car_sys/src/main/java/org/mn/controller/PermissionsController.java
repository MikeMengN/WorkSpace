package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.Permissions;
import org.mn.service.impl.PermissionsService;
import org.mn.util.ConstantUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: PermissionsController  
* @Description: 权限控制器  
* @author: MengNing  
* @date: 2019年4月4日下午5:36:49  
*/
@Controller
@RequestMapping(value = "/permissions")
public class PermissionsController {
	
	@Resource
	private PermissionsService perService;
	
	/**
	 * @Title: findAllPerInfo   
	 * @Description: 分页查询权限控制器   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param page
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findAllPerInfo")
	public String findAllPerInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
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
		List<Permissions> lisp = perService.findAllPerPageInfo(currIndex, pageSize);
		// 无分页查询
		List<Permissions> lsall = perService.findAllPerInfo();
		if(lisp != null) {
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
			request.setAttribute("lisp", lisp);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "permissions.jsp";
		} else {
			return "error.jsp";
		}
 		
	}
}
