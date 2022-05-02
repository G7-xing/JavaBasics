package com.inmysong.demo.demo15Set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/28 2:02
 * @description
 */
@SuppressWarnings("all")
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("java",12));
        hashSet.add(new Employee("tom",23));
        hashSet.add(new Employee("java",12));
        System.out.println(hashSet);
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //如果name 和 age 相同，放回相同的hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
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