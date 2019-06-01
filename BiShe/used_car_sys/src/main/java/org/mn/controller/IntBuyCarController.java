package org.mn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.IntentionBuyCar;
import org.mn.bean.IntentionSellCar;
import org.mn.service.IIntBuyCarService;
import org.mn.util.ConstantUtil;
import org.mn.util.DateUtil;
import org.mn.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: IntBuyCarController  
* @Description: 意向买车者信息控制器  
* @author: MengNing  
* @date: 2019年4月4日下午5:39:05  
*/
@Controller
@RequestMapping(value = "/ibc")
public class IntBuyCarController {

	@Resource
	private IIntBuyCarService buyCarService;
	
	@RequestMapping(value = "/buyCarInfoFromCompany")
	public String buyCarInfoFromCompany(HttpServletRequest request, HttpServletResponse response, String user_id, String uci_id) {
		// 如果用户没登陆(即用户id为空)，则返回错误信息
				if(user_id == null || "".equals(user_id) || user_id == "null") {
					request.setAttribute("error", "0");
					return "web_user/login.jsp";
				} else {
					IntentionBuyCar buyCar = new IntentionBuyCar();
					buyCar.setIbc_id(StringUtil.getRoundId());
					buyCar.setUser_id(user_id);
					buyCar.setUci_id(uci_id);
					buyCar.setCreate_time(DateUtil.getDate());
					// 再提交信息之前，查看数据库中在一个月内是否已经有此纪录
					IntentionBuyCar buyCar2 = buyCarService.findIBCInfo(buyCar);
					if(buyCar2 == null) {
						int result = buyCarService.buyCarInfoFromCompany(buyCar);
						if(result > 0) {
							System.out.println("预约成功");
							request.setAttribute("info", "1");
							return "usedCar/findUsedCarInfoToBuyCar";
						} else {
							return "error.jsp";
						}
					} else {
						System.out.println("预约成功");
						request.setAttribute("info", "1");
						return "usedCar/findUsedCarInfoToBuyCar";
					}
					
				}
	}
	
	/**
	 * @Title: findAllBuyCarPageInfo   
	 * @Description:后端卖车者管理模块查询   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findAllBuyCarPageInfo")
	public String findAllBuyCarPageInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
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
		List<IntentionBuyCar> lisbuy = buyCarService.findAllIbcPageInfo(currIndex, pageSize);
		// 无分页查询
		List<IntentionBuyCar> lsall = buyCarService.findAllIbcInfo();
		if(lisbuy != null) {
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
			request.setAttribute("lisbuy", lisbuy);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "ibc.jsp";
		} else {
			return "error.jsp";
		}
	}
}
