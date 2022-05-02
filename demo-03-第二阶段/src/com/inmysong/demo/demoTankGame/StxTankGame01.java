package com.inmysong.demo.demoTankGame;

import javax.swing.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/17 22:34
 * @description
 */
public class StxTankGame01 extends JFrame {

    //定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        StxTankGame01 stxTankGame01 = new StxTankGame01();
    }
    public StxTankGame01(){
        //初始化面版
        mp = new MyPanel();
        //把画板放入窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(1000,800);
        this.addKeyListener(mp);
        //关闭.点小叉就退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可以显示
        this.setVisible(true);
    }
}
