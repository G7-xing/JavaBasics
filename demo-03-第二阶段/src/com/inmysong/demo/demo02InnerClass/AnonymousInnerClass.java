package com.inmysong.demo.demo02InnerClass;

/**
 * 演示匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{//外部类
    //属性
    private int n1 = 10;
    //方法
    public void method(){
        //基于接口的匿名内部类
        //1.需求：想使用IA接口，并创建对象
        //2.传统方式：先建一个类去实现接口IA，然后早创建对像取调用
        //3。需求：Dog类只使用一次，以后再也不用了
        //4.此时解决方式就是使用匿名内部类简化开发；
       /* IA  dog = new Dog();
        dog.cry();*/

        //5.dog 的编译类型？看左边的类型就是IA
        //6.don 的运行类型？就是匿名内部类 XXXXX Outer04$1
        // dog 的运行类型： class com.inmysong.demo.demo02.Outer04$1

        /*底层 会分配类名 Outer$1
         class XXXXX implements IA{
            @Override
            public void cry() {
                System.out.println("wawawawawa.....");
            }
         }
        */
        //7.jdk底层在创建匿名内部类 Outer04$1 ，立即码上就创建了 Outer04$1的实例，并且把地址返回dog
        //8.匿名内部类使用一次Outer04$1.class，就不能在用了
        IA dog = new IA() {
            @Override
            public void cry() {
                System.out.println("wawawawawa.....");
            }
        };
        dog.cry();
        System.out.println("dog 的运行类型： " + dog.getClass());

        //演示基于类的匿名内部类
        //father 编译类型：Father
        //father 运行类型 ：Outer$2
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了方法");
            }
        };
        System.out.println(father.getClass());
        father.test();
    }
}

interface IA{//接口
    public void cry();
}

/*class Dog implements IA{

    @Override
    public void cry() {
        System.out.println("wawawawawa.....");
    }
}*/

class Father{//类
    public Father (String name){//构造器
    }
    public void test(){}
}