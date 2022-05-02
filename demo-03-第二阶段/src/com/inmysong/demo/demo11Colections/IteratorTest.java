package com.inmysong.demo.demo11Colections;

import java.util.*;
import java.util.Collection;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 15:45
 * @description Iterator 迭代器
 * 1.Collection接口遍历方法
 * 2.Iterator对象称为迭代器，只要用于遍历Collection集合元素中的元素；
 * 3.所有的Collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象，
 *  就是可以返回一个迭代器。
 * 4，Iterator仅用于遍历集合，Iterator本省并不存放对象
 */
public class IteratorTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("java","song"));
        col.add(new Book("Arithmetic","yog"));
        col.add(new Book("math","sti"));
        col.add(new Book("English","qing"));
/*
        System.out.println(col);*/
        //遍历集合
        //1.先得到col对应的Iterator
        Iterator iterator = col.iterator();
        //2.使用while遍历。
        /*while(iterator.hasNext()){
        //编译时，是Object，运行时是Book，动态绑定机制
            Object obj = iterator.next();
            System.out.println(obj);
        }*/
        //快捷键：while -- 》itit .所有模板 ctrl + J
        while (iterator.hasNext()) {
            Object object =  iterator.next();

        }
        //当推出while循环后，这时候iterator指向的是最后的元素，
        // 如果再iterator.next(),会抛出异常：NoSuchElementException
        //还想再次遍历需要重置我们的迭代器Iterator：iterator = col.iterator;第二次遍历

        System.out.println("++++++++++");
        /**
         * 使用增强for循环
         * 底层还是Itertor
         */
        for (Object book: col) {
            System.out.println(book);
        }

    }
}

class Book{
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
