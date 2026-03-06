package com.tingshuo.test;

/**
 * @description: 练习 字符串相加
 * @author: yangZwt
 * @date: 2026/3/6 19:12
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("第一题：-----");
        System.out.println(3.1 + "abc");// 问  3.1abc
        System.out.println("第二题：-----");
        System.out.println("abc" + true);//结果是什么 abcture
        System.out.println("第三题：-----");
        System.out.println('中' + "abc" + true);//结果是什么中abctrue
        System.out.println("第四题：-----");
        int age = 18;
        System.out.println("我的年龄是：" + age + "岁");//结果是什么 我的年龄是18岁
        System.out.println("我的年龄是：" + "age" + "岁");//结果是什么 我的年龄是age岁
        System.out.println("第五题：-----");
        System.out.println(1 + 2 + "abc" + 2 + 1); // 结果是什么3abc21
        System.out.println("第六题：-----");
        System.out.println("abc" + 123);// 结果是什么 abc123
    }
}
