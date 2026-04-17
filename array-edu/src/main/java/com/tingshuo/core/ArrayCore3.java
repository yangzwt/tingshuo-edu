package com.tingshuo.core;

/**
 * @description: java两个数组共享一个空间
 * @author: yangZwt
 * @date: 2026/4/16 21:24
 * @version: 1.0
 */
public class ArrayCore3 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;
        System.out.println(array1);//地址值
        System.out.println(array2);//地址值
        array1[2] = 40;
        System.out.println(array1[0]);//10
        System.out.println(array1[1]);//20
        System.out.println(array1[2]);// ？40
        System.out.println("--------------");
        System.out.println(array2[0]);//10
        System.out.println(array2[1]);//20
        System.out.println(array2[2]);//40
    }
}
