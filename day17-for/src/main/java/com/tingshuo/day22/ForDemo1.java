package com.tingshuo.day22;

/**
 * @description: java使用for循环。练习逢7过
 * @author: yangZwt
 * @date: 2026/3/23 11:02
 * @version: 1.0
 */
public class ForDemo1 {
    public static void main(String[] args) {
        /**
         * 练习：逢7过
         * 朋友聚会的时候会玩一个游戏：逢7过
         * 游戏规则：从任意任意一个数字开始报数，当你要报的数字包含7或者7的倍数时，
         * 都要说过。
         * 需求：使用程序在控制台，打印出1-100之间的满足逢7必过的原则的数据。
         */
        // 需求分析：1.包括7，等于7，7的倍数
        // 例如 1，2，3，4，5，6，过，8，9，10，11，12，13，过
        // .....69，过，过，过，过，过，过，过，过，过，过，80..100
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过"+"不能说的数字是："+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
