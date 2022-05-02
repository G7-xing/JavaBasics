package com.inmysong.demo.demo16Map;

import java.util.HashMap;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/13 20:30
 * @description 源码分析
 * 1.HashMap 底层维护了Node 类型的table，默认为null
 * 2.当创建对象时，将加载因子（loadfactor）初始化为0.75
 * 3.当添加key -value 时，通过key的hash值得到table的索引，然后判断该索引处是否有元素，如果没有元素直接添加
 *     如果有元素，继续判断该索引的key是否和准备加入的key相等，如果相等，则直接替换value，如果不相等需要判断是树结构还是链表结构，做出相应的处理，如果添加时发现容量不够，则需要扩容
 * 4.第一次添加，则需要扩容table容量为16，临界值threshold为12
 * 5.以后扩容，则需要扩容table容量为原来的2倍，临界值为原来的2倍，即24，以此类推
 * 6.在jdk8中秒如果一条链表的元素个数超过8，并且table的大小》=64，就会进行树化，红黑树
 */
@SuppressWarnings("all")
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("java",10);
        hashMap.put("stx",6);
        hashMap.put("zq",9);
        hashMap.put("zq",69);
        System.out.println("hashMap =" + hashMap);

        /**
         * 1. 执行构造器 new HashMap()
         *    初始化加载因子 loadfactor = 0.75
         *    HashMap$Node[] table = null
         * 2. 执行 put ，调用hash方法，计算key的hash值 (h = key.hashCode()) ^ (h >>> 16)
         * public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         * 3. 执行putVal
         *  final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;
         *         //如果底层的table为null，或者length==0，就扩容到16
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         // i = (n - 1) & hash 为table表中的索引值，p时对应索引值位置的值是null，则new一个Node，将K，V扶进去
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash && //如果table 的索引位置的k的hash相同和新的keykey的hash值相同，
         *             并且满足（tabale现有的结点的key和准备添加的key是同一个对像 || equals 返回），并且equals相同
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)//红黑树
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {//后面是链表
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                 // k相同之后 ，v就被替换了
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         */
    }
}
