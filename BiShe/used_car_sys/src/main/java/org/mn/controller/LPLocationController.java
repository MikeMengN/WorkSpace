package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.LicensePlateLocation;
import org.mn.bean.Permissions;
import org.mn.service.impl.LPLocationService;
import org.mn.util.ConstantUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: LPLocationController  
* @Description: 地理位置控制器   
* @author: MengNing  
* @date: 2019年4月4日下午8:07:34  
*/
@Controller
@RequestMapping(value = "/lpl")
public class LPLocationController {
	
	@Resource
	private LPLocationService lplService;
	
	/**
	 * @Title: findAllLocationInfo   
	 * @Description: 地理位置管理，控制层    
	 * @param: @param request
	 * @param: @param response
	 * @param: @param page
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findAllLocationInfo")
	public String findAllLocationInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
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
		List<LicensePlateLocation> lislpl = lplService.findAllLocationPageInfo(currIndex, pageSize);
		// 无分页查询
		List<LicensePlateLocation> lsall = lplService.findAllLocationInfo();
		if(lislpl != null) {
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
			request.setAttribute("lislpl", lislpl);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "lpl.jsp";
		} else {
			return "error.jsp";
		}
 		
	}
	
}
