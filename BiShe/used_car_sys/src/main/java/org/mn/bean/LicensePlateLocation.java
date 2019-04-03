package org.mn.bean;

/**  
* @Title: LicensePlateLocation  
* @Description: 二手车挂牌城市信息  
* @author: MengNing  
* @date: 2019年4月1日上午9:15:57  
*/
public class LicensePlateLocation {
	// 主键id
	private String lpl_id;
	// 城市名称
	private String city_name;
	/**
	 * 
	 */
	public LicensePlateLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param lpl_id
	 * @param city_name
	 */
	public LicensePlateLocation(String lpl_id, String city_name) {
		super();
		this.lpl_id = lpl_id;
		this.city_name = city_name;
	}
	/**
	 * @return the lpl_id
	 */
	public String getLpl_id() {
		return lpl_id;
	}
	/**
	 * @param lpl_id the lpl_id to set
	 */
	public void setLpl_id(String lpl_id) {
		this.lpl_id = lpl_id;
	}
	/**
	 * @return the city_name
	 */
	public String getCity_name() {
		return city_name;
	}
	/**
	 * @param city_name the city_name to set
	 */
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
}
