package com.tingshuo.day24;

import java.util.Scanner;

/**
 * @description: java 实现求质数
 * @author: yangZwt
 * @date: 2026/3/23 18:29
 * @version: 1.0
 */
public class ForDemo1 {
    public static void main(String[] args) {
        /**
         *
         * 案例-求质数：
         * 需求：键盘录入一个正整数x，判断该整数是否为一个质数。（质数：只能被1和本身整数，否则这个数叫做合数。）
         */
        // 1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        //
        int number=sc.nextInt();// 如果数据是1000000，可以再后续学习中进行优化
        // 7 = 1和7
        // 6 = 2 ，3，1，6
        // 9 = 1，9，3和3
        // 2.分析，for 逐个比较
        // 标记一个结果
        int count=0;
        for (int i = 2; i <number ; i++) {
            if (number % i==0){
                //System.out.println(number+"不是一个质数");
                count++;
                break;
            }
        }
        System.out.println(count);
        if (count>0){
            System.out.println(number+"不是一个质数");
        }else {
            System.out.println(number+"是一个质数");
        }
        System.out.println(number % 4);
        //3.打印是否质数

    }
}
