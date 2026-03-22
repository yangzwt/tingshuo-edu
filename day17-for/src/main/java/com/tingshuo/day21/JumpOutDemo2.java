package com.tingshuo.day21;

/**
 * @description: java中循环的结束循环练习
 * @author: yangZwt
 * @date: 2026/3/22 13:25
 * @version: 1.0
 */
public class JumpOutDemo2 {
    public static void main(String[] args) {
        /**
         * 循环练习：break;
         * 练习2：小老虎吃包子，今天心情不好，吃不了5个包子了,只能吃3个。
         * tiger, eat,bun
         */
        int bun=5;
        int eat=0;
        int count=0;
        while (eat<=bun){
            if (count==3){
                break;
            }
            eat++;
            System.out.println("小老虎再吃第" + eat + "个包子");
            count++;
        }
        System.out.println("小老虎吃了" + count + "个包子");
        System.out.println("for循环==========================");
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("小老虎再吃第" + i + "个包子");
            sum++;
            if (i==3){
                break;
            }
        }
        System.out.println("小老虎吃了" + sum + "个包子");
    }
}
