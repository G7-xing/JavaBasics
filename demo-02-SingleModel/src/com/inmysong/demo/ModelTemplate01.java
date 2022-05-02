package com.inmysong.demo;

public class ModelTemplate01 {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.job();
    }
}

class Sum extends Template{

    public void job(){
        long sum= 0;
        for (long i = 1; i <= 8000000; i++) {
            sum+=i;
        }
    }
}