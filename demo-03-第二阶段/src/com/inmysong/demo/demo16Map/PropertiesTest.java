package com.inmysong.demo.demo16Map;

import java.util.Properties;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/14 22:54
 * @description Map接口的实现类 Properties
 * 1.Properties 类继承自Hashtable类并且实现了Map接口，也是使用键值对的形式保存数据
 * 2，他的使用特点和hashtable类似
 * 3，properties 还可用于配置文件 XXX.properties 文件中，加载数据到properties类对象，并进行读取和修改
 * 4，xxx.properties 文件通常作为配置文件，io流
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
//        properties.put(null,1);
        properties.put("john",2);
        properties.put("john",8);
        properties.put("ghj",24);
    }
}
