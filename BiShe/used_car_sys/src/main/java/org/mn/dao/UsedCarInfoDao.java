package org.mn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mn.bean.UsedCarInfo;

/**  
* @Title: UsedCarInfoDao  
* @Description: 二手车信息数据访问层  
* @author: MengNing  
* @date: 2019年4月4日下午8:13:44  
*/
public interface UsedCarInfoDao {
	/**
	 * @Title: findAllUsedCarInfo   
	 * @Description:查询所有二手车信息    
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findAllUsedCarInfo();
	
	/**
	 * @Title: findAllUsedCarPageInfo   
	 * @Description: 分页查询所有二手车信息 -后端管理系统查询 
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findAllUsedCarPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
	
	/**
	 * @Title: addUsedCarInfo   
	 * @Description: 插入二手车信息  
	 * @param: @param usedCar
	 * @return: int      
	 * @throws
	 */
	int addUsedCarInfo(@Param("usedCar") UsedCarInfo usedCar);
	
	/**
	 * @Title: updateUsedCarInfo   
	 * @Description: 更新二手车信息   
	 * @param: @param usedCar
	 * @return: int      
	 * @throws
	 */
	int updateUsedCarInfo(@Param("usedCar") UsedCarInfo usedCar);
	
	/**
	 * @Title: deleteUsedCarInfo   
	 * @Description: 删除二手车信息   
	 * @param: @param uci_id
	 * @return: int      
	 * @throws
	 */
	int deleteUsedCarInfo(@Param("uci_id") String uci_id);
	
	/**
	 * @Title: findUsedCarInfoToWeb   
	 * @Description:按条件查询二手车信息--前端用户模块    
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @param: @param usedCar
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findUsedCarInfoToWeb(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize, @Param("usedCar") UsedCarInfo usedCar);
	
	/**
	 * @Title: findUsedCarInfoToWebIndex   
	 * @Description:首页查询，三条信息    
	 * @param: @param usedCar
	 * @return: List<UsedCarInfo>      
	 * @throws
	 */
	List<UsedCarInfo> findUsedCarInfoToWebIndex(@Param("usedCar") UsedCarInfo usedCar);
	
	/**
	 * @Title: findUsedCarInfoByUci_Id   
	 * @Description:根据id查询二手车信息    
	 * @param: @param uci_id
	 * @return: UsedCarInfo      
	 * @throws
	 */
	UsedCarInfo findUsedCarInfoByUci_Id(@Param("uci_id") String uci_id);
}
