package com.inmysong.demo.demo21IO;

import java.io.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 1:11
 * @description
 *  演示 BufferedInputStream 和 BufferedOutputStream
 */
public class BufferedOutAndInStream {
    public static void main(String[] args) {
        String srcFilePath = "d:\\IOExercise\\qq.png";
        String destFilePath = "d:\\IOExercise\\qq2.png";

        BufferedInputStream bis =null;
        BufferedOutputStream bos = null;
        try {
             bis = new BufferedInputStream(new FileInputStream(srcFilePath));
             bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

             // 循环读取文件，并写入到destFilepath
            byte[] buff = new byte[1024];
            int readLine = 0;
            while((readLine = bis.read(buff))!=-1){
                bos.write(buff,0,readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
