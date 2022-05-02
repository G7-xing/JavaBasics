package com.inmysong.demo.demo21IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/26 22:35
 * @description
 * 节点流：对某一个特定的数据源进行读写数据
 * 处理流/包装流：就是将节点流包装成一个处理流，因为里面有个属性 Reader/File。利用的是修饰器模式
 * 是链接在已存在的流（节点流或处理流）之上，为程序提供更为强大的读写功能，也更加灵活
 *
 * 节点流是底层流，直接更数据源打交道
 * 处理流/包装流包装节点流，既可以消除不同节点流的实现差异，也可以提供更加方柏霓的方法来完成输入输出
 * 处理流使用了修饰器设计模式，不会直接与数据相接
 * 处理流的特点：
 * 性能的提高，主要以增加缓冲 的方式来提高输入输出的效率
 * 操作的便捷，处理流可以提供一系列边界的方法来一次输入输出大批量的数据没使用更加灵活方便
 */
public class FileReaderTest {
    public static void main(String[] args) {
        String filePath ="d:\\news2.txt";
        FileReader fileReader =null;
        int data =0;
        try {
            // 创建FileReader
            fileReader = new FileReader(filePath);
            // 当个字符取
            while((data=fileReader.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader == null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
