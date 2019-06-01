/*
 Navicat Premium Data Transfer

 Source Server         : mysql_local
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost:3306
 Source Schema         : used_car_sys

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : 65001

 Date: 01/06/2019 09:29:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for intention_buy_car
-- ----------------------------
DROP TABLE IF EXISTS `intention_buy_car`;
CREATE TABLE `intention_buy_car`  (
  `ibc_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `user_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联用户表',
  `uci_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '意向购买的二手车id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '请求时间',
  PRIMARY KEY (`ibc_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '意向买车者信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of intention_buy_car
-- ----------------------------
INSERT INTO `intention_buy_car` VALUES ('20190521111859905qI9HK9lMml', '001', '20190521105928998lQOEJIivum', '2019-05-21 11:18:59');
INSERT INTO `intention_buy_car` VALUES ('20190521123220690m6tIQb3COG', '001', '20190521105849264BV2tAcdViZ', '2019-05-21 12:32:20');

-- ----------------------------
-- Table structure for intention_sell_car
-- ----------------------------
DROP TABLE IF EXISTS `intention_sell_car`;
CREATE TABLE `intention_sell_car`  (
  `isc_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `user_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '卖车用户id,关联用户表',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '请求时间',
  PRIMARY KEY (`isc_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '意向卖车者信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of intention_sell_car
-- ----------------------------
INSERT INTO `intention_sell_car` VALUES ('20190527100628047YqC0BH2qGh', '001', '2019-05-27 22:06:28');

-- ----------------------------
-- Table structure for license_plate_location
-- ----------------------------
DROP TABLE IF EXISTS `license_plate_location`;
CREATE TABLE `license_plate_location`  (
  `lpl_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `city_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`lpl_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '车牌所在地信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of license_plate_location
-- ----------------------------
INSERT INTO `license_plate_location` VALUES ('001', '西安', '2019-05-07 20:18:18');
INSERT INTO `license_plate_location` VALUES ('002', '北京', '2019-05-07 20:18:21');
INSERT INTO `license_plate_location` VALUES ('003', '上海', '2019-05-07 20:18:25');
INSERT INTO `license_plate_location` VALUES ('004', '深圳', '2019-05-07 20:18:28');
INSERT INTO `license_plate_location` VALUES ('005', '广州', '2019-05-07 20:18:30');
INSERT INTO `license_plate_location` VALUES ('006', '武汉', '2019-05-07 20:18:33');
INSERT INTO `license_plate_location` VALUES ('007', '济南', '2019-05-07 20:18:35');

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions`  (
  `per_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限主键',
  `per_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名称',
  `jsp_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联页面',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`per_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of permissions
-- ----------------------------
INSERT INTO `permissions` VALUES ('001', '用户管理', 'user/findAllUserInfo', '2019-03-31 23:55:43');
INSERT INTO `permissions` VALUES ('002', '角色管理', 'role/findAllRoleInfo', '2019-03-31 23:56:14');
INSERT INTO `permissions` VALUES ('003', '权限管理', 'permissions/findAllPerInfo', '2019-03-31 23:56:41');
INSERT INTO `permissions` VALUES ('004', '意向买车者信息管理', 'ibc/findAllBuyCarPageInfo', '2019-03-31 23:57:30');
INSERT INTO `permissions` VALUES ('005', '意向卖车者信息管理', 'isc/findSellCarPageInfo', '2019-03-31 23:59:07');
INSERT INTO `permissions` VALUES ('006', '二手车信息列表', 'usedCar/findUsedCarPageInfo', '2019-03-31 23:59:50');
INSERT INTO `permissions` VALUES ('007', '车辆品牌管理', 'vbrand/findAllVBrandInfo', '2019-04-01 00:01:16');
INSERT INTO `permissions` VALUES ('008', '车辆车系管理', 'vtrain/findAllVTrainInfo', '2019-04-01 00:01:42');
INSERT INTO `permissions` VALUES ('009', '地理位置管理', 'lpl/findAllLocationInfo', '2019-04-01 00:03:00');

-- ----------------------------
-- Table structure for quality_inspection
-- ----------------------------
DROP TABLE IF EXISTS `quality_inspection`;
CREATE TABLE `quality_inspection`  (
  `qi_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `accident_vehicle` int(4) NULL DEFAULT 0 COMMENT '是否是事故车,是为1，不是为0，默认为0',
  `chassis_status` int(4) NULL DEFAULT 0 COMMENT '底盘情况,正常为0，不正常为1，默认为0',
  `slight_collision` int(4) NULL DEFAULT 1 COMMENT '是否轻微碰撞,是为0，不是为1，默认为1',
  `vulnerable_part` int(4) NULL DEFAULT 0 COMMENT '易损耗部件是否正常,正常为0，不正常为1，默认为0',
  `commonly_used_functions` int(4) NULL DEFAULT 0 COMMENT '常用功能是否正常,正常为0，不正常为1，默认为0',
  `driving_test` int(4) NULL DEFAULT 0 COMMENT '启动驾驶检测是否正常,正常为0，不正常为1，默认为0',
  `appearance_of_interior` int(4) NULL DEFAULT 0 COMMENT '外观内饰是否正常,正常为0，不正常为1，默认为0',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`qi_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '二手车质量检测信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `role_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色主键',
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('001', '超级管理员', '2019-03-31 23:53:39');
INSERT INTO `role` VALUES ('002', '客服人员', '2019-03-31 23:54:00');
INSERT INTO `role` VALUES ('003', '人工服务人员', '2019-03-31 23:54:25');

-- ----------------------------
-- Table structure for role_per
-- ----------------------------
DROP TABLE IF EXISTS `role_per`;
CREATE TABLE `role_per`  (
  `rp_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `per_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限id',
  `role_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`rp_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_per
-- ----------------------------
INSERT INTO `role_per` VALUES ('001', '001', '001');
INSERT INTO `role_per` VALUES ('002', '002', '001');
INSERT INTO `role_per` VALUES ('003', '003', '001');
INSERT INTO `role_per` VALUES ('004', '004', '001');
INSERT INTO `role_per` VALUES ('005', '005', '001');
INSERT INTO `role_per` VALUES ('006', '006', '001');
INSERT INTO `role_per` VALUES ('007', '007', '001');
INSERT INTO `role_per` VALUES ('008', '008', '001');
INSERT INTO `role_per` VALUES ('009', '009', '001');
INSERT INTO `role_per` VALUES ('010', '004', '002');
INSERT INTO `role_per` VALUES ('011', '005', '002');
INSERT INTO `role_per` VALUES ('012', '006', '002');
INSERT INTO `role_per` VALUES ('013', '007', '002');
INSERT INTO `role_per` VALUES ('014', '008', '002');
INSERT INTO `role_per` VALUES ('015', '009', '002');

-- ----------------------------
-- Table structure for used_car_infermation
-- ----------------------------
DROP TABLE IF EXISTS `used_car_infermation`;
CREATE TABLE `used_car_infermation`  (
  `uci_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `vb_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属品牌id',
  `vt_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属车系id',
  `ex_factory_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '出厂价',
  `present_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '现价',
  `vehicle_age` int(4) NULL DEFAULT NULL COMMENT '车龄',
  `transmission` int(4) NULL DEFAULT NULL COMMENT '变速箱,默认为0（不限）1（手动）2（自动）',
  `vehicle_model` int(4) NULL DEFAULT NULL COMMENT '车型,详情参考瓜子二手车',
  `road_hual` int(4) NULL DEFAULT NULL COMMENT '行驶里程',
  `displacement` float(4, 0) NULL DEFAULT NULL COMMENT '排量',
  `effluent_standard` int(4) NULL DEFAULT NULL COMMENT '排放标准',
  `seating` int(4) NULL DEFAULT NULL COMMENT '座位数',
  `fuel_type` int(4) NULL DEFAULT NULL COMMENT '燃油类型',
  `color` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '颜色',
  `lpl_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆所在地',
  `driving_type` int(4) NULL DEFAULT NULL COMMENT '驱动类型',
  `country` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国别.有冗余',
  `highlight_the_configuration` int(4) NULL DEFAULT NULL COMMENT '亮点配置',
  `picture1` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片1',
  `picture2` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片2',
  `picture3` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片3',
  `qi_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二手车质量检测信息',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`uci_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '二手车信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of used_car_infermation
-- ----------------------------
INSERT INTO `used_car_infermation` VALUES ('20190521105849264BV2tAcdViZ', '001', NULL, 16.00, 7.00, 4, 1, 1, 5, 2, 3, 3, 1, '#000000', '001', 1, NULL, 7, '20190521105849258.jpg', NULL, NULL, NULL, '2019-05-21 10:58:49');
INSERT INTO `used_car_infermation` VALUES ('20190521105928998lQOEJIivum', '002', NULL, 9.00, 5.00, 4, 1, 3, 4, 2, 3, 3, 1, '#000000', '001', 1, NULL, 0, '20190521105928995.jpg', NULL, NULL, NULL, '2019-05-21 10:59:28');
INSERT INTO `used_car_infermation` VALUES ('20190521110025059yppI2NdASZ', '001', NULL, 15.00, 7.00, 4, 1, 1, 6, 3, 3, 3, 1, '#000000', '001', 1, NULL, 5, '20190521110025057.jpg', NULL, NULL, NULL, '2019-05-21 11:00:25');
INSERT INTO `used_car_infermation` VALUES ('20190521110110580BzjlXIataG', '004', NULL, 17.00, 8.00, 5, 1, 1, 6, 2, 3, 3, 1, '#000000', '001', 1, NULL, 7, '20190521110110578.jpg', NULL, NULL, NULL, '2019-05-21 11:01:10');
INSERT INTO `used_car_infermation` VALUES ('201905211102297148IKvkvlDYC', '006', NULL, 13.00, 8.00, 3, 1, 1, 4, 2, 3, 3, 1, '#000000', '001', 1, NULL, 2, '20190521110229712.jpg', NULL, NULL, NULL, '2019-05-21 11:02:29');
INSERT INTO `used_car_infermation` VALUES ('20190521110348746ptVTO0yROa', '003', NULL, 9.00, 8.00, 4, 2, 3, 8, 2, 3, 3, 1, '#000000', '001', 1, NULL, 0, '20190521110348744.jpg', NULL, NULL, NULL, '2019-05-21 11:03:48');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `user_sex` int(4) NULL DEFAULT 0 COMMENT '用户性别，0代表男，1代表女',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `user_passwd` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '需要加密',
  `user_resource` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户来源，区分是前端注册的用户还是后端添加的用户，若是前端注册，则为0，否则为空',
  `user_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('001', 0, 'admin', 'e10adc3949ba59abbe56e057f20f883e', '', 'admin', '2019-05-21 02:35:46');
INSERT INTO `user` VALUES ('002', 0, 'user', 'e10adc3949ba59abbe56e057f20f883e', NULL, '18991431422', '2019-04-06 09:22:32');
INSERT INTO `user` VALUES ('003', 1, 'test', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15022699652', '2019-04-06 09:23:45');
INSERT INTO `user` VALUES ('004', 0, '11', '111', NULL, '15125623561', '2019-04-11 20:02:15');
INSERT INTO `user` VALUES ('20190415072611637HTHZY55ExN', 1, 'test111', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15129649956', '2019-05-20 15:47:34');
INSERT INTO `user` VALUES ('20190416091931385KvEjEfYlC8', 1, 'dddd', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15129649923', '2019-05-20 15:47:36');
INSERT INTO `user` VALUES ('20190520034504459QYSOZd4sbd', 0, 'testff', 'e10adc3949ba59abbe56e057f20f883e', '0', '15029613379', '2019-05-20 15:47:40');
INSERT INTO `user` VALUES ('20190520034629826xkbcb62NPs', 0, 'testgg', 'e10adc3949ba59abbe56e057f20f883e', '0', '15029613379', '2019-05-20 15:47:43');
INSERT INTO `user` VALUES ('201905200353064476TCLp09h0X', 1, 'ffddssssaa', 'e10adc3949ba59abbe56e057f20f883e', '0', '15029613379', '2019-05-20 15:53:06');
INSERT INTO `user` VALUES ('20190521020756821xcVYJV0BZd', 0, 'ss', 'e10adc3949ba59abbe56e057f20f883e', '', '15029613379', '2019-05-21 02:07:56');
INSERT INTO `user` VALUES ('20190521020811654ML3bfefL7q', 1, 'testffddd', 'e10adc3949ba59abbe56e057f20f883e', '', '15029613379', '2019-05-21 02:08:11');
INSERT INTO `user` VALUES ('20190521020947077sjIrP63HLa', 1, 'admin1', 'e10adc3949ba59abbe56e057f20f883e', '', '15029613379', '2019-05-21 02:09:47');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `ur_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `user_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id 关联用户表',
  `role_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色id 关联角色表',
  PRIMARY KEY (`ur_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('001', '001', '001');
INSERT INTO `user_role` VALUES ('002', '002', '002');

-- ----------------------------
-- Table structure for vehicle_brand
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_brand`;
CREATE TABLE `vehicle_brand`  (
  `vb_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `vb_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `country` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属国家',
  PRIMARY KEY (`vb_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '车辆品牌信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of vehicle_brand
-- ----------------------------
INSERT INTO `vehicle_brand` VALUES ('001', '大众', '德国');
INSERT INTO `vehicle_brand` VALUES ('002', '哈佛', '中国');
INSERT INTO `vehicle_brand` VALUES ('003', '吉利', '中国');
INSERT INTO `vehicle_brand` VALUES ('004', '本田', '日本');
INSERT INTO `vehicle_brand` VALUES ('005', '福特', '美国');
INSERT INTO `vehicle_brand` VALUES ('006', '现代', '韩国');
INSERT INTO `vehicle_brand` VALUES ('007', '传祺', '中国');

-- ----------------------------
-- Table structure for vehicle_train
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_train`;
CREATE TABLE `vehicle_train`  (
  `vt_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `vt_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车系名称',
  `vb_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属品牌id,关联车辆品牌表',
  PRIMARY KEY (`vt_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '车辆所属车系信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of vehicle_train
-- ----------------------------
INSERT INTO `vehicle_train` VALUES ('001', '桑塔纳', '001');
INSERT INTO `vehicle_train` VALUES ('002', '高尔夫', '001');
INSERT INTO `vehicle_train` VALUES ('003', '捷达', '001');
INSERT INTO `vehicle_train` VALUES ('004', '途观', '001');
INSERT INTO `vehicle_train` VALUES ('005', '哈佛H系列', '002');
INSERT INTO `vehicle_train` VALUES ('006', '帝豪', '003');
INSERT INTO `vehicle_train` VALUES ('007', '博越', '003');
INSERT INTO `vehicle_train` VALUES ('008', 'WEY', '002');

SET FOREIGN_KEY_CHECKS = 1;
