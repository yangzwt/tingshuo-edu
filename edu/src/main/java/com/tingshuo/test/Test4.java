package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 演示 逻辑与
 * @author: yangZwt
 * @date: 2026/3/10 19:41
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        /*
         * 需求：
         * 数字 6 是一个真正伟大的数字，键盘录入两个整数，
         * 1.如果 其中一个为 6，最终结果输出 true，
         * 2.如果它们的和为 6的倍数，最终结果输出:true
         * 其他情况都是 false
         */
        //1.需求 ：键盘录入

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数.");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数.");
        int number2 = sc.nextInt();
        // 2. 和 和 取余得到最终结果
        boolean result1 =(number1 ==6 || number2 ==6 || (number1 + number2) % 6==0);
        System.out.println(result1);
    }
}
