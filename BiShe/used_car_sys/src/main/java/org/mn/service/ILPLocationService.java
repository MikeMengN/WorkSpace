package org.mn.service;

import java.util.List;

import org.mn.bean.LicensePlateLocation;

/**  
* @Title: ILPLocationService  
* @Description: 地理位置业务接口
* @author: MengNing  
* @date: 2019年4月4日下午8:08:15  
*/
public interface ILPLocationService {
	
	/**
	 * @Title: findAllLocationInfo   
	 * @Description: 查询所有城市信息   
	 * @return: List<LicensePlateLocation>      
	 * @throws
	 */
	List<LicensePlateLocation> findAllLocationInfo();
	
	/**
	 * @Title: findAllLocationPageInfo   
	 * @Description:查询所有城市信息    
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<LicensePlateLocation>      
	 * @throws
	 */
	List<LicensePlateLocation> findAllLocationPageInfo(Integer currIndex, Integer pageSize);
}
