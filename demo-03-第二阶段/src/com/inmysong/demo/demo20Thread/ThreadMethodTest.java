package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/21 23:55
 * @description 线程的使用
 *1.setName("张清")//设置线程名字
 *2.setPriority(Thread.MIN_PRIORITY);//线程优先级 1
 *3.start()//启动线程
 * 4.interrupt()//中断线程休眠
 * 5.run()//线程调用它，start--start0
 * 6.Thread.sleep(1000)//休眠时间 毫秒
 * 7.Thread.currentThread().getName()//获取当前线程的名字
 *
 *
 * 8. yield : 线程的礼让。让出cpu ，让其它线程执行，但礼让的时间不确定，所以也不一定礼让成功；屈取决于资源情况
 * 9. join ： 线程插队。 插队的线程一旦成功，则肯定先执行完插入的线程所有任务
 */
public class ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        CN cn = new CN();
        cn.setName("张清");
        cn.setPriority(Thread.MIN_PRIORITY);
        cn.start();

        // 主线程打印 5 个hi ，然后终端子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Hi  --"+i);
        }
        // 当执行到这里，就会提前中断 子线程 休眠
        cn.interrupt();
    }
}
class CN extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"吃包子--"+i);
            }
                try {
                    System.out.println(Thread.currentThread().getName()+"休眠中--");
                    Thread.sleep(20*1000);
                } catch (InterruptedException e) {
                    // 当线程执行到一个interrupt 方式时，就会catch 一个 异常，可以加入自己的业务代码
                    // InterruptedException 时捕获到一个中断异常
                    System.out.println(Thread.currentThread().getName()+"被 interrupt  ----");
                }

        }
    }
}