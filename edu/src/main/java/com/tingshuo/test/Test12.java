package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: java if 的练习题,实现电影院选座
 * @author: yangZwt
 * @date: 2026/3/15 9:58
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) {
        /*
         * 在实际开发中,电影院选座也使用了if判断
         * 假设某电影院售卖了100张电影票,票的序号为1-100之间.
         * 其中奇数票号坐左侧,偶数票号坐右侧.
         * 键盘录入一个整数表示电影票的票号.
         * 根据不同的情况,给出不同的提示:
         * 如果票号为奇数,那么打印坐左边,
         * 如果票号为偶数,那么打印坐右边.
         * ticket
         */
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        // 2.判断if 和else
        System.out.println("请您输入您的电影票号");
        int ticket = sc.nextInt();
        // 3.小坑:奇数和偶数 % 2 == 0 .if 嵌套
        if (ticket > 0 && ticket <= 100) {
            if (ticket % 2 == 0) {
                System.out.println("请您坐右边");
            } else {
                System.out.println("请您坐左边");
            }
        }
    }
}
