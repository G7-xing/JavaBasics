package com.inmysong.代理模式;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/21 0:40
 * @description 代理模式
 */
// 线程代理类，模拟一个极简的Thread类
@SuppressWarnings("all")
public class ProxyModel implements Runnable{
    private Runnable target = null;

    public ProxyModel(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }

    private void start0() {
        run();
    }

    @Override
    public void run() {
        if (target == null) {
            target.run();//动态绑定
        }
    }
}

