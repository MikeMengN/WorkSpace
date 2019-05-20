package org.mn.service;

import java.util.List;

import org.mn.bean.UsedCarInfo;

/**  
* @Title: IUsedCarInfoService  
* @Description: 二手车信息业务接口  
* @author: MengNing  
* @date: 2019年4月4日下午8:13:58  
*/
public interface IUsedCarInfoService {
	
	/**
	 * @Title: findAllUsedCarInfo   
	 * @Description:查询所有二手车信息    
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findAllUsedCarInfo();
	
	/**
	 * @Title: findAllUsedCarPageInfo   
	 * @Description: 分页查询所有二手车信息  
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findAllUsedCarPageInfo(Integer currIndex, Integer pageSize);
	
	/**
	 * @Title: addUsedCarInfo   
	 * @Description: 插入二手车信息  
	 * @param: @param usedCar
	 * @return: int      
	 * @throws
	 */
	int addUsedCarInfo(UsedCarInfo usedCar);
	
	/**
	 * @Title: updateUsedCarInfo   
	 * @Description: 更新二手车信息   
	 * @param: @param usedCar
	 * @return: int      
	 * @throws
	 */
	int updateUsedCarInfo(UsedCarInfo usedCar);
	
	/**
	 * @Title: deleteUsedCarInfo   
	 * @Description: 删除二手车信息   
	 * @param: @param uci_id
	 * @return: int      
	 * @throws
	 */
	int deleteUsedCarInfo(String uci_id);
	
	/**
	 * @Title: findAllUsedCarPageInfo   
	 * @Description: 前端首页查询   
	 * @param: @param info
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findAllUsedCarInfoIndex(UsedCarInfo info);
	
	/**
	 * @Title: findUsedCarInfoToWeb   
	 * @Description: 买车模块查询  
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @param: @param carInfo
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findUsedCarInfoToWeb(Integer currIndex, Integer pageSize, UsedCarInfo carInfo);

	/**
	 * @Title: findUsedCarInfoByUci_id   
	 * @Description:根据二手车id查询二手车详细信息  
	 * @param: @param uci_id
	 * @return: UsedCarInfo      
	 * @throws
	 */
	UsedCarInfo findUsedCarInfoByUci_id(String uci_id);
}
