package com.tingshuo.test;

/**
 * @description: java数组练习题
 * @author: yangZwt
 * @date: 2026/3/29 15:56
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        /*练习1：遍历数组并求和
         * 定义数组 ，存储1，2，3，4，5 {1,2,3,4,5}
         * 遍历数组得到每一个元素，求数组里面所有的数据总和
         *
         */
        // 1.分析，定义数组
        int[] array = {1, 2, 3, 4, 5};
        // 2.遍历数组
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        // 3.求和
        System.out.println(sum);
    }
}
