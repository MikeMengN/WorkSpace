package org.mn.service.impl;

import javax.annotation.Resource;

import org.mn.bean.IntentionSellCar;
import org.mn.dao.IntSellCarDao;
import org.mn.service.IIntSellCarService;
import org.springframework.stereotype.Service;

/**  
* @Title: IntSellCarService  
* @Description: 意向卖车者信息业务
* @author: MengNing  
* @date: 2019年4月4日下午5:41:55  
*/
@Service
public class IntSellCarService implements IIntSellCarService {

	@Resource
	private IntSellCarDao iscDao;

	/* 
	 * @see org.mn.service.IIntSellCarService#sellCarToCompany(org.mn.bean.IntentionSellCar)
	 */
	@Override
	public int sellCarToCompany(IntentionSellCar sellCar) {
		// TODO Auto-generated method stub
		return iscDao.sellCarToCompany(sellCar);
	}
	
}
