package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.IntentionBuyCar;
import org.mn.dao.IntBuyCarDao;
import org.mn.service.IIntBuyCarService;
import org.springframework.stereotype.Service;

/**  
* @Title: IntBuyCarService  
* @Description: 意向买车者信息业务  
* @author: MengNing  
* @date: 2019年4月4日下午5:40:23  
*/
@Service
public class IntBuyCarService implements IIntBuyCarService {

	@Resource
	private IntBuyCarDao buyDao;
	/* 
	 * @see org.mn.service.IIntBuyCarService#buyCarInfoFromCompany(org.mn.bean.IntentionBuyCar)
	 */
	@Override
	public int buyCarInfoFromCompany(IntentionBuyCar buyCar) {
		// TODO Auto-generated method stub
		return buyDao.buyCarInfoFromCompany(buyCar);
	}
	/* 
	 * @see org.mn.service.IIntBuyCarService#findIBCInfo(org.mn.bean.IntentionBuyCar)
	 */
	@Override
	public IntentionBuyCar findIBCInfo(IntentionBuyCar buyCar) {
		// TODO Auto-generated method stub
		return buyDao.findIBCInfo(buyCar);
	}
	/* 
	 * @see org.mn.service.IIntBuyCarService#findAllIbcPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<IntentionBuyCar> findAllIbcPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return buyDao.findAllIbcPageInfo(currIndex, pageSize);
	}
	/* 
	 * @see org.mn.service.IIntBuyCarService#findAllIbcInfo()
	 */
	@Override
	public List<IntentionBuyCar> findAllIbcInfo() {
		// TODO Auto-generated method stub
		return buyDao.findAllIbcInfo();
	}

}
