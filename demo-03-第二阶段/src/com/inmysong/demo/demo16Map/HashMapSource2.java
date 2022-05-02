package com.inmysong.demo.demo16Map;

import java.util.HashMap;
import java.util.Objects;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/14 22:14
 * @description
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12 ; i++) {
            hashMap.put(new A(i), i);
        }

        System.out.println("hashMap = "+ hashMap);
    }
}
class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public String
    toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
