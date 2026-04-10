package com.tingshuo.day27;

/**
 * @description: 数组动态初始化和静态初始化的区别
 * @author: yangZwt
 * @date: 2026/4/4 16:17
 * @version: 1.0
 */
public class ArrayComDemo2 {
    public static void main(String[] args) {
        /**
         * 数组动态初始化和静态初始化的区别
         */
        //静态初始化
        String [] array= {"zhangsan","lisi"};
        // 动态初始化
        String [] strings= new String[3];
        System.out.println(strings[5]);
    }
}
