package com.inmysong.demo.demo01Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 17:19
 * @description
 */
public class SocketTCPServerTest02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9998);
        System.out.println("服务器端口9990等待中。。。");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        // 字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
       /* // 字节流
        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }*/

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("字符流和二号和");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        /*outputStream.write("hello,Client".getBytes());
        // 设一个结束标识
        socket.shutdownOutput();*/

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
