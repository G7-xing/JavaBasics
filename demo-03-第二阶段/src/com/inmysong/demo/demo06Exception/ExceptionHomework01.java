package com.inmysong.demo.demo06Exception;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/25 20:35
 * @description
 */
public class ExceptionHomework01 {
    public static void main(String[] args) {

        try {
            //验证输入参数个数是否正确，两个参数
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //先接受到的参数转成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            //调用方法计算
            double cal = cal(n1, n2);
            System.out.println(cal);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对，需要输入整数");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    //方法
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
