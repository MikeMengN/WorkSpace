package org.mn.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mn.bean.LicensePlateLocation;
import org.mn.bean.UsedCarInfo;
import org.mn.bean.VehicleBrand;
import org.mn.service.ILPLocationService;
import org.mn.service.IVBrandService;
import org.mn.service.impl.UsedCarInfoService;
import org.mn.util.ConstantUtil;
import org.mn.util.DateUtil;
import org.mn.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**  
* @Title: UsedCarInfoController  
* @Description: 二手车信息控制器  
* @author: MengNing  
* @date: 2019年4月4日下午8:13:31  
*/
@Controller
@RequestMapping(value = "/usedCar")
public class UsedCarInfoController {
	
	@Resource
	private UsedCarInfoService usedCarService;
	@Resource
	private IVBrandService ivbService;
	@Resource
	private ILPLocationService lplService;
	
	/**
	 * @Title: findUsedCarPageInfo   
	 * @Description: 分页查询二手车信息   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param page
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findUsedCarPageInfo")
	public String findUsedCarPageInfo(HttpServletRequest request, HttpServletResponse response, Integer page) {
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
		List<UsedCarInfo> lisc = usedCarService.findAllUsedCarPageInfo(currIndex, pageSize);
		// 无分页查询
		List<UsedCarInfo> lsall = usedCarService.findAllUsedCarInfo();
		// 为前端准备数据
		List<VehicleBrand> lsvb = ivbService.findVBListToJsp();
		// 城市数据
		List<LicensePlateLocation> lslpl = lplService.findLPLInfoToJsp();
		if(lisc != null) {
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
			request.setAttribute("lisc", lisc);
			request.setAttribute("lsvb", lsvb);
			request.setAttribute("lslpl", lslpl);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "used_car_info.jsp";
		} else {
			return "error.jsp";
		}
	}
	
	/**
	 * @Title: addUsedCarInfo   
	 * @Description: 添加二手车信息，带文件上传   
	 * @param: @param request
	 * @param: @param response
	 * @param: @param usedCarInfo
	 * @param: @param file
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/addUsedCarInfo")
	public String addUsedCarInfo(HttpServletRequest request, HttpServletResponse response, UsedCarInfo usedCarInfo, @RequestParam("file")MultipartFile file) throws Exception {
		// 数据库保存路径
		String serverPath = "";
		// 本地文件保存路径
		String localPath = "D:\\upload\\";
		// 文件原名
		String fileName = "";
		// 服务路径
		String sqlPath = "";
		String trueFileName = null;
		if(file != null) {
			// 文件类型
			String type = null;
			// 获取文件原名称
			fileName = file.getOriginalFilename();
			System.out.println("文件原名称" + fileName);
			String realPath = null;
			// 获取文件类型
			type = fileName.substring(fileName.lastIndexOf(".")+1);
			System.out.println("文件类型" + type.toUpperCase());
			if("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
				// 项目在服务器中发布的根路径
				realPath = request.getSession().getServletContext().getRealPath("/upload/");
				System.out.println("服务器发布根路径" + realPath);
				// 自定义的文件名称
				trueFileName = StringUtil.getFilename() + "." + type;
				System.out.println("自定义文件名称" + trueFileName);
				
				// 本地服务器保存路径
//				sqlPath = localPath + trueFileName;
				// 服务器路径
				serverPath = realPath + trueFileName;
				try {
					// 保存文件至服务器
//					file.transferTo(new File(sqlPath));
					
					file.transferTo(new File(serverPath));
					System.out.println("文件上传成功，路径为：" + serverPath);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("文件类型错误！");
				return null;
			}
		} else {
			System.out.println("么有找到相应的文件！");
			return null;
		}
		// 保存文件的相对路径至数据库
		System.out.println("服务路径sqlPath" + "=================" + sqlPath);
		usedCarInfo.setPicture1(trueFileName);
		// 设置创建时间
		usedCarInfo.setCreate_time(DateUtil.getDate());
		if(usedCarInfo.getUci_id() == null) {
			usedCarInfo.setUci_id(StringUtil.getRoundId());
		}
		usedCarService.addUsedCarInfo(usedCarInfo);
		return "usedCar/findUsedCarPageInfo";
	}
	
	/**
	 * @Title: findUsedCarInfoToWeb   
	 * @Description: 根据前端传入的各种条件对二手车信息进行查询  
	 * @param: @param request
	 * @param: @param response
	 * @param: @param usedCarInfo
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findUsedCarInfoToWeb")
	public String findUsedCarInfoToWeb(HttpServletRequest request, HttpServletResponse response, UsedCarInfo usedCarInfo, String arg, Integer page) {
			// 查询首页前三个展示最新上架二手车的信息，此时条件无限制，只是需要以日期排序
			List<UsedCarInfo> lisu = usedCarService.findAllUsedCarInfoIndex(usedCarInfo);
			
			if(lisu != null) {
				request.setAttribute("lisu", lisu);
				return "/web_user/index.jsp";
			} else {
				return "error.jsp";
			}
		
	}
	
	/**
	 * @Title: findUsedCarInfoToBuyCar   
	 * @Description:  查询买车信息  
	 * @param: @param request
	 * @param: @param response
	 * @param: @param usedCarInfo
	 * @param: @param page
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/findUsedCarInfoToBuyCar")
	public String findUsedCarInfoToBuyCar(HttpServletRequest request, HttpServletResponse response, UsedCarInfo usedCarInfo, Integer page) {
		// 参数为1时，则查询我要买车模块的分页查询，每页显示记录数为6
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
			currIndex = (page-1)*ConstantUtil.PageSizeWeb;
 		}
		Integer pageSize = page*ConstantUtil.PageSizeWeb;
		// 分页查询
		List<UsedCarInfo> lisbuy = usedCarService.findUsedCarInfoToWeb(currIndex, pageSize,usedCarInfo);
		// 无分页查询
		List<UsedCarInfo> lsall = usedCarService.findAllUsedCarInfo();
		if(lisbuy != null) {
			// 取得最大页数,通过判断奇偶的到最大页数
			if(lsall.size()%ConstantUtil.PageSizeWeb == 0) {
				maxPage = (lsall.size()) / (ConstantUtil.PageSizeWeb);
			} else {
				maxPage = (lsall.size()) / (ConstantUtil.PageSizeWeb) + 1;
			}
			// 取得当前页数
			nowPage = page;
			if(nowPage > maxPage) {
				nowPage = maxPage;
			}
			request.setAttribute("lisbuy", lisbuy);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("nowPage", nowPage);
			return "/web_user/buycar.jsp";
		} else {
			return "error.jsp";
		}
	}
	
	/**
	 * @Title: serviceInfo   
	 * @Description: 展示服务信息，无其他功能
	 * @param: @param request
	 * @param: @param response
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/serviceInfo")
	public String serviceInfo(HttpServletRequest request, HttpServletResponse response) {
		return "/web_user/service.jsp";
	}
	
	/**
	 * @Title: sellService   
	 * @Description: 跳转买车页面  
	 * @param: @param request
	 * @param: @param response
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/sellService")
	public String sellService(HttpServletRequest request, HttpServletResponse response) {
		return "/web_user/sellcar.jsp";
	}
	
	/**
	 * @Title: sellDetailInfo   
	 * @Description: 跳转到二手车信息详情页面  
	 * @param: @param request
	 * @param: @param response
	 * @param: @param uci_id
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/sellDetailInfo")
	public String sellDetailInfo(HttpServletRequest request, HttpServletResponse response, String uci_id) {
		// 根据id查询二手车详细信息
		UsedCarInfo usedCarInfo = usedCarService.findUsedCarInfoByUci_id(uci_id);
		
		if(usedCarInfo != null) {
			request.setAttribute("usedCarInfo", usedCarInfo);
			return "web_user/sell_detail_info.jsp";
		}
		
		return "error.jsp";
	}
	
}
