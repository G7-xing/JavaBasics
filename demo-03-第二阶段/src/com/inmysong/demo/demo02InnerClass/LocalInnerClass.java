package com.inmysong.demo.demo02InnerClass;

/**
 * 局部内部类的使用
 */
public class LocalInnerClass {//外部其他类
    //6。外部其他类不可以调用局部内部类，局部内部类是局部成员
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{
    private int n1 = 1;

    public void m1(){
        //1.局部内部类是定义在外部类的局部位置上，通常实在方法中
        //3.不能添加访问修饰符，但是可以使用final修饰
        //4.作用域：只能在定义他的方法体中或代码块中
        final class Inner02{//局部内部类
            //2.可以直接访问外部类的所有成员，包含私有的
            //7.如果外部类和局部内部类的成员重名时，默认遵守就近原则，
            //如果像访问外部类的成员，可使用 （外部类）.this.成员名 去访问
            private int n1 = 800;
            public void f1(){
                //5.局部内部类可以直接访问外内部类的成员
                System.out.println("n1 = " + n1);
                //Outer02.this本质就是Outer02的外部类的对象，哪个对象掉调用了m1，Outer.this就是那个对象
                System.out.println("外部类的n1=" + Outer02.this.n1);
                m2();
            }
        }
        //6.外部类在方法中，可以new Inner02对象，直接调用即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    public void m2(){
        System.out.println("Inner02调用m2（）");
    }
}