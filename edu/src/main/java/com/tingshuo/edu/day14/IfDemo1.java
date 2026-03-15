package com.tingshuo.edu.day14;

import java.util.Scanner;

/**
 * @description: java 中的if的第二种用法
 * @author: yangZwt
 * @date: 2026/3/15 9:44
 * @version: 1.0
 */
public class IfDemo1 {
    public static void main(String[] args) {
        /*
         * if (关系表达式){
         * 语句体1;
         * } else{
         * 语句体2;
         * }
         * 执行流程：
         * 1、首先计算关系表达式的值；
         * 2、如果关系表达式的值为true，就执行语句体1；
         * 3、如果关系达式的值为flase，就执行语句体2；
         * 4、继续执行后面的其他语句.
         */

        /*
         * 需求:键盘录入一个整数,表示口袋里的钱,
         * 如果大于等于100,就吃豪华大餐
         * 否则,就吃经济实惠的沙县小吃.
         */
        // 要求使用 if 的第二种用法
        // 1.键盘录入
        Scanner sc=new Scanner( System.in);
        System.out.println("请输入您口袋里的钱,整数");
        int money= sc.nextInt();
        // 2.判断 if 和else
        if (money >=100){
            System.out.println("吃豪华大餐");
        }else {
            System.out.println("吃经济实惠的沙县小吃");
        }
        // money
    }
}
