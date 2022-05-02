package com.inmysong.demo.demoTankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;


/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/17 22:30
 * @description 坦克大战绘图区
 */

// 为了实现键盘监听时间
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    MyTank myTank = null;
    // 定义敌人tank
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemySizes = 3;

    //构造器
    public MyPanel() {
        // 初始化自己的tank
        myTank = new MyTank(100, 100);
        myTank.setSpeed(10);

        // 初始化敌人的tank
        for (int i = 0; i < enemySizes; i++) {

            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);

        }
    }
    //绘图

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 2000, 800);//填充矩形，默认灰色

        //画出自己的坦克
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);

        // 画出敌人的tank，遍历enemyTanks
        for (int i = 0; i < enemyTanks.size(); i++) {
            // 取出tank
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }

    }

    /**
     * @param x      :左上角的x坐标
     * @param y      ：左上交的y坐标
     * @param g      ： 画笔
     * @param direct ：tank方向
     * @param type   ：坦克类型
     */
    private void drawTank(int x, int y, Graphics g, int direct, int type) {

        //不用类型的tank不同的颜色
        switch (type) {
            case 0://我们自己坦克
                g.setColor(Color.green);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向绘制tank
        //direct :0:向上 1：向右 2：向下 3向左
        switch (direct) {
            case 0: //向上
                g.fill3DRect(x, y, 10, 60, false);//左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间的肚子
                g.fillOval(x + 10, y + 20, 20, 20);//圆盖
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒
                break;
            case 1: //向右
                g.fill3DRect(x, y, 60, 10, false);//上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//中间的肚子
                g.fillOval(x + 20, y + 10, 20, 20);//圆盖
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//炮筒
                break;
            case 2: //向下
                g.fill3DRect(x, y, 10, 60, false);//左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间的肚子
                g.fillOval(x + 10, y + 20, 20, 20);//圆盖
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//炮筒
                break;
            case 3: //向左
                g.fill3DRect(x, y, 60, 10, false);//上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//中间的肚子
                g.fillOval(x + 20, y + 10, 20, 20);//圆盖
                g.drawLine(x + 30, y + 20, x, y + 20);//炮筒
                break;
            default:
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 处理
     * wasd 键按下
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变方向
            myTank.setDirect(0);
            myTank.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(1);
            myTank.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirect(2);
            myTank.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(3);
            myTank.moveLeft();
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
