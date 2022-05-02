package com.inmysong.demo.demo08StringClass;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/26 1:43
 * @description  StringBuilder类
 * 1.一个可变的字符序列，此类提供一个与StringBuffer兼容的API，但不保证同步（StingBuilder不是线程安全的）
 *     该类被设计用作StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候，如果可能，简简易有限采用该类，
 *     因为太多数实现中，它比StringBuffer要快。
 * 2.在StringBuilder上的主要操作是append和insert方法，可重载这些方法，以接受任意类型的数据。
 *
 *
 * String :不可变字符序列，效率底，但是复用率高
 * StringBuffer：可变字符序列，效率较高（增删），线程安全
 * StringBuilder：可变字符序列，效率最高，线程不安全
 *
 * 如果我们堆String做大量的修改，不要使用String
 *
 *
 * 使用原则：
 * 1.存在大量修改增，StringBuffer，StringBuilder均可
 * 2.存在大量修改增，在单线程的情况下，用StringBuilder
 * 3.存在大量修改增，在多线程下用StringBuffer，
 * 4，字符串修改少，被多个对象引用是，用String，比如配置信息等
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
    }
}
