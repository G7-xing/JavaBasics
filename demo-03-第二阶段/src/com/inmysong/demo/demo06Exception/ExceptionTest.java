package com.inmysong.demo.demo06Exception;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/24 22:45
 * @description 异常
 * 1.将程序执行中发生的不正常情况称之为异常，语法错误与逻辑错误不是异常
 * 2.异常事件可分为两类
 *  1.Error：虚拟机无法解决的严重问题，程序会崩溃
 *  2.Exception： 其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
 *      运行时异常或编译时异常
 * 3.常见的运行时异常
 *
 *  1.NullPointerException ：空指针异常
 *  2.ArithmeticException :数学运算异常
 *  3.ArrayIndexOutOfBoundsException : 数组越界异常
 *  4.ClassCastException：类型转换异常：当两个类没有继承关系，然后强制转换
 *  5.NumberFormatException:数字格式不正确
 *
 * 4.编译异常
 *  1.SQLException ：操作数据库，查询表可能发生异常
 *  2.IOException：操作文件时，发生异常
 *  3.FileNotFoundException ：当操作一个不存在的文件时发生异常
 *  4.EOFException ：操作文件，到文件末尾，发生异常
 *  5.ClassNotFoundException：加载类该类不存在
 *  6.IllegalArgumentException：参数异常
 *
 * 5.异常处方式
 * try-catch-finally
 * throws，交给jvm处理
 */

public class ExceptionTest {
    public static void main(String[] args) {
        int n = 0;
        try {
            if (n == 1){
                System.out.println("for...");
            }
        } catch (Exception e) {
            System.out.println("catch.....");
        }
    }
}
