package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 键盘录入一个三位数，将其拆分为个位，十位，百位，打印在控制台上。
 * @author: yangZwt
 * @date: 2026/3/4 19:18
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，将其拆分为个位，十位，百位，打印在控制台上。
        Scanner sc =new Scanner(System.in);
        System.out.println("请您输入一个三位整数。");
        int number = sc.nextInt();

        // 公式： 123 变为 321
        // 个位 % 10
        // 十位 /10 %10
        // 百位 /100 %10
        // 千位 /1000 %10
        //
        int geWei=number % 10;//个位
        int shiWei=number/10 % 10;//十
        int baiWei=number/100 % 10;//百
        System.out.println("个位:"+geWei);
        System.out.println("十位:"+shiWei);
        System.out.println("百位:"+baiWei);

    }
}
