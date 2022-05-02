package com.inmysong.demo.demo12List;

import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 16:47
 * @description 集合的遍历的三种方式
 */
public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /**
         * List 接口下有实现类：Vector ，ArrayList，LinkedList
         * 编译类型没变化，运行类型发生变化
         */
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();


        list.add("tom");
        list.add("java");
        list.add("tom");
        list.add("merry");
        list.add("tom");
        list.add("sort");

        //遍历
        //1.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        System.out.println("=============");
        //增强for
        for (Object o :list) {
            System.out.println(o);
        }
        System.out.println("=============");
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
