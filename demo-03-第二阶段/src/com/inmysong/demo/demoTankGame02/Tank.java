package com.inmysong.demo.demoTankGame02;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/17 22:27
 * @description
 */
public class Tank {
    private int x;//横坐标
    private int y;//纵坐标
    private int direct;
    private int speed;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //移动
    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
