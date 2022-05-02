package com.inmysong.demo.demo21IO;

import java.io.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 0:53
 * @description
 *
 * 注意不要去操作 二进制文件：视频，音乐，文档，pdf
 */
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFile = "D:\\ok.txt";
        String destFile = "d:\\ok2.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFile));
            bw = new BufferedWriter(new FileWriter(destFile));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                // 换行
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

