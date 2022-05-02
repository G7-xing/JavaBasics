package com.inmysong.demo.demo06Exception;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 0:11
 * @description 如果用户输入的不是一个整数，就提示他反复输入，知道输入一个整数为止
 */
public class TryCatchQuestion {
    //1.Scanner接收
    //有一个死循环，去接受输入
    //输入的值转成一个int型
    //如果在转换的时候发生异常，就说明输入的不是一个整数
    //如果没有抛出异常，则break；该循环
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("请输入一个整数");
            try {
                i = Integer.parseInt(scanner.next());//这里是可能抛出异常的NumberFormatException
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的整数是："+ i);
    }
}
