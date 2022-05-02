package com.inmysong.demo.demo06Exception;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/24 23:35
 * @description try-catch-finally 演示
 *  1.如果异常发生了，则异常发生后面的代码不会执行，直接静茹catch体中，
 *  2.如果异常没有发生，则顺序执行try的代码快，不会进入catch中
 *  3.如果不管异常，都要执行某个代码，放在finally代码块中
 *  4.可以有多个catch语句，捕获不同的异常（进行不同的业务处理），
 *      要求父类异常在后，子类在前，，如果发生异常，只会匹配一个catch
 *  5.可以进行try-finally配合使用，这种用法相当于美誉捕获异常，因此程序会直接崩掉
 *      应用场景，就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑
 */
public class TryCatchTestException {
    public static void main(String[] args) {
        //1.
        /*try {
            String str = "宋天星";
            int a = Integer.parseInt(str);
            System.out.println("数字："+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        }
        System.out.println("我运行零零");*/
        //4.
        /*try {
            person person = new person();
            person = null;
            System.out.println(person.getName());//NullPointerException
            int n = 1;
            int n1 = 0;
            int res = n / n1 ;//ArithmeticException
            System.out.println(res);
        } catch (NullPointerException e){
            System.out.println("空指针异常" + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("数学运算异常" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //5.
        try{
            int n = 1;
            int n1 = 0;
            int res = n / n1 ;
            System.out.println(res);
        }finally {
            System.out.println("执行了///");
        }
        System.out.println("程序继续。。。");
    }
}

class person{
    private String name = "song";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
