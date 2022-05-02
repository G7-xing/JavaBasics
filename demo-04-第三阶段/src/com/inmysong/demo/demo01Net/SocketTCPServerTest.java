package com.inmysong.demo.demo01Net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 5:13
 * @description
 * Socket 介绍
 * 1. 套接字（Socket）开发网络应用程序被广泛采用，成为事实上的标准
 * 2. 通信的两端都要有Socket，时两台机器间通信的端点
 * 3. 网络通信其实就是Socket键的通信
 * 4. Socket允许程序把网络链接当成一个流，数据在两个Socket间通过IO传输。
 * 5. 一般注定发起通信的应用程序属于客户端，等待通信请求的属于服务端（监听的状态）
 *
 *
 */
public class SocketTCPServerTest {

    /** TCP演示
     * 服务器：思路
     * 1. 在本机的9999端口监听，等待链接
     * 2。 当没有客户端链接9999端口时，程序会阻塞，等待连接
     * 3. 连接上后，通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
     * 客户端：思路
     * 1.来链接服务器的ip，端口
     * 2. 连接上后，生成Socket，通过socket.getOutputStream()
     * 3. 通过输出流，写入数据到 数据通道
     */
    // 服务端
    public static void main(String[] args) throws IOException {
        // 监听
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接中。。。。【9999】");
        // 有链接则返回一个Socket对象，没有连接，以后的代码不能执行
        // 这个ServerSocket 可以通过accept()返回多个Socket[多个客户端来连接服务器的并发]
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        int realLen = 0;
        while((realLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,realLen));
        }

        inputStream.close();
        accept.close();
        serverSocket.close();
    }

}


