
package com.tingshuo.day16;

/**
 * @description: switch演示: switch新特性
 * @author: yangZwt
 * @date: 2026/3/17 18:38
 * @version: 1.0
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        // JDK12之后才可使用使用的.
        // 需求: 1 2 3 打印 一 二 三
        int number = 2;
        switch (number) {
            case 1 -> System.out.println("一");

            case 2 -> System.out.println("二");

            case 3 -> System.out.println("三");

            default -> System.out.println("没有对应的选择");
        }
    }
}
