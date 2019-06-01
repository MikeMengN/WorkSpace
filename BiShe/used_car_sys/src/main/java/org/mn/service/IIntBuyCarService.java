package org.mn.service;

import java.util.List;

import org.mn.bean.IntentionBuyCar;

/**  
* @Title: IIntBuyCarService  
* @Description: 意向买车者信息业务接口   
* @author: MengNing  
* @date: 2019年4月4日下午5:39:49  
*/
public interface IIntBuyCarService {

	/**
	 * @Title: buyCarInfoFromCompany   
	 * @Description:买车者信息收集接口 
	 * @param: @param buyCar
	 * @return: int      
	 * @throws
	 */
	int buyCarInfoFromCompany(IntentionBuyCar buyCar);
	
	/**
	 * @Title: findIBCInfo   
	 * @Description:查询数据库中是否有重复记录 
	 * @param: @param buyCar
	 * @return: IntentionBuyCar      
	 * @throws
	 */
	IntentionBuyCar findIBCInfo(IntentionBuyCar buyCar);
	
	/**
	 * @Title: findAllIbcPageInfo   
	 * @Description:后端分页查询    
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<IntentionBuyCar>      
	 * @throws
	 */
	List<IntentionBuyCar> findAllIbcPageInfo(Integer currIndex, Integer pageSize);
	
	
	/**
	 * @Title: findAllIbcInfo   
	 * @Description:查询页面 
	 * @param: @return      
	 * @return: List<IntentionBuyCar>      
	 * @throws
	 */
	List<IntentionBuyCar> findAllIbcInfo();
}
