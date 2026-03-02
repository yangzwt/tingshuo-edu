package com.tingshuo.edu.day4;

import java.util.Scanner;

/**
 * @description: java学习if和else
 * @author: yangZwt
 * @date: 2026/3/2 19:15
 * @version: 1.0
 */
public class VariableTest {
    // 需求是键盘输入数据，计算您的成绩是否及格是否是优秀，如果分数大于60，打印及格，否则打印不及格,score成绩，
    // 增加一个条件，如果大于90分，打印“优秀”，如果小于60认为不及格
    // 使用if 和 else 进行比较
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请您输入您的成绩，我来告诉您是否及格。");
        int score = scanner.nextInt();//输入的成绩
//        if (score>60){
//            System.out.println("您好您的成绩是及格的。不要骄傲哦！！");
//        }else {
//            System.out.println("您的成绩不合格，请继续努力！！");
//        }
        //45 60 80 90 从小到达排序
        // 90 80 60 45
        // 1.校验
        // 2.注意 不能先判断数据小，即成绩 不能判断小的
       if ( score <0 || score >100){
           System.out.println("您好您输入的成绩不在指定范围内，请检查后输入。");
       } else if (score>=90) {
           System.out.println("您好您的成绩是优秀的。继续保持哦！！");
       } else if (score >=80) {
           System.out.println("您好您的成绩是良好的。继续加油哦！！");
       }else if (score >= 60){
           System.out.println("您好您的成绩是及格的。不要骄傲哦！！");
       }else {
           System.out.println("您的成绩不合格，请继续努力！！");
       }
    }
}
