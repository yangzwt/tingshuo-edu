package com.tingshuo.day17.test;

/**
 * @description: java中的for循环练习
 * @author: yangZwt
 * @date: 2026/3/18 18:59
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        // 练习1,打印 1-5
        // 分析: 开始1,结束5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("for结束才打印.");
        // 练习2,打印 5-1
        // 分析. 开始5,结束1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
