package com.inmysong.demo.demo20Thread;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/20 23:31
 * @description 线程
 *
 * 1. 线程由进程创建的，是进程的一个实体
 * 2. 一个进程可以拥有对各线程
 * 3.单线程 ：同一个时刻，只允许执行一个线程
 * 4.多线程同一时刻可以执行多个线程
 *  并发 ： 同一时刻，多个任务交替执行，造成一种貌似同时的错觉，简单的说，单核cpu实现的多任务就是并发
 *  并行 ：同一个时刻，多个任务同时执行，多核cpu可以实现并行。并发和并行同时进行
 */
public class ThreadsTest {
    /**
     * 测试cpu个数
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 可用的处理器个数
        int cpuNumbers = runtime.availableProcessors();
        System.out.println(cpuNumbers);
    }
}
