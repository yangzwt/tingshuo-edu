package com.tingshuo.core;

/**
 * @description: java数组多个数组演示
 * @author: yangZwt
 * @date: 2026/4/16 21:23
 * @version: 1.0
 */
public class ArrayCore2 {
    public static void main(String[] args) {
        //int [] array=new int [3];
        //栈 和 堆内存，两个数组分别占用不同的空间。
        int [] array1= {10,20,30};
        System.out.println(array1);// 地址值
        System.out.println(array1[0]);//10
        System.out.println(array1[1]);//20
        System.out.println(array1[2]);//30
        System.out.println("-----------");
        int [] array2={10,20,30,40};
        System.out.println(array2);// 地址值
        System.out.println(array2[0]);//10
        System.out.println(array2[1]);//20
        System.out.println(array2[2]);//30
        System.out.println(array2[3]);//40
    }
}
