package com.inmysong.demo.demo01Interface;

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作。。");
    }

    @Override
    public void end() {
        System.out.println("相机结束工作。");
    }
}
