package com.tingshuo.day18.test;

import java.util.Scanner;

/**
 * @description: java使用for循环统计练习
 * @author: yangZwt
 * @date: 2026/3/19 19:03
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * 练习: 统计满足条件的数字
         * 需求:键盘录入两个数字,表示一个范围.
         * 统计这个范围中.既能被3整除,又能被5整除数字有多少个?
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字表示范围开始");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围结束");
        int end= sc.nextInt();
        // 1.分析数据开始和 数据结束
        int sum=0;
        for (int i = start; i <=end ; i++) {
            // 2.能被3 ,又能被5整除 % 3 ==0 && % 5 ==0
            if ( i % 3== 0 &&  i % 5==0){
               //System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);

    }
}
