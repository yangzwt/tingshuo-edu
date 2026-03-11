package com.tingshuo.test;

/**
 * @description: 三元运算符
 * @author: yangZwt
 * @date: 2026/3/11 18:53
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        /*
        需求：一座寺庙里住着三个和尚，已知他们的身高，分别式 210cm、150cm、165cm
        请用程序实现获取这三个和尚的最高身高。
         */
        int length1 = 210;
        int lengt2 = 150;
        int length3 = 165;

        // 三个数值比较
        int tmp = length1 > lengt2 ? length1 : lengt2;
        int max = tmp > length3 ? tmp : length3;
        System.out.println(max);


    }
}
