package org.mn.bean;

/**  
* @Title: Role  
* @Description: 角色实体类
* @author: MengNing  
* @date: 2019年4月1日上午12:19:37  
*/
public class Role {
	// 角色id
	private String role_id;
	// 角色名称
	private String role_name;
	/**
	 * 
	 */
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param role_id
	 * @param role_name
	 */
	public Role(String role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}
	/**
	 * @return the role_id
	 */
	public String getRole_id() {
		return role_id;
	}
	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	/**
	 * @return the role_name
	 */
	public String getRole_name() {
		return role_name;
	}
	/**
	 * @param role_name the role_name to set
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
}
