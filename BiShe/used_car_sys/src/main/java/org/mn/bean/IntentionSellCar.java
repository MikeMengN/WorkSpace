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
	public IntentionSellCar(String isc_id, String user_id) {
		super();
		this.isc_id = isc_id;
		this.user_id = user_id;
	}
	/**
	 * @return the isc_id
	 */
	public String getIsc_id() {
		return isc_id;
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
	
	
}
