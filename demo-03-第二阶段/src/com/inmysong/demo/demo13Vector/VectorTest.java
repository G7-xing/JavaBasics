package com.inmysong.demo.demo13Vector;

import java.util.Vector;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 19:05
 * @description Vector实现类
 * 1.底层也是一个对象数组，protected Object[] elementData;
 * 2.Vector是线程同步的，即线程安全的，Vector类的操作方法待遇 synchronized；
 *
 *  public synchronized void setSize(int newSize) {
 *         modCount++;
 *         if (newSize > elementData.length)
 *             grow(newSize);
 *         final Object[] es = elementData;
 *         for (int to = elementCount, i = newSize; i < to; i++)
 *             es[i] = null;
 *         elementCount = newSize;
 *     }
 *
 * 3.需要线程同步的使用Vector，所有效率没有ArrayList高
 * 4.无参，默认10，满了后就按两倍扩容，指定大小，满后，直接按照指定大小的两倍扩容
 */
@SuppressWarnings("all")
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
    }
}
