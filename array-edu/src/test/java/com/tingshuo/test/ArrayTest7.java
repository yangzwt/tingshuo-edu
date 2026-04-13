package com.tingshuo.test;

/**
 * @description: java数组交换
 * @author: yangZwt
 * @date: 2026/4/13 18:51
 * @version: 1.0
 */
public class ArrayTest7 {
    public static void main(String[] args) {
        //要求：数组内元素数据进行首位对调 -结果为：5 2 3 4 1
        int[] array = {1, 2, 3, 4, 5};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
