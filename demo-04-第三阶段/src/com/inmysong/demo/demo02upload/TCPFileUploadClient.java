package com.inmysong.demo.demo02upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.stream.Stream;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/2 2:48
 * @description
 * 文件上传的客户端
 *
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        // 创建读取磁盘文件的输入流
        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("d:\\IOExercise\\qq.png"));
        // bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);


        // 通过socket获取到输出流，将bytes数据发送到服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput(); // 写入结束标志


        InputStream inputStream = socket.getInputStream();
        byte[] bytes1 = StreamUtils.streamToByteArray(inputStream);
        System.out.println(bytes1);

        bos.close();
        bis.close();
        socket.close();

    }
}
