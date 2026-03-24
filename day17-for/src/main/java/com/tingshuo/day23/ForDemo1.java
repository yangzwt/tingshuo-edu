package com.tingshuo.day23;

import java.util.Scanner;

/**
 * @description: java实现数学中的平方根
 * @author: yangZwt
 * @date: 2026/3/23 21:49
 * @version: 1.0
 */
public class ForDemo1 {
    public static void main(String[] args) {
        /**
         * 需求：键盘录入一个大于等于2的整数 x，计算并返回 x 的平方根，结果只保留整数部分，
         * 小数部分将被舍弃。（平方根：16 的平方根 4，4的平方根2）
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        // 分析：1.平方根，就是原来的数的开平方2.例如 16的平方根是4，4的平安根是2
        // 当前数字小于1循环下一次
        // 当前数字等于 i ，说明当前数字就是平方根
        // 当前数字大于i ，说明i循环的上一个数字就是它的整数部分
        /*
        10的平方根
        1*1 = 1 < 10；
        2*2=4 <10;
        3*3= 9<10;
        4*4 =16 >10;
        20的平方根
         */
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            //等于本身的值
            if (i * i == x) {
                System.out.println(i + "就是" + "x的平方根");
                break;
            } else if (i * i > x) {
                // 大于平方根
                System.out.println((i - 1) + "就是" + "x的平方根的整数部分");
                break;
            }
        }
    }
}
