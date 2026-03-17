package com.tingshuo.day16;

/**
 * @description: switch演示 default的位置和省略
 * @author: yangZwt
 * @date: 2026/3/17 18:38
 * @version: 1.0
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        /*
        * 注意
         */
        // 1.位置: default不一定写在最下面,可以写在任何位置,只不过建议写在最下面.
        // 2.省略: default,可以省略,但是不建议省略.
        int number = 30;
        switch (number) {
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值,不为1也不为20");
                break;

        }
    }
}
