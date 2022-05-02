public class Object01 {


    //数组：1.数据类型体现不出来，2。不利于数据的管理
    //类与对象OOP，就是现有的技术，不能完美的解决新的需求
    //String[] cat1 = {"小白","3","白色"};
    //String[] cat2 = {"小花","20","黑色"};
    //将多个事物把他们共有的特性提炼出来，出来的属性与行为组成这些事物的类class，这就是类，
    // 而这些事物的一个个体就是这个类的实例，这个实例就是我们ja中的对象
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "xiao_ming";
        p1.age = 10;
        Person p2 = p1 ;
        System.out.println(p2.age);
    }

    //总结：
     /*
     * 1.java内存的结构：
     *  1.栈：一般存放基本数据类型（局部变量）
     *  2.堆：存放对象
     *  3.方法区：常量池（常量，字符串），类加载信息
     * 2.对象创建的过程
     *  1.先加载Person类信息，只会加载一次
     *  2。在堆中分配空间，进行默认初始化，
     *  3.把地址赋给p1
     *
     * */


    /*
    * 方法机制：
    *   1.当程序执行到方法是，就会在栈中开辟另外一个独立的空间。栈空间
    *   2.此时到了执行方法，等待方法执行结束返回一个结果，此结果会被返回到当时调用他的地方
    *   4，然后继续执行后面的代码
    * */
}
//定义一个猫类
class Cat {
    //属性/成员变量/字段 field
    String name;
    int age;
    String color;
}


class Person {
    String name;
    int age;
}


