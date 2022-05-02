package com.inmysong.demo.demo03InnerClassE;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //匿名内部类
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("get up to bed");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("gogoggogo");
            }
        });
    }
}

interface Bell{
    public void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}