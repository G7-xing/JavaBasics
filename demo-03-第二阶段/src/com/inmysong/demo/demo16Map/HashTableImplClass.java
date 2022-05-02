package com.inmysong.demo.demo16Map;

import java.util.Hashtable;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/14 22:29
 * @description Map接口的实现类 -Hashtable
 *
 * 1.存放的元素是键值对：K -v
 * 2.hashtable的键值都不能为null，否则会抛出NullPointerException
 * 3.hashTable 使用方法基本上和HashMap一样
 * 4.hashTable 是线程安全的，HashMap不是线程安全的
 * table = Hashtable$Entry[11],扩容机制：11*2 + 1
 */
@SuppressWarnings("all")
public class HashTableImplClass {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
//        hashtable.put(null,100);
        hashtable.put("john",26);
        hashtable.put("john",100);
        hashtable.put("john",100);
        System.out.println(hashtable);


    }

}
