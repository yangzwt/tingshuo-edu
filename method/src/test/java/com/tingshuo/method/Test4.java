package com.tingshuo.method;

/**
 * @description: java使用带参计算圆的面积
 * @author: yangZwt
 * @date: 2026/4/18 10:55
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // 目标：学会方法的参数，计算圆的面积 公式：半径 * 半径 * Π
        // 会选择使用无参方法或者有参方法。
        getMeth(1.2);

    }
    public static void getMeth(double len){
       double result= len * len * 3.14;
        System.out.println("圆的面积:"+result);
    }
}
