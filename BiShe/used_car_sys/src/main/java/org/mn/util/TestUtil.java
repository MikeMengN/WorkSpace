package org.mn.util;

/**  
* @Title: TestUtil  
* @Description:   
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
		// TODO Auto-generated method stub
		String s = "admin";
		String pwd = MD5Utils.getPwd(s);
		System.out.println(pwd);
	}

}
