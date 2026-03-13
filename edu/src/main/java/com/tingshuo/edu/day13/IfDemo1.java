package com.tingshuo.edu.day13;

import java.util.Scanner;

/**
 * @description: 流程控制 ：if
 * @author: yangZwt
 * @date: 2026/3/13 18:38
 * @version: 1.0
 */
public class IfDemo1 {
    public static void main(String[] args) {
        // 需求：键盘录入女婿酒量，如果酒量大于2斤，老丈人给出回应，否则不理会
        //格式： if (关系表达式){语句块}
        // 1.键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int jiu = scanner.nextInt();
        // 2.if 判断
        if (jiu > 2)
           // int a=10; // 1.定义变量 // 2.赋值
            System.out.println("小伙子，酒量不错哦，这门婚事，我同意了。");

    }
}
