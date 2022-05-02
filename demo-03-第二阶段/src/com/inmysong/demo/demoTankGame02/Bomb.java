package com.inmysong.demo.demoTankGame02;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/24 0:27
 * @description 炸弹
 */
public class Bomb {
    int x, y;
    int life = 9;// 生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
