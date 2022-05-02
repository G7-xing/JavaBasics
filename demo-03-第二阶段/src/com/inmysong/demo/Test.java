package com.inmysong.demo;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args)  {
        BigDecimal i = new BigDecimal("20.34");
        BigDecimal j = new BigDecimal("20.32");
        System.out.println(i.compareTo(j));
        String str = "Design and implementation of simple network storage system based on Java";
        System.out.println(str.toUpperCase());
    }
}

