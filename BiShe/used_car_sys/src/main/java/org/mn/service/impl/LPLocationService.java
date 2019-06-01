package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.LicensePlateLocation;
import org.mn.dao.LPLocationDao;
import org.mn.service.ILPLocationService;
import org.springframework.stereotype.Service;

/**  
* @Title: LPLocationService  
* @Description: 地理位置业务 
* @author: MengNing  
* @date: 2019年4月4日下午8:08:47  
*/
@Service
public class LPLocationService implements ILPLocationService {

	@Resource
	private LPLocationDao lplDao;
	
	/* 
	 * @see org.mn.service.ILPLocationService#findAllLocationInfo()
	 */
	@Override
	public List<LicensePlateLocation> findAllLocationInfo() {
		// TODO Auto-generated method stub
		return lplDao.findAllLocationInfo();
	}

	/* 
	 * @see org.mn.service.ILPLocationService#findAllLocationPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<LicensePlateLocation> findAllLocationPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return lplDao.findAllLocationPageInfo(currIndex, pageSize);
	}

	/* 
	 * @see org.mn.service.ILPLocationService#findLPLInfoToJsp()
	 */
	@Override
	public List<LicensePlateLocation> findLPLInfoToJsp() {
		// TODO Auto-generated method stub
		return lplDao.findLPLInfoToJsp();
	}

}
