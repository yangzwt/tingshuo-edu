package com.tingshuo.method;

/**
 * @description: java方法练习2
 * @author: yangZwt
 * @date: 2026/4/21 18:45
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) {
        //练习二：
        //数组最大值：需求：设计一个方法用于求数组的最大值，并将最大值返回;
        int[] arr = {1, 2, 3, 4, 5};
        // 定义方法用于数组遍历
        //1.我要干嘛？ 遍历数组
        // 2.我干这件事情需要什么才能处理完成? 求最大值 int []
        // 3.方法的调用，是否需要返回值？ 需要返回值
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
