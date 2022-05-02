package com.inmysong.demo.demo02upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.Stream;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/2 2:47
 * @description
 * 文件上传的服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("8888端口监听。。。");
        // 等待连接
        Socket socket = serverSocket.accept();

        // 读取客户端发送的数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 写入到磁盘
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\IOExercise\\tt.png"));
        bos.write(bytes);
        bos.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();
        socket.shutdownOutput();

        bufferedWriter.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
