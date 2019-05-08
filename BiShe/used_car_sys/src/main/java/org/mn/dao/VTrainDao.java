package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.VehicleTrain;

/**  
* @Title: VTrainDao  
* @Description: 车辆车系数据访问层 
* @author: MengNing  
* @date: 2019年4月4日下午8:18:15  
*/
public interface VTrainDao {

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
	List<VehicleTrain> findAllVTrainPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
}
