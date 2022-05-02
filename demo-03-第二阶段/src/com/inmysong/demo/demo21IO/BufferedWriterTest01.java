package com.inmysong.demo.demo21IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 0:44
 * @description
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws IOException {
        String file ="d:\\ok.txt";
        // new FileWriter(file,true)追加的方式
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
        bufferedWriter.write("hello,你好谁啊！");
        // 插入一个换行
        bufferedWriter.newLine();
        bufferedWriter.write("hello,你好谁啊！");
        bufferedWriter.close();
    }
}
