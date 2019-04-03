package org.mn.bean;

/**  
* @Title: QualityInspection  
* @Description: 二手车质量检测信息实体   
* @author: MengNing  
* @date: 2019年4月1日上午9:00:37  
*/
public class QualityInspection {
	// 主键id
	private String qi_id;
	// 是否是事故车,是为1，不是为0，默认为0
	private Integer accident_vehicle;
	// 底盘情况,正常为0，不正常为1，默认为0
	private Integer chassis_status;
	// 是否轻微碰撞,是为0，不是为1，默认为1
	private Integer slight_collision;
	// 易损耗部件是否正常,正常为0，不正常为1，默认为0
	private Integer vulnerable_part;
	// 常用功能是否正常,正常为0，不正常为1，默认为0
	private Integer commonly_used_functions;
	// 启动驾驶检测是否正常,正常为0，不正常为1，默认为0
	private Integer driving_test;
	// 外观内饰是否正常,正常为0，不正常为1，默认为0
	private Integer appearance_of_interior;
	/**
	 * 
	 */
	public QualityInspection() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param qi_id
	 * @param accident_vehicle
	 * @param chassis_status
	 * @param slight_collision
	 * @param vulnerable_part
	 * @param commonly_used_functions
	 * @param driving_test
	 * @param appearance_of_interior
	 */
	public QualityInspection(String qi_id, Integer accident_vehicle, Integer chassis_status, Integer slight_collision,
			Integer vulnerable_part, Integer commonly_used_functions, Integer driving_test,
			Integer appearance_of_interior) {
		super();
		this.qi_id = qi_id;
		this.accident_vehicle = accident_vehicle;
		this.chassis_status = chassis_status;
		this.slight_collision = slight_collision;
		this.vulnerable_part = vulnerable_part;
		this.commonly_used_functions = commonly_used_functions;
		this.driving_test = driving_test;
		this.appearance_of_interior = appearance_of_interior;
	}
	/**
	 * @return the qi_id
	 */
	public String getQi_id() {
		return qi_id;
	}
	/**
	 * @param qi_id the qi_id to set
	 */
	public void setQi_id(String qi_id) {
		this.qi_id = qi_id;
	}
	/**
	 * @return the accident_vehicle
	 */
	public Integer getAccident_vehicle() {
		return accident_vehicle;
	}
	/**
	 * @param accident_vehicle the accident_vehicle to set
	 */
	public void setAccident_vehicle(Integer accident_vehicle) {
		this.accident_vehicle = accident_vehicle;
	}
	/**
	 * @return the chassis_status
	 */
	public Integer getChassis_status() {
		return chassis_status;
	}
	/**
	 * @param chassis_status the chassis_status to set
	 */
	public void setChassis_status(Integer chassis_status) {
		this.chassis_status = chassis_status;
	}
	/**
	 * @return the slight_collision
	 */
	public Integer getSlight_collision() {
		return slight_collision;
	}
	/**
	 * @param slight_collision the slight_collision to set
	 */
	public void setSlight_collision(Integer slight_collision) {
		this.slight_collision = slight_collision;
	}
	/**
	 * @return the vulnerable_part
	 */
	public Integer getVulnerable_part() {
		return vulnerable_part;
	}
	/**
	 * @param vulnerable_part the vulnerable_part to set
	 */
	public void setVulnerable_part(Integer vulnerable_part) {
		this.vulnerable_part = vulnerable_part;
	}
	/**
	 * @return the commonly_used_functions
	 */
	public Integer getCommonly_used_functions() {
		return commonly_used_functions;
	}
	/**
	 * @param commonly_used_functions the commonly_used_functions to set
	 */
	public void setCommonly_used_functions(Integer commonly_used_functions) {
		this.commonly_used_functions = commonly_used_functions;
	}
	/**
	 * @return the driving_test
	 */
	public Integer getDriving_test() {
		return driving_test;
	}
	/**
	 * @param driving_test the driving_test to set
	 */
	public void setDriving_test(Integer driving_test) {
		this.driving_test = driving_test;
	}
	/**
	 * @return the appearance_of_interior
	 */
	public Integer getAppearance_of_interior() {
		return appearance_of_interior;
	}
	/**
	 * @param appearance_of_interior the appearance_of_interior to set
	 */
	public void setAppearance_of_interior(Integer appearance_of_interior) {
		this.appearance_of_interior = appearance_of_interior;
	}
	
}
