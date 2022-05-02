package com.inmysong.demo.demo01Interface;

//多态数组
public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组->接口类型数组
        Usb[] usbs =new Usb[2];
        usbs[0] = new Phone0();
        usbs[1] = new Camera12();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            //执行特有的方法
            //需要进行向下转型
            if (usbs[i] instanceof Phone0) {
                ((Phone0) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone0 implements Usb{
    public void call(){
        System.out.println("calling");
    }

    @Override
    public void work() {
        System.out.println("Phone is working...");
    }
}
class Camera12 implements Usb{
    @Override
    public void work() {
        System.out.println("Camera is working......");
    }
}