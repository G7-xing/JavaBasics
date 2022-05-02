package com.inmysong.demo.demo04Enum;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/24 21:15
 * @description 自定义枚举
 * 1.将类的额构造器私有化，目的防止new
 * 2.去掉setXxx方法，防止属性被修改
 * 3.在类的内部，直接创建固定的对象
 */
public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
        System.out.println(Season.SPRING.getDesc());
        System.out.println(Season.WINNER);


    }
}

class Season{
    private String name;
    private String desc;

    //定义四个静态变量
    public final static Season SPRING = new Season("春天","暖");
    public final static Season SUMMER = new Season("夏天","热");
    public final static Season AUTUMN = new Season("秋天","清");
    public final static Season WINNER = new Season("冬天","冷");


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}



