package com.inmysong.demo.demo15Set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/28 2:22
 * @description
 */
@SuppressWarnings("all")
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        MyDate f1 = new MyDate(2000, 12, 4);
        MyDate f2 = new MyDate(1998, 3, 4);
        MyDate f3 = new MyDate(2000, 12, 4);

        hashSet.add(new Student("java",12,f1));
        hashSet.add(new Student("tom",23,f2));
        hashSet.add(new Student("java",12,f3));
            System.out.println(hashSet);
    }
}
@SuppressWarnings("all")
class Student{
    private String name;
    private int age;
    private MyDate birthday;

    public Student(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(birthday, student.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
@SuppressWarnings("all")
class MyDate{
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
