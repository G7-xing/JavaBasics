package com.inmysong.demoTankGame03;

import java.util.Vector;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/23 15:59
 * @description
 */
public class EnemyTank extends Tank {
    // 使用Vector 保存对各Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
