package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/23 15:35
 * @description
 */
public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread = new Thread(t);
        thread.setName("t1");
        Thread thread1 = new Thread(t);
        thread1.setName("t2");
        thread.start();
        thread1.start();
    }
}

// 编程却款的线程
// 1.应为这里涉及到多个线程共享资源，所以我们使用接口方式
class T implements Runnable{
    private int money = 10000;
    @Override
    public void run() {

            while (true){
                synchronized (this){
                    // 判额
                    if (money < 1000) {
                        System.out.println("余额不足");
                        break;
                    }
                    money-=1000;
                    System.out.println(Thread.currentThread().getName()+"取出1000"+"当前剩余额度"+money);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }


    }
}