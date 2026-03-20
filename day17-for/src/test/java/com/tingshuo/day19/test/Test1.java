package com.tingshuo.day19.test;

/**
 * @description: java中的while循环练习题
 * @author: yangZwt
 * @date: 2026/3/20 18:45
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        // 练习: 打印折纸的次数
        /**
         * 需求: 世界上最高的山峰是珠穆朗玛峰 (8844.43米 = 8844430 毫米),
         * 假如我有一张足够大的纸, 纸张厚度是 0.1 毫米,0.2
         * 请问,我折多少次,可以折成珠穆朗玛峰的高度 ? height,paper,count
         */
        // 1.分析: 折叠的纸张,每次折叠的厚度是原来的两倍
        // 2.8844430 结束
        double height = 8844430;
        // 3.开始  0.1 * 2
        double paper = 0.1;
        int count = 0;
        while (paper <height) {
            paper = paper * 2;
            count++;
        }
        // 4. 结束 8844430
        System.out.println(count);

    }
}
