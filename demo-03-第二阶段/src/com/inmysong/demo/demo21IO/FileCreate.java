package com.inmysong.demo.demo21IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/26 19:38
 * @description 创建文件
 *
 * IO原理及流的分类
 * 1.以内存为中心，有输入流和输出流
 * 2. 流的分类
 *  1.流的操作数据单位不同;; 字节流（8bit）二进制文件，字符流（按字符）文本文件
 *  2.数据的流向不同：输入流，输出流
 *  3.流的角色不同，节点流，处理流/包装流
 *
 *  InputStream
 *  outputStream
 *  Reader
 *  Writer
 *
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    // 方式一 new File(String pathname)
    @Test
    public void create01(){
        String path = "d:\\news.txt";
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("方式一ok---");
    }
    // 方式2. new File(File parent,String child)
    @Test
    public void create02(){
        File parentFile = new File("d:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("方式2ok---");
    }
}
