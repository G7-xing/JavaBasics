package com.inmysong.demo.demo02InnerClass;

public class InnerClass {
    public static void main(String[] args) {

    }
}

class Outer{
    //属性
    private int z = 11;
    //方法
    public void m1(){
        System.out.println("m1,....");
    }
    //构造器
    public Outer(int z) {
        this.z = z;
    }
    //代码快
    {
        System.out.println("代码块。。。。");
    }
    //内部类
    class InnerClass{

    }
}