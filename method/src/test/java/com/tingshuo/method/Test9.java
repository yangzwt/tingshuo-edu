package com.tingshuo.method;

/**
 * @description: java方法的重载练习
 * @author: yangZwt
 * @date: 2026/4/20 18:44
 * @version: 1.0
 */
public class Test9 {
    // 第4组，判断.构成方法重载，但是不建议使用。
    public static void getSum(int a,double b){
        System.out.println(a+b);
    }
    public static void getSum(double b,int a){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        getSum(10,1.1);
        getSum(11.1,1);
    }
}
