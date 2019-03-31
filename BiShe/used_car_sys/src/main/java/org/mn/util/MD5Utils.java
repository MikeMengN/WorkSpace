package org.mn.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author CQY13 MD5���ܹ�����
 */
public class MD5Utils {

    /**
     * MD5加密工具类
     * 
     * @param pwd
     *            
     * @return String
     */
    public static String getPwd(String pwd) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");

            byte[] bs = digest.digest(pwd.getBytes());
            String hexString = "";
            for (byte b : bs) {
                int temp = b & 255;
                if (temp < 16 && temp >= 0) {
                    hexString = hexString + "0" + Integer.toHexString(temp);
                } else {
                    hexString = hexString + Integer.toHexString(temp);
                }
            }
            return hexString;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

}