package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/21 1:06
 * @description 使用对线程，模拟三个窗口同时售票
 *
 * Synchronized
 *
 * 线程同步机制
 * 1.在多线程编程中，一些米娜干数据不允许被多个线程同时访问，此时就是用同步访问技术
 *  保证数据在任何同一时刻，最多有一个线程访问，以保证数据的完整性。
 * 2.也可以这样理解：
 *  线程同步：当一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作，其他线程才能对该内存进行操作。
 *
 * 3.同步的具体方法---Synchronized
 *
 * 1. 同步代码块
 *  Synchronized（对象）{ // 得到对象的锁，才能操作代码快
 *      // 需要被同步的代码
 *  }
 *
 * 2. synchronized 还可以放在方法声明中，表示整个方法为同步方法
 * public synchronized void method(String name){
 *     // 需要同步的代码
 * }
 *
 * 3.互斥锁
 *  1.在java语言中，引入对象互斥锁的概念，来保证共享数据操作的完整性
 *  2.每一个对象都对应一个可称为“互斥锁”的标记，这个标记用来保证在任意时刻，只能有一个线程访问该对象
 *  3.关键词synchronized来与对象的互斥锁联系。当某一个对象用synchronized修饰时，表明该对象在任一时刻
 *      只能由一个线程访问
 *  4.同步局限性： 导致程序的执行效率要降低
 *  5.同步方法  要求是多个线程访问的是同一个对象
 *      非静态的锁可以是 this ，也可以是其他对象。要求同步一个对象
 *      静态的锁为当前类本身
 *
 * 4. 死锁
 *  多个线程都占用了对方的资源，但不肯相让，导致了死锁，在编程是一定要避免死锁发生
 *
 *
 */
public class TicketExercise {
    public static void main(String[] args) {

//        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        // 出现同步互斥的问题了，超卖了
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        SellTicket02 sellTicket03 = new SellTicket02();
//        SellTicket02 sellTicket04 = new SellTicket02();
//        Thread thread = new Thread(sellTicket02);
//        Thread thread1 = new Thread(sellTicket03);
//        Thread thread2 = new Thread(sellTicket04);
//        thread.start();
//        thread1.start();
//        thread2.start();
        new Thread(new SellTicket03()).start();
        new Thread(new SellTicket03()).start();
        new Thread(new SellTicket03()).start();

    }
}

// 使用实现Runnable接口方式 ，使用synchronized实现线程同步
class SellTicket03 implements Runnable{

    private static int ticketNum = 100; //让多个线程共享 ticketNum
    private  boolean loop = true;

    // 静态的锁为当前类本身
    // public synchronized static void m(){} 锁加在 SellTicket03.class
    public synchronized static void m(){}
    // 同步代码快
    public static void m2(){
        synchronized (SellTicket03.class){

        }
    }
    // 说明
    // 1. public synchronized void sell(){} 就是一个同步方法
    // 2. 这时锁在 this对象
    // 3. 依然可以在代码快上写synchronized ,互斥锁还在this对象

    public /*synchronized*/ void sell(){
           synchronized (this){
               try {
                   Thread.sleep(80);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               if (ticketNum <= 0) {
                   System.out.println("售票结束。。。。");
                   loop = false;
                   return;
               }

               System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票"
                       + " 剩余票数 = " + (--ticketNum));
           }

    }
    @Override
    public synchronized void run() { // 同步方法,同一时刻，只能一个线程
        while (loop){
            sell();
        }
    }
}

// 使用继承Thread方式
class SellTicket01 extends Thread {
    private static int ticketNum = 100; //让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。。。");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票"
                    + " 剩余票数 = " + (--ticketNum));
        }
    }
}
// 使用实现Runnable接口方式
class SellTicket02 implements Runnable{

    private static int ticketNum = 100; //让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。。。");
                break;
            }
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票"
                    + " 剩余票数 = " + (--ticketNum));
        }
    }
}