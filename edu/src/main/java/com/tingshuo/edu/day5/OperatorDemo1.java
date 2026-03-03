package com.tingshuo.edu.day5;

/**
 * @description: 运算符：1.算术运算符
 * @author: yangZwt
 * @date: 2026/3/3 21:37
 * @version: 1.0
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        // +
        // -
        // *
        System.out.println(2 + 3);//5
        System.out.println(4 - 1);//3
        System.out.println(2 * 3);//6
        //如果计算的时候有小数参与计算
        //结论：
        //如果有小数参与计算，可能会出现不精确的情况。
        // 为什么呐？
        // 我们会在后边学习java进阶过程中讲解。
        System.out.println(1.1 + 1.1);// 2.2
        System.out.println(1.1 + 1.01);// 2.11 ？2.1100000000000003
        System.out.println(1.1 - 1.01);//?0.01 ？0.09000000000000008
        System.out.println(1.1 * 1.01);// 1.1110000000000002
    }
}
