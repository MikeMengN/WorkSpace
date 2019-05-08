package org.mn.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mn.bean.Permissions;
/**  
* @Title: PermissionDao  
* @Description: 权限数据访问层 
* @author: MengNing  
* @date: 2019年4月4日下午5:37:02  
*/
public interface PermissionDao {
	
	/**
	 * @Title: findAllPerInfo   
	 * @Description: 查询所有权限信息
	 * @param: @return      
	 * @return: List<Permissions>      
	 * @throws
	 */
	List<Permissions> findAllPerInfo();
	
	/**
	 * @Title: findAllPerPageInfo   
	 * @Description: 分页查询所有权限信息   
	 * @param: @param currIndex
	 * @param: @param pageSize
	 * @param: @return      
	 * @return: List<Permissions>     
	 * @throws
	 */
	List<Permissions> findAllPerPageInfo(@Param("currIndex") Integer currIndex, @Param("pageSize") Integer pageSize);
}
