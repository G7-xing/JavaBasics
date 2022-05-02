package com.inmysong.demo.demo08StringClass;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 21:51
 * @description String 类
 * 惊喜：String 实现了Serialization接口，说明String可以串行化，可以在网络传输
 *       还实现了Comparable接口，说明对象可以比较
 *
 * 1.String 对象保存的是字符串，也就是一组字符序列
 * 2.zhangqing，是字符串常量，双引号里面的书字符序列
 * 3.Unicode字符编码，一个字符占两个字节
 * 4.他有很多构造器：
 * 6.String是final类，不能被继承
 * 7.有个属性， private final char value[] ;用于存放字符串内容，
 *    value是一个final的，不可以修改，意思就是其数组内容可以修改，地址不可修改
 *
 *
 *   String创建方法
 *   1.直接赋值：String s = "zq"
 *      底层:首先从常量池中查看是否有“za"的数据空间，如果有，就直接指向
 *      如果没有，就重新创建一个，然后指向，s最终指向的是常量池的空间地址；
 *   2.调用构造器：String str = new String("zq”);
 *     底层：先在堆中创建空间，String里如果存储了，维护了value属性，指向常量池的zq空间。
 *     如果没有维护value属性，意思就是在常量池中没有“zq”，则重新创建，直接通过value指向，最终指向的是堆中的地址；
 *
 *    intern():返回的是常量池的地址
 *    String重写了equals方法
 *    equals:比较的是内容。区分大小写
 *    equalsIgnoreCase：比较内容，不区分大小写
 */
public class StringTest01 {
    public static void main(String[] args) {
        String a = "zhangqing";
        String b = "lovesongtianxing";
        /**
         * 1.先创建StringBuilder sb = new StringBuilder;
         * 2.sb.append(a)
         * 3.sb.append(b)
         * 常量想加看的是池，变量相加看的是堆中
         */
        String c = a + b;
        int qing = a.indexOf("qing");
        System.out.println(qing);

    }
}
