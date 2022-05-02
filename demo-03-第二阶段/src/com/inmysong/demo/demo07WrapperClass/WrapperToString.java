package com.inmysong.demo.demo07WrapperClass;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 21:22
 * @description 包装类转与String类的转换
 *
 * 在判断 ==
 * 只要有基本数据类型参与对比，就是比较的是值
 */
public class WrapperToString {
    public static void main(String[] args) {

        //Wrapper --> String
        Integer n1 = 200;
        //1.
        String str1 = n1 + ""; //对之前的n1的类型没有影响
        //2.
        String str2 = n1.toString();
        //3.
        String str3 = String.valueOf(n1);

        //String --> Wrapper
        String str4 = "2324";
        //1.
        Integer i = Integer.parseInt(str4); //自动装箱
        Integer i1 = new Integer(str4);//构造器
        Integer i3 = Integer.valueOf(str4);
    }
}
