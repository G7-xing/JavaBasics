package com.inmysong.demo.demo03reflection;

import java.lang.reflect.Method;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/2 5:35
 * @description
 * 测试反射调用的性能和优化方案
 */
public class Reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();

    }
    // 传统方式
    public static void m1(){
        Cat cat = new Cat();
        long star = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1 "+(end-star));
    }
    // 反射机制
    public static void m2() throws Exception {
        Class cls = Class.forName("com.inmysong.demo.demo03reflection.Cat");
        Object o = cls.newInstance();
        Method method = cls.getMethod("hi");
        long star = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2 "+(end-star));
    }
    // 反射机制 调用优化+关闭访问检查
    public static void m3() throws Exception {
        Class cls = Class.forName("com.inmysong.demo.demo03reflection.Cat");
        Object o = cls.newInstance();
        Method method = cls.getMethod("hi");
        method.setAccessible(true);// 在反射调用方法时，取消访问检测
        long star = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2 "+(end-star));
    }
}
