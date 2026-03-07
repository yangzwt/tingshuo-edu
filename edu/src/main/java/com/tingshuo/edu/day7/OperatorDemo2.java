package com.tingshuo.edu.day7;

/**
 * @description: 运算符：自增和自减运算符 参与计算
 * @author: yangZwt
 * @date: 2026/3/7 15:24
 * @version: 1.0
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        // ++
        // --
        /*参与计算：
        *
        * */
        int a = 10;
        // 解答
        // 先用后加 11
        int b = a++; // 先用后加
        // 解答 12
        int c = ++a; // 先加后用
        System.out.println("---华丽的分割符-----------");
        System.out.println("a:"+a); //
        System.out.println("---华丽的分割符-----------");
        System.out.println("b:"+b);
        System.out.println("---华丽的分割符-----------");
        System.out.println("c:"+c);

    }
}
