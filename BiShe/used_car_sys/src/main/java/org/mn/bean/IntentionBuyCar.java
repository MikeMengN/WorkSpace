package org.mn.bean;

/**  
* @Title: IntentionBuyCar  
* @Description: 意向买车者信息实体   
* @author: MengNing  
* @date: 2019年4月1日上午12:22:15  
*/
public class IntentionBuyCar {
	// 主键id
	private String ibc_id;
	// 用户id
	private String user_id;
	// 二手车id
	private String uci_id;
	/**
	 * 
	 */
	public IntentionBuyCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ibc_id
	 * @param user_id
	 * @param uci_id
	 */
	public IntentionBuyCar(String ibc_id, String user_id, String uci_id) {
		super();
		this.ibc_id = ibc_id;
		this.user_id = user_id;
		this.uci_id = uci_id;
	}
	/**
	 * @return the ibc_id
	 */
	public String getIbc_id() {
		return ibc_id;
	}
	/**
	 * @param ibc_id the ibc_id to set
	 */
	public void setIbc_id(String ibc_id) {
		this.ibc_id = ibc_id;
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
	 * @return the uci_id
	 */
	public String getUci_id() {
		return uci_id;
	}
	/**
	 * @param uci_id the uci_id to set
	 */
	public void setUci_id(String uci_id) {
		this.uci_id = uci_id;
	}
	
}
