package com.inmysong.demoTankGame03;

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
// 为了让Panel不停的重绘子弹，需要将MyPanel实现Runnable，当作一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    MyTank myTank = null;
    // 定义敌人tank
    Vector<EnemyTank> enemyTanks = new Vector<>();
    // 存放一个炸弹Vector
    Vector<Bomb> bombs = new Vector<>();
    int enemySizes = 3;

    // 定义三张炸弹图片，用于显示爆炸交过
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    //构造器
    public MyPanel() {
        // 初始化自己的tank
        myTank = new MyTank(100, 100);
        myTank.setSpeed(10);

        // 初始化敌人的tank
        for (int i = 0; i < enemySizes; i++) {

            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            // 给tank加上子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            // 加入Vector
            enemyTank.shots.add(shot);
            // 启动shot线程
            new Thread(shot).start();
            enemyTanks.add(enemyTank);

        }


        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }
    //绘图

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 2000, 800);//填充矩形，默认灰色

        // 画出自己的坦克
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);

        // 画出敌人的tank，遍历enemyTanks
        for (int i = 0; i < enemyTanks.size(); i++) {
            // 取出tank
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                // 画出 enemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    // 取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    // 绘制子弹
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        // 移除Vector子弹
                        enemyTank.shots.remove(shot);
                    }
                }
            }

        }

        // 画出子弹
        if (myTank.shot != null && myTank.shot.isLive == true) {
            //g.fill3DRect(myTank.shot.x,myTank.shot.y,1,1,false);
            g.draw3DRect(myTank.shot.x, myTank.shot.y, 2, 2, false);
        }
        // 如果bombs 集合中右对象就画出
        for (int i = 0; i < bombs.size(); i++) {
            // 取出
            Bomb bomb = bombs.get(i);
            if (bomb.life>6){
                g.drawImage(image1, bomb.x, bomb.y, 60,60,this);
            }else if(bomb.life>3){
                g.drawImage(image2, bomb.x, bomb.y, 60,60,this);
            }else{
                g.drawImage(image3, bomb.x, bomb.y, 60,60,this);
            }
            // 让炸弹生命值减少,配合图片爆炸效果
            bomb.lifeDown();
            if (bomb.life ==0){
                bombs.remove(bomb);
            }
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


    // 判断我方子弹是走集中敌人
    public  void hitTank(Shot s, EnemyTank enemyTank) {
        // 击中坦克
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    // 创建一个Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    // 创建一个Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
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

        // 如果用户按下时J 就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            myTank.shotEnemyTank();
        }
        // 重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔一段时间他自己重构区域,不停的刷新，子弹就移动了
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 判断是否击中敌人的tank
            if (myTank.shot != null && myTank.shot.isLive) {
                // 遍历敌人所有的tank
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(myTank.shot, enemyTank);
                }
            }
            this.repaint();
        }
    }
}
