package com.tingshuo.edu.day15;

import java.util.Scanner;

/**
 * @description: java使用if和else-if和else第三种判断
 * @author: yangZwt
 * @date: 2026/3/16 19:05
 * @version: 1.0
 */
public class IfElseIfElseDemo1 {
    public static void main(String[] args) {
        /*
         * 需求:小明考试分数
         * 根据不同的分数来决定收到不同的礼物
         * 如果的95-100分,得到自行车一辆
         * 如果是90-94分,游乐场玩一天
         * 如果是80-89分,得到变形金刚一个
         * 如果低于80分,挨顿打.score 分数
         */
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个整数,表示小明的成绩");
        // 2.判断 if 和 else - if 和 else
        int score = sc.nextInt();
        // 增加合法性校验
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("得到自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("得到变形金刚一个");
            } else {
                System.out.println("挨顿打");
            }
        } else {
            System.out.println("您好,您输入的成绩,不合法.");
        }
    }
}
