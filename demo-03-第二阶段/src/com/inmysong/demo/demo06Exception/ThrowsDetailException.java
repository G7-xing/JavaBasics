package com.inmysong.demo.demo06Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 19:43
 * @description throws 异常处理的细节
 *
 *  1.对于编译异常，程序中必须处理，用try-catch 或 throws
 *  2.对于运行时异常，程序中如果没有处理，默认就是throws方式处理
 *  3.子类重写父类方法时，对抛出异常的规定：
 *      子类重写方法，所抛出的异常类型
 *      要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
 *  4.在throws过程中，如果有方法try-catch，就相当于处理异常，就不不可用throws
 */
public class ThrowsDetailException {
    public static void main(String[] args) {
        f();
    }

    private static void f() {
        int n = 1;
        int t = 0;
        double res = n/t;
    }

    public static void f1() throws FileNotFoundException {
        /**
         * 调用f3 ，报错
         * 1.f3是有编译异常的
         * 2.就相当于f1也有同样 的异常，所以必须处理
         * 3.throws ，try -catch
         *
         */
        f3();
    }

    private static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D://a.txt");
    }


    public static  void f4(){
        /**
         * 1.能调用
         * 2.即使有异常，因为f()抛出的是运行时异常
         * 3.而java中，并不用显示处理，因为有默认的处理机制
         */
        f5();
    }
    public static  void f5() throws ArithmeticException{

    }

}

class Father{
    public void method()throws RuntimeException{

    }
}
class Son extends Father{
    @Override
    public void method() throws  NullPointerException{

    }
}