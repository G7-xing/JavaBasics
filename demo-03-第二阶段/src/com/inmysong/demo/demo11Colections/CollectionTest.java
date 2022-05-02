package com.inmysong.demo.demo11Colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 14:43
 * @description 集合
 * 1.可以动态的保存任意多个对象，使用很方便。
 * 2.提供了一系列方便的操作对象方法：add，remove，set，get
 * 3.使用集合添加，删除新元素的代码简洁。
 */
public class CollectionTest {

    /**
     * 1.集合有两组：单列集合：在集合里面放的是单个对象，单个元素；双列集合：以键值对的形式存在；
     * 2.Collection接口有两个重要要的重要的接口；List，Set，他们的实现子类都是单列集合；
     * 3.Map接口的实现子类：是双列结合存在K-V键值对
     *  Map下有，TreeMap，HashMap，HashTable
     */
    //Collection
    //Map
    public static void main(String[] args) {
        /**
         * 演示Collection接口中常用的方法
         */
        List list = new ArrayList();
        //add:添加元素
        list.add("java");
        list.add(10);//new Integer(010);
        list.add(true);
        System.out.println(list);
        //remove：删除指定元素
        list.remove(0);
        //contains：查找元素是否存在
        System.out.println(list.contains(10));
        //size：获取元素个数
        System.out.println(list.size());
        //isEmpty：判断是否为空
        System.out.println(list.isEmpty());
        //clear：清空
        list.clear();
        //addAll：添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("ji");
        arrayList.add('2');
        list.addAll(arrayList);
        //containsAll：查找对各元素是否存在
        list.containsAll(arrayList);
        //removeAll：删除所有元素
    }


}
