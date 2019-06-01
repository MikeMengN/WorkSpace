package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.IntentionBuyCar;

/**  
* @Title: IntBuyCarDao  
* @Description: 意向买车者数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午5:39:30  
*/
public interface IntBuyCarDao {
	
	/**
	 * @Title: findAllIbcInfo   
	 * @Description: 查询所有意向卖车者信息   
	 * @return: List<IntentionBuyCar>      
	 * @throws
	 */
	List<IntentionBuyCar> findAllIbcInfo();
	
	/**
	 * @Title: findAllIbcPageInfo   
	 * @Description: 分页查询所有意向卖车者信息    
	 * @return: List<IntentionBuyCar>      
	 * @throws
	 */
	List<IntentionBuyCar> findAllIbcPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);

	/**
	 * @Title: buyCarInfoFromCompany   
	 * @Description: 意向卖车者信息收集   
	 * @param: @param buyCar
	 * @return: int      
	 * @throws
	 */
	int buyCarInfoFromCompany(@Param("buyCar") IntentionBuyCar buyCar);
	
	/**
	 * @Title: findIBCInfo   
	 * @Description: 查询数据库中是否有重复信息   
	 * @param: @param buyCar
	 * @return: IntentionBuyCar      
	 * @throws
	 */
	IntentionBuyCar findIBCInfo(@Param("buyCar") IntentionBuyCar buyCar);
}
