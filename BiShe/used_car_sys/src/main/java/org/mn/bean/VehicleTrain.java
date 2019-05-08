package org.mn.bean;

/**  
* @Title: VehicleBrand  
* @Description: 车辆车系信息
* @author: MengNing  
* @date: 2019年4月1日上午12:26:12  
*/
public class VehicleTrain {
	// 车辆车系id
	private String vt_id;
	// 车辆车系名称
	private String vt_name;
	
	// 车辆车系所属车辆品牌
	private String vb_id;
	
	// 关联属性
	private String vb_name;
	/**
	 * 
	 */
	public VehicleTrain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param vt_id
	 * @param vt_name
	 * @param vb_id
	 * @param vb_name
	 */
	public VehicleTrain(String vt_id, String vt_name, String vb_id, String vb_name) {
		super();
		this.vt_id = vt_id;
		this.vt_name = vt_name;
		this.vb_id = vb_id;
		this.vb_name = vb_name;
	}
	/**
	 * @return the vt_id
	 */
	public String getVt_id() {
		return vt_id;
	}
	/**
	 * @param vt_id the vt_id to set
	 */
	public void setVt_id(String vt_id) {
		this.vt_id = vt_id;
	}
	/**
	 * @return the vt_name
	 */
	public String getVt_name() {
		return vt_name;
	}
	/**
	 * @param vt_name the vt_name to set
	 */
	public void setVt_name(String vt_name) {
		this.vt_name = vt_name;
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
	
	
}
