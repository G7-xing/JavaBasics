package com.inmysong.demo.demo01Net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 17:20
 * @description
 */
public class SocketTCPClientTest02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9998);
        // 连接后，发送
        OutputStream outputStream = socket.getOutputStream();
       // outputStream.write("hello,server".getBytes());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("字符流。。。");
        bufferedWriter.newLine();// 插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!!!!
        bufferedWriter.flush(); // 使用字符流，需要树洞书信，否则数据不会写入数据通道
        // 设一个结束标识
        socket.shutdownOutput();
        // 接收
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        /*byte[] buf = new byte[1024];
        int readLen=0;
        while((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }*/

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
