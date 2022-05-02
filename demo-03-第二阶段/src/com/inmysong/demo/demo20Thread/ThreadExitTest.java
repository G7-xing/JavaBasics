package com.inmysong.demo.demo20Thread;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/21 23:15
 * @description 线程的终止
 * 当线程完成任务后，会自动退出
 * 还可以通过 使用变量  来控制 run方法退出的方式停止线程，即通知方式
 *
 * 用户线程：工程线程，当线程的任务执行王或者通知方式结束
 * 守护线程：一般是为工作线程服务的，当所有的用户线程结束，守护线程自动结束
 * 常用的守护线程：垃圾回收机制
 */
public class ThreadExitTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        AMT amt = new AMT();
        amt.start();

        // main线程区控制amt线程的终止，必须修改 loop
        // 让amt 退出run方法，从而终止amt 线程 -->通知方式

        // 主线程休眠1秒
        Thread.sleep(1000);
        amt.setLoop(false);
    }
    @Test
    public void test() throws InterruptedException {
        MyDaemon myDaemon = new MyDaemon();
        // 线程守护提前配置
        myDaemon.setDaemon(true);
        myDaemon.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("working.....");
            Thread.sleep(1000);
        }
    }
}

class AMT extends Thread {
    private int count = 0;

    // 设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AMT  运行中。。。" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class MyDaemon extends Thread{
    @Override
    public void run() {
        for (;;){
            System.out.println("MyDaemon = 守护 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}