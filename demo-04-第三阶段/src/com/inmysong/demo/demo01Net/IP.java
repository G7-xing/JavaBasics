package com.inmysong.demo.demo01Net;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 3:50
 * @description
 * IP 地址：计算机的身份证，唯一标识。ipconfig，网络地址+主机地址
 * 表现形式：点分十进制
 * 域名与端口号：
 * 域名：www.baidu.com 与百度的服务器ip映射。用HTTP协议映射的
 * 端口号： 用于标识某个域名中的特定一个服务
 *
 * 网络通讯协议：数据的组织形式就是协议
 * TCP/IP协议：传输控制协议/因特网互联协议
 *
 * TCP:传输控制协议
 * 1.使用TCP协议之前，需要先简易TCP链接，形成传输数据通道
 * 2.传输前，采用  三次握手 方式，是可靠的
 * 3.TCP协议进行通讯的两个应用进程：客户端、服务端
 * 4.在链接中，可进行大量的数据的传输
 * 5.传输完毕，需要释放已建立的链接，效率底
 *
 * UDP：用户数据协议
 * 1.将数据、源、目的封装成数据包，不需要建立连接
 * 2.每一个数据报大小限制64k内，不适合大量数据
 * 3.因为不需要建立链接，所以是不可靠的
 * 4.发送数据结束时，无需要释放资源（因为没有建立链接），速度快
 *
 * Socket 介绍
 *  * 1. 套接字（Socket）开发网络应用程序被广泛采用，成为事实上的标准
 *  * 2. 通信的两端都要有Socket，时两台机器间通信的端点
 *  * 3. 网络通信其实就是Socket键的通信
 *  * 4. Socket允许程序把网络链接当成一个流，数据在两个Socket间通过IO传输。
 *  * 5. 一般注定发起通信的应用程序属于客户端，等待通信请求的属于服务端（监听的状态）
 *  TCP演示
 *      * 服务器：思路
 *      * 1. 在本机的9999端口监听，等待链接
 *      * 2。 当没有客户端链接9999端口时，程序会阻塞，等待连接
 *      * 3. 连接上后，通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
 *      * 客户端：思路
 *      * 1.来链接服务器的ip，端口
 *      * 2. 连接上后，生成Socket，通过socket.getOutputStream()
 *      * 3. 通过输出流，写入数据到 数据通道
 *
 *      客户端：思路
 *          1.来链接服务器的ip，端口
 *          2. 连接上后，生成Socket，通过socket.getOutputStream()
 *          3. 通过输出流，写入数据到 数据通道
 *
 *
 *
 * netstat 指令
 * 1.netstat -an 可以查看当前主机网络情况，包括端口建通情况和网络连接情况
 * 2. netsta -anb|more 可以分页显示
 * 3. 要求在dos控制台下执行
 *
 *
 * 当客户端连接服务器端后，实际上客户端也是通过一个端口和服务器进行通信的，这个端口时TCP/IP来分配的，是随机的
 *
 *
 *
 *
 * UDP编程
 * 1. 没有明确的服务端和客户端，其实时 数据的发送端和接受端
 * 2.接受数据和发送数据都是通过DatagramSocket对象完成的
 * 3 将数据封装到DatagramPacket 对象/装包
 * 4. 当接收到 DatagramPacket 对象，需要进行拆包，取出数据
 * 5. 一般接受端设定指定一个端口，接受数据的，两个端都可以进行设定端口的
 */
public class IP {
}
