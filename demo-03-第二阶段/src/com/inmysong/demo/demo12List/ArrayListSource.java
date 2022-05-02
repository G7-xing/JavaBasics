package com.inmysong.demo.demo12List;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 17:32
 * @description 源码分析   transient//表示瞬间短暂     、的的，说明该属性不会序列化
 * 1.ArrayList中维护了一个Object类型的数组elementData  transient Object[] elementData；
 * 2.当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，
 *      第一此添加，则扩容elementData为10，如果再次添加，扩容elementData为1.5倍。
 * 3.如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接孔融elementData为1.5倍。
 */
@SuppressWarnings("all")
public class ArrayListSource {

    public static void main(String[] args) {

        //无参构造器创建对象
        //ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(8);
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        for (int j = 11; j <= 15 ; j++) {
            list.add(j);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        for (Object o :list) {
            System.out.println(o);
        }

    }
}
