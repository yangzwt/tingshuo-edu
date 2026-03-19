package com.tingshuo.day18.test;

/**
 * @description: java中for的练习-求和
 * @author: yangZwt
 * @date: 2026/3/19 18:54
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        /**
         * 需求: 在实际开发中,如果要获取一个范围的中每一个数据时,会用的循环.
         * 但是此时,大多数情况下,不会获取所有的数据,而是获取其中符合要求的数据.
         * 此时就需要循环和其他语句结合使用了.
         * 例如:求1-100 直接的偶数和
         *
         */
        // 1.分析 实现 1-100之间的每个数字
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            // 2.累加求和(先判断,再求和)
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
