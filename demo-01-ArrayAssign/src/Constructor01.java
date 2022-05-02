/*
* 构造方法：叫构造器，是类的一种特殊的方法，主要作用：完成对新对象的初始化，
*  有以下特点：
*   1。方法名和类相同
*   2. 没有返回值
*   3. 在创建对象是，系统会自动地调用该类的构造器完成对对象的初始化
* 2.一个类的构造器可以有多个，就是构造器重载（方法名相同，参数的形式必须不一样（个数类型等））
*3.构造器是完成对象的初始化，并不是创建对象
* 4.在创建对象时候，系统会自动地调用该类的构造方法
*
*
* this 就是当前对象
*
* */

/**
 * this的注意事项：
 * 可以用来访问本类的属性，方法，构造器
 * 用于区分当前类的属性和局部变量
 * 访问成员方法:this.方法名（参数列表）
 * 访问构造器语法：this（参数列表）；注意只能在构造器中使用，只能在构造器中访问另外一个构造器，必须放在第一条语句
 * this不能在类定义的外部使用，只能在外部使用
 *
 */


public class Constructor01 {
    public static void main(String[] args) {
        Person01 tom = new Person01("tom", 12);
    }
}


class Person01 {
    String name;
    int age;

    public Person01(String name, int age) {
        System.out.println("我被调用。。。");
        this.name = name;
        this.age = age;
    }
}