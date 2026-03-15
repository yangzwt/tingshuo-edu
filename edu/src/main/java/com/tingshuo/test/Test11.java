package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: java 使用if 和else
 * @author: yangZwt
 * @date: 2026/3/15 9:50
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        /*
         *需求:练习题-商品付款
         * 在实际开发中,如果要根据两种不同的情况来执行不同的代码,就需要用的if的第二种格式.
         * 需求:
         * 假设,用户在超市实际购买,商品总价为:600元.
         * 键盘录入一个整数表示用户实际支付的钱,
         * 如果打款大于等于600,表示付款成功,否则付款失败.
         *
         */
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您要付款的金额");
        // 2.if 和 else 判断 ,金额
        int money = sc.nextInt();
        if (money >= 600) {
            System.out.println("您付款成功,商品属于您了.");
        } else {
            System.out.println("付款失败,请您核对金额");
        }
    }
}
