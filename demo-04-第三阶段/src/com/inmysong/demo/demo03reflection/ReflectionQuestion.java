package com.inmysong.demo.demo03reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/5/2 4:46
 * @description 反射机制
 * 1.反射机制允许程序在执行期间借助于Reflection API 取得任何类的内部信息（比如成员变量，构造器，成员方法等）
 *  并能操作对象的属性及方法。反射在设计模式和框架底层都会用的到
 * 2. 加载完类之后，在堆张就产生了一个Class类型的对象（一个类只有一个Class对象），这个对象包含了类的完整信息。
 *  通过这个对象得到类的结构，这个对象就像一面镜子，通过这个镜子看到类的结构，所以叫 反射
 *  Class，Method,Filed,Constructor  .setAccessible ,调用优化
 */
@SuppressWarnings("all")
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Cat cat = new Cat();

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\java基础\\demo-04-第三阶段\\src\\com\\inmysong\\demo\\re.properties"));
        String classfullpath = (String) properties.get("classfullpath");
        String methodName = String.valueOf(properties.get("method"));
        System.out.println(classfullpath);
        System.out.println(methodName);

        //3。反射机制解决问
        /**
         * 1。加载类 ,返回一个Class类型的对象
         */
        Class cls = Class.forName(classfullpath);
        /**
         * 2.通过cls 得到你加载的类，Cat的对象的实例
         */
        Object o = cls.newInstance();
        /**
         * 3.通过cls 得到你加载类 Cat 的方法对象,在反射中，可以把方法视为一种对象，万物皆可对象
         */
        Method method = cls.getMethod(methodName);
        /**
         * 通过 method 调用方法，通过方法对象调用对象的方法,
         * 通过 method.invoke(对象)，来实现
         */
        method.invoke(o);

    }
}
