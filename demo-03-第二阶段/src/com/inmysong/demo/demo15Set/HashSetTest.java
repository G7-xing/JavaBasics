package com.inmysong.demo.demo15Set;

import java.util.HashSet;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 21:46
 * @description HashTest --Set接口的实现类
 * 1.HashSet实际上是HashMap，无参构造直接是下面的代码
 *      public HashSet() {
 *         map = new HashMap<>();
 *     }
 *     HashMap底层是：数组+链表+红黑树
 * 2.可以放 null，只能是一个
 * 3.不能保证输入与输出的顺序一致，HashSet不保证元素是有序的取决于hash后们再确定索引的结果；；？？
 * 4，不能有重复的元素/对象
 */
@SuppressWarnings("all")
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("jack"));
        System.out.println(hashSet);

        //今典的面试题
        //看源码
        hashSet.add(new String("stx"));//ok
        hashSet.add(new String("stx"));//不ok
        System.out.println(hashSet);

    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}