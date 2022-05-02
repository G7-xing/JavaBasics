package com.inmysong.demo.demo10StringReverse;

import java.util.Locale;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 1:34
 * @description 输入 song tian xing , 输出  xing,song .T
 */
public class Important03 {
    public static void main(String[] args) {
        String name = "song tian xing";
        try {
            printName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void printName(String name){
        if (name == null) {
            System.out.println("名字不能为空");
            return;
        }
        String[] s = name.split(" ");
        if (s.length != 3){
            System.out.println("名字错误！");
            return;
        }
        String format = String.format("%s,%s .%s", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
