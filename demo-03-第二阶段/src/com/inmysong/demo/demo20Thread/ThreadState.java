package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/22 1:27
 * @description 线程状态演示
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        AH ah = new AH();
        System.out.println(ah.getName() + "state = " + ah.getState());
        ah.start();
        while (Thread.State.TERMINATED != ah.getState()) {
            System.out.println(ah.getName() + "state = " + ah.getState());
            Thread.sleep(1000);
        }
        System.out.println(ah.getName() + "state = " + ah.getState());
    }
}

class AH extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
