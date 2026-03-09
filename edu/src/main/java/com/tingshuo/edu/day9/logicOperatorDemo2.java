package com.tingshuo.edu.day9;

/**
 * @description: java逻辑运算符 ^ 和
 * @author: yangZwt
 * @date: 2026/3/9 19:06
 * @version: 1.0
 */
public class logicOperatorDemo2 {
    public static void main(String[] args) {
       // 1. ^ 异或 shift + 6 ^ 相同为false，不同为true
        System.out.println( true ^ true); // 结果  false
        System.out.println( false ^ false); // 结果  false
        System.out.println( true ^ false); // 结果 true
        System.out.println( false ^ true); // 结果 true
        // 2. ! 逻辑非。也叫 取反
        // 提示：
        // 取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println( ! true); // 结果 false
        System.out.println( ! false ); // 结果 true
    }
}
