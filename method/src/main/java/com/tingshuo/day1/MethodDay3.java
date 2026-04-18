package com.tingshuo.day1;

/**
 * @description: java方法带参数的学习
 * @author: yangZwt
 * @date: 2026/4/18 10:52
 * @version: 1.0
 */
public class MethodDay3 {
    public static void main(String[] args) {
        // 目标：学会使用方法的带参调用
        // 练习：求长方形的周长 公式：长 * 宽 * 2
        double length = 12.1; //实参
        double with = 20.1;//实参
        getAgees(length, with);
        getAgees(10.1, 10.2);
    }

    /**
     *
     * @param len  形参 长度
     * @param with 形参 宽度
     */
    public static void getAgees(double len, double with) {
        double result = len * with * 2;
        System.out.println("长方形的周长等于:" + result);
    }

}
