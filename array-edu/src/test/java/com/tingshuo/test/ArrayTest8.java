package com.tingshuo.test;

/**
 * @description: java数组交换练习
 * @author: yangZwt
 * @date: 2026/4/13 18:51
 * @version: 1.0
 */
public class ArrayTest8 {
    public static void main(String[] args) {
        //要求：数组内元素数据进行首位对调 -结果为：5 4 3 2 1
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
