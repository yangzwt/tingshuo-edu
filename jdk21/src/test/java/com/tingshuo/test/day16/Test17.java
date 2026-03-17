package com.tingshuo.test.day16;

import java.util.Scanner;

/**
 * @description:
 * @author: yangZwt
 * @date: 2026/3/17 19:17
 * @version: 1.0
 */
public class Test17 {
    public static void main(String[] args) {
        /*
         * 练习 :用户选择:
         * 在实际开发中,如果我们需要在多种情况下选择其中一个,就可以使用switch语句
         * 例如:当我们拨打了某些服务电话时,一般都会有按键选择
         * 假设现在我们拨打了机票预定电话.
         * 语言提示:
         * 1.机票查询
         * 2.机票预定
         * 3.机票改签
         * 4.退出服务
         * 其他按键也是退出服务,请使用 switch 语句实现改模拟.
         * choose
         */
        // 1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入您的选择");
        // 2.switch 语句判断
        int choose=sc.nextInt();
        switch (choose){
            case 1 -> System.out.println("机票查询");

            case 2 -> System.out.println("机票预定");

            case 3 -> System.out.println("机票改签");
//            case 4:
//                System.out.println("退出服务");
//                break;
            default -> System.out.println("退出服务");

        }
    }
}
