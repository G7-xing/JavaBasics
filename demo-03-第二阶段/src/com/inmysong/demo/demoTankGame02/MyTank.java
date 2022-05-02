package com.inmysong.demo.demoTankGame02;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/17 22:29
 * @description
 */
public class MyTank extends Tank {
    // 定义一个Shot对象 ，表示一个设计线程
    Shot shot = null;

    public MyTank(int x, int y) {
        super(x, y);
    }

    // 射击
    public void shotEnemyTank(){
        // 创建Shot对象，根据当前MyTank对象的位置和方向来创建Shot
        switch (getDirect()){
            case 0:// 上
                shot = new Shot(getX()+20,getY(),0);
                break;
            case 1:// 右
                shot = new Shot(getX()+60,getY()+20,1);
                break;
            case 2:// 下
                shot = new Shot(getX()+20,getY()+60,2);
                break;
            case 3:// 左
                shot = new Shot(getX(),getY()+20,3);
                break;
        }
        // 启动我们的Shot线程
        new Thread(shot).start();
    }
}
