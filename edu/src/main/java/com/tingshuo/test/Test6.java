package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 三元运算符
 * @author: yangZwt
 * @date: 2026/3/11 18:45
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        //使用三元运算符。
        /*
        * 两只老虎
        * 需求：动物园里有两只老虎，体重分别通过键盘录入获得。
        * 请用程序实现判断两只老虎体重是否相同。
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("请您输入第一只老虎的体重");
        int weigh1 = sc.nextInt();
        System.out.println("请您输入第二只老虎的体重");
        int weigh2 = sc.nextInt();

        //boolean b = weigh1 == weigh2;
        //System.out.println( b);
        String result = weigh1 > weigh2 ? "不相同"  : "相同";
        System.out.println(result);


    }
}
