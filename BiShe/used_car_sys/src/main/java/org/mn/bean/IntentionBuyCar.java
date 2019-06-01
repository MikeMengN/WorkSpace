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
	// 创建时间
	private String create_time; 
	
	/*
	 * 以下是临时属性
	 */
	private String user_name;
	private String user_sex;
	private String user_phone;
	private String ex_factory_price;
	private String present_price;
	private String vb_name;
	
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
	public IntentionBuyCar(String ibc_id, String user_id, String uci_id, String create_time) {
		super();
		this.ibc_id = ibc_id;
		this.user_id = user_id;
		this.uci_id = uci_id;
		this.create_time = create_time;
	}
	
	
	/**
	 * @param ibc_id
	 * @param user_id
	 * @param uci_id
	 * @param create_time
	 * @param user_name
	 * @param user_sex
	 * @param user_phone
	 * @param ex_factory_price
	 * @param present_price
	 * @param vb_name
	 */
	public IntentionBuyCar(String ibc_id, String user_id, String uci_id, String create_time, String user_name,
			String user_sex, String user_phone, String ex_factory_price, String present_price, String vb_name) {
		super();
		this.ibc_id = ibc_id;
		this.user_id = user_id;
		this.uci_id = uci_id;
		this.create_time = create_time;
		this.user_name = user_name;
		this.user_sex = user_sex;
		this.user_phone = user_phone;
		this.ex_factory_price = ex_factory_price;
		this.present_price = present_price;
		this.vb_name = vb_name;
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
	/**
	 * @return the ex_factory_price
	 */
	public String getEx_factory_price() {
		return ex_factory_price;
	}
	/**
	 * @param ex_factory_price the ex_factory_price to set
	 */
	public void setEx_factory_price(String ex_factory_price) {
		this.ex_factory_price = ex_factory_price;
	}
	/**
	 * @return the present_price
	 */
	public String getPresent_price() {
		return present_price;
	}
	/**
	 * @param present_price the present_price to set
	 */
	public void setPresent_price(String present_price) {
		this.present_price = present_price;
	}
	/**
	 * @return the vb_name
	 */
	public String getVb_name() {
		return vb_name;
	}
	/**
	 * @param vb_name the vb_name to set
	 */
	public void setVb_name(String vb_name) {
		this.vb_name = vb_name;
	}
	
	
}
