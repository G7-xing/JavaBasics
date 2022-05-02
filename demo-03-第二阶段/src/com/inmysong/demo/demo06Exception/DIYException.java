package com.inmysong.demo.demo06Exception;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 20:18
 * @description 自定义异常步骤
 * 1.定义类：自定义异常类名，继承Exception或RuntimeException
 * 2.继承Exception，属于编译异常
 * 3.继承RuntimeException，属于运行异常，一般用的多：好处：我们可以使用默认的处理机制。比较方便
 */
public class DIYException {
    public static void main(String[] args) {
        int age = 8;
        if(!(age >=12 && age <= 120)){
            throw new AgeException("年龄需要在18-120");
        }
        System.out.println("正确的");
    }
}
//写个自定义异常类
class AgeException extends RuntimeException{
    public AgeException(String message) {//构造器
        super(message);
    }
}
