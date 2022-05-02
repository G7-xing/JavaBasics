package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/20 23:46
 * @description 线程的使用
 * 1. 继承Thread类 ,重写run方法
 * 2. 实现Runnable接口 ；当一个类已经继承了另外一个类，此时不能继承Thread类了，我们可以实现Runnable接口实现及成果
 * 区别：；
 *  本质上是没什么区别：都是调用start - start0
 *  实现Runnable接口方式可以适合多个线程共享一个资源的情况，避免了单继承的限制
 *
 * 在Terminal中输入 jconsole 来看线程的运行情况
 */
public class ThreadClassTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个Cat对象当作线程使用
        Cat cat = new Cat();
        /**
         * 源码：
         * 1.  public synchronized void start(){
         *     start0();
         * }
         * 2.  public synchronized void start0();
         * 由JVM调用start0(),start0()才是真正实现多线程的效果的
         *
         *
         *
         *
         */
        // 启动线程
        cat.start(); // 去执行 cat 的run的方法

        /*
        start()方法调用start0()方法后，该线程并不一定立马执行，只是将线程变成可运行状态，
            具体什么时候执行，取决与cpu，由cpu统一调度
         */

        // 当main 线程启动一个子线程 Thread-0，主线程不会阻塞，会继续执行
        // 交替执行
        System.out.println("主线程继续执行" + " 主线程名= "+Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i = " + i);
            // 让主线程休眠
            Thread.sleep(1000);
        }
    }
}

// 当一个类继承了Thread 类，该类就可以当作线程使用
// 一般会重写run方法，写上业务逻辑
// Thread 的 run() 方法实现了 Runnable 接口的run方法
class Cat extends Thread {
    @Override
    public void run() { // 重run方法，写上自己的业务逻辑
        int time = 0;
        while (true) {
            try {
                // 每隔一秒输出
                System.out.println("喵喵~~~~~  " + (++time) + "  子线程名= " + Thread.currentThread().getName());
                // 休眠一秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (time == 80) {
                break;
            }
        }
    }
}