package com.tingshuo.edu.day8;

/**
 * @description: 运算符：关系运算符
 * @author: yangZwt
 * @date: 2026/3/8 11:46
 * @version: 1.0
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        // 1.== ?
        int a=10;
        int b=10;
        int c=20;
        System.out.println( a == b );// true-- false
        System.out.println( a == c );//false

        // 2. != ?
        System.out.println(a!=b);//false
        System.out.println( a!=c );// true

    }
}
