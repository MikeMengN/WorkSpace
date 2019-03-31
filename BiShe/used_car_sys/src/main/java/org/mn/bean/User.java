package org.mn.bean;

/**  
* @Title: User  
* @Description: 用户实体类
* @author: MengNing  
* @date: 2019年3月30日 下午3:44:13  
*/
public class User {
	// 用户id
	private String user_id;
	// 用户姓名
	private String user_name;
	// 用户密码
	private String user_passwd;
	// 用户电话号码
	private String user_phone;
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param user_id
	 * @param user_name
	 * @param user_passwd
	 * @param user_phone
	 */
	public User(String user_id, String user_name, String user_passwd, String user_phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_passwd = user_passwd;
		this.user_phone = user_phone;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_passwd
	 */
	public String getUser_passwd() {
		return user_passwd;
	}
	/**
	 * @param user_passwd the user_passwd to set
	 */
	public void setUser_passwd(String user_passwd) {
		this.user_passwd = user_passwd;
	}
	/**
	 * @return the user_phone
	 */
	public String getUser_phone() {
		return user_phone;
	}
	/**
	 * @param user_phone the user_phone to set
	 */
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	
	
}

