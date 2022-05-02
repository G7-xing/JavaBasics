package com.inmysong.demo.demo17Generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 18:13
 * @description
 *
 * 泛型方法：
 * 修饰符 <T,V> 返回类型 方法名 <T t,V v>{
 *
 * }
 * 方法使用了泛型
 * 修饰符 返回类型 方法名 <T t,V v>{
 *  *
 *  * }
 */
@SuppressWarnings("all")
public class GenericExercise22 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("stx",4500,new MyDate(12,4,1998)));
        employees.add(new Employee("zq",3500,new MyDate(2,30,2000)));
        employees.add(new Employee("stx",14500,new MyDate(4,4,1988)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0){
                    return i;
                }
               /* int year = o1.getBirthday().getYear()- o2.getBirthday().getYear();
                if (year != 0){
                    return year;
                }
                int month = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (month != 0) {
                    return month;
                }
                return o1.getBirthday().getDay() - o2.getBirthday().getDay();*/
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}