package com.inmysong.demo.demo21IO;

import java.io.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 2:19
 * @description
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 演示ObjectInputStream，反序列化数据，
        String filePath ="d:\\IOExercise\\data.bat";
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(filePath));

        // 读取 ：1. 读取（反序列化）的顺序需要和你保存数据（序列化）的顺序一致
        // 2. 序列化transient ,static 属性不能序列化
        // 3.一个类中的对象属性，这个对象属性必须要实现序列化
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());// ois.readObject().class 运行类型是Dog
        // 关闭流
        ois.close();

    }
}
