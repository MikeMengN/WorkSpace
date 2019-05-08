package org.mn.service;

import java.util.List;

import org.mn.bean.VehicleTrain;

/**  
* @Title: IVTrainService  
* @Description: 车辆车系业务接口  
* @author: MengNing  
* @date: 2019年4月4日下午8:18:26  
*/
public interface IVTrainService {
	
	/**
	 * @Title: findAllVTrainInfo   
	 * @Description: 查询所有车系信息   
	 * @return: List<VehicleTrain>      
	 * @throws
	 */
	List<VehicleTrain> findAllVTrainInfo();
	
	/**
	 * @Title: findAllVTrainPageInfo   
	 * @Description: 分页查询所有车系信息   
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<VehicleTrain>      
	 * @throws
	 */
	List<VehicleTrain> findAllVTrainPageInfo(Integer currIndex, Integer pageSize);
}
