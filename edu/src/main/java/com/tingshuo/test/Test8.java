package com.tingshuo.test;

import java.util.Scanner;

/**
 * @description: 流程控制 : switch 实现
 * @author: yangZwt
 * @date: 2026/3/12 19:09
 * @version: 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        /*
         * 锻炼活动
         * 需求：键盘录入星期数，显示今天的锻炼活动
         * 周一：跑步
         * 周二：游泳
         * 周三：慢走
         * 周四：单车运动
         * 周五：分享视频
         * 周六：学习java基础知识
         * 周日：好好吃一顿
         */
        //分析：week
        // 1.键盘录入
        Scanner scanner=new Scanner(System.in);
        System.out.println("请您输入今天的锻炼活动内容,录入星期");
        // 2.录入switch 对应不同条件值
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("单车运动");
                break;
            case 5:
                System.out.println("分享视频");
                break;
            case 6:
                System.out.println("学习java基础知识");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("您输入的星期有误。请核对。");
                break;
        }

    }
}
