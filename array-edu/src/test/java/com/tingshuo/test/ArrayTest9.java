package com.tingshuo.test;


import java.util.Random;

/**
 * @description: java数组中的打乱顺序
 * @author: yangZwt
 * @date: 2026/4/14 18:19
 * @version: 1.0
 */
public class ArrayTest9 {
    public static void main(String[] args) {
        // 需求： 定义一个数组，存入1~5，要求打乱数组中所有数据的顺序
        int[] array = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            //生成随机数 1-5
            int randomIndex = r.nextInt(array.length);
            // 标记发存储开始值
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }

        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
