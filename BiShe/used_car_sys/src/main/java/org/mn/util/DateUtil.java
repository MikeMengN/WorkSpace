package org.mn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**  
* @Title: DateUtil  
* @Description:日期工具类   
* @author: MengNing  
* @date: 2019年5月7日下午8:44:42  
*/
public class DateUtil {
	
	// 获取当前时间信息（记录创建时间），以字符串的形式返回
	public static final String getDate() {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simp.format(new Date());
	}
	
	
	// 测试
	public static void main(String[] args) {
		System.out.println(getDate());
	}
}
