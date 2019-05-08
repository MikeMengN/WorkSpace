package org.mn.service.impl;
import java.util.List;
import javax.annotation.Resource;
import org.mn.bean.VehicleTrain;
import org.mn.dao.VTrainDao;
import org.mn.service.IVTrainService;
import org.springframework.stereotype.Service;

/**  
* @Title: VTrainService  
* @Description: 车辆车系业务层  
* @author: MengNing  
* @date: 2019年4月4日下午8:18:46  
*/
@Service
public class VTrainService implements IVTrainService {

	@Resource
	private VTrainDao vTDao;
	/* 
	 * @see org.mn.service.IVTrainService#findAllVTrainInfo()
	 */
	@Override
	public List<VehicleTrain> findAllVTrainInfo() {
		// TODO Auto-generated method stub
		return vTDao.findAllVTrainInfo();
	}

	/* 
	 * @see org.mn.service.IVTrainService#findAllVTrainPageInfo(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<VehicleTrain> findAllVTrainPageInfo(Integer currIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return vTDao.findAllVTrainPageInfo(currIndex, pageSize);
	}

}
