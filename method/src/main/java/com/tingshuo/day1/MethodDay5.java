package com.tingshuo.day1;

/**
 * @description: java方法的重载
 * @author: yangZwt
 * @date: 2026/4/20 18:18
 * @version: 1.0
 */
public class MethodDay5 {
    public static void main(String[] args) {
        //练习:  求两个数的和
        int sumTwo = getSumTwo(10, 20);
        System.out.println(sumTwo);
        //  求三个数的和
        //  求四个数的和

    }

    /**
     * 求两个数的和
     *
     * @param a
     * @param b
     * @return
     */
    public static int getSumTwo(int a, int b) {
        return a + b;
    }

    /**
     * 求三个数的和
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int getSumThree(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * 求四个数的和
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int getSumFour(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /**
     * 求两个小数的和
     */
    public static double getSumDecimals(double a, double b) {
        //decimals d=
        return a + b;
    }
}
