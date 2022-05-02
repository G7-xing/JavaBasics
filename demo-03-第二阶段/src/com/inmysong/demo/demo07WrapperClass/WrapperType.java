package com.inmysong.demo.demo07WrapperClass;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 21:02
 * @description 包装类
 *
 *     Boolean
 *     Character
 *
 *     Number类的子类：
 *         Byte
 *         Short
 *         Integer
 *         Long
 *         Float
 *         Double
 *  三目运算看成一个整体；涉及到数据类型的转换，
 *  1.裝箱：基本数据类型-->包装类类型
 *  2.拆箱：包装类类型-->基本数据类型
 *  3.自动装箱：底层用的是：valueOf(),例如：Integer.valueOf()
 */
public class WrapperType {
    /**
     * 演示int，Integer自动装箱和自动拆箱
     * @param args
     */
    public static void main(String[] args) {
        int n1 = 200;
        //自动装箱 :Xxxxx.valueOf()
        Integer n2 = n1;//底层用，Integer.valueOf(n1)
        //自动拆箱 xxxxValue()
        int n3 = n2;//使用的是intValue()
        Integer m = 128;//-128--127  ,不在直接new
        Integer n = 128;
        System.out.println(m);
    }

}
