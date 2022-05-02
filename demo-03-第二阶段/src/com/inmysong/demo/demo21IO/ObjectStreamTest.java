package com.inmysong.demo.demo21IO;

import java.io.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 1:55
 * @description 对象流 - ObjectInputStream ObjectOutputStream
 * 序列化： 在保存数据时，保存数据的值和数据类型
 * 反序列化： 在恢复数据时，或者将文件中的数据恢复时，恢复数据的值和数据类型，也就是恢复成对象
 * 需要让讴歌对象支持序列化机制，就必须让其类是可序列化的，为了让讴歌类是可序列化的，该类必须实现两个接口之一：
 *  Serializable //这是一个标记接口
 *  Externalizable // 用的很少
 */
public class ObjectStreamTest {
    public static void main(String[] args) throws Exception {
       // 演示 ObjectOutputStream 的使用，完成数据的序列化
        String filePath = "d:\\IOExercise\\data.bat";// 序列化后，保存的文件格式不是存文本，二十按照它的格式来保存

        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据到：d:\IOExercise\data.bat
        oos.writeInt(100);// int--Integer--实现了Serializable接口
        oos.writeBoolean(false); // boolean -- Boolean --实现了Serializable接口
        oos.writeChar('f');// char --Char --实现了Serializable接口
        oos.writeUTF("你做谁啊");// String 实现了Serializable接口

        // 类的对象需要实现Serializable接口
        oos.writeObject(new Dog(12,"大头")); // 对向
        oos.close();


    }
}

class Dog implements Serializable {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

