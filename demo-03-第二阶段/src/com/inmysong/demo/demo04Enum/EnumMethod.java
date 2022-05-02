package com.inmysong.demo.demo04Enum;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/24 21:36
 * @description Enum类的各种方法
 *
 * 1.enum类不能继承其他类，因为他已经继承了Enum类
 * 2.enum类可以实现接口的
 */
public class EnumMethod {
    public static void main(String[] args) {
        //获取一个枚举对象
        Season02 spring = Season02.SPRING;
        Season02 winner1 = Season02.WINNER;
        //1.输出枚举对象的名字
        System.out.println(spring.name());
        //2.ordinal() 输出的是该枚举对象的编号，从0开始的
        System.out.println(spring.ordinal());
        //3.javap 反编译看出values（）方法，放回Season[],含有定义的所有枚举对象
        Season02[] values = Season02.values();
        for (Season02 season: values) {//增强for
            System.out.println(season);
        }
        //4.根据你输入的 WINNER 到 Season02的枚举对象中取查找，
        //找到就放回类型，没找到就报错 illeagleArgumExpencint
        Season02 winner = Season02.valueOf("WINNER");
        System.out.println("winner= "+winner);
        //compareTo：比较两个枚举常量，比较的是枚举的编号
        //前面的 - 后面的 = 3
        System.out.println(winner1.compareTo(spring));
    }

}

enum Season02{
    SPRING("春天","暖"),SUMMER("夏天","热"),AUTUMN("秋天","清"),WINNER("冬天","冷");

    private String name;
    private String desc;

    Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}