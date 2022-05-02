package com.inmysong.demo.demo01Interface;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作。。。");
    }

    @Override
    public void end() {
        System.out.println("手机结束");
    }
}
