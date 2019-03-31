package org.mn.bean;

/**  
* @Title: VehicleBrand  
* @Description: 车辆品牌信息
* @author: MengNing  
* @date: 2019年4月1日上午12:26:12  
*/
public class VehicleBrand {
	// 车辆品牌id
	private String vb_id;
	// 车辆品牌名称
	private String vb_name;
	// 车辆品牌所属国家
	private String country;
	/**
	 * 
	 */
	public VehicleBrand() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param vb_id
	 * @param vb_name
	 * @param country
	 */
	public VehicleBrand(String vb_id, String vb_name, String country) {
		super();
		this.vb_id = vb_id;
		this.vb_name = vb_name;
		this.country = country;
	}
	/**
	 * @return the vb_id
	 */
	public String getVb_id() {
		return vb_id;
	}
	/**
	 * @param vb_id the vb_id to set
	 */
	public void setVb_id(String vb_id) {
		this.vb_id = vb_id;
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
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
}
