package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 使用if和else-if和else 做出练习
 * @author: yangZwt
 * @date: 2026/3/15 12:16
 * @version: 1.0
 */
public class Test13 {
    public static void main(String[] args) {
        //商品的价格
        /*
         * 在实际开发中,多种情况判断.会用到if的三种格式
         * 需求:
         * 商城\超市都有VIP的会员制,根据不同的会员会有不同折扣.
         * 假设商品总结为1000.price
         * 键盘录入会员级别,并计算出实际支付的钱.
         * 会员1级:打9折.
         * 会员2级:打8折
         * 会员3级:打七折
         * 非会员:不打折,要打也是打骨折,嘿哈.
         */
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您的会员等级");
        // 2.根据不同等级进行不同判断
        int level = sc.nextInt();
        int price = 1000;
        // 3.if 和 else - if 和 else 判断
        double money = 0;
        if (level == 1) {
            money = (price * 0.9);
        } else if (level == 2) {
            money = (price * 0.8);
        } else if (level == 3) {
            money = (price * 0.7);
        } else {
            money = price;
        }
        System.out.println("请您付钱,金额是:" + money);
    }
}
