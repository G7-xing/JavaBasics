package com.inmysong.demo.demoTankGame02;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/23 16:16
 * @description
 */
public class Shot implements Runnable {
    // 子弹坐标
     int x;
     int y;
    // 方向
     int direct = 0;
    // 速度
     int speed = 2;

    // 子弹是否存活
    boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() { //射击
        while (true) {
            // 休眠才会看的到弹道
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 根据方向改变坐标
            switch (direct) {
                case 0: // 上
                    y -= speed;
                    break;
                case 1: // 右
                    x += speed;
                    break;
                case 2: // 下
                    y += speed;
                    break;
                case 3: // 左
                    x -= speed;
                    break;
            }
            // 挡子弹移动到面板的边界时，应当自动销毁；把启动的子弹线程销毁
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 800 && isLive)) {
                isLive = false;
                break;
            }
        }

    }
}
