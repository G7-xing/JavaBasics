package com.inmysong.demo.demo21IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/26 20:40
 * @description 字节输入流
 */
public class FileInputStreamTest {
    public static void main(String[] args) {

    }

    /**
     * 读取文件
     * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b)
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream=null;
        try {
             fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 读取文件
     * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b)
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\hello.txt";

        int readLength = 0;
        byte[] buf = new byte[8];// 一次读8个字节
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readLength=(fileInputStream.read(buf))) != -1) {
                System.out.print(new String(buf,0,readLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
