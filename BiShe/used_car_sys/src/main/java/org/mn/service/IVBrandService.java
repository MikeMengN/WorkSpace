package org.mn.service;

import java.util.List;

import org.mn.bean.VehicleBrand;

/**  
* @Title: IVBrandService  
* @Description: 车辆品牌信息业务接口  
* @author: MengNing  
* @date: 2019年4月4日下午8:16:21  
*/
public interface IVBrandService {

	/**
	 * @Title: findAllVBrandInfo   
	 * @Description:查询所有品牌信息    
	 * @return: List<VehicleBrand>      
	 * @throws
	 */
	List<VehicleBrand> findAllVBrandInfo();
	
	/**
	 * @Title: findAllVBrandPageInfo   
	 * @Description:分页查询所有品牌信息    
	 * @param: @return      
	 * @return: List<VehicleBrand>      
	 * @throws
	 */
	List<VehicleBrand> findAllVBrandPageInfo(Integer currIndex, Integer pageSize);
}
