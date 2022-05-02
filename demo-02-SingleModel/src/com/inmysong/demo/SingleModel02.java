package com.inmysong.demo;

/**
 * 演示懒汉式的单例模式
 */
public class SingleModel02 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat);
    }
}

//希望在程序运行过程中，只能创建一个Cat对象
//使用单例模式
//懒汉式：只有当用户使用getInstance时候、，才返回实例对象，下一才用的时候就不用再去new了

class Cat{
    private static  int n =99;
    private String name ;
    //步骤：
    //1.将构造器私有化
    private Cat(String name) {
        System.out.println("构造器被加载了。。。");
        this.name = name;
    }
    //2。定义一个static静态属性对象
    private static Cat cat;
    //3.提供一个public的static方法，可以返回一个Cat对象
    public static Cat getInstance(){
        if (cat == null) {
            cat = new Cat("大头");//在这里才是真正的new ，不要加实例的类型
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat【" +
                "name='" + name + '\'' +
                '】';
    }
}
