package com.inmysong.demo.demo14LinkedList;

import java.util.LinkedList;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 20:49
 * @description LinkedList 增删改查
 */
@SuppressWarnings("all")
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //增加
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        //删
        linkedList.remove();//默认的删除的第一个元素
        System.out.println(linkedList);
        //改
        linkedList.set(1,99);
        System.out.println(linkedList);
    }
}
