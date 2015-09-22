package com.sleep.tools.io;

import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileOutputStream;

/**
 * DecodeUtils 解码工具
 *
 * @author Zhang Jingtao
 * @date 2015/9/22
 */
public class DecodeUtils {
    /**
     * 对文件进行解码
     *
     * @param oldString 需要解码的字符串
     * @param filePath  将字符串解码到filepath文件路径
     * @return 返回解码后得到的文件
     * @throws Exception
     */
    public static File base642File(String oldString, String filePath) throws Exception {
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("文件已经存在，不能将base64编码转换为文件");
            return null;
        } else {
            file.createNewFile();
        }
        FileOutputStream out = new FileOutputStream(file);

        //对oldString进行解码
        String newString = new String(new BASE64Decoder().decodeBuffer(oldString));
        //将问件内容转为byte[]
        char[] str = newString.toCharArray();
        for (char ch : str) {
            byte b = (byte) ch;
            out.write(b);
        }
        out.close();
        return file;
    }

    /**
     * ASCII转换为字符串
     *
     * @param s ASCII码字符串
     */
    public static String ascii2Str(String s) {
        String[] chars = s.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            result.append((char) Integer.parseInt(chars[i]));
        }
        return result.toString();
    }

    /**
     * Unicode转字符串
     * @param s
     * @return
     */
    public static String unicode2Str(String s) {
        StringBuffer result = new StringBuffer();
        String[] hex = s.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            result.append((char) data);
        }
        return result.toString();
    }
}
