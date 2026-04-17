package com.tingshuo.day1;

/**
 * @description: java方法的学习
 * @author: yangZwt
 * @date: 2026/4/17 18:47
 * @version: 1.0
 */
public class MethodDay1 {
    public static void main(String[] args) {
        //代码冗余
        // 打一次游戏
       // payGames();
        //System.out.println("-----------------等待10秒开始下一局------------------------");
        // 打两次游戏
        //payGames();
        //打多次游戏
        for (int i = 0; i < 4; i++) {
            payGames();
            System.out.println("-----------------等待10秒开始下一局------------------------");
        }
    }

    /**
     * 执行打游戏的方法
     */
    public static  void payGames(){
        System.out.println("登录游戏");
        System.out.println("选择人物");
        System.out.println("打怪");
        System.out.println("存钱买装备");
        System.out.println("升级装备");
        System.out.println("团战");
        System.out.println("加油队友们，胜利就在眼前");
        System.out.println("游戏胜利or游戏失败");
    }

}
