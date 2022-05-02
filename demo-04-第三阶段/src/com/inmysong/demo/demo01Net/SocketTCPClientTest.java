package com.inmysong.demo.demo01Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 17:03
 * @description 客户端
 */
public class SocketTCPClientTest {
    /**
     *  * 客户端：思路
     *      * 1.来链接服务器的ip，端口
     *      * 2. 连接上后，生成Socket，通过socket.getOutputStream()
     *      * 3. 通过输出流，写入数据到 数据通道
     *      *
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        outputStream.close();
        socket.close();
    }
}
