package com.tingshuo.test.day16;

import java.util.Scanner;

/**
 * @description: java 练习
 * @author: yangZwt
 * @date: 2026/3/17 19:11
 * @version: 1.0
 */
public class Test16 {
    public static void main(String[] args) {
        /*
         * 练习:休息日和工作日
         * 需求:键盘录入星期数,输出工作日,休息日
         * (1-5) 工作日,(6-7) 休息日
         * 使用 case 穿透 week,又用了switch 新特性
         */
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个整数");
        // 2.switch 判断
        int week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有您输入的工作日");
        }
    }
}
