package com.tingshuo.edu.day11;

/**
 * @description: Java 运算符：三元运算符/三目运算符
 * @author: yangZwt
 * @date: 2026/3/11 18:28
 * @version: 1.0
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //注意格式：关系表达式 ？ 表达式1 ：表达式2；
        //计算规则：首先计算关系表达式的值，如果值为true，表达式1的值就是运算结果，如果为false，表达式2的值就是运算结果。
        // 求 两个数中的最大值
        // 1.需要先定义两个变量
        int number1= 10;
        int number2 =20;
        // 2. 表达式的结果要被使用
        int max = number1 > number2 ? number1 : number2;
        System.out.println( max);

    }
}
