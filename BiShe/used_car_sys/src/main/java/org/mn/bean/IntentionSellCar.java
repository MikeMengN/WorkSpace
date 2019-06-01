package org.mn.bean;

/**  
* @Title: IntentionSellCar  
* @Description: 意向卖车者信息实体   
* @author: MengNing  
* @date: 2019年4月1日上午12:22:15  
*/
public class IntentionSellCar {
	// 主键id
	private String isc_id;
	// 用户id
	private String user_id;
	// 创建时间
	private String create_time;
	/*
	 * 以下是临时使用的属性
	 */
	private String user_name;
	private String user_sex;
	private String user_phone;
	
	/**
	 * 
	 */
	public IntentionSellCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param isc_id
	 * @param user_id
	 */
	public IntentionSellCar(String isc_id, String user_id, String create_time) {
		super();
		this.isc_id = isc_id;
		this.user_id = user_id;
		this.create_time = create_time;
	}
	
	/**
	 * 临时实体类
	 */
	/**
	 * @return the isc_id
	 */
	public String getIsc_id() {
		return isc_id;
	}
	/**
	 * @param isc_id
	 * @param user_id
	 * @param create_time
	 * @param user_name
	 * @param user_sex
	 * @param user_phone
	 */
	public IntentionSellCar(String isc_id, String user_id, String create_time, String user_name, String user_sex,
			String user_phone) {
		super();
		this.isc_id = isc_id;
		this.user_id = user_id;
		this.create_time = create_time;
		this.user_name = user_name;
		this.user_sex = user_sex;
		this.user_phone = user_phone;
	}
	/**
	 * @param isc_id the isc_id to set
	 */
	public void setIsc_id(String isc_id) {
		this.isc_id = isc_id;
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
	 * @return the create_time
	 */
	public String getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
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
	 * @return the user_sex
	 */
	public String getUser_sex() {
		return user_sex;
	}
	/**
	 * @param user_sex the user_sex to set
	 */
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
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
