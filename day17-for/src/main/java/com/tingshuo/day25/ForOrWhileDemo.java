package com.tingshuo.day25;


import java.util.Random;
import java.util.Scanner;

/**
 * @description: java使用循环来练习，猜数字游戏
 * @author: yangZwt
 * @date: 2026/3/26 19:00
 * @version: 1.0
 */
public class ForOrWhileDemo {
    public static void main(String[] args) {
        /**
         * 案例：猜数字小游戏  需求：程序自动生成一个1-100的随机数字，使用程序实现猜出这个数字是多少？
         */
        // 生成随机数
        Random r = new Random();
        // 注意：1.不能打印随机，2.不能在循环中生成随机
        // 1.分析需求，随机
        int number = r.nextInt(100) + 1;
        //System.out.println(number);
        // 2.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要猜的整数");
        // 抽奖，100，保底3次，送一个安慰奖
        //标记 结束
        int count = 0;
        while (true) {
            // 3.猜数字，
            int guessNum = sc.nextInt();
            count++;
            if (count == 3) {
                System.out.println("您好，您没猜中，得到安慰奖一个。");
                break;
            }
            // 1.猜的数字，大于 随机数 2.猜的数字，小于 随机数 3.猜的数字，等于 随机数
            if (guessNum > number) {
                System.out.println("您猜大了");
            } else if (guessNum < number) {
                System.out.println("您猜小了");
            } else {
                System.out.println("您猜中了。");
                break;
            }
        }
// 第二种实现方式：
//        for (;;){
//            // 3.猜数字，
//            int guessNum=sc.nextInt();
//            count++;
//            if (count==3){
//                System.out.println("您好，您没猜中，得到安慰奖一个。");
//                break;
//            }
        // 1.猜的数字，大于 随机数 2.猜的数字，小于 随机数 3.猜的数字，等于 随机数
//            if (guessNum>number){
//                System.out.println("您猜大了");
//            } else if (guessNum<number) {
//                System.out.println("您猜小了");
//            }else {
//                System.out.println("您猜中了。");
//                break;
//            }
//        }
    }
}
