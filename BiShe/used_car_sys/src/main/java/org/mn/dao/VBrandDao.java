package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.VehicleBrand;

/**  
* @Title: VBrandDao  
* @Description: 车辆品牌信息数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午8:16:11  
*/
public interface VBrandDao {
	
	/**
	 * @Title: findAllVBrandInfo   
	 * @Description: 查询所有品牌信息    
	 * @return: List<VehicleBrand>      
	 * @throws
	 */
	List<VehicleBrand> findAllVBrandInfo();
	
	/**
	 * @Title: findAllVBrandPageInfo   
	 * @Description: 分页查询所有品牌信息   
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<VehicleBrand>      
	 * @throws
	 */
	List<VehicleBrand> findAllVBrandPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
}
