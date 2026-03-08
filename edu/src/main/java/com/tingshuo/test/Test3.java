package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 运算符：练习
 * @author: yangZwt
 * @date: 2026/3/8 09:07
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        /*
        需求：
        您和您的约会对象在餐厅里面正在约会。
        要求：键盘录入两个整数，表示你和你约会对象衣服的时髦度（手动输入 0-10 的整数，不能输入其他）
         如果你的时髦度大于你对象的时髦程度，相亲就成功，输出true，否则输出false。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion = sc.nextInt();
        boolean result = myFashion > girlFashion;
        System.out.println(result);
    }
}
