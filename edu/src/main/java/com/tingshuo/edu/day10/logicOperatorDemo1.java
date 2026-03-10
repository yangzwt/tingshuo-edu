package com.tingshuo.edu.day10;

/**
 * @description: java逻辑与 和 逻辑或
 * @author: yangZwt
 * @date: 2026/3/10 19:24
 * @version: 1.0
 */
public class logicOperatorDemo1 {
    public static void main(String[] args) {
        // 1. && 逻辑与 ，结果和&相同，但是有短路效果 ,并且，
        // 两边都为真，结果才为真
        System.out.println(true && true); // 结果 true
        System.out.println(false && false); // 结果  false
        System.out.println(true && false); // 结果 false
        System.out.println(false && true); // 结果 false
        System.out.println("-------------------------------");

        //2. || 逻辑或, 结果和|相同，但是有短路效果
        // 两边都为假，结果才是假
        System.out.println(true || true); // 结果 true
        System.out.println(false || false); // 结果  false
        System.out.println(true || false); // 结果 true
        System.out.println(false || true); // 结果 true
        System.out.println("-------------------------------");
        //3. 短路逻辑符具体短路效果
        // 简单的来说：当左边的表达式能确定最终的结果，右边的就不会执行了， 记得演示 & 和 ||
        int a = 10;
        int b = 10;
        boolean result = ++a <1 && ++b < 1;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
