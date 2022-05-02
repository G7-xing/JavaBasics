package com.inmysong.demo.demo20Thread;

import java.util.Random;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/23 15:11
 * @description
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}

class A extends Thread {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            // 1- 100 随机数
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

// 直到di 2线程从键盘读取Q
class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            // 接受用户输入
            System.out.println("请输入Q，退出");
            char c = scanner.next().toUpperCase().charAt(0);
            if ('Q' == c) {
                // 已通知的方式结束A线程
                a.setFlag(false);
                System.out.println("B线程退出。。");
                break;
            }
        }
    }


}