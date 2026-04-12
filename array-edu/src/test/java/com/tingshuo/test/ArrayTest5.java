package com.tingshuo.test;

import java.util.Random;

/**
 * @description: java数组求和
 * @author: yangZwt
 * @date: 2026/4/12 18:23
 * @version: 1.0
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        //求和：数组中随机数的相关内容
        //需求：生成10个1-100之间的随机数存入数组
        //1.求出数组中所有数据的和？
        //2.求所有数据的平均数？
        //3.统计有多少个数据比平均数小。
        //需求分析1.定义数组 动态数组或静态数组，采用动态数组
        int [] array=new int[10];
        //2.定义随机数
        Random r=new Random();
        for (int i = 0; i < array.length; i++) {
            int number =r.nextInt(100)+1; // 不加1 数据是 0~99
            array[i] = number;
        }
        //3.遍历数组求和-》求出数组中所有数据的和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("该数组中的数据总和是:" + sum);
        //4.数组求平均数
        int avg = sum / array.length;
        System.out.println("该数组中的平均数是:" + avg);
        //5.求数组中数据比平均数小的个数
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                count++;
            }
        }
        System.out.println("该数组中的数据小于平均数的个数有:" + count + "个");
        //验证数组中的数据是否是正确的
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +"+");
        }
    }
}
