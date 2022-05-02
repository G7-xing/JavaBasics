package com.inmysong.demo.demo10StringReverse;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 1:06
 * @description 注册处理
 *
 * 输入用户名，密码，邮箱，
 * 1.用户名长度为2，或3或4
 * 2，密码长度为6，要求都是数字
 * 3.邮箱中包含@和. ，并且@在.前面
 */
public class Important02 {
    public static void main(String[] args) {
        String name = "zq";
        String pwd = "21eer3";
        String email = "st7xing@163.com";

        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void userRegister(String name, String pwd, String email){
        int length = name.length();
        if(!(length >= 2 && length <= 4)){
            throw new RuntimeException("要求用户名长度为2，或3或4");
        }
        if(!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码长度为6，要求都是数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > -1 && j > i)){
            throw new RuntimeException("邮箱中包含@和. ，并且@在.前面");
        }
    }

    private static boolean isDigital(String pwd) {
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }

}
