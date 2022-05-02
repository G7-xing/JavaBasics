package com.inmysong.demo.demo12List;



import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 17:02
 * @description
 */
@SuppressWarnings("all")
public class ListExercise {

    public static void main(String[] args) {
        List list = new ArrayList();


        list.add(new Book_list("java      ","song",10.5));
        list.add(new Book_list("english   ","d   ",23.5));
        list.add(new Book_list("java1.8   ","ssg ",134.55));
        list.add(new Book_list("math      ","sfeg",45));
        list.add(new Book_list("java17    ","uyg ",142));
        list.add(new Book_list("Arithmetic","utg ",15));
        //排序
        sort(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o =  iterator.next();
            System.out.println(o);
        }

    }

    public static void sort(List list){
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                //  取出对象
                Book_list book1 = (Book_list) list.get(j);
                Book_list book2= (Book_list) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                        list.set(j,book2);
                        list.set(j + 1,book1);
                }
            }
        }
    }
}


class Book_list{
    private String name;
    private String author;
    private double price;

    public Book_list(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t\t价格：" + price + "\t\t作者：" + author + "\t\t";
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}