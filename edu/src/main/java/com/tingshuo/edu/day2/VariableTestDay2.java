package com.tingshuo.edu.day2;

/**
 * @description: 特殊字符类型
 * @author: yangZwt
 * @date: 2026/2/28 20:27
 * @version: 1.0
 */
public class VariableTestDay2 {
    public static void main(String[] args) {
        // 打印制表符 \t 熟悉制表符的基本用法,是为了让前面字符补齐到8或者8的倍数

        System.out.println("name"+'\t'+"age");
        System.out.println("tom"+'\t'+"23");
        System.out.println("-------------------------------");
        int a=10;
        int b=20;
        System.out.println(a+b);//变量的计算
        b=50;
        // 修改变量中值
        System.out.println("修改变量的值"+b);
        System.out.println("-------------------------------");
        // 在一个语句中，可以多个变量
        int d =100,e=200,f=300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        // 变量使用之前需要 先赋值
        // int g;
        // g=0;
        // 建议：以后在定义变量的时候不要 ，把赋值分开来写，请直接赋值
        int g = 0;
        System.out.println("g"+g);

    }
}
