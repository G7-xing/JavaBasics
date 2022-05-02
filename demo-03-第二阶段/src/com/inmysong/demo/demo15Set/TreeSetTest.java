package com.inmysong.demo.demo15Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 3:34
 * @description TreeSet 分析
 *底层就是 TreeMap
 *
 * 1. 当我们使用无参构造器，常见TreeSet，仍然是无序的
 * 2. 希望添加的是按字符串大小来安排的，
 *  使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
 */
@SuppressWarnings("all")
public class TreeSetTest {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 按照字母顺序排列 字母相同加不进去
                // return ((String) o1).compareTo((String) o2);
                // 按照长度大小排列 长度一样加不进去
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeSet.add("java");
        treeSet.add("abc"); //
        treeSet.add("tom");
        treeSet.add("857");

        System.out.println("TreeSet = " + treeSet);
    }
}
