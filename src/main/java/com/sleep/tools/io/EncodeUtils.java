package com.sleep.tools.io;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * EncodeUtils
 *
 * @author Zhang Jingtao
 * @date 2015/9/6
 */
public class EncodeUtils {
    /**
     * 对文件进行编码
     *
     * @param file 需要编码的问家
     * @return 对文件进行base64编码后的字符串
     * @throws Exception
     */
    public static String file2Base64(File file) throws Exception {
        StringBuffer sb = new StringBuffer();
        FileInputStream in = new FileInputStream(file);
        int b;
        char ch;
        while ((b = in.read()) != -1) {
            ch = (char) b;
            sb.append(ch);
        }
        in.close();
        //将buffer转化为string
        String oldString = new String(sb);

        //使用base64编码
        String newString = new String((new BASE64Encoder()).encode(oldString.getBytes()));

        return newString;
    }

    /**
     * 对文件进行编码
     *
     * @param file 需要编码的问家
     * @return 对文件进行base64编码后的字符串
     * @throws Exception
     */
    public static String inputStream2Base64(InputStream in) throws Exception {
        StringBuffer sb = new StringBuffer();
        int b;
        char ch;
        while ((b = in.read()) != -1) {
            ch = (char) b;
            sb.append(ch);
        }
        in.close();
        //将buffer转化为string
        String oldString = new String(sb);
        //使用base64编码
        String newString = new String((new BASE64Encoder()).encode(oldString.getBytes()));
        return newString;
    }

    /**
     * 字符串转ASCII码
     *
     * @param s
     * @return
     */
    public static String str2Ascii(String s) {
        char[] chars = s.toCharArray(); //把字符中转换为字符数组
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {//输出结果
            result.append((int) chars[i]);
        }
        return result.toString();
    }

    /**
     * 字符串转Unicode
     *
     * @param s
     * @return
     */
    public static String str2Unicode(String s) {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            // 取出每一个字符
            char c = s.charAt(i);
            // 转换为unicode
            unicode.append("\\u" + Integer.toHexString(c));
        }
        return unicode.toString();
    }
}
