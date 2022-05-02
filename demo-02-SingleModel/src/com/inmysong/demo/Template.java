package com.inmysong.demo;

abstract public class Template {//抽象类-模板设计模型
    public abstract void job();//抽象方.法
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

}
