package com.inmysong.demo.demo18Draw;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 22:58
 * @description 画一个⚪
 */
@SuppressWarnings("all")
public class DrawCircle extends JFrame {   //JFrame 对应一个窗口，是哟个画框
    //顶一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        DrawCircle drawCircle = new DrawCircle();
    }
    // 构造器
    public DrawCircle(){
        //初始化面版
        mp = new MyPanel();
        //把画板放入窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(400,400);
        //关闭.点小叉就退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可以显示
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {

    // 1. MyPanel 就是一个画板
    // 2。 Graphics g 把g理解成一只画笔
    // 3. Graphics 提供很多绘图的方法
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g);//调用父类的方法完成初始化
        System.out.println("woyongl");
        //画一个圆
        g.drawOval(10, 10, 100, 120);

        //直线
        g.drawLine(10,9,20,20);

    }
}