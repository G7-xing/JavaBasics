package com.inmysong.demo.demo12List;

import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 16:23
 * @description  List 接口，常用方法
 * List 接口是Collection接口的子接口
 * 1.List集合类中元素有序（添加顺序和取出的顺序一致），可重复的
 * 2.List集合类中的每个元素都有其对应的顺序索引，支持索引
 * 3.List容器中的元素都应对一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素。
 * List接口一下的实现类： ArrayList，LinkedList，Vector
 */
public class ListTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("tom");
        list.add("java");
        list.add("tom");
        list.add("merry");
        list.add("tom");
        list.add("sort");

        System.out.println(list);
        //索引从0开始
        System.out.println(list.get(4));

    }
}
