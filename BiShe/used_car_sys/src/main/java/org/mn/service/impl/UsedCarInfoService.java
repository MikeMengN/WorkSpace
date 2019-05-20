package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.UsedCarInfo;
import org.mn.dao.UsedCarInfoDao;
import org.mn.service.IUsedCarInfoService;
import org.springframework.stereotype.Service;

/**  
* @Title: UsedCarInfoService  
* @Description: 二手车信息业务  
* @author: MengNing  
* @date: 2019年4月4日下午8:14:18  
*/
@Service
public class UsedCarInfoService implements IUsedCarInfoService {
	
	@Resource
	private UsedCarInfoDao usedCarDao;

	/* 
	 * @see org.mn.service.IUsedCarInfoService#findAllUsedCarInfo()
	 */
	@Override
	public List<UsedCarInfo> findAllUsedCarInfo() {
		// TODO Auto-generated method stub
		return usedCarDao.findAllUsedCarInfo();
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#findAllUsedCarPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<UsedCarInfo> findAllUsedCarPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return usedCarDao.findAllUsedCarPageInfo(currIndex, pageSize);
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#addUsedCarInfo(org.mn.bean.UsedCarInfo)
	 */
	@Override
	public int addUsedCarInfo(UsedCarInfo usedCar) {
		// TODO Auto-generated method stub
		return usedCarDao.addUsedCarInfo(usedCar);
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#updateUsedCarInfo(org.mn.bean.UsedCarInfo)
	 */
	@Override
	public int updateUsedCarInfo(UsedCarInfo usedCar) {
		// TODO Auto-generated method stub
		return usedCarDao.updateUsedCarInfo(usedCar);
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#deleteUsedCarInfo(java.lang.String)
	 */
	@Override
	public int deleteUsedCarInfo(String uci_id) {
		// TODO Auto-generated method stub
		return usedCarDao.deleteUsedCarInfo(uci_id);
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#findAllUsedCarInfoIndex(org.mn.bean.UsedCarInfo)
	 */
	@Override
	public List<UsedCarInfo> findAllUsedCarInfoIndex(UsedCarInfo info) {
		// TODO Auto-generated method stub
		return usedCarDao.findUsedCarInfoToWebIndex(info);
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#findUsedCarInfoToWeb(java.lang.Integer, java.lang.Integer, org.mn.bean.UsedCarInfo)
	 */
	@Override
	public List<UsedCarInfo> findUsedCarInfoToWeb(Integer currIndex, Integer pageSize, UsedCarInfo carInfo) {
		// TODO Auto-generated method stub
		return usedCarDao.findUsedCarInfoToWeb(currIndex, pageSize, carInfo);
	}

	/* 
	 * @see org.mn.service.IUsedCarInfoService#findUsedCarInfoByUci_id(java.lang.String)
	 */
	@Override
	public UsedCarInfo findUsedCarInfoByUci_id(String uci_id) {
		// TODO Auto-generated method stub
		return usedCarDao.findUsedCarInfoByUci_Id(uci_id);
	}

	
}
