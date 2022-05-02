package com.inmysong.demo.demo05Annotation;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/24 22:09
 * @description javase 的三个注解
 * 1.@Override  重写，在编译层面的语法的校验
 * 2.@interface 是jdk1.5，表示是一个注解类
 *
 * @Target(ElementType.METHOD) ：说明该注解只能修饰方法 ，是修饰注解的注解，称为元注解
 * @Retention(RetentionPolicy.SOURCE)
 * public @interface Override {
 * }
 * 3.@Deprecated :修饰某个元素，说明该元素过时了，但是还是有用的
 *
 * @Documented
 * @Retention(RetentionPolicy.RUNTIME)
 * @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
 * public @interface Deprecated
 *
 *
 * 4.@SuppressWarnings({""}) :抑制警告信息的
 * {"all"}： 可以写入你希望抑制的警告信息
 * @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
 * @Retention(RetentionPolicy.SOURCE)
 * public @interface SuppressWarnings
 *
 *
 * 源码的元注解：
 * @Retention  ：指定注解的作用范围，SUORCE ：源码 CLASS 类 RUNTIME 运行时  RetentionPolicy：保留策略
 * RetentionPolicy.SOURCE ：编译器使用后：直接丢弃这种注解
 * RetentionPolicy.CLASS：编译器将把注解记录在class文件中，当运行java程序是，JVM不会保留注解，这是默认值
 * RetentionPolicy.RUNTIME： 编译器价将注解记录在class文件中，当运行java程序是，JVM会保留注解，程序可以
 * 通过反射获取该注解
 * @Rarget 指定注解可以在那些地方使用
 * @Documented 指定该注解是否会在javadoc文档体现
 * @Inherited 子类会继承父类
 */
public class AnnotationTest {
//    @Override

  //  @Deprecated

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

    }
}
