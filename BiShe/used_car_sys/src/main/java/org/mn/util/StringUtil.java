package org.mn.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**  
* @Title: StringUtil  
* @Description: 处理字符串的工具类  
* @author: MengNing  
* @date: 2019年4月13日下午10:48:31  
*/
public class StringUtil {
	/**
	 * @Title: String   
	 * @Description:    
	 * @return: void      
	 * @throws
	 */
	public static String getRoundId() {
		// 取得当前的时间，并转换为字符串
		Date date = new Date();
		// 取得到毫秒的时间
		SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		// 获取长度为10的随机字符串
		Random random=new Random();
	    StringBuffer sb=new StringBuffer();
	    for(int i = 0; i < 10; i++){
	       int number=random.nextInt(62);
	       sb.append(ConstantUtil.Str.charAt(number));
	    }
	    // 将当前时间戳与随机得到的字符串组合成为一个新的字符串
	    String str = sim.format(date) + sb.toString();
		return str;
	}
	
	/**
	 * @Title: getFilename   
	 * @Description: 获取文件名称   
	 * @return: String      
	 * @throws
	 */
	public static String getFilename() {
		// 取得当前的时间，并转换为字符串
		Date date = new Date();
		// 取得到毫秒的时间
		SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		// 将当前时间戳与随机得到的字符串组合成为一个新的字符串
		String str = sim.format(date);
		return str;
	}
}
