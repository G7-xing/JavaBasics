package com.inmysong.demo.demo01Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/1 5:00
 * @description
 */
public class InetAddressTest01 {
    // 演示 InetAddress 使用
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress
        // 1.获取本机的InetAddress对象
        System.out.println(InetAddress.getLocalHost());
        // 2.根据指定的主机名获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("DESKTOP-H2Q6TP4");
        System.out.println(host1);
        // 3.根据域名返回InetAddress对象，
        InetAddress host2 = InetAddress.getByName("wwww.baidu.com");
        System.out.println(host2);
        // 4. 通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);
    }
}
