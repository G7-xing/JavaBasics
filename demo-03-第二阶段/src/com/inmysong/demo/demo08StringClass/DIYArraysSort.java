package com.inmysong.demo.demo08StringClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/26 2:41
 * @description 冒泡  + 定制排序
 */
public class DIYArraysSort {
    public static void main(String[] args) {
        int[]  arr = {2,1,-3,-5,9,10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("++++++++++++++++++++++++++");
        bubbleDIY(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer o11 = (Integer) o1;
                Integer o22 = (Integer) o2;
                return 011 - 022;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    //完成冒泡排序
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从大到小
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //冒泡 + 定制
    public static void bubbleDIY(int[] arr, Comparator c){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从大到小
                if (c.compare(arr[j],arr[j + 1]) < 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
