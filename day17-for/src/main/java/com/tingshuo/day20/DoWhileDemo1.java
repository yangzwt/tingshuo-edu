package com.tingshuo.day20;

/**
 * @description: java 中的do-while循环
 * @author: yangZwt
 * @date: 2026/3/21 14:30
 * @version: 1.0
 */
public class DoWhileDemo1 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("DoWhileDemo1,对应的i是" + i);
            i++;
        } while (i < 1);
        System.out.println("循环结束" + i);
    }
}
