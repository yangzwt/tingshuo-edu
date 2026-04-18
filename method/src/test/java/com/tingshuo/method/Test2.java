package com.tingshuo.method;

/**
 * @description: java的方法练习2，多方法调用。
 * @author: yangZwt
 * @date: 2026/4/18 9:53
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("看程序，回答对应结果");
        System.out.println("a");
        lookMethod1();
    }

    public static void lookMethod1() {
        System.out.println("b");
        lookMethod2();
        System.out.println("c");
    }
    public static void lookMethod2() {
        System.out.println("e");
        System.out.println("f");
    }
}
