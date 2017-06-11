/*
 * 网络管理委员会信息管理系统 ( NetUnion Information System )
 * Copyright (c) 2017.
 */

package net.dormforce.nuis.util;

import java.nio.file.Paths;

/**
 * Description:文件工具类
 * Author: 刘文哲
 * Date: 2017/4/19, 星期三
 */
public class FileHelper {

    public static String generateFilePath(String dir, String... more) {
        return Paths.get(dir,more).toString();
    }

    public static void main(String[] args){
        System.out.println(generateFilePath("aaa","aaa","aaaaa"));
    }
}
