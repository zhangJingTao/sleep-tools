package com.sleep.tools.io;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileUtils
 *
 * @author Zhang Jingtao
 * @date 2015/9/6
 */
public class FileUtils {

    /**
     * 复制文件或文件夹
     * @param from 源文件/文件夹
     * @param to 目标文件/文件夹
     * @return
     */
    public Boolean cpFile(String from,String to){
        return true;
    }

    /**
     * 创建文件
     * @param fileName
     * @return
     */
    public Boolean newFile(String fileName){
        return true;
    }

    /**
     * 移动文件
     * @param from
     * @param to
     * @return
     */
    public Boolean mvFile(String from,String to){
        return true;
    }

    /**
     * 删除文件
     * @param file
     * @return
     */
    public Boolean deleteFile(String file){
        return true;
    }

    /**
     * 获取文件属性
     * @param file
     * @return
     */
    public Map<String,String> getFileProperty(String file){
        return new HashMap<String, String>();
    }

    /**
     * 单个文件重命名
     * @param file
     * @param newFileName
     * @return
     */
    public Boolean renameFile(String file,String newFileName){
        return true;
    }
    /**
     * 批量重命名文件
     * @param filePaths
     * @param names
     * @return
     */
    public Boolean renameFile(List<String> filePaths,List<String> names){
        return true;
    }
}
