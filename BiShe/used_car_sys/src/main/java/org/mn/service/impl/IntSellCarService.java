package org.mn.service.impl;

import java.util.List;

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

	/* 
	 * @see org.mn.service.IIntSellCarService#findSellCarInfo(org.mn.bean.IntentionSellCar)
	 */
	@Override
	public IntentionSellCar findSellCarInfo(IntentionSellCar sellCar) {
		// TODO Auto-generated method stub
		return iscDao.findSellCarInfo(sellCar);
	}

	/* 
	 * @see org.mn.service.IIntSellCarService#findSellCarPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<IntentionSellCar> findSellCarPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return iscDao.findSellCarPageInfo(currIndex, pageSize);
	}

	/* 
	 * @see org.mn.service.IIntSellCarService#findAllSellCarInfo()
	 */
	@Override
	public List<IntentionSellCar> findAllSellCarInfo() {
		// TODO Auto-generated method stub
		return iscDao.findAllSellCarInfo();
	}
	
}
