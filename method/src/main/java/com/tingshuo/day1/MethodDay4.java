package com.tingshuo.day1;

/**
 * @description: java使用方法带返回值
 * @author: yangZwt
 * @date: 2026/4/18 15:10
 * @version: 1.0
 */
public class MethodDay4 {

    public static void main(String[] args) {
        // 目标： 学会方法的使用，包括带返回值
        // 练习：定义一个方法：求一个商场每个季度的营业额。根据方法结果再计算出全年的营业额。
        //第一个季度的营业额
        //1.直接调用
//        getSum(10,20,30);
//        getSum(20,20,30);
//        getSum(30,20,30);
//        getSum(40,20,30);
        //2. 赋值调用
        //第一个季度的营业额
        int sum1 = getSum(10, 20, 30);
        //第二个季度的营业额
        int sum2 = getSum(20, 20, 30);
        //第三个季度的营业额
        int sum3 = getSum(30, 20, 30);
        //第四个季度的营业额
        int sum4 = getSum(40, 20, 30);
        // 全年的营业额
       int sum= sum1 + sum2 +sum3 +sum4;
        System.out.println("商场全年的营业额是："+sum);
        // 3.输出调用
        //System.out.println(getSum(40, 20, 30));//第四季度的营业额

    }
    public static int getSum(int num1,int num2,int num3){
        int sum= num1+num2 +num3;
        return sum;//表示方法结束
        //System.out.println("无效的代码");
    }

}
