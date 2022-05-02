package com.inmysong.demo.demo15Set;

import java.util.HashSet;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 23:58
 * @description HashSet.add()源码追击
 * 1.HashSet底层是HashMap
 * 2.添加一个元素时，先得到的时Hash值--会转称--》索引值
 * 3.找到存储数据表table，看这个索引位置是否已存放的元素
 * 4，如果没有，直接加入
 * 5.如果有，调用equals比较，如果相同，就放弃添加，如果不同，则添加到最后面
 * 6.在java8中，如果一条链表的元素个数>=默认值8，并且table的大小>= 64，链表就会转成红黑树
 */
@SuppressWarnings("all")
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);
    }
    /**
     * 源码解读：
     * 1. 执行HashSet()构造器
     *      public HashSet() {
     *         map = new HashMap<>();
     *     }
     * 2.执行add（）
     *  public boolean add(E e) { e = java
     *         return map.put(e, PRESENT)==null;//PRESENT:private static final Object PRESENT = new Object();
     *     }
     * 3，执行 put() ，会执行hash(),会得到key对应的hash值： 算法：(h = key.hashCode()) ^ (h >>> 16);
     *  public V put(K key, V value) { //key =java ,value = PRESENT 共享的对象
     *         return putVal(hash(key), key, value, false, true);
     *     }
     * 4.执行 putVal()
     *  final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
     *                    boolean evict) {
     *         Node<K,V>[] tab; Node<K,V> p; int n, i;//定义一些辅助变量
     *
     *         //table：就是HashMap的一个数组，类型Node[]
     *         //if语句表示如果当前table是null，或者大小 = 0
     *         //就是进行第一次扩容，到 16 空间，在一此扩容就直接两倍；
     *         if ((tab = table) == null || (n = tab.length) == 0)
     *             n = (tab = resize()).length;
     *          //1.根据key，得到的hash 去计算该key应该存放到table表的哪一个索引位置
     *          //并把这个索引值的对象赋给 p 节点
     *          //2.判断 p 是否为 null
     *              如果为空。表明该节点 p 没有存放元素，就创建一个Node（key=java，value =PRESENT）
     *         if ((p = tab[i = (n - 1) & hash]) == null)
     *             tab[i] = newNode(hash, key, value, null);
     *         else {
     *              //开发技巧：定义变量，在需要的变量的时候在创建
     *             Node<K,V> e; K k;
     *             //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样
     *             //并且的满足下面两个条件之一
     *             //   1.准备加入到额 key 和 p 指向Node 结点 的 key 是同一个对象
     *             //   2.准备加入的key 的equals 与 p 指向Node 结点 的 key = k 比较之后相同
     *             if (p.hash == hash &&
     *                 ((k = p.key) == key || (key != null && key.equals(k))))
     *                 e = p;
     *              //判断这个 p 是不是一个红黑树
     *              //如果是一颗红黑树，就调用putTreeVal，来进行添加
     *             else if (p instanceof TreeNode)
     *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
     *             else {
     *             //如果table对应的索引位置，已经是一个链表，就使用以下的for循环比较
     *             //(1) 依次和链表的每一个元素比较后，都不相同，则加入到该链表的最后，
     *             //    注意在把元素添加到链表后，就立即判断 该链表是否已经达到 8 个结点，如果达到8个结点
     *             //    就调用treeifyBin(tab, hash)方法，对当前这个链表进行红黑树树化，
     *             //   注意： 在转成红黑树时，要进行判断，判断条件；作用是看看你table的大小是否>=64
     *             //   if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY（64）)
     *             //       resize();
     *             //   如果上面成立，就对table进行扩容
     *             //   如果不成立，才进行红黑树树化。
     *             //(2)依次和该链表的每一个元素比较过程中马，如果有相同的情况，直接break；
     *             //
     *                 for (int binCount = 0; ; ++binCount) {
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
     *                     e.value = value;
     *                 afterNodeAccess(e);
     *                 return oldValue;
     *             }
     *         }
     *         ++modCount;
     *         // size 就是我们 每加一个结点Node（）,size++;
     *         if (++size > threshold)
     *             resize();//扩容
     *         afterNodeInsertion(evict);
     *         return null;
     *     }
     */
}
