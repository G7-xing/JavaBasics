package com.inmysong.demo.demo21IO;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/26 21:06
 * @description
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {


    }


    /**
     * FileOutputStream ，将数据写入文件，字节
     * 如果该文件不存在创建文件
     */
    @Test
    public void writeFile() {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            // new FileOutputStream(filePath) 创建方式，当写入内容会覆盖原来的内容的
            // new FileOutputStream(filePath, true) 创建方式,当写入内容时，是追加到文件后面
            fileOutputStream = new FileOutputStream(filePath,true);
            // 写入一个字节
            fileOutputStream.write('s');
            // 写入字符串
            String str = "zhangQing,hello a!! ";
            // str.getBytes() :字符串---> 字节数组
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
