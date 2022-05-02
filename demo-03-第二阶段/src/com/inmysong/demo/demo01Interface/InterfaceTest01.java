package com.inmysong.demo.demo01Interface;

public class InterfaceTest01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();

        Computer computer = new Computer();

        //把手机接入计算机
        computer.work(phone);
        System.out.println("_______________");

        //把相机接入计算机
        computer.work(camera);

    }
}
