package org.mn.bean;

/**  
* @Title: UsedCarInfo  
* @Description: 二手车信息表  
* @author: MengNing  
* @date: 2019年4月1日上午9:05:15  
*/
public class UsedCarInfo {
	// 主键id
	private String uci_id;
	// 所属品牌id
	private String vb_id;
	// 所属车系id
	private String vt_id;
	// 出厂价
	private Double ex_factory_price;
	// 现价
	private Double present_price;
	// 车龄
	private Integer vehicle_age;
	// 变速箱,默认为0（不限）1（手动）2（自动）
	private Integer transmission;
	// 车型,详情参考瓜子二手车
	private Integer vehicle_model;
	// 行驶里程
	private Integer road_hual;
	// 排量
	private Float displacement;
	// 排放标准
	private Integer effluent_standard;
	// 座位数
	private Integer seating;
	// 燃油类型
	private Integer fuel_type;
	// 颜色
	private Integer color;
	// 车辆所在地
	private String lpl_id;
	// 驱动类型
	private Integer driving_type;
	// 国别.有冗余
	private String country;
	// 亮点配置
	private Integer highlight_the_configuration;
	// 图片1
	private String picture1;
	// 图片2
	private String picture2;
	// 图片3
	private String picture3;
	// 二手车质量检测信息
	private String qi_id;
	/**
	 * 
	 */
	public UsedCarInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param uci_id
	 * @param vb_id
	 * @param vt_id
	 * @param ex_factory_price
	 * @param present_price
	 * @param vehicle_age
	 * @param transmission
	 * @param vehicle_model
	 * @param road_hual
	 * @param displacement
	 * @param effluent_standard
	 * @param seating
	 * @param fuel_type
	 * @param color
	 * @param lpl_id
	 * @param driving_type
	 * @param country
	 * @param highlight_the_configuration
	 * @param picture1
	 * @param picture2
	 * @param picture3
	 * @param qi_id
	 */
	public UsedCarInfo(String uci_id, String vb_id, String vt_id, Double ex_factory_price, Double present_price,
			Integer vehicle_age, Integer transmission, Integer vehicle_model, Integer road_hual, Float displacement,
			Integer effluent_standard, Integer seating, Integer fuel_type, Integer color, String lpl_id,
			Integer driving_type, String country, Integer highlight_the_configuration, String picture1, String picture2,
			String picture3, String qi_id) {
		super();
		this.uci_id = uci_id;
		this.vb_id = vb_id;
		this.vt_id = vt_id;
		this.ex_factory_price = ex_factory_price;
		this.present_price = present_price;
		this.vehicle_age = vehicle_age;
		this.transmission = transmission;
		this.vehicle_model = vehicle_model;
		this.road_hual = road_hual;
		this.displacement = displacement;
		this.effluent_standard = effluent_standard;
		this.seating = seating;
		this.fuel_type = fuel_type;
		this.color = color;
		this.lpl_id = lpl_id;
		this.driving_type = driving_type;
		this.country = country;
		this.highlight_the_configuration = highlight_the_configuration;
		this.picture1 = picture1;
		this.picture2 = picture2;
		this.picture3 = picture3;
		this.qi_id = qi_id;
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
	 * @return the ex_factory_price
	 */
	public Double getEx_factory_price() {
		return ex_factory_price;
	}
	/**
	 * @param ex_factory_price the ex_factory_price to set
	 */
	public void setEx_factory_price(Double ex_factory_price) {
		this.ex_factory_price = ex_factory_price;
	}
	/**
	 * @return the present_price
	 */
	public Double getPresent_price() {
		return present_price;
	}
	/**
	 * @param present_price the present_price to set
	 */
	public void setPresent_price(Double present_price) {
		this.present_price = present_price;
	}
	/**
	 * @return the vehicle_age
	 */
	public Integer getVehicle_age() {
		return vehicle_age;
	}
	/**
	 * @param vehicle_age the vehicle_age to set
	 */
	public void setVehicle_age(Integer vehicle_age) {
		this.vehicle_age = vehicle_age;
	}
	/**
	 * @return the transmission
	 */
	public Integer getTransmission() {
		return transmission;
	}
	/**
	 * @param transmission the transmission to set
	 */
	public void setTransmission(Integer transmission) {
		this.transmission = transmission;
	}
	/**
	 * @return the vehicle_model
	 */
	public Integer getVehicle_model() {
		return vehicle_model;
	}
	/**
	 * @param vehicle_model the vehicle_model to set
	 */
	public void setVehicle_model(Integer vehicle_model) {
		this.vehicle_model = vehicle_model;
	}
	/**
	 * @return the road_hual
	 */
	public Integer getRoad_hual() {
		return road_hual;
	}
	/**
	 * @param road_hual the road_hual to set
	 */
	public void setRoad_hual(Integer road_hual) {
		this.road_hual = road_hual;
	}
	/**
	 * @return the displacement
	 */
	public Float getDisplacement() {
		return displacement;
	}
	/**
	 * @param displacement the displacement to set
	 */
	public void setDisplacement(Float displacement) {
		this.displacement = displacement;
	}
	/**
	 * @return the effluent_standard
	 */
	public Integer getEffluent_standard() {
		return effluent_standard;
	}
	/**
	 * @param effluent_standard the effluent_standard to set
	 */
	public void setEffluent_standard(Integer effluent_standard) {
		this.effluent_standard = effluent_standard;
	}
	/**
	 * @return the seating
	 */
	public Integer getSeating() {
		return seating;
	}
	/**
	 * @param seating the seating to set
	 */
	public void setSeating(Integer seating) {
		this.seating = seating;
	}
	/**
	 * @return the fuel_type
	 */
	public Integer getFuel_type() {
		return fuel_type;
	}
	/**
	 * @param fuel_type the fuel_type to set
	 */
	public void setFuel_type(Integer fuel_type) {
		this.fuel_type = fuel_type;
	}
	/**
	 * @return the color
	 */
	public Integer getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Integer color) {
		this.color = color;
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
	 * @return the driving_type
	 */
	public Integer getDriving_type() {
		return driving_type;
	}
	/**
	 * @param driving_type the driving_type to set
	 */
	public void setDriving_type(Integer driving_type) {
		this.driving_type = driving_type;
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
	/**
	 * @return the highlight_the_configuration
	 */
	public Integer getHighlight_the_configuration() {
		return highlight_the_configuration;
	}
	/**
	 * @param highlight_the_configuration the highlight_the_configuration to set
	 */
	public void setHighlight_the_configuration(Integer highlight_the_configuration) {
		this.highlight_the_configuration = highlight_the_configuration;
	}
	/**
	 * @return the picture1
	 */
	public String getPicture1() {
		return picture1;
	}
	/**
	 * @param picture1 the picture1 to set
	 */
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	/**
	 * @return the picture2
	 */
	public String getPicture2() {
		return picture2;
	}
	/**
	 * @param picture2 the picture2 to set
	 */
	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}
	/**
	 * @return the picture3
	 */
	public String getPicture3() {
		return picture3;
	}
	/**
	 * @param picture3 the picture3 to set
	 */
	public void setPicture3(String picture3) {
		this.picture3 = picture3;
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
	
	
}
