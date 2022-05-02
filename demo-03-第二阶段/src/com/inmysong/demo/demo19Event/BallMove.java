package com.inmysong.demo.demo19Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/17 23:09
 * @description 通过键盘控制上下移动， java的事件控制
 */
public class BallMove extends JFrame {
    MyPanel myPanel = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400, 400);
        //JFrame可以监听到键盘的事件
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// KeyListener 是监听器，可以监听键盘输入
class MyPanel extends JPanel implements KeyListener {
    //为了小球移动，就把他的左上角坐标成变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y,40,40);
    }

    /**
     * 有字符输出时该方法就会触发
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 当某个键按下，该方法触发
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)e.getKeyCode());
        //根据用户按下的键，来处理小球的移动
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 5;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 5;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 5;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 5;
        }
        //面板重绘
        this.repaint();
    }

    /**
     * 当某个键松开，该方法触发
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
