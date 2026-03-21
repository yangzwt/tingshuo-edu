package com.tingshuo.day20;

import java.util.Scanner;

/**
 * @description:
 * @author: yangZwt
 * @date: 2026/3/21 14:33
 * @version: 1.0
 */
public class DoWhileDemo2 {
    public static void main(String[] args) {
        /**
         * 经典场景 —— “密码验证模拟器”
         * **目标**：模拟用户登录，直到输入正确密码为止。这是 `do-while` 最实用的场景。
         *
         * **题目描述**：
         * 1. 预设正确的密码是 `"123456"`。
         * 2. 使用 `Scanner` 获取用户输入。
         * 3. 使用 `do-while` 循环：
         *    - 提示用户：“请输入密码：”
         *    - 获取用户输入的密码。
         *    - 如果输入错误，提示：“密码错误，请重试！”
         *    - 如果输入正确，提示：“登录成功！”并退出循环。
         * 4. **关键点**：不管用户第一次输没输对，程序都必须先让他输一次。
         */
        int passwd=123456;

        Scanner sc=new Scanner(System.in);
        int pd=0;
        do {
            System.out.println("请您输入您的密码");
             pd = sc.nextInt();
            if (pd!=passwd){
                System.out.println("您输入的密码有误，请重新输入");
            }
        }while (pd!=passwd);
        System.out.println("登录成功，可以继续使用");
    }
}
