package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 三元运算符演示
 * @author: yangZwt
 * @date: 2026/3/11 18:37
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        // 需求是键盘输入数据，计算您的成绩是否及格是否是优秀，如果分数大于60，打印及格，否则打印不及格,score成绩，
        // 增加一个条件，如果大于90分，打印“优秀”，如果小于60认为不及格
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您的成绩，我告诉您是否优秀");
        int score = sc.nextInt();
        String result = score >= 90 ? "优秀" : score >= 80 ? "良好" : score >= 60 ? "及格" : "不及格";
        System.out.println(result);
        //运算符的优先级
        int a =10;
        int b =20;
        int result1 = (a + (b * a));
        System.out.println(result1);
    }
}
