package com.tingshuo.edu.day3;
//1.导入包
import java.util.Scanner;

/**
 * @description: java键盘输入
 * @author: yangZwt
 * @date: 2026/3/1 21:39
 * @version: 1.0
 */
public class VariableTest {
    public static void main(String[] args) {
        //2. 创建对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入第一个要计算的整数");
        // 3.使用对应的方法
        int i = sc.nextInt();
        // 打印输出数据
        System.out.println("您好您的输入内容是"+i);
        // 输入 两个数据并计算两个数据的总和
        System.out.println("请您输入第二个要计算的整数");
        int number=sc.nextInt();
        //int sum=i+number;

        System.out.println(i+number);//计算输入数据总和。

    }
}
