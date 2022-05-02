package com.inmysong.demo.demo21IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/26 21:17
 * @description
 */
public class FileCopyTest {
    public static void main(String[] args) {
        /**
         * 完成文件copy
         * 1. 创建文件的输入流，将文件读入在程序
         * 2. 创建文件的输出流，蒋程序的文件写入在另外一个文件中
         * 3. 应该读取部分数据就写入到指定文件这里使用循环操作
         */
        String copyFilePath = "d:\\a.txt";
        String destFilePath = "d:\\QQ\\b.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            fileInputStream =new FileInputStream(copyFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            // 定一个字节数组，提高效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen=fileInputStream.read(buf))!=-1){
                // 读到后就写入文件，通过fileOutputStream 就是一边读一边写
                fileOutputStream.write(buf,0,readLen);// 一定要着用杨的
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream == null) {
                    fileInputStream.close();
                }
                if (fileOutputStream == null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
