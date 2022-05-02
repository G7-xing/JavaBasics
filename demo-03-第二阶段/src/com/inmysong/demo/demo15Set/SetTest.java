package com.inmysong.demo.demo15Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 21:31
 * @description Set 接口用法
 * 1.无序，添加和取出的顺序不一致，没有索引,但是取出顺次每次都一样的
 * 2.不允许重复元素，最多包含一个null
 * 3.实现类主要是，HashSet，TreeSet
 * 遍历可以用：迭代器，增强for，但是不能不用索引
 *
 */
@SuppressWarnings("all")
public class SetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("john");
        hashSet.add("lucy");
        hashSet.add("john");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("tom");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("???????");
        for (Object o :hashSet) {
            System.out.println(o);
        }

    }
}
