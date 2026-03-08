package com.tingshuo.edu.day8;

/**
 * @description: 运算符：赋值运算符
 * @author: yangZwt
 * @date: 2026/03/08 11:45:00
 * @version: 1.0
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        // +=
        //规则
        int a = 10;
        int b = 20;
        a += b;
        // 等同于什么？ a =(int)（a+b）
        System.out.println(a);//30

        short s1 = 10;
        s1 += 1;
        // 等同于什么？  =(int) s1 +1;
        System.out.println(s1);
    }
}
