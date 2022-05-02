package com.inmysong.demo.demo02upload;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/2 2:53
 * @description
 */
public class StreamUtils {
    /**
     * 将输入流转换成byte[],可以把文件的内容读入到 byte[]
     *
     * @param is
     * @return
     * @throws IOException
     */
    public static byte[] streamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }



}
