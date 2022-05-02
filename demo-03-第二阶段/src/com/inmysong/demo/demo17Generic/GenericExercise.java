package com.inmysong.demo.demo17Generic;

import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 17:48
 * @description 1. T ,E 只能是引用数据类型
 * 2. 再给泛型指定具体引用数据类型，可以传入该类型或者类型的子类型
 */
@SuppressWarnings("all")
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("stx", 23));
        students.add(new Student("zq", 22));
        students.add(new Student("stxLoveZq", 999));
        for (Student student : students) {
            System.out.println("Student = " + student);
        }
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("stx", new Student("stx", 23));
        studentHashMap.put("zq", new Student("zq", 22));
        studentHashMap.put("stxLoveZq", new Student("stxLoveZq", 999));


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");


        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> entryIterator = entries.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Student> studentEntry = entryIterator.next();
            System.out.println(studentEntry.getKey() + " = " + studentEntry.getValue());

        }


    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return " Student{" +
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
