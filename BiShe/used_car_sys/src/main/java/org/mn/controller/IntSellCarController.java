package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.IntentionSellCar;
import org.mn.bean.LicensePlateLocation;
import org.mn.service.IIntSellCarService;
import org.mn.util.ConstantUtil;
import org.mn.util.DateUtil;
import org.mn.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: IntSellCarController  
* @Description: 意向卖车者信息控制器 
* @author: MengNing  
* @date: 2019年4月4日下午5:41:08  
*/
@Controller
@RequestMapping(value = "/isc")
public class IntSellCarController {
	
	@Resource
	private IIntSellCarService iscService;
	
	/**
	 * @Title: sellCarToCompany   
	 * @Description: 用户请求卖车 
	 * @param: @param request
	 * @param: @param response
	 * @param: @param user
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/sellCarToCompany")
	public String sellCarToCompany(HttpServletRequest request, HttpServletResponse response, String user_id) {
		// 如果用户没登陆(即用户id为空)，则返回错误信息
		if(user_id == null || "".equals(user_id) || user_id == "null") {
			request.setAttribute("error", "0");
			return "web_user/login.jsp";
		} else {
			IntentionSellCar sellCar = new IntentionSellCar();
			sellCar.setIsc_id(StringUtil.getRoundId());
			sellCar.setUser_id(user_id);
			sellCar.setCreate_time(DateUtil.getDate());
			// 查询数据库中是否已存在此用户信息
			IntentionSellCar sellCar2  = iscService.findSellCarInfo(sellCar);
			if(sellCar2 == null) {
				int result = iscService.sellCarToCompany(sellCar);
				if(result > 0) {
					System.out.println("预约成功");
					request.setAttribute("info", "1");
					return "web_user/sellcar.jsp";
				} else {
					return "error.jsp";
				}
			} else {
				System.out.println("预约成功");
				request.setAttribute("info", "1");
				return "web_user/sellcar.jsp";
			}
			
			
		}
		
		
	}
	
	
	/**
	 * @Title: findSellCarPageInfo   
	 * @Description:后端分页查询
	 * @param: @param request
	 * @param: @param response
	 * @param: @param page
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findSellCarPageInfo")
	public String findSellCarPageInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
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
		List<IntentionSellCar> lissell = iscService.findSellCarPageInfo(currIndex, pageSize);
		// 无分页查询
		List<IntentionSellCar> lsall = iscService.findAllSellCarInfo();
		if(lissell != null) {
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
			request.setAttribute("lissell", lissell);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "isc.jsp";
		} else {
			return "error.jsp";
		}
 		
	}
	
}
