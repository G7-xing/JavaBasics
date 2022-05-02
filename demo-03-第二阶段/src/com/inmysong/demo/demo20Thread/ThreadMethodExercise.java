package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/22 0:29
 * @description
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Hello hello = new Hello();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("hi---"+i);
            Thread.sleep(1000);
            if(i == 5){
                Thread thread = new Thread(hello);
                thread.start();
                thread.join();// 立即将子线程插入到main ，让子线程执行完；
            }
        }
    }
}
class Hello implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("hello---"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}