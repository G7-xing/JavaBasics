package com.inmysong.demo.demo08StringClass;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/26 1:05
 * @description StringBuffer
 * 1.可变的字符序列，可以对字符串内容进行增删；
 * 2.方法与String相同，但是它是可变长度的
 * 3.StringBuffer是一个容器.
 * 4.StringBuffer 的直接父类是 AbstractStringBuffer
 * 5.StringBuffer 实现了Serialization接口，它的对象可以串行化
 * 6.在父类中 AbstractStringBuffer ，有属性char[] value,不是final的
 * value数组存在字符串中，因此引出存放在堆中
 * 7.StringBuffer是一个final类，所以不能被继承
 * 8.和String有着本着的区别：
 *      因为StringBuffer 字符内容是存在 char[] value ，
 *      所有在变化（增，删）不用每次都更换地址（即不是每次创建新对象），所以效率高
 * 9.线程安全的  public synchronized 都是这东西修饰的
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);//AbstractStringBuilder appendNull() 的方法，直接写成 null
        System.out.println(stringBuffer.length());//null/4

        System.out.println(stringBuffer);//null

        StringBuffer stringBuffer1 = new StringBuffer(str);//NullPointerException，，
                                    // int length = null.length();
        System.out.println(stringBuffer1);
    }
}
