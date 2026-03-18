package com.tingshuo.day17.test;

/**
 * @description: java中的for循环练习2
 * @author: yangZwt
 * @date: 2026/3/18 19:03
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * 练习: 玩游戏的时候,如果网络不好,那么会经常掉线重连.
         * 那么掉线重连这个业务逻辑就需要重复执行
         * 假设现在公司要求,掉线重连的业务逻辑最多只能5次
         * 请用代码实现
         * 目前:学习基础阶段,掉线重连,可以用打印语句描述即可.
         */
        // 分析 :5次掉线重连
        for (int i = 1; i <=5 ; i++) {
            System.out.println("第"+i+"次网络信号不好,掉线重连.");
        }
        int sum = 0;

        for (int i = 1; i <= 3; i++) {

            sum += i;

        }
        System.out.println(sum);
    }
}
