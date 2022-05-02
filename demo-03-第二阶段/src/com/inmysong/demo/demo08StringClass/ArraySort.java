package com.inmysong.demo.demo08StringClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/26 2:12
 * @description   Arrays
 *
 * 1.可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
 * 2.因为数组是引用类型，所以通过sort排序后，会直接影响到  实参 arr
 * 3.sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
 * 4.调用 定制排序 时，传入两个参数1.排序的数组 arr 2。实现了的Comparator接口的匿名内部类，要求实现 compare 方法
 * >0 升序 huo <0降序
 */
public class ArraySort {
    public static void main(String[] args) {
        Integer[] arr = {1,4,5,78,23,94,43,55};

       /* //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //直接使用Arrays.toString方法，显示数组
        System.out.println(Arrays.toString(arr));*/

        //Arrays.sort(arr);
/*
        1.可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
        2.因为数组是引用类型，所以通过sort排序后，会直接影响到  实参 arr
        3.sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        4.调用 定制排序 时，传入两个参数 1.排序的数组 arr 2。实现了的Comparator接口的匿名内部类，
                要求实现 compare 方法*/

        Arrays.sort(arr,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                return n2 - n1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
