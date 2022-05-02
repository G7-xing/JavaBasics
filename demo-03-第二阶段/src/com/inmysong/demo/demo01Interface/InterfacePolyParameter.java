package com.inmysong.demo.demo01Interface;
//接口的多态体现
public class InterfacePolyParameter {
    public static void main(String[] args) {

        //接口类型的变量 monster 可以指向 实现了monster接口类的指向的对象实例
        IF monster = new Monster();
        monster = new Car();

        //继承体现的多态
        AAA a = new BBB();
        a = new CCC();
    }
}

interface IF{}
class  Monster implements IF{}
class Car implements IF{}

class AAA{}
class BBB extends AAA{}
class CCC extends AAA{}