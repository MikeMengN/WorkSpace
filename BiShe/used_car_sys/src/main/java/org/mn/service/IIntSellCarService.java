package org.mn.service;

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
}
