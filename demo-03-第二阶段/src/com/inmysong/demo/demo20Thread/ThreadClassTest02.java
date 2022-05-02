package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/21 0:29
 * @description 线程的使用
 * 1. 继承Thread类 ,重写run方法
 *   2. 实现Runnable接口 ；当一个类已经继承了另外一个类，此时不能继承Thread类了，我们可以实现Runnable接口实现及成果
 */
public class ThreadClassTest02 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();

        //使用一种设计模式 ，代理模式
        Thread thread = new Thread(monkey);
        thread.start();

    }
}
class Monkey implements Runnable{

    int time = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("giao···giao~~  " + (++time) + "  子线程名= " + Thread.currentThread().getName());
            // 休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time == 8) {
                break;
            }
        }

    }
}