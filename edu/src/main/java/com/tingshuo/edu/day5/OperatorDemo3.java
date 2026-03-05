package com.tingshuo.edu.day5;

/**
 * @description: 运算符：1.算术运算符，除和取模
 * @author: yangZwt
 * @date: 2026/3/3 21:37
 * @version: 1.0
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        // +
        // -
        // *
        System.out.println(2 + 3);//5
        System.out.println(4 - 1);//3
        System.out.println(2 * 3);//6
        //如果计算的时候有小数参与计算
        //结论：
        //如果整数参与计算有小数参与计算，可能会出现不精确的情况。
        // 为什么呐？
        // 我们会在后边学习java进阶过程中讲解。
        System.out.println(1.1 + 1.1);// 2.2
        System.out.println(1.1 + 1.01);// 2.11 ？2.1100000000000003
        System.out.println(1.1 - 1.01);//?0.01 ？0.09000000000000008
        System.out.println(1.1 * 1.01);// 1.1110000000000002
        System.out.println("------------------");
        // 除 /
        // 取余 % 取模
        System.out.println( 10 / 2);//5
        System.out.println(10 / 3 );//3 ？
        System.out.println(10.0 / 3 );//3.3333333333333335 ？

        System.out.println(10 % 2);//？0
        System.out.println(10 % 3);//？1

        System.out.println("------------------");
        double a=123.1;
        int b =(int) a;
        System.out.println(b);//数据丢失情况
        //数据丢失。
//        // 2.
//        int a1=300;
//        byte b1= (byte) a1;// -128 ~127
//        System.out.println(b1);
//        ------------练习
        System.out.println("------------------");
//        byte b1 = 10;
//        byte b2 = 20;
//        int result = b1+b2; //30 // int ，byte
//        System.out.println(result);
//
        byte b1 = 100; // -128 ~127
        byte b2 = 100;
        byte result = (byte) (b1+ b2);//数据丢失情况
        System.out.println(result);


    }
}
