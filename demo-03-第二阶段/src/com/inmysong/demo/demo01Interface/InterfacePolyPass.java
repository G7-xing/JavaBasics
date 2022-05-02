package com.inmysong.demo.demo01Interface;
//多态传递现象
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类性的变量可以指向 是实现了该接口的类的对象实例
        IG ig = new Player();
        RNG rng = new Player();
    }
}

interface RNG{}

interface IG extends RNG{}
class Player implements IG{

}
