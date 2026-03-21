package com.tingshuo.day20;

/**
 * @description: java 中的while循环练习题，力扣算法题
 * @author: yangZwt
 * @date: 2026/3/21 10:16
 * @version: 1.0
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        /*
         * 需求：给你一个整数x，如果x 是一个回文整数，打印true，否则返回 false。
         * 解释：回文数是指正序（从左向右） 和 倒叙（从右向左）读都是一样的整数。
         * 例如：121 是回文数，而123 不是。
         */
        // 1.定义一个整数
        int x = 123321;
        // 2.将原来的数字，倒过来
        // 使用while循环
        int num = 0;
        int tmp=x;
        while (x!=0) {
            int ge = x % 10;//1
            //System.out.println(ge);
            // 修改一下x的值
            x = x / 10;//2，3，3，2，2，1
            // 3.把最终结果赋值给最终结果，拼接结果
            num=num*10 +ge;
        }
        System.out.println(num);
        // 4.比较结果
        System.out.println(num==tmp);
//        int ge = x % 10;
//        System.out.println(ge);
//        int shi = x / 10 % 10;
//        System.out.println(shi);
//        int bai = x / 100 % 10;
//        System.out.println(bai);
//        int num = ge*100+shi*10+bai;
//        System.out.println(num);
//        System.out.println(x==num);
        // 3.将原来的数字，和倒过来的数字进行比较
        // 4.一样的话打印true，不一样打印false

    }
}
