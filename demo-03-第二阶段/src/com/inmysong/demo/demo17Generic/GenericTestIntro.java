package com.inmysong.demo.demo17Generic;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 17:27
 * @description E = Integer/String/Dog
 * 介绍：
 *  * 1. 泛型又称 参数化类型 ，解决数据类型的安全性问题。
 *  * 2. 在类声明或实例化时候，只要制定好需要的具体类型就i行
 *  * 3. 泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生ClassCastException异常，同时代码更加简洁健壮
 *  * 4. 可以在类声明时通过一个标识表示类的某个属性的类型，
 *  *  或者 是在某个方法返回值的类型 或者 是参数类型
 */
public class GenericTestIntro {
    public static void main(String[] args) {
        Person<String> stx = new Person<String>("stx");
        Person<Integer> integerPerson = new Person<>(100);
    }
}
class Person<E> {
    E s; // E 表示 s 的数据类型 ，该数据类型在定义Person对象的时候指定，就是在编译期间，就确定E是什么类型

    public Person(E s) { // E 可以是参数类型
        this.s = s;
    }

    public E f() { //返回类型使用 E
        return s;
    }
}
