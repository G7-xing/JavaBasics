package com.inmysong.demo.demo08StringClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/26 12:29
 * @description 练习
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        books[0] = new Book("红罗么",100);
        books[1] = new Book("三国演义",90);
        books[2] = new Book("梦",170);
        books[3] = new Book("java基础到进阶",50);

/*        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book n1 =  (Book) o1;
                Book n2 =  (Book) o2;
                return n1.getPrice()-n2.getPrice();
            }
        });*/

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book n1 =  (Book) o1;
                Book n2 =  (Book) o2;
                return n1.getName().length() - n2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));

    }
}
class Book{
    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}