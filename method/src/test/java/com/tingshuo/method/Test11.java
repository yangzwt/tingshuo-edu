package com.tingshuo.method;

/**
 * @description: java中方法的相关练习
 * @author: yangZwt
 * @date: 2026/4/21 18:35
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        //练习一：
        // 数组遍历：需求：设计一个方法用于数组遍历，要求遍历的结果在一行上，例如 [ 1,2,3,4,5 ]
        int[] arr = {1, 2, 3, 4, 5};
        pinList(arr);
        System.out.println();//打印空字符
        System.out.println("");//打印空字符
        System.out.print("");//打印内容不换行
    }

    // 定义方法用于数组遍历
    //1.我要干嘛？ 遍历数组
    // 2.我干这件事情需要什么才能处理完成? 遍历打印，需要一个数组
    // 3.方法的调用，是否需要返回值？ 不需要
    public static void pinList(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

}
