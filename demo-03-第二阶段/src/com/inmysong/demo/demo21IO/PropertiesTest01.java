package com.inmysong.demo.demo21IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 3:26
 * @description
 * load：加载配置文件的键值对到Properties对象
 * list：将数据显示到指定设备
 * getProperty(key):根据键获取值
 * setProperty(key,value):设置键值对到Properties对象
 * store：将Properties中的键值对存储到配置文件，在idea中保存信息到配置文件，如果含有中文，会存储为unicode
 */
public class PropertiesTest01 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\java基础\\demo-03-第二阶段\\src\\mysql.properties"));
        properties.list(System.out);
        System.out.println(properties.getProperty("user"));

    }
}
