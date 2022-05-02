package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/23 14:13
 * @description 锁
 * 3.互斥锁
 *  *  1.在java语言中，引入对象互斥锁的概念，来保证共享数据操作的完整性
 *  *  2.每一个对象都对应一个可称为“互斥锁”的标记，这个标记用来保证在任意时刻，只能有一个线程访问该对象
 *  *  3.关键词synchronized来与对象的互斥锁联系。当某一个对象用synchronized修饰时，表明该对象在任一时刻
 *  *      只能由一个线程访问
 *  *  4.同步局限性： 导致程序的执行效率要降低
 *  *  5.同步方法  要求是多个线程访问的是同一个对象
 *  *      非静态的锁可以是 this ，也可以是其他对象。要求同步一个对象
 *  *      静态的锁为当前类本身
 *  *
 *  * 4. 死锁
 *  *  多个线程都占用了对方的资源，但不肯相让，导致了死锁，在编程是一定要避免死锁发生
 *
 *   5. 释放锁
 *   以下情况可以释放锁
 *   1. 当前线程的同步方法，同步代码块执行结束
 *   2. 当前线程在同步代码快，同步方法中遇见break、return
 *   3. 当前线程在同步代码块、同步方法中出现了未处理的Error或Exception，导致异常结束
 *   4. 当前线程在同步代码块、同步方法中执行了线程对象的wait()方法，当前线程暂停，并释放锁
 *
 *   以下情况不会导致释放锁
 *   1. 线程执行同步代码快、同步方法时，程序调用Thread.sleep()Thread.yield()方法暂停当前线程的执行，不会释放锁
 *   2. 线程执行同步代码快时，其他线程调用了该线程的 suspend() 方法将线程挂起，该线程不会释放锁
 */
public class ThreadLock {
    // 模拟一种死锁现象
    public static void main(String[] args) {
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A线程 ");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B线程 ");
        A.start();
        B.start();
    }

}

// 线程
class DeadLockDemo extends Thread {

    static Object o1 = new Object(); // 保证多线程，共享一个对象，使用static
    static Object o2 = new Object();
    boolean flag;


    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    @SuppressWarnings("all")
    @Override
    public void run() {
        // 分析
        // 1. flag = T， 线程A 就会先得到 o1 对象锁，然后尝试去获取o2 对象锁 ，线程 A 的不到o2 对象锁 就会Blocked
        // 2. flag = F， 线程B 就会先得到 o2 对象锁，然后尝试去获取o1 对象锁 ，线程 B 的不到o1 对象锁 就会Blocked

        if (flag) {
            synchronized (o1){ // A对象互斥锁
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){ // 这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }

        }else {
            synchronized (o2){// B对象互斥锁
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1){// 这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }

        }
    }
}