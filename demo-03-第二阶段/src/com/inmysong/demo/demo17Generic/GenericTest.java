package com.inmysong.demo.demo17Generic;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 16:52
 * @description 泛型
 *
 * 1. ArrayList<Dog> arrayList = new ArrayList<Dog>();
 * 表示 存放在 arrayList 集合中的元素是Dog类型，不能是其他类型
 * 2.编译时，检查添加元素的类型可提高安全性
 * 3.减少类型次数的转换，提高效率
 *
 *
 *
 */
@SuppressWarnings("all")
public class GenericTest {
    public static void main(String[] args) {
    // 使用泛型

        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("tom",3));
        arrayList.add(new Dog("jeny",4));
        arrayList.add(new Dog("jack",5));

        //arrayList.add(new Cat("datou",8));
//        使用泛型
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() +"--"+ dog.getAge());
        }


    }
}
/*@SuppressWarnings("all")
public class GenericTest {
    public static void main(String[] args) {

//        传统的方式
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("tom",3));
        arrayList.add(new Dog("jeny",4));
        arrayList.add(new Dog("jack",5));

        for (Object o :arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() +"--"+ dog.getAge());
        }

    }
}*/

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}