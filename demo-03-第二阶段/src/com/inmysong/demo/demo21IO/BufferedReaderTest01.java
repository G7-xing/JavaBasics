package com.inmysong.demo.demo21IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 0:35
 * @description 处理流/包装流
 * 按照  字符 去操作
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\news2.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        // 读取
        String line;
        // 按行读取，返回为null，读取结束

        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        // 关闭流
        // 只需要关闭BufferedReader，底层会自动的去关闭节点流
        // FileReader
        bufferedReader.close();
    }
}
