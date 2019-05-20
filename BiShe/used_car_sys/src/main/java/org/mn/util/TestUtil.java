package org.mn.util;

/**  
* @Title: TestUtil  
* @Description: 测试类   
* @author: MengNing  
* @date: 2019年3月31日下午7:47:50  
*/
public class TestUtil {

	/**   
	 * @Title: main   
	 * @Description:    
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// 测试MD5
//		String s = "admin";
//		String pwd = MD5Utils.getPwd(s);
//		System.out.println(pwd);
		// 测试取得id的方法
		System.out.println(StringUtil.getRoundId());
		System.out.println(StringUtil.getFilename());
	}

}
