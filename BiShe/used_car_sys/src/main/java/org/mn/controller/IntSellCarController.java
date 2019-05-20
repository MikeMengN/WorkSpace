package org.mn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.IntentionSellCar;
import org.mn.bean.User;
import org.mn.service.IIntSellCarService;
import org.mn.util.DateUtil;
import org.mn.util.StringUtil;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: IntSellCarController  
* @Description: 意向卖车者信息控制器 
* @author: MengNing  
* @date: 2019年4月4日下午5:41:08  
*/
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
		// 如果用户没登陆，则返回错误信息
		if(user_id == null || "".equals(user_id)) {
			return "web_user/login.jsp?error=0";
		} else {
			IntentionSellCar sellCar = null;
			sellCar.setIsc_id(StringUtil.getRoundId());
			sellCar.setUser_id(user_id);
			sellCar.setCreate_time(DateUtil.getDate());
			int result = iscService.sellCarToCompany(sellCar);
			if(result > 0) {
				System.out.println("预约成功");
				return "web_user/sellcar.jsp?info=1";
			} else {
				return "error.jsp";
			}
		}
		
		
	}
	
}
