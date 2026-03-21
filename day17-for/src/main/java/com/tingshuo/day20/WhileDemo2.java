package com.tingshuo.day20;

/**
 * @description: java中的while循环练习
 * @author: yangZwt
 * @date: 2026/3/21 11:30
 * @version: 1.0
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        /**
         * 案例：求商和余数
         * 需求：给定两个整数，被除数和除数，（都是正数，且不超过int 的范围）。
         * 将两数相除，要求不使用乘法、除法 和 % 运算符。
         * 得到商和余数。
         */
       /* int a=100;//被除数
        int b=10;//除数
        100 - 10 = 90;
        90 - 10 =80;
        80 -10 =70;
        70 -10 =60;
        60 -10 =50;
        50 -10 =40;
        40 -10 =30;
        30 -10 =20;
        20 -10 =10;
        10 -10 =0;*/
        int number = 100;//被除数
        int num = 37;//除数
        int count = 0;
        while (number >= num) {
            number = number - num;
            System.out.println(number);
            count++;
        }
        System.out.println("余数："+number);
        System.out.println("商：" +count);
    }
}
