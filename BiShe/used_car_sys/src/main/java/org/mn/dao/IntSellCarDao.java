package org.mn.dao;

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
}
