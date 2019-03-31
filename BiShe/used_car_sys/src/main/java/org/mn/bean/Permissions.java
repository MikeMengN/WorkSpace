package org.mn.bean;

/**  
* @Title: Permissions  
* @Description: 权限实体类  
* @author: MengNing  
* @date: 2019年4月1日上午12:17:09  
*/
public class Permissions {
	// 权限主键
	private String per_id;
	// 权限名称
	private String per_name;
	// 关联页面
	private String jsp_name;
	/**
	 * 
	 */
	public Permissions() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param per_id
	 * @param per_name
	 * @param jsp_name
	 */
	public Permissions(String per_id, String per_name, String jsp_name) {
		super();
		this.per_id = per_id;
		this.per_name = per_name;
		this.jsp_name = jsp_name;
	}
	/**
	 * @return the per_id
	 */
	public String getPer_id() {
		return per_id;
	}
	/**
	 * @param per_id the per_id to set
	 */
	public void setPer_id(String per_id) {
		this.per_id = per_id;
	}
	/**
	 * @return the per_name
	 */
	public String getPer_name() {
		return per_name;
	}
	/**
	 * @param per_name the per_name to set
	 */
	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}
	/**
	 * @return the jsp_name
	 */
	public String getJsp_name() {
		return jsp_name;
	}
	/**
	 * @param jsp_name the jsp_name to set
	 */
	public void setJsp_name(String jsp_name) {
		this.jsp_name = jsp_name;
	}
	
}
