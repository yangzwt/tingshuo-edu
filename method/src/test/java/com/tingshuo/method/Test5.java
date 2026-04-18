package com.tingshuo.method;

/**
 * @description: java使用有参进行多个人年龄总和计算
 * @author: yangZwt
 * @date: 2026/4/18 11:21
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        getSum(10,20);
        getSum(20,30);
        getSum(30,40);
        //计算平均值，平均年龄的话？下个视频，分享
    }
    public static void getSum(int num1,int num2){
        int result=num1 + num2;
        System.out.println("年龄的总和等于："+result);
    }
}
