package org.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mn.bean.VehicleBrand;
import org.mn.dao.VBrandDao;
import org.mn.service.IVBrandService;
import org.springframework.stereotype.Service;

/**  
* @Title: VBrandService  
* @Description: 车辆品牌信息业务  
* @author: MengNing  
* @date: 2019年4月4日下午8:16:41  
*/
@Service
public class VBrandService implements IVBrandService {

	@Resource
	private VBrandDao vBDao;
	/* 
	 * @see org.mn.service.IVBrandService#findAllVBrandInfo()
	 */
	@Override
	public List<VehicleBrand> findAllVBrandInfo() {
		// TODO Auto-generated method stub
		return vBDao.findAllVBrandInfo();
	}

	/* 
	 * @see org.mn.service.IVBrandService#findAllVBrandPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<VehicleBrand> findAllVBrandPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return vBDao.findAllVBrandPageInfo(currIndex, pageSize);
	}

}
