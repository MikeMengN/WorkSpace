package org.mn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.IntentionSellCar;

/**  
* @Title: IIntSellCarService  
* @Description: 意向卖车者信息业务接口 
* @author: MengNing  
* @date: 2019年4月4日下午5:41:30  
*/
public interface IIntSellCarService {

	/**
	 * @Title: sellCarToCompany   
	 * @Description:意向卖车者信息收集  
	 * @param: @param sellCar
	 * @return: int      
	 * @throws
	 */
	int sellCarToCompany(IntentionSellCar sellCar);
	
	/**
	 * @Title: findSellCarInfo   
	 * @Description:查询卖车信息中是否有重复
	 * @param: @param sellCar
	 * @return: IntentionSellCar      
	 * @throws
	 */
	IntentionSellCar findSellCarInfo(IntentionSellCar sellCar);
	
	/**
	 * @Title: findSellCarPageInfo   
	 * @Description:分页查询 
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<IntentionSellCar>      
	 * @throws
	 */
	List<IntentionSellCar> findSellCarPageInfo(Integer currIndex, Integer pageSize);
	
	/**
	 * @Title: findAllSellCarInfo   
	 * @Description:查询所有信息 
	 * @param: @return      
	 * @return: List<IntentionSellCar>      
	 * @throws
	 */
	List<IntentionSellCar> findAllSellCarInfo();
}
