package com.tingshuo.day27;

/**
 * @description: 数组动态初始化
 * @author: yangZwt
 * @date: 2026/4/4 16:06
 * @version: 1.0
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        /**
         * 讲解和学习数组的动态初始化和相关问题
         *
         */
        //1. 数组元素的长度定义
       String [] array =new String[5];
       array[0]="zhangsan";
       array[1]="lisi";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");
        int [] ints=new int[3];
        System.out.println(ints[0]);
        String [] arrs=new String[5];
        System.out.println(arrs[0]);
        char [] chars=new char[1];
        System.out.println(chars[0]);
        boolean [] booleans=new boolean[1];
        System.out.println(booleans[0]);
        // 2.数组元素的默认值
        // 2.1、常见数据类型的默认值
            // 字符类型默认值 '\u0000'
            // 整型默认值  0
            // 浮点类型、小数类默认值 0.0
            // 布尔类型默认值 false
            // 引用类型默认值 null
        //3.数组元素的常见开发中的问题

    }

}
