package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.IntentionSellCar;

/**  
* @Title: IntSellCarDao  
* @Description: 意向卖车者信息数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午5:41:18  
*/
public interface IntSellCarDao {

	/**
	 * @Title: sellCarToCompany   
	 * @Description:处理卖车用户请求数据访问层接口  
	 * @param: @param sellCar
	 * @return: int      
	 * @throws
	 */
	int sellCarToCompany(@Param("sellCar") IntentionSellCar sellCar);
	
	/**
	 * @Title: findSellCarInfo   
	 * @Description:查询信息是否重复  
	 * @param: @param sellCar
	 * @return: IntentionSellCar      
	 * @throws
	 */
	IntentionSellCar findSellCarInfo(@Param("sellCar") IntentionSellCar sellCar);
	
	/**
	 * @Title: findSellCarPageInfo   
	 * @Description:后端分页查询  
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<IntentionSellCar>      
	 * @throws
	 */
	List<IntentionSellCar> findSellCarPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
	
	/**
	 * @Title: findAllSellCarInfo   
	 * @Description:查询所有信息 
	 * @return: List<IntentionSellCar>      
	 * @throws
	 */
	List<IntentionSellCar> findAllSellCarInfo();
}
