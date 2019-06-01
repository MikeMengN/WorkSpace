package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.LicensePlateLocation;

/**  
* @Title: LPLocationDao  
* @Description: 地理位置数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午8:07:59  
*/
public interface LPLocationDao {
	
	/**
	 * @Title: findAllLocationInfo   
	 * @Description: 查询所有地理位置信息   
	 * @return: List<LicensePlateLocation>      
	 * @throws
	 */
	List<LicensePlateLocation> findAllLocationInfo();
	
	/**
	 * @Title: findAllLocationPageInfo   
	 * @Description: 分页查询所有地理位置信息  
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<LicensePlateLocation>      
	 * @throws
	 */
	List<LicensePlateLocation> findAllLocationPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
	
	/**
	 * @Title: findLPLInfoToJsp   
	 * @Description:为前端准备数据    
	 * @param: @return      
	 * @return: List<LicensePlateLocation>      
	 * @throws
	 */
	List<LicensePlateLocation> findLPLInfoToJsp();
}
