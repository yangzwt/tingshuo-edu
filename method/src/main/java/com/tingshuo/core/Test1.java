package com.tingshuo.core;

import java.util.Scanner;

/**
 * @description: java综合练习题：1、卖飞机票
 * @author: yangZwt
 * @date: 2026/4/25 15:27
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //需求：
        // 1.1、机票价格按照淡季旺季、头等舱和经济舱进行分类，
        //      输入机票原价、购买月份和购买舱类别头等舱或经济舱。
        // 1.2、按照以下规则计算机票价格：旺季(5-10)头等舱9折，经济舱8.5折，
        //      淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        // 一、需求分析，键盘录入 机票原价 、购买月份和购买舱类别头等舱或经济舱
        // 二、判断月份 month 、旺季或淡季、舱位 seat
        // 三、根据季节价格计算 ticket
        // 四、输出最终价格
        //ctrl +alt +m
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入机票原价格");
        int ticket = scanner.nextInt();//机票原价格
        System.out.println("请您输入月份1-12月");
        int month = scanner.nextInt();//月份
        System.out.println("请您输入舱位 0 头等舱 1 经济舱");
        int seat = scanner.nextInt();
        // 二、判断月份、旺季或淡季、舱位
        //ctrl +alt +m
        if (month >= 5 && month <= 10) {
            // 旺季
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("您输入的月份不合法");
        }
        // 四、输出最终价格
        System.out.println("您购买的机票，优惠后是" + ticket);
    }
    /**
     *
     * @param seat 舱位
     * @param ticket 机票价格
     * @param x 头等舱折扣
     * @param x1 经济舱折扣
     * @return  折扣后价格
     */
    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            // 头等舱
            // 三、价格计算
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            // 经济舱
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("您输入的舱位不存在");
        }
        return ticket;
    }
    //抽离方法：
    // 1.我要干吗？
    // 2.我干这件事，需要什么？
    // 3.方法的结果，需要返回吗？
}
