package com.inmysong.demo.demo10StringReverse;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 0:47
 * @description  练习题
 */
public class Important {
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            str = reverse(str, 3, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end){

        /**
         * 编程技巧：
         * 对于输入的参数做一个验证
         * 1.写出正确的情况
         * 2，对正确的情况取反
         */
        if(!(str != null && start >= 0 && end > start && end < str.length())){
            throw new RuntimeException("参数错误");
        }

        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
