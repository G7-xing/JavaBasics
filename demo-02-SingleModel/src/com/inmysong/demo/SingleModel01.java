package com.inmysong.demo;

public class SingleModel01 {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance();
        System.out.println(girlFriend);
    }
}

/**
 *  单例模式里的饿汉式:myWife在类加载的时候就new出来了，他很着急被使用，你可以不使用
 1,构造器私有化——》防止直接new
 2.类的内部创建对象
 3.向外只暴露一个静态的公共方法。getInstance
 4，代码实现
 */
//女朋友只能有一个
class GirlFriend{
    private String name;
     // 1,构造器私有化——》防止直接new
     //2.类的内部创建对象
     //3.向外只暴露一个静态的公共方法。getInstance
     private static GirlFriend myWife =  new GirlFriend("张清");
     //4，代码实现
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return myWife;
    }

    @Override
    public String toString() {
        return "GirlFriend[" +
                "name='" + name + '\'' +
                ']';
    }
}
